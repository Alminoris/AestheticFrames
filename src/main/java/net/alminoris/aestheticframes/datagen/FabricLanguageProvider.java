package net.alminoris.aestheticframes.datagen;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.block.Block;
import net.minecraft.data.DataCache;
import net.minecraft.data.DataProvider;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.stat.StatType;
import net.minecraft.util.Identifier;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public abstract class FabricLanguageProvider implements DataProvider {
    protected final FabricDataGenerator dataGenerator;
    private final String languageCode;

    protected FabricLanguageProvider(FabricDataGenerator dataGenerator) {
        this(dataGenerator, "en_us");
    }

    protected FabricLanguageProvider(FabricDataGenerator dataGenerator, String languageCode) {
        this.dataGenerator = dataGenerator;
        this.languageCode = languageCode;
    }

    public abstract void generateTranslations(TranslationBuilder builder);

    @Override
    public void run(DataCache cache) throws IOException {
        TreeMap<String, String> translationEntries = new TreeMap<>();

        this.generateTranslations((key, value) -> {
            Objects.requireNonNull(key);
            Objects.requireNonNull(value);
            if (translationEntries.containsKey(key)) {
                throw new RuntimeException("Duplicate translation key: " + key);
            }
            translationEntries.put(key, value);
        });

        JsonObject langEntryJson = new JsonObject();
        for (Map.Entry<String, String> entry : translationEntries.entrySet()) {
            langEntryJson.addProperty(entry.getKey(), entry.getValue());
        }

        Path langFile = getLangFilePath(this.languageCode);
        Files.createDirectories(langFile.getParent());
        Files.write(langFile, langEntryJson.toString().getBytes(StandardCharsets.UTF_8));
    }

    private Path getLangFilePath(String code) {
        return this.dataGenerator.getOutput()
                .resolve("assets/" + this.dataGenerator.getModId() + "/lang/" + code + ".json");
    }

    @Override
    public String getName() {
        return "Language: " + this.languageCode;
    }

    @FunctionalInterface
    public interface TranslationBuilder {
        void add(String key, String value);

        default void add(Item item, String value) {
            this.add(item.getTranslationKey(), value);
        }

        default void add(Block block, String value) {
            this.add(block.getTranslationKey(), value);
        }

        default void add(ItemGroup group, String value) {
            this.add("itemGroup." + group.getName(), value);
        }

        default void add(EntityType<?> entityType, String value) {
            this.add(entityType.getTranslationKey(), value);
        }

        default void add(Enchantment enchantment, String value) {
            this.add(enchantment.getTranslationKey(), value);
        }

        default void add(EntityAttribute entityAttribute, String value) {
            this.add(entityAttribute.getTranslationKey(), value);
        }

        default void add(StatType<?> statType, String value) {
            this.add(statType.getTranslationKey(), value);
        }

        default void add(StatusEffect statusEffect, String value) {
            this.add(statusEffect.getTranslationKey(), value);
        }

        default void add(Identifier identifier, String value) {
            this.add("translation." + identifier.getNamespace() + "." + identifier.getPath(), value);
        }

        default void add(Path existingLanguageFile) throws IOException {
            try (Reader reader = Files.newBufferedReader(existingLanguageFile)) {
                JsonObject translations = new JsonParser().parse(reader).getAsJsonObject();

                for (Map.Entry<String, com.google.gson.JsonElement> entry : translations.entrySet()) {
                    this.add(entry.getKey(), entry.getValue().getAsString());
                }
            }
        }
    }
}
