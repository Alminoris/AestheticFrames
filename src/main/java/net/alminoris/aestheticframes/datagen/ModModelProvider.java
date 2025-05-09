package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.block.ModBlocks;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITENED_WHITE_TERRACOTTA);

        for(String name : BlockSetsHelper.getWoods())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                blockStateModelGenerator.registerSimpleState(ModBlocks.FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registry.BLOCK.getId(ModBlocks.FRAMES.get(frameName+name)).getPath()));
            }

            for(String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
            {
                blockStateModelGenerator.registerSimpleState(ModBlocks.SCALED_FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.SCALED_FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registry.BLOCK.getId(ModBlocks.SCALED_FRAMES.get(frameName+name)).getPath()));
            }
        }

        for(String name : BlockSetsHelper.getStones())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                blockStateModelGenerator.registerSimpleState(ModBlocks.FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registry.BLOCK.getId(ModBlocks.FRAMES.get(frameName+name)).getPath()));
            }

            for(String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
            {
                blockStateModelGenerator.registerSimpleState(ModBlocks.SCALED_FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.SCALED_FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registry.BLOCK.getId(ModBlocks.SCALED_FRAMES.get(frameName+name)).getPath()));
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
    }
}