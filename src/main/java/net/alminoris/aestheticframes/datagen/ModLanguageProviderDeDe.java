package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderDeDe extends FabricLanguageProvider
{
    public ModLanguageProviderDeDe(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator, "de_de");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder)
    {
        Map<String, String> frameTypes = new LinkedHashMap<>();
        frameTypes.put("frame_", "Rahmen aus %s");
        frameTypes.put("vertical_frame_", "Vertikaler Rahmen aus %s");
        frameTypes.put("horizontal_frame_", "Horizontaler Rahmen aus %s");
        frameTypes.put("perpendicular_frame_", "Senkrechter Rahmen aus %s");
        frameTypes.put("crest_frame_", "Wappenrahmen aus %s");
        frameTypes.put("vertical_crest_frame_", "Vertikaler Wappenrahmen aus %s");
        frameTypes.put("horizontal_crest_frame_", "Horizontaler Wappenrahmen aus %s");
        frameTypes.put("perpendicular_crest_frame_", "Senkrechter Wappenrahmen aus %s");
        frameTypes.put("crest_scaled_frame_", "Skalierter Wappenrahmen aus %s");

        Map<String, String> materials = new LinkedHashMap<>();
        materials.put("bald_cypress", "Sumpfzypresse");
        materials.put("thuja", "Thuja");
        materials.put("sequoia", "Mammutbaum");
        materials.put("mountain_hemlock", "Berg-Hemlocktanne");
        materials.put("cryptomeria", "Kryptomerie");
        materials.put("yew", "Eibe");
        materials.put("larch", "Lärche");
        materials.put("olive", "Olivenholz");
        materials.put("tamarisk", "Tamariske");
        materials.put("western_serviceberry", "Westlicher Felsenmispel");
        materials.put("trembling_aspen", "Zitterpappel");
        materials.put("cottonwood", "Baumwollpappel");
        materials.put("walnut", "Walnuss");
        materials.put("silver_maple", "Silber-Ahorn");
        materials.put("staghorn_sumac", "Essigbaum");
        materials.put("silverberry", "Silberölweide");
        materials.put("willow", "Weide");
        materials.put("poplar", "Pappel");
        materials.put("alder", "Erle");
        materials.put("aspen", "Espe");
        materials.put("azalea", "Azalee");
        materials.put("apple", "Apfelbaum");
        materials.put("scots_pine", "Waldkiefer");
        materials.put("swamp_oak", "Sumpfeiche");
        materials.put("aspen_nss", "Espe");
        materials.put("cedar_nss", "Zeder");
        materials.put("coconut_nss", "Kokospalme");
        materials.put("cypress_nss", "Zypresse");
        materials.put("fir_nss", "Tanne");
        materials.put("ghaf_nss", "Ghaf-Baum");
        materials.put("larch_nss", "Lärche");
        materials.put("mahogany_nss", "Mahagoni");
        materials.put("maple_nss", "Ahorn");
        materials.put("olive_nss", "Olivenholz");
        materials.put("palo_verde_nss", "Palo-Verde-Holz");
        materials.put("redwood_nss", "Mammutbaum");
        materials.put("saxaul_nss", "Saxaul");
        materials.put("sugi_nss", "Sugi");
        materials.put("willow_nss", "Weide");
        materials.put("wisteria_nss", "Blauregen");
        materials.put("oak", "Eiche");
        materials.put("birch", "Birke");
        materials.put("spruce", "Fichte");
        materials.put("jungle", "Tropenholz");
        materials.put("acacia", "Akazie");
        materials.put("dark_oak", "Dunkeleiche");
        materials.put("crimson", "Karmesinholz");
        materials.put("warped", "Wirrholz");
        materials.put("mangrove", "Mangrovenholz");
        materials.put("cherry", "Kirschbaum");
        materials.put("bamboo", "Bambus");
        materials.put("hazelnut", "Hasel");
        materials.put("hornbeam", "Hainbuche");
        materials.put("hawthorn", "Weißdorn");
        materials.put("quince", "Quitte");
        materials.put("plum", "Pflaume");
        materials.put("mango", "Mango");
        materials.put("fig", "Feige");
        materials.put("viburnum", "Schneeball");
        materials.put("white_mulberry", "Weiße Maulbeere");
        materials.put("wild_cherry", "Süßkirsche");
        materials.put("bauhinia", "Bauhinie");
        materials.put("pine", "Kiefer");
        materials.put("fir", "Tanne");
        materials.put("cedar", "Zeder");
        materials.put("araucaria", "Araukarie");
        materials.put("juniper", "Wacholder");
        materials.put("stone", "Stein");
        materials.put("tuff", "Tuffstein");
        materials.put("blackstone", "Schwarzstein");
        materials.put("andesite", "Andesit");
        materials.put("diorite", "Diorit");
        materials.put("granite", "Granit");
        materials.put("deepslate", "Tiefenschiefer");
        materials.put("basalt_side", "Basalt");
        materials.put("quartz_block_bottom", "Quarz");
        materials.put("stone_bricks", "Steinziegel");
        materials.put("bricks", "Ziegel");
        materials.put("mud_bricks", "Lehmziegel");
        materials.put("sandstone", "Sandstein");
        materials.put("dolomite_block", "Dolomit");
        materials.put("saltmarsh_block", "Salzmoorstein");
        materials.put("loessic_marl_block", "Lössmergel");
        materials.put("loamy_marl_block", "Tonmergel");
        materials.put("fossil_marlstone_block", "Fossiler Mergelstein");
        materials.put("limestone_block", "Kalkstein");

        for (Map.Entry<String, String> type : frameTypes.entrySet()) {
            for (Map.Entry<String, String> mat : materials.entrySet()) {
                String key = "block." + AestheticFrames.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("block.aestheticframes.whitened_white_terracotta", "Gebleichte weiße Terrakotta");

        translationBuilder.add("itemGroup.aestheticframes.afstab","Aesthetic Frames");
    }
}