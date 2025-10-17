package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

import static net.fabricmc.loader.impl.util.StringUtil.capitalize;

public class ModLanguageProviderEnUs extends FabricLanguageProvider
{
    public ModLanguageProviderEnUs(FabricDataOutput dataOutput)
    {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Registries.BLOCK.stream()
                .filter(block ->
                {
                    Identifier id = Registries.BLOCK.getId(block);
                    return AestheticFrames.MOD_ID.equals(id.getNamespace());
                })
                .forEach(block ->
                {
                    Identifier id = Registries.BLOCK.getId(block);
                    String path = id.getPath();

                    String[] parts = path.split("_");
                    List<String> beforeFrame = new ArrayList<>();
                    List<String> afterFrame = new ArrayList<>();
                    boolean foundFrame = false;

                    for (String part : parts)
                    {
                        if (part.equalsIgnoreCase("nss")) continue;

                        if (part.equalsIgnoreCase("frame"))
                        {
                            foundFrame = true;
                            beforeFrame.add("Frame");
                        }
                        else
                        {
                            if (foundFrame)
                            {
                                afterFrame.add(capitalize(part));
                            }
                            else
                            {
                                beforeFrame.add(capitalize(part));
                            }
                        }
                    }

                    List<String> finalParts = new ArrayList<>();
                    finalParts.addAll(afterFrame);
                    finalParts.addAll(beforeFrame);

                    String displayName = String.join(" ", finalParts);
                    translationBuilder.add("block." + AestheticFrames.MOD_ID + "." + path, displayName);
                });

        translationBuilder.add("itemgroup.afstab","Aesthetic Frames");
    }
}