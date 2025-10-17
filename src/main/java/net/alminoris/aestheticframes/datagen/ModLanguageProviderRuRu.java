package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderRuRu extends FabricLanguageProvider
{
    public ModLanguageProviderRuRu(FabricDataOutput dataOutput)
    {
        super(dataOutput, "ru_ru");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> frameTypes = new LinkedHashMap<>();
        frameTypes.put("frame_", "Рамка из %s");
        frameTypes.put("vertical_frame_", "Вертикальная рамка из %s");
        frameTypes.put("horizontal_frame_", "Горизонтальная рамка из %s");
        frameTypes.put("perpendicular_frame_", "Перпендикулярная рамка из %s");
        frameTypes.put("crest_frame_", "Гербовая рамка из %s");
        frameTypes.put("vertical_crest_frame_", "Вертикальная гербовая рамка из %s");
        frameTypes.put("horizontal_crest_frame_", "Горизонтальная гербовая рамка из %s");
        frameTypes.put("perpendicular_crest_frame_", "Перпендикулярная гербовая рамка из %s");
        frameTypes.put("crest_scaled_frame_", "Масштабированная гербовая рамка из %s");

        Map<String, String> materials = new LinkedHashMap<>();
        materials.put("bald_cypress", "болотного кипариса");
        materials.put("thuja", "туи");
        materials.put("sequoia", "секвойи");
        materials.put("mountain_hemlock", "горной тсуги");
        materials.put("cryptomeria", "криптомерии");
        materials.put("yew", "тиса");
        materials.put("larch", "лиственницы");
        materials.put("olive", "оливы");
        materials.put("tamarisk", "тамариска");
        materials.put("western_serviceberry", "ирги западной");
        materials.put("trembling_aspen", "осины дрожащей");
        materials.put("cottonwood", "тополя хлопкового");
        materials.put("walnut", "грецкого ореха");
        materials.put("silver_maple", "серебристого клёна");
        materials.put("staghorn_sumac", "сумаха");
        materials.put("silverberry", "лохины серебристой");
        materials.put("willow", "ивы");
        materials.put("poplar", "тополя");
        materials.put("alder", "ольхи");
        materials.put("aspen", "осины");
        materials.put("azalea", "азалии");
        materials.put("apple", "яблони");
        materials.put("scots_pine", "сосны обыкновенной");
        materials.put("swamp_oak", "болотного дуба");
        materials.put("aspen_nss", "осины");
        materials.put("cedar_nss", "кедра");
        materials.put("coconut_nss", "кокосовой пальмы");
        materials.put("cypress_nss", "кипариса");
        materials.put("fir_nss", "пихты");
        materials.put("ghaf_nss", "гафа");
        materials.put("larch_nss", "лиственницы");
        materials.put("mahogany_nss", "махогони");
        materials.put("maple_nss", "клёна");
        materials.put("olive_nss", "оливы");
        materials.put("palo_verde_nss", "пало-верде");
        materials.put("redwood_nss", "секвойи");
        materials.put("saxaul_nss", "саксаула");
        materials.put("sugi_nss", "суги");
        materials.put("willow_nss", "ивы");
        materials.put("wisteria_nss", "глицинии");
        materials.put("oak", "дуба");
        materials.put("birch", "берёзы");
        materials.put("spruce", "ели");
        materials.put("jungle", "тропического дерева");
        materials.put("acacia", "акации");
        materials.put("dark_oak", "тёмного дуба");
        materials.put("crimson", "багрового дерева");
        materials.put("warped", "искривлённого дерева");
        materials.put("mangrove", "мангрового дерева");
        materials.put("cherry", "вишни");
        materials.put("bamboo", "бамбука");
        materials.put("hazelnut", "лесного ореха");
        materials.put("hornbeam", "граба");
        materials.put("hawthorn", "боярышника");
        materials.put("quince", "айвы");
        materials.put("plum", "сливы");
        materials.put("mango", "манго");
        materials.put("fig", "инжира");
        materials.put("viburnum", "калины");
        materials.put("white_mulberry", "белой шелковицы");
        materials.put("wild_cherry", "черешни");
        materials.put("bauhinia", "баухинии");
        materials.put("pine", "сосны");
        materials.put("fir", "пихты");
        materials.put("cedar", "кедра");
        materials.put("araucaria", "араукарии");
        materials.put("juniper", "можжевельника");
        materials.put("stone", "камня");
        materials.put("tuff", "туфа");
        materials.put("blackstone", "чёрного камня");
        materials.put("andesite", "андезита");
        materials.put("diorite", "диорита");
        materials.put("granite", "гранита");
        materials.put("deepslate", "глубинного сланца");
        materials.put("basalt_side", "базальта");
        materials.put("quartz_block_bottom", "кварца");
        materials.put("stone_bricks", "каменного кирпича");
        materials.put("bricks", "кирпича");
        materials.put("mud_bricks", "глиняного кирпича");
        materials.put("sandstone", "песчаника");
        materials.put("dolomite_block", "доломита");
        materials.put("saltmarsh_block", "солончака");
        materials.put("loessic_marl_block", "лёссового мергеля");
        materials.put("loamy_marl_block", "суглинистого мергеля");
        materials.put("fossil_marlstone_block", "ископаемого мергеля");
        materials.put("limestone_block", "известняка");

        for (Map.Entry<String, String> type : frameTypes.entrySet()) {
            for (Map.Entry<String, String> mat : materials.entrySet()) {
                String key = "block." + AestheticFrames.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("block.aestheticframes.whitened_white_terracotta", "Отбелённая белая терракота");
        translationBuilder.add("itemgroup.afstab","Aesthetic Frames");
    }
}