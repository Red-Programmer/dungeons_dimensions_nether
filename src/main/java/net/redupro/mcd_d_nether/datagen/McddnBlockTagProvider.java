package net.redupro.mcd_d_nether.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.redupro.mcd_d_nether.block.McddnBlocks;

import java.util.concurrent.CompletableFuture;

public class McddnBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public McddnBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(McddnBlocks.DARK_NETHER_BRICK_FENCE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(McddnBlocks.DARK_NETHER_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(McddnBlocks.CRIMSON_IVY);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(McddnBlocks.ASH);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_NETHER).add(McddnBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_END).add(McddnBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD).add(McddnBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(McddnBlocks.CUT_BLACKSTONE)
                .add(McddnBlocks.CUT_BLACKSTONE_SLAB)
                .add(McddnBlocks.CUT_BLACKSTONE_STAIRS)
                .add(McddnBlocks.INSET_POLISHED_BLACKSTONE)
                .add(McddnBlocks.SPALLING_CUT_BLACKSTONE)
                .add(McddnBlocks.NETHER_BRICK_PILLAR)
                .add(McddnBlocks.CUT_NETHERRACK)
                .add(McddnBlocks.CUT_NETHERRACK_SLAB)
                .add(McddnBlocks.CUT_NETHERRACK_STAIRS)
                .add(McddnBlocks.INSET_POLISHED_NETHERRACK)
                .add(McddnBlocks.SPALLING_NETHER_BRICKS)
                .add(McddnBlocks.SPALLING_CUT_NETHERRACK)
                .add(McddnBlocks.RED_NETHER_BRICK_PILLAR)
                .add(McddnBlocks.CUT_RED_NETHERRACK)
                .add(McddnBlocks.CUT_RED_NETHERRACK_SLAB)
                .add(McddnBlocks.CUT_RED_NETHERRACK_STAIRS)
                .add(McddnBlocks.CHISELED_POLISHED_RED_NETHERRACK)
                .add(McddnBlocks.CHISELED_POLISHED_NETHERRACK)
                .add(McddnBlocks.INSET_POLISHED_RED_NETHERRACK)
                .add(McddnBlocks.SPALLING_RED_NETHER_BRICKS)
                .add(McddnBlocks.SPALLING_CUT_RED_NETHERRACK)
                .add(McddnBlocks.POLISHED_NETHERRACK)
                .add(McddnBlocks.POLISHED_NETHERRACK_SLAB)
                .add(McddnBlocks.POLISHED_RED_NETHERRACK)
                .add(McddnBlocks.POLISHED_RED_NETHERRACK_SLAB)
                .add(McddnBlocks.POLISHED_DARK_NETHERRACK)
                .add(McddnBlocks.POLISHED_DARK_NETHERRACK_SLAB)
                .add(McddnBlocks.DARK_NETHER_BRICKS)
                .add(McddnBlocks.DARK_NETHER_BRICK_SLAB)
                .add(McddnBlocks.DARK_NETHER_BRICK_STAIRS)
                .add(McddnBlocks.DARK_NETHER_BRICK_FENCE)
                .add(McddnBlocks.DARK_NETHER_BRICK_WALL)
                .add(McddnBlocks.MOLDY_INSET_POLISHED_BLACKSTONE)
                .add(McddnBlocks.MOLDY_CUT_BLACKSTONE)
                .add(McddnBlocks.MOLDY_INSET_POLISHED_NETHERRACK)
                .add(McddnBlocks.MOLDY_CUT_NETHERRACK)
                .add(McddnBlocks.MOLDY_INSET_POLISHED_RED_NETHERRACK)
                .add(McddnBlocks.MOLDY_CUT_RED_NETHERRACK)
                .add(McddnBlocks.ROUGH_NETHERRACK)
                .add(McddnBlocks.ASHY_BASALT);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(McddnBlocks.WARPED_WART_FLUFF)
                .add(McddnBlocks.NETHER_WART_FLUFF)
                .add(McddnBlocks.MIDNIGHT_WART_BLOCK)
                .add(McddnBlocks.MIDNIGHT_MOULD)
                .add(McddnBlocks.MOONLIGHT_MOULD);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_AXE)
                .add(McddnBlocks.WARPED_TRUNK);
    }
}
