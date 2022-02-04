package com.asablock;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * Item constants and method for initializing.
 * @author asablock
 * @see MoreMaterialsMod
 */
public final class MItems {
    // Ingot
    public static final Item COPPER_INGOT_ITEM = craftingItemBuilder();
    public static final Item ALUMINUM_INGOT_ITEM = craftingItemBuilder();
    public static final Item TIN_INGOT_ITEM = craftingItemBuilder();

    // Other
    public static final Item SAPPHIRE_ITEM = craftingItemBuilder();
    public static final Item RUBY_ITEM = craftingItemBuilder();

    // Dust
    public static final Item NETHERITE_DUST_ITEM = craftingItemBuilder();
    public static final Item IRON_DUST_ITEM = craftingItemBuilder();
    public static final Item GOLD_DUST_ITEM = craftingItemBuilder();
    public static final Item DIAMOND_DUST_ITEM = craftingItemBuilder();
    public static final Item LAPIS_DUST_ITEM = craftingItemBuilder();
    public static final Item EMERALD_DUST_ITEM = craftingItemBuilder();
    public static final Item COAL_DUST_ITEM = craftingItemBuilder();
    public static final Item ALUMINUM_DUST_ITEM = craftingItemBuilder();
    public static final Item COPPER_DUST_ITEM = craftingItemBuilder();
    public static final Item TIN_DUST_ITEM = craftingItemBuilder();
    public static final Item SAPPHIRE_DUST_ITEM = craftingItemBuilder();
    public static final Item RUBY_DUST_ITEM = craftingItemBuilder();

    // Nugget
    public static final Item NETHERITE_NUGGET_ITEM = craftingItemBuilder();
    public static final Item COPPER_NUGGET_ITEM = craftingItemBuilder();
    public static final Item TIN_NUGGET_ITEM = craftingItemBuilder();
    public static final Item ALUMINUM_NUGGET_ITEM = craftingItemBuilder();

    /**
     * Register an item to Minecraft.
     * @param id Item ID.
     * @param item {@code Item} object.
     * @see Item
     * @author asablock
     */
    public static void registerItem(String id, Item item) {
        Registry.register(Registry.ITEM, new Identifier("more-materials", id), item);
    }

    private static Item craftingItemBuilder() {
        return new Item(new Item.Settings().group(MoreMaterialsMod.GROUP));
    }
}
