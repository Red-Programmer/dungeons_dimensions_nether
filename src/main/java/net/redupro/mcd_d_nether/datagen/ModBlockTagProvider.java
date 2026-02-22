package net.redupro.mcd_d_nether.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import net.redupro.mcd_d_nether.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.DARK_NETHER_BRICK_FENCE);
        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DARK_NETHER_BRICK_WALL);
        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .add(ModBlocks.CRIMSON_IVY);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.ASH);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_NETHER).add(ModBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_END).add(ModBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD).add(ModBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.CUT_BLACKSTONE)
                .add(ModBlocks.CUT_BLACKSTONE_SLAB)
                .add(ModBlocks.CUT_BLACKSTONE_STAIRS)
                .add(ModBlocks.INSET_POLISHED_BLACKSTONE)
                .add(ModBlocks.SPALLING_CUT_BLACKSTONE)
                .add(ModBlocks.NETHER_BRICK_PILLAR)
                .add(ModBlocks.CUT_NETHERRACK)
                .add(ModBlocks.CUT_NETHERRACK_SLAB)
                .add(ModBlocks.CUT_NETHERRACK_STAIRS)
                .add(ModBlocks.INSET_POLISHED_NETHERRACK)
                .add(ModBlocks.SPALLING_NETHER_BRICKS)
                .add(ModBlocks.SPALLING_CUT_NETHERRACK)
                .add(ModBlocks.RED_NETHER_BRICK_PILLAR)
                .add(ModBlocks.CUT_RED_NETHERRACK)
                .add(ModBlocks.CUT_RED_NETHERRACK_SLAB)
                .add(ModBlocks.CUT_RED_NETHERRACK_STAIRS)
                .add(ModBlocks.CHISELED_POLISHED_RED_NETHERRACK)
                .add(ModBlocks.CHISELED_POLISHED_NETHERRACK)
                .add(ModBlocks.INSET_POLISHED_RED_NETHERRACK)
                .add(ModBlocks.SPALLING_RED_NETHER_BRICKS)
                .add(ModBlocks.SPALLING_CUT_RED_NETHERRACK)
                .add(ModBlocks.POLISHED_NETHERRACK)
                .add(ModBlocks.POLISHED_NETHERRACK_SLAB)
                .add(ModBlocks.POLISHED_RED_NETHERRACK)
                .add(ModBlocks.POLISHED_RED_NETHERRACK_SLAB)
                .add(ModBlocks.POLISHED_DARK_NETHERRACK)
                .add(ModBlocks.POLISHED_DARK_NETHERRACK_SLAB)
                .add(ModBlocks.DARK_NETHER_BRICKS)
                .add(ModBlocks.DARK_NETHER_BRICK_SLAB)
                .add(ModBlocks.DARK_NETHER_BRICK_STAIRS)
                .add(ModBlocks.DARK_NETHER_BRICK_FENCE)
                .add(ModBlocks.DARK_NETHER_BRICK_WALL)
                .add(ModBlocks.MOLDY_INSET_POLISHED_BLACKSTONE)
                .add(ModBlocks.MOLDY_CUT_BLACKSTONE)
                .add(ModBlocks.MOLDY_INSET_POLISHED_NETHERRACK)
                .add(ModBlocks.MOLDY_CUT_NETHERRACK)
                .add(ModBlocks.MOLDY_INSET_POLISHED_RED_NETHERRACK)
                .add(ModBlocks.MOLDY_CUT_RED_NETHERRACK)
                .add(ModBlocks.ROUGH_NETHERRACK);
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_HOE)
                .add(ModBlocks.WARPED_WART_FLUFF)
                .add(ModBlocks.NETHER_WART_FLUFF)
                .add(ModBlocks.MIDNIGHT_WART_BLOCK)
                .add(ModBlocks.MIDNIGHT_MOULD)
                .add(ModBlocks.MOONLIGHT_MOULD);
    }
}
