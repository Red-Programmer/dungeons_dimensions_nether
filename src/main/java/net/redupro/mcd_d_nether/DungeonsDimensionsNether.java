package net.redupro.mcd_d_nether;

import com.mojang.serialization.MapCodec;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleRandomFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElementType;
import net.redupro.mcd_d_nether.block.ModBlocks;
import net.redupro.mcd_d_nether.block.custom.*;
import net.redupro.mcd_d_nether.item.ModItems;
import net.redupro.mcd_d_nether.world.level.levelgen.feature.*;
import net.redupro.mcd_d_nether.world.level.levelgen.structure.pools.FreeFeaturePoolElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DungeonsDimensionsNether implements ModInitializer {
	public static final String MOD_ID = "mcd_d_nether";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Identifier MOD_HUGE_FUNGUS_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "mod_huge_fungus");
    public static final Identifier STACKED_FEATURE_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "simple_stacked_feature");
    public static final Identifier ADVANCED_BLOCK_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "advanced_block");
    public static final Identifier IVY_FEATURE_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "crimson_ivy");
    public static final Identifier NETHER_WALL_FLOWER_PATCH_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "nether_wall_flower_patch");
    public static final Identifier GASEOUS_GLOB_PATCH_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "gaseous_glob_patch");
    public static final Identifier ASH_PATCH_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "ash_patch");
    public static final Identifier FORTRESS_CAP_ID = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "fortress_cap");

    public static final ModifiedHugeFungusFeature MOD_HUGE_FUNGUS_FEATURE = new ModifiedHugeFungusFeature(ModifiedHugeFungusFeatureConfig.CODEC);
    public static final SimpleStackedFeature SIMPLE_STACKED_FEATURE = new SimpleStackedFeature(SimpleRandomFeatureConfiguration.CODEC);
    public static final AdvancedBlockFeature ADVANCED_BLOCK_FEATURE = new AdvancedBlockFeature(AdvancedBlockFeatureConfig.CODEC);
    public static final CrimsonIvyFeature CRIMSON_IVY_FEATURE = new CrimsonIvyFeature(NoneFeatureConfiguration.CODEC);
    public static final NetherWallFlowerPatchFeature NETHER_WALL_FLOWER_PATCH_FEATURE = new NetherWallFlowerPatchFeature(RandomPatchConfiguration.CODEC);
    public static final GaseousGlobPatchFeature GASEOUS_GLOB_PATCH_FEATURE = new GaseousGlobPatchFeature(RandomPatchConfiguration.CODEC);
    public static final AshPatchFeature ASH_PATCH_FEATURE = new AshPatchFeature(RandomPatchConfiguration.CODEC);
    public static final FortressCapFeature FORTRESS_CAP_FEATURE = new FortressCapFeature(NoneFeatureConfiguration.CODEC);


    @Override
	public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItems.registerModItems();

        BlockRenderLayerMap.putBlock(Blocks.WARPED_STEM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(Blocks.WARPED_WART_BLOCK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WARPED_BLOSSOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.POTTED_WARPED_BLOSSOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WARPED_WART_FLUFF, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.NETHER_WART_FLUFF, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WARPED_STALK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CRIMSON_STALK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SHY_SUCCULENT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOONLIGHT_MILDEW, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MIDNIGHT_MILDEW, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FLUORESCENT_FUNGUS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FEELER_FLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FROG_FLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.FUNGAL_FERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SIPHON_STALK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.NETHER_WALL_FLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BLOODTHORN_BLOSSOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.GASEOUS_GLOB, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.OBSERVER_ORCHIDS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.STOUTSHROOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.RED_BRUSH, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.TEAL_BRUSH, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MOONLIGHT_MOULD, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MIDNIGHT_MOULD, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CRIMSON_IVY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.SPORANGIUM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.TALL_SPORANGIUM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.WARPED_FILAMENT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CRIMSON_FILAMENT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CRIMSON_SPROUTS, ChunkSectionLayer.CUTOUT);

        Registry.register(BuiltInRegistries.BLOCK_TYPE, "wart_fluff", WartFluffBlock.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "nether_wall_flower", NetherWallFlower.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "quad_brush", QuadBrushBlock.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "ivy", IvyBlock.CODEC);
        Registry.register(BuiltInRegistries.BLOCK_TYPE, "glob", GlobBlock.CODEC);

        Registry.register(BuiltInRegistries.FEATURE, MOD_HUGE_FUNGUS_ID, MOD_HUGE_FUNGUS_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, STACKED_FEATURE_ID, SIMPLE_STACKED_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, ADVANCED_BLOCK_ID, ADVANCED_BLOCK_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, IVY_FEATURE_ID, CRIMSON_IVY_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, NETHER_WALL_FLOWER_PATCH_ID, NETHER_WALL_FLOWER_PATCH_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, GASEOUS_GLOB_PATCH_ID, GASEOUS_GLOB_PATCH_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, ASH_PATCH_ID, ASH_PATCH_FEATURE);
        Registry.register(BuiltInRegistries.FEATURE, FORTRESS_CAP_ID, FORTRESS_CAP_FEATURE);

        Registry.register(BuiltInRegistries.STRUCTURE_POOL_ELEMENT, Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "free_feature_pool_element" +
                ""), (StructurePoolElementType<FreeFeaturePoolElement>) () -> FreeFeaturePoolElement.CODEC);

    }
}