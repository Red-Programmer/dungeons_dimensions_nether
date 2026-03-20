package net.redupro.mcd_d_nether.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.redupro.mcd_d_nether.DungeonsDimensionsNether;

public class McddnTags {
    public static class Blocks {
        public static final TagKey<Block> BLACKSTONE_TILES = createTag("blackstone_tiles");
        public static final TagKey<Block> ORNATE_BLACKSTONE_TILES = createTag("inlaid_blackstone_tiles");
        public static final TagKey<Block> BASALT_CANNOT_PLACE_ON = createTag("basalt_cannot_place_on");

        private static TagKey<Block> createTag(String id) {
            return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, id));
        }
    }
}
