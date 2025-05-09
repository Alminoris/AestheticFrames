package net.alminoris.aestheticframes.item;

import net.alminoris.aestheticframes.AestheticFrames;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(AestheticFrames.MOD_ID, name), item);
    }

    public static void registerItems()
    {

    }
}
