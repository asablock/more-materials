package com.asablock;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

/**
 * <p>Initializer of the mod.</p>
 * <p>ModInitializer:</p>
 * <blockquote>
 *     A mod initializer.
 * </blockquote>
 * @author asablock
 * @see ModInitializer
 */
public class MoreMaterialsMod implements ModInitializer {
	// The item group.
	public static final ItemGroup GROUP = FabricItemGroupBuilder
			.build(new Identifier("more-materials", "item_group"), () ->
					new ItemStack(Items.IRON_INGOT));

	@Override
	public void onInitialize() {
		registerItems();
		registerBlocks();
		registerFeatures();
	}

	public void registerFeatures() {
		MFeatures.registerFeature("copper_ore", MFeatures.COPPER_ORE_FEATURE);
		MFeatures.registerFeature("tin_ore", MFeatures.TIN_ORE_FEATURE);
		MFeatures.registerFeature("aluminum_ore", MFeatures.ALUMINUM_ORE_FEATURE);
		MFeatures.registerFeature("sapphire_ore", MFeatures.SAPPHIRE_ORE_FEATURE);
		MFeatures.registerFeature("ruby_ore", MFeatures.RUBY_ORE_FEATURE);
	}

	public void registerItems() {
		ingotRegisterer();
		dustRegisterer();
		nuggetRegisterer();
		// other
		MItems.registerItem("sapphire", MItems.SAPPHIRE_ITEM);
		MItems.registerItem("ruby", MItems.RUBY_ITEM);
	}

	public void registerBlocks() {
		MBlocks.registerBlock("copper_ore", MBlocks.COPPER_ORE_BLOCK, true);
		MBlocks.registerBlock("tin_ore", MBlocks.TIN_ORE_BLOCK, true);
		MBlocks.registerBlock("aluminum_ore", MBlocks.ALUMINUM_ORE_BLOCK, true);
		MBlocks.registerBlock("sapphire_ore", MBlocks.SAPPHIRE_ORE_BLOCK, true);
		MBlocks.registerBlock("ruby_ore", MBlocks.RUBY_ORE_BLOCK, true);
		MBlocks.registerBlock("copper_block", MBlocks.COPPER_BLOCK_BLOCK, true);
		MBlocks.registerBlock("tin_block", MBlocks.TIN_BLOCK_BLOCK, true);
		MBlocks.registerBlock("aluminum_block", MBlocks.ALUMINUM_BLOCK_BLOCK, true);
		MBlocks.registerBlock("sapphire_block", MBlocks.SAPPHIRE_BLOCK_BLOCK, true);
		MBlocks.registerBlock("ruby_block", MBlocks.RUBY_BLOCK_BLOCK, true);
	}

	public void dustRegisterer() {
		MItems.registerItem("netherite_dust", MItems.NETHERITE_DUST_ITEM);
		MItems.registerItem("iron_dust", MItems.IRON_DUST_ITEM);
		MItems.registerItem("gold_dust", MItems.GOLD_DUST_ITEM);
		MItems.registerItem("diamond_dust", MItems.DIAMOND_DUST_ITEM);
		MItems.registerItem("lapis_dust", MItems.LAPIS_DUST_ITEM);
		MItems.registerItem("emerald_dust", MItems.EMERALD_DUST_ITEM);
		MItems.registerItem("coal_dust", MItems.COAL_DUST_ITEM);
		MItems.registerItem("copper_dust", MItems.COPPER_DUST_ITEM);
		MItems.registerItem("aluminum_dust", MItems.ALUMINUM_DUST_ITEM);
		MItems.registerItem("tin_dust", MItems.TIN_DUST_ITEM);
		MItems.registerItem("sapphire_dust", MItems.SAPPHIRE_DUST_ITEM);
		MItems.registerItem("ruby_dust", MItems.RUBY_DUST_ITEM);
	}

	public void ingotRegisterer() {
		MItems.registerItem("copper_ingot", MItems.COPPER_INGOT_ITEM);
		MItems.registerItem("aluminum_ingot", MItems.ALUMINUM_INGOT_ITEM);
		MItems.registerItem("tin_ingot", MItems.TIN_INGOT_ITEM);
	}

	public void nuggetRegisterer() {
		MItems.registerItem("netherite_nugget", MItems.NETHERITE_NUGGET_ITEM);
		MItems.registerItem("copper_nugget", MItems.COPPER_NUGGET_ITEM);
		MItems.registerItem("aluminum_nugget", MItems.ALUMINUM_NUGGET_ITEM);
		MItems.registerItem("tin_nugget", MItems.TIN_NUGGET_ITEM);
	}
}
