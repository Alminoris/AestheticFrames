package net.alminoris.aestheticframes.util.helper;

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
                    "crimson", "warped", "mangrove", "cherry", "bamboo"
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
        String[] combinedWoods = new String[WOODS.length + EXTRA_WOODS_AN.length + EXTRA_WOODS_WF.length];
        System.arraycopy(WOODS, 0, combinedWoods, 0, WOODS.length);
        System.arraycopy(EXTRA_WOODS_AN, 0, combinedWoods, WOODS.length, EXTRA_WOODS_AN.length);
        System.arraycopy(EXTRA_WOODS_WF, 0, combinedWoods, WOODS.length + EXTRA_WOODS_AN.length, EXTRA_WOODS_WF.length);
        return combinedWoods;
    }

    public static String[] getStones()
    {
        String[] combinedStones = new String[STONES.length + EXTRA_STONES_WF.length];
        System.arraycopy(STONES, 0, combinedStones, 0, STONES.length);
        System.arraycopy(EXTRA_STONES_WF, 0, combinedStones, STONES.length, EXTRA_STONES_WF.length);
        return combinedStones;
    }
}