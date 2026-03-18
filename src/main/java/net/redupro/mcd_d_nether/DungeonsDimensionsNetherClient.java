package net.redupro.mcd_d_nether;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.redupro.mcd_d_nether.block.McddnBlocks;

public class DungeonsDimensionsNetherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(DungeonsDimensionsNether.MOD_ID).ifPresent(modContainer -> {
            ResourceManagerHelper.registerBuiltinResourcePack(ResourceLocation.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "custom_fortress"), modContainer, Component.translatable("Custom Nether Fortress"), ResourcePackActivationType.DEFAULT_ENABLED);
        });

        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_TRUNK, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_WART_HANGING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPING_VINES, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPING_VINES_PLANT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.WARPED_BLOSSOM, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(McddnBlocks.POTTED_WARPED_BLOSSOM, RenderType.cutout());
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
    }
}
