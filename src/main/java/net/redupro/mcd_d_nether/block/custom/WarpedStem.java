package net.redupro.mcd_d_nether.block.custom;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class WarpedStem extends RotatedPillarBlock {
    public static final IntegerProperty DISTANCE = BlockStateProperties.DISTANCE;
    public WarpedStem(Properties settings) {
        super(settings);
        this.registerDefaultState(this.defaultBlockState().setValue(DISTANCE, 4).setValue(AXIS, Direction.Axis.Y));
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(DISTANCE, AXIS);
    }
}
