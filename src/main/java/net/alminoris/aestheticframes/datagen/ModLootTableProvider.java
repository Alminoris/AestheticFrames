package net.alminoris.aestheticframes.datagen;

import net.alminoris.aestheticframes.block.ModBlocks;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider
{
    public ModLootTableProvider(FabricDataGenerator dataGenerator)
    {
        super(dataGenerator);
    }

    @Override
    public void generateBlockLootTables()
    {
        addDrop(ModBlocks.WHITENED_WHITE_TERRACOTTA);

        for(String name : BlockSetsHelper.getWoods())
        {
            for (String frameName : BlockSetsHelper.FRAME_TYPES)
                addDrop(ModBlocks.FRAMES.get(frameName+name));

            for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                addDrop(ModBlocks.SCALED_FRAMES.get(frameName+name));
        }

        for(String name : BlockSetsHelper.getStones())
        {
            for (String frameName : BlockSetsHelper.FRAME_TYPES)
                addDrop(ModBlocks.FRAMES.get(frameName+name));

            for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                addDrop(ModBlocks.SCALED_FRAMES.get(frameName+name));
        }
    }
}