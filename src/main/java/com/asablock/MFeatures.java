package com.asablock;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public final class MFeatures {
    public static ConfiguredFeature<?, ?> COPPER_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MBlocks.COPPER_ORE_BLOCK.getDefaultState(),
                    12))
            .rangeOf(64)
            .spreadHorizontally()
            .repeat(12);

    public static ConfiguredFeature<?, ?> TIN_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MBlocks.TIN_ORE_BLOCK.getDefaultState(),
                    9))
            .rangeOf(64)
            .spreadHorizontally()
            .repeat(10);

    public static ConfiguredFeature<?, ?> ALUMINUM_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MBlocks.ALUMINUM_ORE_BLOCK.getDefaultState(),
                    9))
            .rangeOf(64)
            .spreadHorizontally()
            .repeat(9);

    public static ConfiguredFeature<?, ?> SAPPHIRE_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MBlocks.SAPPHIRE_ORE_BLOCK.getDefaultState(),
                    9))
            .rangeOf(35)
            .spreadHorizontally()
            .repeat(11);

    public static ConfiguredFeature<?, ?> RUBY_ORE_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
                    MBlocks.RUBY_ORE_BLOCK.getDefaultState(),
                    9))
            .rangeOf(42)
            .spreadHorizontally()
            .repeat(13);

    /**
     * Register a feature to minecraft.
     * @param id Feature ID.
     * @param feature {@code ConfiguredFeature} object.
     * @see ConfiguredFeature
     * @author asablock
     */
    @SuppressWarnings("deprecation")
    public static void registerFeature(String id, ConfiguredFeature<?, ?> feature) {
        RegistryKey<ConfiguredFeature<?, ?>> key = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
                new Identifier("more-materials", id));
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, key.getValue(), feature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, key);
    }
}
