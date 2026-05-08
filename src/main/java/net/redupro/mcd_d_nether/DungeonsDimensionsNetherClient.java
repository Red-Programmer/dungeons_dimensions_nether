package net.redupro.mcd_d_nether;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.redupro.mcd_d_nether.block.McddnBlocks;

public class DungeonsDimensionsNetherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_TRUNK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_WART_HANGING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPING_VINES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPING_VINES_PLANT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.POTTED_WARPED_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.POTTED_CRIMSON_SPROUTS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_WART_FLUFF, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.NETHER_WART_FLUFF, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_STALK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.CRIMSON_STALK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.SHY_SUCCULENT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.MOONLIGHT_MILDEW, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.MIDNIGHT_MILDEW, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.FLUORESCENT_FUNGUS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.FEELER_FLOWER, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.FROG_FLOWER, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.FUNGAL_FERN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.SIPHON_STALK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.NETHER_WALL_FLOWER, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.BLOODTHORN_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.GASEOUS_GLOB, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.OBSERVER_ORCHIDS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.STOUTSHROOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.RED_BRUSH, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.TEAL_BRUSH, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.MOONLIGHT_MOULD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.MIDNIGHT_MOULD, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.CRIMSON_IVY, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.SPORANGIUM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.TALL_SPORANGIUM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_FILAMENT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.CRIMSON_FILAMENT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.CRIMSON_SPROUTS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.BONE_FENCE, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.NETHERITE_BARS, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.NETHERITE_CHAIN, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.NETHERITE_SPIKE, RenderType.cutout());
    }
}
