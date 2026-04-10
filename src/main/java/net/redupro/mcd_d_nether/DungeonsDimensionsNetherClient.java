package net.redupro.mcd_d_nether;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.redupro.mcd_d_nether.block.McddnBlocks;

public class DungeonsDimensionsNetherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPED_TRUNK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPED_WART_HANGING, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPING_VINES, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPING_VINES_PLANT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPED_BLOSSOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.POTTED_WARPED_BLOSSOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPED_WART_FLUFF, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.NETHER_WART_FLUFF, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPED_STALK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.CRIMSON_STALK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.SHY_SUCCULENT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.MOONLIGHT_MILDEW, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.MIDNIGHT_MILDEW, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.FLUORESCENT_FUNGUS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.FEELER_FLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.FROG_FLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.FUNGAL_FERN, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.SIPHON_STALK, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.NETHER_WALL_FLOWER, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.BLOODTHORN_BLOSSOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.GASEOUS_GLOB, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.OBSERVER_ORCHIDS, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.STOUTSHROOM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.RED_BRUSH, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.TEAL_BRUSH, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.MOONLIGHT_MOULD, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.MIDNIGHT_MOULD, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.CRIMSON_IVY, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.SPORANGIUM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.TALL_SPORANGIUM, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.WARPED_FILAMENT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.CRIMSON_FILAMENT, ChunkSectionLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(McddnBlocks.CRIMSON_SPROUTS, ChunkSectionLayer.CUTOUT);
    }
}
