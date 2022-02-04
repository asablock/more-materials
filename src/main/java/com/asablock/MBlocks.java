package com.asablock;

import com.asablock.blocks.BlockTemplate;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class MBlocks {
    // Ore
    public static final Block COPPER_ORE_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_ORE), 1);
    public static final Block TIN_ORE_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_ORE), 1);
    public static final Block ALUMINUM_ORE_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_ORE), 1);
    public static final Block SAPPHIRE_ORE_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_ORE), 2);
    public static final Block RUBY_ORE_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_ORE), 2);

    // Block
    public static final Block COPPER_BLOCK_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), 1);
    public static final Block TIN_BLOCK_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), 1);
    public static final Block ALUMINUM_BLOCK_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), 1);
    public static final Block SAPPHIRE_BLOCK_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), 2);
    public static final Block RUBY_BLOCK_BLOCK = new BlockTemplate(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK), 2);

    /**
     * Register a block to Minecraft.
     * @param id Block ID.
     * @param block {@code Block} object.
     * @param registerItem Whether the method register the {@code BlockItem} of the block.
     * @see Block
     * @see BlockItem
     * @author asablock
     */
    public static void registerBlock(String id, Block block, boolean registerItem) {
        Registry.register(Registry.BLOCK, new Identifier("more-materials", id), block);
        if (registerItem) Registry.register(Registry.ITEM, new Identifier("more-materials", id),
                new BlockItem(block, new Item.Settings().group(MoreMaterialsMod.GROUP)));
    }
}
