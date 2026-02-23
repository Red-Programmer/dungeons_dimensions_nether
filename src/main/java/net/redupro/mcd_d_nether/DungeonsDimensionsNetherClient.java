package net.redupro.mcd_d_nether;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.redupro.mcd_d_nether.block.ModBlocks;

public class DungeonsDimensionsNetherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_TRUNK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Blocks.WARPED_WART_BLOCK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_WARPED_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_WART_FLUFF, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NETHER_WART_FLUFF, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_STALK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_STALK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SHY_SUCCULENT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOONLIGHT_MILDEW, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MIDNIGHT_MILDEW, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FLUORESCENT_FUNGUS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FEELER_FLOWER, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FROG_FLOWER, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FUNGAL_FERN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SIPHON_STALK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NETHER_WALL_FLOWER, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLOODTHORN_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GASEOUS_GLOB, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OBSERVER_ORCHIDS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.STOUTSHROOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_BRUSH, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TEAL_BRUSH, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MOONLIGHT_MOULD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MIDNIGHT_MOULD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_IVY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.SPORANGIUM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.TALL_SPORANGIUM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WARPED_FILAMENT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_FILAMENT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CRIMSON_SPROUTS, RenderType.cutout());
    }
}
