package net.alminoris.aestheticframes.item;

import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.block.ModBlocks;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup AFS_TAB = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AestheticFrames.MOD_ID, "afstab"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.afstab"))
                    .icon(() -> new ItemStack(ModBlocks.FRAMES.get("oak"))).entries((displayContext, entries) ->
                    {
                        entries.add(ModBlocks.WHITENED_WHITE_TERRACOTTA);

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            for (String frameName : BlockSetsHelper.FRAME_TYPES)
                                entries.add(ModBlocks.FRAMES.get(frameName+name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                for (String frameName : BlockSetsHelper.FRAME_TYPES)
                                    entries.add(ModBlocks.FRAMES.get(frameName+name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                for (String frameName : BlockSetsHelper.FRAME_TYPES)
                                    entries.add(ModBlocks.FRAMES.get(frameName+name));
                            }
                        }

                        for(String name : BlockSetsHelper.STONES)
                        {
                            for (String frameName : BlockSetsHelper.FRAME_TYPES)
                                entries.add(ModBlocks.FRAMES.get(frameName+name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                for (String frameName : BlockSetsHelper.FRAME_TYPES)
                                    entries.add(ModBlocks.FRAMES.get(frameName+name));
                            }
                        }

                        for(String name : BlockSetsHelper.WOODS)
                        {
                            for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                                entries.add(ModBlocks.SCALED_FRAMES.get(frameName+name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("arborealnature"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_AN)
                            {
                                for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                                    entries.add(ModBlocks.SCALED_FRAMES.get(frameName+name));
                            }
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_WOODS_WF)
                            {
                                for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                                    entries.add(ModBlocks.SCALED_FRAMES.get(frameName+name));
                            }
                        }

                        for(String name : BlockSetsHelper.STONES)
                        {
                            for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                                entries.add(ModBlocks.SCALED_FRAMES.get(frameName+name));
                        }

                        if (FabricLoader.getInstance().isModLoaded("wildfields"))
                        {
                            for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                            {
                                for (String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
                                    entries.add(ModBlocks.SCALED_FRAMES.get(frameName+name));
                            }
                        }
                    }).build());

    public static void registerItemGroups()
    {

    }
}