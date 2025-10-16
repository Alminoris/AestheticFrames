package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderUkUa extends FabricLanguageProvider
{
    public ModLanguageProviderUkUa(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Map<String, String> frameTypes = new LinkedHashMap<>();
        frameTypes.put("frame_", "Рамка з %s");
        frameTypes.put("vertical_frame_", "Вертикальна рамка з %s");
        frameTypes.put("horizontal_frame_", "Горизонтальна рамка з %s");
        frameTypes.put("perpendicular_frame_", "Перпендикулярна рамка з %s");
        frameTypes.put("crest_frame_", "Гербова рамка з %s");
        frameTypes.put("vertical_crest_frame_", "Вертикальна гербова рамка з %s");
        frameTypes.put("horizontal_crest_frame_", "Горизонтальна гербова рамка з %s");
        frameTypes.put("perpendicular_crest_frame_", "Перпендикулярна гербова рамка з %s");
        frameTypes.put("crest_scaled_frame_", "Масштабована гербова рамка з %s");

        Map<String, String> materials = new LinkedHashMap<>();
        materials.put("bald_cypress", "болотного кипариса");
        materials.put("thuja", "туї");
        materials.put("sequoia", "секвої");
        materials.put("mountain_hemlock", "гірської тсуги");
        materials.put("cryptomeria", "криптомерії");
        materials.put("yew", "тису");
        materials.put("larch", "модрини");
        materials.put("olive", "оливи");
        materials.put("tamarisk", "тамаріску");
        materials.put("western_serviceberry", "ірги західної");
        materials.put("trembling_aspen", "осики");
        materials.put("cottonwood", "тополі бавовникової");
        materials.put("walnut", "горіха");
        materials.put("silver_maple", "сріблястого клена");
        materials.put("staghorn_sumac", "сузу");
        materials.put("silverberry", "лохини сріблястої");
        materials.put("willow", "верби");
        materials.put("poplar", "тополі");
        materials.put("alder", "вільхи");
        materials.put("aspen", "осики");
        materials.put("azalea", "азалії");
        materials.put("apple", "яблуні");
        materials.put("scots_pine", "сосни звичайної");
        materials.put("swamp_oak", "болотного дуба");
        materials.put("aspen_nss", "осики");
        materials.put("cedar_nss", "кедра");
        materials.put("coconut_nss", "кокосової пальми");
        materials.put("cypress_nss", "кипариса");
        materials.put("fir_nss", "ялиці");
        materials.put("ghaf_nss", "гафу");
        materials.put("larch_nss", "модрини");
        materials.put("mahogany_nss", "махаґоні");
        materials.put("maple_nss", "клена");
        materials.put("olive_nss", "оливи");
        materials.put("palo_verde_nss", "пало верде");
        materials.put("redwood_nss", "секвої");
        materials.put("saxaul_nss", "саксаулу");
        materials.put("sugi_nss", "суґі");
        materials.put("willow_nss", "верби");
        materials.put("wisteria_nss", "гліцинії");
        materials.put("oak", "дуба");
        materials.put("birch", "берези");
        materials.put("spruce", "ялиці");
        materials.put("jungle", "тропічного дерева");
        materials.put("acacia", "акації");
        materials.put("dark_oak", "темного дуба");
        materials.put("crimson", "пурпурового дерева");
        materials.put("warped", "деформованого дерева");
        materials.put("mangrove", "мангрового дерева");
        materials.put("cherry", "вишні");
        materials.put("bamboo", "бамбука");
        materials.put("hazelnut", "ліщини");
        materials.put("hornbeam", "грабу");
        materials.put("hawthorn", "глоду");
        materials.put("quince", "айви");
        materials.put("plum", "сливи");
        materials.put("mango", "манго");
        materials.put("fig", "інжиру");
        materials.put("viburnum", "калини");
        materials.put("white_mulberry", "білої шовковиці");
        materials.put("wild_cherry", "черешні");
        materials.put("bauhinia", "баухінії");
        materials.put("pine", "сосни");
        materials.put("fir", "ялини");
        materials.put("cedar", "кедра");
        materials.put("araucaria", "араукарії");
        materials.put("juniper", "ялівця");
        materials.put("stone", "каменю");
        materials.put("tuff", "туфу");
        materials.put("blackstone", "чорного каменю");
        materials.put("andesite", "андезиту");
        materials.put("diorite", "діориту");
        materials.put("granite", "граніту");
        materials.put("deepslate", "глибокої сланцю");
        materials.put("basalt_side", "базальту");
        materials.put("quartz_block_bottom", "кварцу");
        materials.put("stone_bricks", "кам’яної цегли");
        materials.put("bricks", "цегли");
        materials.put("mud_bricks", "глиняної цегли");
        materials.put("sandstone", "піщанику");
        materials.put("dolomite_block", "доломіту");
        materials.put("saltmarsh_block", "солончака");
        materials.put("loessic_marl_block", "лессового мергеля");
        materials.put("loamy_marl_block", "суглинкового мергеля");
        materials.put("fossil_marlstone_block", "викопного мергеля");
        materials.put("limestone_block", "вапняку");

        for (Map.Entry<String, String> type : frameTypes.entrySet())
        {
            for (Map.Entry<String, String> mat : materials.entrySet())
            {
                String key = "block." + AestheticFrames.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("block.aestheticframes.whitened_white_terracotta","Вибілена біла теракота");
        translationBuilder.add("itemgroup.afstab","Aesthetic Frames");
    }
}