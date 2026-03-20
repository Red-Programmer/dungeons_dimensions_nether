package net.redupro.mcd_d_nether;

import net.fabricmc.api.ModInitializer;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElementType;
import net.redupro.mcd_d_nether.block.McddnBlocks;
import net.redupro.mcd_d_nether.block.custom.*;
import net.redupro.mcd_d_nether.item.McddnItems;
import net.redupro.mcd_d_nether.world.level.levelgen.feature.*;
import net.redupro.mcd_d_nether.world.level.levelgen.structure.pools.FreeFeaturePoolElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonsDimensionsNether implements ModInitializer {
	public static final String MOD_ID = "mcd_d_nether";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Identifier MCDDN_HUGE_FUNGUS_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "mcddn_huge_fungus");
    public static final Identifier STACKED_FEATURE_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "simple_stacked_feature");
    public static final Identifier ADVANCED_BLOCK_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "advanced_block");
    public static final Identifier IVY_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "crimson_ivy");
    public static final Identifier NETHER_WALL_FLOWER_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "nether_wall_flower");
    public static final Identifier GASEOUS_GLOB_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "gaseous_glob");
    public static final Identifier ASH_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "ash");
    public static final Identifier FORTRESS_CAP_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "fortress_cap");
    public static final Identifier BIG_FORTRESS_CAP_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "big_fortress_cap");
    public static final Identifier WARPING_VINES_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "warping_vines");

    public static final McddnHugeFungusFeature MCDDN_HUGE_FUNGUS_FEATURE = new McddnHugeFungusFeature(McddnHugeFungusFeatureConfig.CODEC);
    public static final SimpleStackedFeature SIMPLE_STACKED_FEATURE = new SimpleStackedFeature(SimpleRandomFeatureConfiguration.CODEC);
    public static final AdvancedBlockFeature ADVANCED_BLOCK_FEATURE = new AdvancedBlockFeature(AdvancedBlockFeatureConfig.CODEC);
    public static final CrimsonIvyFeature CRIMSON_IVY_FEATURE = new CrimsonIvyFeature(NoneFeatureConfiguration.CODEC);
    public static final NetherWallFlowerFeature NETHER_WALL_FLOWER_FEATURE = new NetherWallFlowerFeature(NoneFeatureConfiguration.CODEC);
    public static final GaseousGlobFeature GASEOUS_GLOB_FEATURE = new GaseousGlobFeature(NoneFeatureConfiguration.CODEC);
    public static final AshFeature ASH_FEATURE = new AshFeature(NoneFeatureConfiguration.CODEC);
    public static final FortressCapFeature FORTRESS_CAP_FEATURE = new FortressCapFeature(NoneFeatureConfiguration.CODEC);
    public static final BigFortressCapFeature BIG_FORTRESS_CAP_FEATURE = new BigFortressCapFeature(NoneFeatureConfiguration.CODEC);
    public static final WarpingVinesFeature WARPING_VINES_FEATURE = new WarpingVinesFeature(NoneFeatureConfiguration.CODEC);


    @Override
	public void onInitialize() {
        McddnBlocks.registerMcddnBlocks();
        McddnItems.registerMcddnItems();

        Registry.register(BuiltInRegistries.BLOCK_TYPE, "wart_fluff", WartFluffBlock.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "nether_wall_flower", NetherWallFlower.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "quad_brush", QuadBrushBlock.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "ivy", IvyBlock.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "glob", GlobBlock.CODEC);

        Registry.register(BuiltInRegistries.FEATURE, MCDDN_HUGE_FUNGUS_ID, MCDDN_HUGE_FUNGUS_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, STACKED_FEATURE_ID, SIMPLE_STACKED_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, ADVANCED_BLOCK_ID, ADVANCED_BLOCK_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, IVY_ID, CRIMSON_IVY_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, NETHER_WALL_FLOWER_ID, NETHER_WALL_FLOWER_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, GASEOUS_GLOB_ID, GASEOUS_GLOB_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, ASH_ID, ASH_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, FORTRESS_CAP_ID, FORTRESS_CAP_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, BIG_FORTRESS_CAP_ID, BIG_FORTRESS_CAP_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, WARPING_VINES_ID, WARPING_VINES_FEATURE);

        Registry.register(BuiltInRegistries.STRUCTURE_POOL_ELEMENT, Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "free_feature_pool_element"), (StructurePoolElementType<FreeFeaturePoolElement>) () -> FreeFeaturePoolElement.CODEC);
    }
}