package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.block.ModBlocks;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider
{
    public ModModelProvider(FabricDataOutput output)
    {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator)
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                blockStateModelGenerator.registerSimpleState(ModBlocks.FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registries.BLOCK.getId(ModBlocks.FRAMES.get(frameName+name)).getPath()));

                blockStateModelGenerator.registerSimpleState(ModBlocks.SCALED_FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.SCALED_FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registries.BLOCK.getId(ModBlocks.SCALED_FRAMES.get(frameName+name)).getPath()));
            }
        }

        for(String name : BlockSetsHelper.getStones())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                blockStateModelGenerator.registerSimpleState(ModBlocks.FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registries.BLOCK.getId(ModBlocks.FRAMES.get(frameName+name)).getPath()));

                blockStateModelGenerator.registerSimpleState(ModBlocks.SCALED_FRAMES.get(frameName+name));
                blockStateModelGenerator.registerParentedItemModel(ModBlocks.SCALED_FRAMES.get(frameName+name), Identifier.of(AestheticFrames.MOD_ID,
                        "block/"+ Registries.BLOCK.getId(ModBlocks.SCALED_FRAMES.get(frameName+name)).getPath()));
            }
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator)
    {
    }
}