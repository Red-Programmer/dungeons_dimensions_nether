package net.redupro.mcd_d_nether;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;

public class DungeonsDimensionsNetherClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer(DungeonsDimensionsNether.MOD_ID).ifPresent(modContainer -> {
            ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, "custom_fortress"), modContainer, Component.translatable("Custom Nether Fortress"), PackActivationType.DEFAULT_ENABLED);
        });
    }
}
