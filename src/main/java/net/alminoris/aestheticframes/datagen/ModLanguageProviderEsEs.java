package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderEsEs extends FabricLanguageProvider
{
    public ModLanguageProviderEsEs(FabricDataOutput dataOutput)
    {
        super(dataOutput, "es_es");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> frameTypes = new LinkedHashMap<>();
        frameTypes.put("frame_", "Marco de %s");
        frameTypes.put("vertical_frame_", "Marco vertical de %s");
        frameTypes.put("horizontal_frame_", "Marco horizontal de %s");
        frameTypes.put("perpendicular_frame_", "Marco perpendicular de %s");
        frameTypes.put("crest_frame_", "Marco heráldico de %s");
        frameTypes.put("vertical_crest_frame_", "Marco heráldico vertical de %s");
        frameTypes.put("horizontal_crest_frame_", "Marco heráldico horizontal de %s");
        frameTypes.put("perpendicular_crest_frame_", "Marco heráldico perpendicular de %s");
        frameTypes.put("crest_scaled_frame_", "Marco heráldico escalado de %s");

        Map<String, String> materials = new LinkedHashMap<>();
        materials.put("bald_cypress", "ciprés calvo");
        materials.put("thuja", "tuya");
        materials.put("sequoia", "secuoya");
        materials.put("mountain_hemlock", "tsuga de montaña");
        materials.put("cryptomeria", "criptoemeria");
        materials.put("yew", "tejo");
        materials.put("larch", "alerce");
        materials.put("olive", "olivo");
        materials.put("tamarisk", "taray");
        materials.put("western_serviceberry", "amelanchero occidental");
        materials.put("trembling_aspen", "álamo temblón");
        materials.put("cottonwood", "álamo negro");
        materials.put("walnut", "nogal");
        materials.put("silver_maple", "arce plateado");
        materials.put("staghorn_sumac", "zumaque");
        materials.put("silverberry", "eleagno plateado");
        materials.put("willow", "sauce");
        materials.put("poplar", "álamo");
        materials.put("alder", "aliso");
        materials.put("aspen", "álamo temblón");
        materials.put("azalea", "azalea");
        materials.put("apple", "manzano");
        materials.put("scots_pine", "pino silvestre");
        materials.put("swamp_oak", "roble pantanoso");
        materials.put("aspen_nss", "álamo temblón");
        materials.put("cedar_nss", "cedro");
        materials.put("coconut_nss", "palmera de coco");
        materials.put("cypress_nss", "ciprés");
        materials.put("fir_nss", "abeto");
        materials.put("ghaf_nss", "ghaf");
        materials.put("larch_nss", "alerce");
        materials.put("mahogany_nss", "caoba");
        materials.put("maple_nss", "arce");
        materials.put("olive_nss", "olivo");
        materials.put("palo_verde_nss", "palo verde");
        materials.put("redwood_nss", "secuoya");
        materials.put("saxaul_nss", "saxaul");
        materials.put("sugi_nss", "sugi");
        materials.put("willow_nss", "sauce");
        materials.put("wisteria_nss", "glicina");
        materials.put("oak", "roble");
        materials.put("birch", "abedul");
        materials.put("spruce", "abeto");
        materials.put("jungle", "madera tropical");
        materials.put("acacia", "acacia");
        materials.put("dark_oak", "roble oscuro");
        materials.put("crimson", "madera carmesí");
        materials.put("warped", "madera deformada");
        materials.put("mangrove", "mangle");
        materials.put("cherry", "cerezo");
        materials.put("bamboo", "bambú");
        materials.put("hazelnut", "avellano");
        materials.put("hornbeam", "carpe");
        materials.put("hawthorn", "espino");
        materials.put("quince", "membrillero");
        materials.put("plum", "ciruelo");
        materials.put("mango", "mango");
        materials.put("fig", "higuera");
        materials.put("viburnum", "viburno");
        materials.put("white_mulberry", "morera blanca");
        materials.put("wild_cherry", "guindo");
        materials.put("bauhinia", "bauhinia");
        materials.put("pine", "pino");
        materials.put("fir", "abeto");
        materials.put("cedar", "cedro");
        materials.put("araucaria", "araucaria");
        materials.put("juniper", "enebro");
        materials.put("stone", "piedra");
        materials.put("tuff", "toba");
        materials.put("blackstone", "piedra negra");
        materials.put("andesite", "andesita");
        materials.put("diorite", "diorita");
        materials.put("granite", "granito");
        materials.put("deepslate", "pizarra profunda");
        materials.put("basalt_side", "basalto");
        materials.put("quartz_block_bottom", "cuarzo");
        materials.put("stone_bricks", "ladrillos de piedra");
        materials.put("bricks", "ladrillos");
        materials.put("mud_bricks", "ladrillos de barro");
        materials.put("sandstone", "arenisca");
        materials.put("dolomite_block", "dolomita");
        materials.put("saltmarsh_block", "bloque de marisma salada");
        materials.put("loessic_marl_block", "marga loésica");
        materials.put("loamy_marl_block", "marga arcillosa");
        materials.put("fossil_marlstone_block", "marga fósil");
        materials.put("limestone_block", "caliza");

        for (Map.Entry<String, String> type : frameTypes.entrySet()) {
            for (Map.Entry<String, String> mat : materials.entrySet()) {
                String key = "block." + AestheticFrames.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("block.aestheticframes.whitened_white_terracotta", "Terracota blanca blanqueada");
        translationBuilder.add("itemgroup.afstab","Aesthetic Frames");
    }
}