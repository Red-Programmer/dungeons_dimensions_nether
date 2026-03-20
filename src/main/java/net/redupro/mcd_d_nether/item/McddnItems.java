package net.redupro.mcd_d_nether.item;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.redupro.mcd_d_nether.DungeonsDimensionsNether;


public class McddnItems {

    private static Item register(String name) {
        ResourceKey< Item > itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name));
        return Registry.register(BuiltInRegistries.ITEM, itemKey, new Item(new Item.Properties().setId(itemKey)));
    }
    public static void registerMcddnItems() {
        DungeonsDimensionsNether.LOGGER.info("Registering Mod Items for " + DungeonsDimensionsNether.MOD_ID);
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(fabricItemGroupEntries -> {

        });
    }

}
