package net.redupro.mcd_d_nether.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.redupro.mcd_d_nether.block.Ashy;
import net.redupro.mcd_d_nether.block.ModBlocks;


public class BasaltBlock extends RotatedPillarBlock {
    public static final BooleanProperty ASHY = Ashy.ASHY;
    public BasaltBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(ASHY, false).setValue(AXIS, Direction.Axis.Y));
    }

    @Override
    protected BlockState updateShape(
            BlockState blockState,
            Direction direction,
            BlockState blockState2,
            LevelAccessor levelAccessor,
            BlockPos blockPos,
            BlockPos blockPos2
    ) {
        if (levelAccessor.getBlockState(blockPos.above()).is(ModBlocks.ASH)) {
            return blockState.setValue(ASHY, true);
        }
        return blockState;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(ASHY, AXIS);
    }
}
