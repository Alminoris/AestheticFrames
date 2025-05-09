package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.block.ModBlocks;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.alminoris.aestheticframes.util.helper.ModJsonHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider
{
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture)
    {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITENED_WHITE_TERRACOTTA, 1)
                .pattern("#/")
                .input('#', Blocks.WHITE_TERRACOTTA)
                .input('/', Items.WHITE_DYE)
                .criterion(hasItem(Blocks.WHITE_TERRACOTTA), conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromItem(Items.WHITE_DYE))
                .offerTo(recipeExporter);
        
        for(String name : BlockSetsHelper.STONES)
        {
            Block block = Registries.BLOCK.get(Identifier.ofVanilla(name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            registerFrame(recipeExporter, ModBlocks.FRAMES.get(name), block);
            registerCrestFrame(recipeExporter, ModBlocks.FRAMES.get("crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerVerticalFrame(recipeExporter, ModBlocks.FRAMES.get("vertical_"+name), ModBlocks.FRAMES.get(name), block);
            registerHorizontalFrame(recipeExporter, ModBlocks.FRAMES.get("horizontal_"+name), ModBlocks.FRAMES.get(name), block);
            registerPerpendicularFrame(recipeExporter, ModBlocks.FRAMES.get("perpendicular_"+name), ModBlocks.FRAMES.get(name), block);
            registerHorizontalCrestFrame(recipeExporter, ModBlocks.FRAMES.get("horizontal_crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerVerticalCrestFrame(recipeExporter, ModBlocks.FRAMES.get("vertical_crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerPerpendicularCrestFrame(recipeExporter, ModBlocks.FRAMES.get("perpendicular_crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerScaledCrestFrame(recipeExporter, ModBlocks.SCALED_FRAMES.get("crest_"+name), ModBlocks.FRAMES.get("crest_"+name), block);
        }

        for(String name : BlockSetsHelper.EXTRA_STONES_WF)
        {
            ModJsonHelper.createShapedRecipe("frame_"+name, "4", "wildfields:"+name, "aestheticframes:whitened_white_terracotta",
                    "\"///\",", "\"/#/\",", "\"///\"");
            ModJsonHelper.createShapedRecipe("crest_frame_"+name, "2", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "\"/ /\",", "\" # \",", "\"/ /\"");
            ModJsonHelper.createShapedRecipe("vertical_frame_"+name, "1", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "\"/\",", "\"#\",", "\"/\"");
            ModJsonHelper.createShapedRecipe("horizontal_frame_"+name, "1", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "", "\"/#/\"", "");
            ModJsonHelper.createShapedRecipe("perpendicular_frame_"+name, "2", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "\" / \",", "\"/#/\",", "\" / \"");
            ModJsonHelper.createShapedRecipe("horizontal_crest_frame_"+name, "3", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "\"/ /\",", "\"/#/\",", "\"/ /\"");
            ModJsonHelper.createShapedRecipe("vertical_crest_frame_"+name, "3", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "\"///\",", "\" # \",", "\"///\"");
            ModJsonHelper.createShapedRecipe("perpendicular_crest_frame_"+name, "4", "wildfields:"+name, "aestheticframes:frame_"+name,
                    "\"///\",", "\"/#/\",", "\"///\"");
            ModJsonHelper.createShapedRecipe("crest_scaled_frame_"+name, "4", "wildfields:"+name, "aestheticframes:crest_frame_"+name,
                    "\"///\",", "\"/#/\",", "\"///\"");
        }

        for(String name : BlockSetsHelper.WOODS)
        {
            String blockName = (name.equals("crimson") || name.equals("warped")) ? "stem" : (name.equals("bamboo") ? "block" : "log");
            Block block = Registries.BLOCK.get(Identifier.ofVanilla("stripped_"+name+"_"+blockName));

            registerFrame(recipeExporter, ModBlocks.FRAMES.get(name), block);
            registerCrestFrame(recipeExporter, ModBlocks.FRAMES.get("crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerVerticalFrame(recipeExporter, ModBlocks.FRAMES.get("vertical_"+name), ModBlocks.FRAMES.get(name), block);
            registerHorizontalFrame(recipeExporter, ModBlocks.FRAMES.get("horizontal_"+name), ModBlocks.FRAMES.get(name), block);
            registerPerpendicularFrame(recipeExporter, ModBlocks.FRAMES.get("perpendicular_"+name), ModBlocks.FRAMES.get(name), block);
            registerHorizontalCrestFrame(recipeExporter, ModBlocks.FRAMES.get("horizontal_crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerVerticalCrestFrame(recipeExporter, ModBlocks.FRAMES.get("vertical_crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerPerpendicularCrestFrame(recipeExporter, ModBlocks.FRAMES.get("perpendicular_crest_"+name), ModBlocks.FRAMES.get(name), block);
            registerScaledCrestFrame(recipeExporter, ModBlocks.SCALED_FRAMES.get("crest_"+name), ModBlocks.FRAMES.get("crest_"+name), block);
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
        {
            ModJsonHelper.createShapedRecipe("frame_"+name, "4", "arborealnature:stripped_"+name+"_log", "aestheticframes:whitened_white_terracotta",
                    "\"///\",", "\"/#/\",", "\"///\"");
            ModJsonHelper.createShapedRecipe("crest_frame_"+name, "2", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"/ /\",", "\" # \",", "\"/ /\"");
            ModJsonHelper.createShapedRecipe("vertical_frame_"+name, "1", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"/\",", "\"#\",", "\"/\"");
            ModJsonHelper.createShapedRecipe("horizontal_frame_"+name, "1", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "", "\"/#/\"", "");
            ModJsonHelper.createShapedRecipe("perpendicular_frame_"+name, "2", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\" / \",", "\"/#/\",", "\" / \"");
            ModJsonHelper.createShapedRecipe("horizontal_crest_frame_"+name, "3", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"/ /\",", "\"/#/\",", "\"/ /\"");
            ModJsonHelper.createShapedRecipe("vertical_crest_frame_"+name, "3", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"///\",", "\" # \",", "\"///\"");
            ModJsonHelper.createShapedRecipe("perpendicular_crest_frame_"+name, "4", "arborealnature:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"///\",", "\"/#/\",", "\"///\"");
            ModJsonHelper.createShapedRecipe("crest_scaled_frame_"+name, "4", "arborealnature:stripped_"+name+"_log", "aestheticframes:crest_frame_"+name,
                    "\"///\",", "\"/#/\",", "\"///\"");
        }

        for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
        {
            ModJsonHelper.createShapedRecipe("frame_"+name, "4", "wildfields:stripped_"+name+"_log", "aestheticframes:whitened_white_terracotta",
                    "\"///\",", "\"/#/\",", "\"///\"");
            ModJsonHelper.createShapedRecipe("crest_frame_"+name, "2", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"/ /\",", "\" # \",", "\"/ /\"");
            ModJsonHelper.createShapedRecipe("vertical_frame_"+name, "1", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"/\",", "\"#\",", "\"/\"");
            ModJsonHelper.createShapedRecipe("horizontal_frame_"+name, "1", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "", "\"/#/\"", "");
            ModJsonHelper.createShapedRecipe("perpendicular_frame_"+name, "2", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\" / \",", "\"/#/\",", "\" / \"");
            ModJsonHelper.createShapedRecipe("horizontal_crest_frame_"+name, "3", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"/ /\",", "\"/#/\",", "\"/ /\"");
            ModJsonHelper.createShapedRecipe("vertical_crest_frame_"+name, "3", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"///\",", "\" # \",", "\"///\"");
            ModJsonHelper.createShapedRecipe("perpendicular_crest_frame_"+name, "4", "wildfields:stripped_"+name+"_log", "aestheticframes:frame_"+name,
                    "\"///\",", "\"/#/\",", "\"///\"");
            ModJsonHelper.createShapedRecipe("crest_scaled_frame_"+name, "4", "wildfields:stripped_"+name+"_log", "aestheticframes:crest_frame_"+name,
                    "\"///\",", "\"/#/\",", "\"///\"");
        }
    }

    private void registerFrame(RecipeExporter recipeExporter, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, frame, 4)
                .pattern("///")
                .pattern("/#/")
                .pattern("///")
                .input('#', ModBlocks.WHITENED_WHITE_TERRACOTTA)
                .input('/', strippedOak)
                .criterion(hasItem(ModBlocks.WHITENED_WHITE_TERRACOTTA), conditionsFromItem(ModBlocks.WHITENED_WHITE_TERRACOTTA))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerCrestFrame(RecipeExporter recipeExporter, Block crestFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, crestFrame, 2)
                .pattern("/ /")
                .pattern(" # ")
                .pattern("/ /")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerHorizontalFrame(RecipeExporter recipeExporter, Block horizontalFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, horizontalFrame, 1)
                .pattern("/#/")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerVerticalFrame(RecipeExporter recipeExporter, Block verticalFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, verticalFrame, 1)
                .pattern("/")
                .pattern("#")
                .pattern("/")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerPerpendicularFrame(RecipeExporter recipeExporter, Block perpendicularFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, perpendicularFrame, 2)
                .pattern(" / ")
                .pattern("/#/")
                .pattern(" / ")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerPerpendicularCrestFrame(RecipeExporter recipeExporter, Block perpendicularCrestFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, perpendicularCrestFrame, 4)
                .pattern("///")
                .pattern("/#/")
                .pattern("///")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerHorizontalCrestFrame(RecipeExporter recipeExporter, Block horizontalCrestFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, horizontalCrestFrame, 3)
                .pattern("/ /")
                .pattern("/#/")
                .pattern("/ /")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerVerticalCrestFrame(RecipeExporter recipeExporter, Block verticalCrestFrame, Block frame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, verticalCrestFrame, 3)
                .pattern("///")
                .pattern(" # ")
                .pattern("///")
                .input('#', frame)
                .input('/', strippedOak)
                .criterion(hasItem(frame), conditionsFromItem(frame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }

    private void registerScaledCrestFrame(RecipeExporter recipeExporter, Block scaledCrestFrame, Block crestFrame, Block strippedOak)
    {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, scaledCrestFrame, 4)
                .pattern("///")
                .pattern("/#/")
                .pattern("///")
                .input('#', crestFrame)
                .input('/', strippedOak)
                .criterion(hasItem(crestFrame), conditionsFromItem(crestFrame))
                .criterion(hasItem(strippedOak), conditionsFromItem(strippedOak))
                .offerTo(recipeExporter);
    }
}