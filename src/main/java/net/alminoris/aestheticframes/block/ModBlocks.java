package net.alminoris.aestheticframes.block;

import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Dictionary<String, Block> FRAMES = new Hashtable<>()
    {{
        for(String frameName : BlockSetsHelper.FRAME_TYPES)
        {
            for(String name : BlockSetsHelper.getWoods())
            {
                put(frameName+name, registerBlock(frameName+"frame_"+name, new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA))));
            }

            for(String name : BlockSetsHelper.getStones())
            {
                put(frameName+name, registerBlock(frameName+"frame_"+name, new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA))));
            }
        }
    }};

    public static final Dictionary<String, Block> SCALED_FRAMES = new Hashtable<>()
    {{
        for(String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
        {
            for(String name : BlockSetsHelper.getWoods())
            {
                put(frameName+name, registerBlock(frameName+"scaled_frame_"+name, new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA))));
            }

            for(String name : BlockSetsHelper.getStones())
            {
                put(frameName+name, registerBlock(frameName+"scaled_frame_"+name, new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA))));
            }
        }
    }};

    public static final Dictionary<String, Block> BOUNDLESS_FRAMES = new Hashtable<>()
    {{
        for(String frameName : BlockSetsHelper.BOUNDLESS_FRAME_TYPES)
        {
            for(String name : BlockSetsHelper.getWoods())
            {
                put(frameName+name, registerBlock(frameName+"boundless_frame_"+name, new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA))));
            }

            for(String name : BlockSetsHelper.getStones())
            {
                put(frameName+name, registerBlock(frameName+"boundless_frame_"+name, new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA))));
            }
        }
    }};

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AestheticFrames.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(AestheticFrames.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerBlocks()
    {

    }
}