package net.alminoris.aestheticframes.block;

import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.item.ModItemGroups;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.Dictionary;
import java.util.Hashtable;

public class ModBlocks
{
    public static final Block WHITENED_WHITE_TERRACOTTA = registerBlock("whitened_white_terracotta", new Block(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));

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

    public static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, Identifier.of(AestheticFrames.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block)
    {
        Registry.register(Registry.ITEM, Identifier.of(AestheticFrames.MOD_ID, name),
                new BlockItem(block, new Item.Settings().group(ModItemGroups.AFS_TAB)));
    }

    public static void registerBlocks()
    {

    }
}