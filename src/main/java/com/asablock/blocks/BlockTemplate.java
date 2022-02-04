package com.asablock.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.Tag;

public class BlockTemplate extends Block {
    public BlockTemplate(FabricBlockSettings settings, int miningLevel, Tag<Item> tool) {
        super(settings.breakByTool(tool, miningLevel));
    }

    public BlockTemplate(FabricBlockSettings settings, int miningLevel) {
        super(settings.breakByTool(FabricToolTags.PICKAXES, miningLevel));
    }

    public BlockTemplate(Settings settings) {
        super(settings);
    }

    public BlockTemplate(FabricBlockSettings settings) {
        super(settings);
    }
}
