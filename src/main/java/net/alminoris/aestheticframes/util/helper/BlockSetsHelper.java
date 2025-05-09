package net.alminoris.aestheticframes.util.helper;

import net.alminoris.aestheticframes.item.ModItemGroups;

public class BlockSetsHelper
{
    public static final String[] COLORS =
            {
                    "black", "brown", "gray", "light_gray",
                    "white", "red", "orange", "yellow",
                    "purple", "magenta", "pink", "blue",
                    "cyan", "light_blue", "green", "lime"
            };

    public static final String[] STONES =
            {
                    "stone", "tuff", "blackstone", "andesite", "diorite", "granite",  "deepslate", "basalt_side",
                    "quartz_block_bottom", "stone_bricks", "bricks", "mud_bricks", "sandstone"
            };

    public static final String[] EXTRA_STONES_WF =
            {
                    "dolomite_block", "saltmarsh_block"
            };

    public static final String[] WOODS =
            {
                    "oak", "birch", "spruce", "jungle", "acacia", "dark_oak",
                    "crimson", "warped", "mangrove"
            };

    public static final String[] EXTRA_WOODS_AN =
            {
                    "hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum", "white_mulberry", "wild_cherry",
                    "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper"
            };

    public static final String[] EXTRA_WOODS_WF =
            {
                    "olive", "tamarisk"
            };

    public static final String[] FRAME_TYPES =
            {
                    "", "horizontal_", "vertical_", "perpendicular_", "crest_", "horizontal_crest_", "vertical_crest_", "perpendicular_crest_"
            };

    public static final String[] BOUNDLESS_FRAME_TYPES =
            {
                    "horizontal_", "vertical_", "perpendicular_", "crest_", "horizontal_crest_", "vertical_crest_", "perpendicular_crest_"
            };

    public static final String[] SCALED_FRAME_TYPES =
            {
                    "crest_"
            };

    public static String[] getWoods()
    {
        String[] combinedWoods = new String[WOODS.length + ModItemGroups.EXTRA_WOODS_AN.size() + ModItemGroups.EXTRA_WOODS_WF.size()];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(ModItemGroups.EXTRA_WOODS_AN.toArray(new String[ModItemGroups.EXTRA_WOODS_AN.size()]), 0, combinedWoods, WOODS.length, ModItemGroups.EXTRA_WOODS_AN.size());
        System.arraycopy(ModItemGroups.EXTRA_WOODS_WF.toArray(new String[ModItemGroups.EXTRA_WOODS_WF.size()]), 0, combinedWoods, WOODS.length+ModItemGroups.EXTRA_WOODS_AN.size(), ModItemGroups.EXTRA_WOODS_WF.size());
        return combinedWoods;
    }

    public static String[] getStones()
    {
        String[] combinedStones = new String[STONES.length + ModItemGroups.EXTRA_STONES_WF.size()];
        System.arraycopy(STONES, 0, combinedStones, 0, STONES.length);
        System.arraycopy(ModItemGroups.EXTRA_STONES_WF.toArray(new String[ModItemGroups.EXTRA_STONES_WF.size()]), 0, combinedStones, STONES.length, ModItemGroups.EXTRA_STONES_WF.size());
        return combinedStones;
    }
}