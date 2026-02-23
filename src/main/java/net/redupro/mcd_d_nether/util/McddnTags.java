package net.redupro.mcd_d_nether.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.redupro.mcd_d_nether.DungeonsDimensionsNether;

public class McddnTags {
    public static class Blocks {
        public static final TagKey<Block> BLACKSTONE_TILES = createTag("blackstone_tiles");

        private static TagKey<Block> createTag(String id) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, id));
        }
    }
}
