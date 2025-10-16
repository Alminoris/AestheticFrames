package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModLanguageProviderFrFr extends FabricLanguageProvider
{
    public ModLanguageProviderFrFr(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup)
    {
        super(dataOutput, "fr_fr", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder)
    {
        Map<String, String> frameTypes = new LinkedHashMap<>();
        frameTypes.put("frame_", "Cadre en %s");
        frameTypes.put("vertical_frame_", "Cadre vertical en %s");
        frameTypes.put("horizontal_frame_", "Cadre horizontal en %s");
        frameTypes.put("perpendicular_frame_", "Cadre perpendiculaire en %s");
        frameTypes.put("crest_frame_", "Cadre héraldique en %s");
        frameTypes.put("vertical_crest_frame_", "Cadre héraldique vertical en %s");
        frameTypes.put("horizontal_crest_frame_", "Cadre héraldique horizontal en %s");
        frameTypes.put("perpendicular_crest_frame_", "Cadre héraldique perpendiculaire en %s");
        frameTypes.put("crest_scaled_frame_", "Cadre héraldique à échelle en %s");

        Map<String, String> materials = new LinkedHashMap<>();
        materials.put("bald_cypress", "cyprès chauve");
        materials.put("thuja", "thuya");
        materials.put("sequoia", "séquoia");
        materials.put("mountain_hemlock", "pruche de montagne");
        materials.put("cryptomeria", "cryptomérie");
        materials.put("yew", "if");
        materials.put("larch", "mélèze");
        materials.put("olive", "olivier");
        materials.put("tamarisk", "tamaris");
        materials.put("western_serviceberry", "amélanchier de l’Ouest");
        materials.put("trembling_aspen", "peuplier faux-tremble");
        materials.put("cottonwood", "peuplier deltoïde");
        materials.put("walnut", "noyer");
        materials.put("silver_maple", "érable argenté");
        materials.put("staghorn_sumac", "sumac vinaigrier");
        materials.put("silverberry", "chalef argenté");
        materials.put("willow", "saule");
        materials.put("poplar", "peuplier");
        materials.put("alder", "aulne");
        materials.put("aspen", "tremble");
        materials.put("azalea", "azalée");
        materials.put("apple", "pommier");
        materials.put("scots_pine", "pin sylvestre");
        materials.put("swamp_oak", "chêne des marais");
        materials.put("aspen_nss", "tremble");
        materials.put("cedar_nss", "cèdre");
        materials.put("coconut_nss", "cocotier");
        materials.put("cypress_nss", "cyprès");
        materials.put("fir_nss", "sapin");
        materials.put("ghaf_nss", "ghaf");
        materials.put("larch_nss", "mélèze");
        materials.put("mahogany_nss", "acajou");
        materials.put("maple_nss", "érable");
        materials.put("olive_nss", "olivier");
        materials.put("palo_verde_nss", "palo verde");
        materials.put("redwood_nss", "séquoia");
        materials.put("saxaul_nss", "saxaul");
        materials.put("sugi_nss", "sugi");
        materials.put("willow_nss", "saule");
        materials.put("wisteria_nss", "glycine");
        materials.put("oak", "chêne");
        materials.put("birch", "bouleau");
        materials.put("spruce", "épicéa");
        materials.put("jungle", "bois tropical");
        materials.put("acacia", "acacia");
        materials.put("dark_oak", "chêne noir");
        materials.put("crimson", "bois cramoisi");
        materials.put("warped", "bois biscornu");
        materials.put("mangrove", "mangrove");
        materials.put("cherry", "cerisier");
        materials.put("bamboo", "bambou");
        materials.put("hazelnut", "noisetier");
        materials.put("hornbeam", "charme");
        materials.put("hawthorn", "aubépine");
        materials.put("quince", "cognassier");
        materials.put("plum", "prunier");
        materials.put("mango", "manguier");
        materials.put("fig", "figuier");
        materials.put("viburnum", "viorne");
        materials.put("white_mulberry", "mûrier blanc");
        materials.put("wild_cherry", "merisier");
        materials.put("bauhinia", "bauhinie");
        materials.put("pine", "pin");
        materials.put("fir", "sapin");
        materials.put("cedar", "cèdre");
        materials.put("araucaria", "araucaria");
        materials.put("juniper", "genévrier");
        materials.put("stone", "pierre");
        materials.put("tuff", "tuf");
        materials.put("blackstone", "pierre noire");
        materials.put("andesite", "andésite");
        materials.put("diorite", "diorite");
        materials.put("granite", "granit");
        materials.put("deepslate", "ardoise profonde");
        materials.put("basalt_side", "basalte");
        materials.put("quartz_block_bottom", "quartz");
        materials.put("stone_bricks", "briques de pierre");
        materials.put("bricks", "briques");
        materials.put("mud_bricks", "briques de boue");
        materials.put("sandstone", "grès");
        materials.put("dolomite_block", "dolomite");
        materials.put("saltmarsh_block", "pierre de marais salé");
        materials.put("loessic_marl_block", "marne lœssique");
        materials.put("loamy_marl_block", "marne argileuse");
        materials.put("fossil_marlstone_block", "marne fossile");
        materials.put("limestone_block", "calcaire");

        for (Map.Entry<String, String> type : frameTypes.entrySet()) {
            for (Map.Entry<String, String> mat : materials.entrySet()) {
                String key = "block." + AestheticFrames.MOD_ID + "." + type.getKey() + mat.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                translationBuilder.add(key, value);
            }
        }

        translationBuilder.add("block.aestheticframes.whitened_white_terracotta", "Terre cuite blanche blanchie");

        translationBuilder.add("itemgroup.afstab","Aesthetic Frames");
    }
}