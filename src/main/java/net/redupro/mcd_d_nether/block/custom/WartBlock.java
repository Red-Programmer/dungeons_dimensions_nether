package net.redupro.mcd_d_nether.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.redupro.mcd_d_nether.block.McddnBlocks;

public class WartBlock extends Block {
    public WartBlock(Properties properties) {
        super(properties);
    }
    @Override
    protected void onPlace(BlockState blockState, Level level, BlockPos blockPos, BlockState blockState2, boolean bl) {
        if (level.getBlockState(blockPos.below()).isAir()) {
            level.setBlock(blockPos.below(), McddnBlocks.WARPED_WART_HANGING.defaultBlockState(), 2);
        }
    }
}
