package net.redupro.mcd_d_nether.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.AttachFace;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.redupro.mcd_d_nether.block.McddnBlocks;
import net.redupro.mcd_d_nether.util.McddnTags;

public class FortressCapFeature extends Feature<NoneFeatureConfiguration> {
    public FortressCapFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> featurePlaceContext) {
        WorldGenLevel level = featurePlaceContext.level();
        BlockPos blockPos = featurePlaceContext.origin();
        RandomSource random = featurePlaceContext.random();
        BlockPos corner;
        ChunkPos chunkPos = new ChunkPos(blockPos);
        Direction direction = getDirection(level, blockPos, chunkPos);
        if (direction == null || level.getBlockState(blockPos.below()).is(McddnTags.Blocks.BLACKSTONE_TILES)) {
            return false;
        }

        corner = blockPos.below(3).offset(direction.getOpposite().getUnitVec3i()).offset(direction.getCounterClockWise().getUnitVec3i().multiply(4));
        for (var j = 0; j < 16; j++) {
            BlockState blockState = j == 0 || j == 7 || j == 12 || j == 15 ? McddnBlocks.POLISHED_NETHERRACK.defaultBlockState() : Blocks.NETHER_BRICKS.defaultBlockState();
            drawLine(level, corner.above(j), blockState, direction.getClockWise(), 9);
        }


        for (var i = 0; i < 9; i++) {
            if (!level.getBlockState(corner.above(24).offset(direction.getClockWise().getUnitVec3i().multiply(i))).isAir()) {
                drawLine(level, corner.above(23).offset(direction.getClockWise().getUnitVec3i().multiply(i)), Blocks.NETHER_BRICKS.defaultBlockState(), Direction.DOWN, featurePlaceContext.random().nextIntBetweenInclusive(1, 3));
            }
        }



        drawLine(level, corner.above(12).offset(direction.getOpposite().getUnitVec3i()), McddnBlocks.ORNATE_NETHER_TILES.defaultBlockState(), direction.getClockWise(), 9);
        corner = corner.offset(direction.getOpposite().getUnitVec3i()).above(2);
        for (var j = 0; j < 5; j++) {
            BlockState blockState = j == 4 ? McddnBlocks.POLISHED_NETHERRACK.defaultBlockState() : Blocks.NETHER_BRICKS.defaultBlockState();
            drawLine(level, corner.above(j), blockState, direction.getClockWise(), 9);
        }
        corner = corner.offset(direction.getOpposite().getUnitVec3i());
        drawLine(level, corner.offset(direction.getClockWise().getUnitVec3i().multiply(2)), McddnBlocks.ORNATE_NETHER_TILES.defaultBlockState(), direction.getClockWise(), 5);
        corner = corner.offset(direction.getOpposite().getUnitVec3i());
        if (level.getBlockState(corner.offset(direction.getClockWise().getUnitVec3i().multiply(4))).is(McddnTags.Blocks.BLACKSTONE_TILES)) {
            drawLine(level, corner.offset(direction.getClockWise().getUnitVec3i().multiply(3)), McddnBlocks.ORNATE_BLACKSTONE_TILES.defaultBlockState(), direction.getClockWise(), 3);
        }
        BlockState fence = Blocks.NETHER_BRICK_FENCE.defaultBlockState().setValue(CrossCollisionBlock.NORTH, true).setValue(CrossCollisionBlock.EAST, true).setValue(CrossCollisionBlock.WEST, true);
        Rotation fenceRotation = direction == Direction.NORTH ? Rotation.NONE : direction == Direction.SOUTH ? Rotation.CLOCKWISE_180 : direction == Direction.EAST ? Rotation.CLOCKWISE_90 : Rotation.COUNTERCLOCKWISE_90;
        blockPos = blockPos.offset(direction.getOpposite().getUnitVec3i()).below();
        this.setBlock(level, blockPos, McddnBlocks.POLISHED_NETHERRACK.defaultBlockState());
        this.setBlock(level, blockPos.above(), fence.rotate(fenceRotation).rotate(Rotation.CLOCKWISE_180));
        this.setBlock(level, blockPos.above(2), fence.rotate(fenceRotation).rotate(Rotation.CLOCKWISE_180));
        this.setBlock(level, blockPos.above(3), Blocks.CHISELED_NETHER_BRICKS.defaultBlockState());
        if (random.nextFloat() < 0.5F) {
            placeLamp(level, blockPos.above(5).offset(direction.getOpposite().getUnitVec3i()), direction);
        }
        blockPos = blockPos.offset(direction.getOpposite().getUnitVec3i());
        this.setBlock(level, blockPos, McddnBlocks.POLISHED_NETHERRACK.defaultBlockState());
        this.setBlock(level, blockPos.above(), fence.rotate(fenceRotation));
        this.setBlock(level, blockPos.above(2), fence.rotate(fenceRotation));
        this.setBlock(level, blockPos.above(3), Blocks.CHISELED_NETHER_BRICKS.defaultBlockState());
        blockPos = blockPos.above();
        this.setBlock(level, blockPos.above(3).offset(direction.getCounterClockWise().getUnitVec3i().multiply(2)), McddnBlocks.ORNATE_POLISHED_NETHERRACK.defaultBlockState());
        this.setBlock(level, blockPos.above(3).offset(direction.getClockWise().getUnitVec3i().multiply(2)), McddnBlocks.ORNATE_POLISHED_NETHERRACK.defaultBlockState());
        drawLine(level, blockPos.offset(direction.getCounterClockWise().getUnitVec3i().multiply(2)), McddnBlocks.NETHER_BRICK_PILLAR.defaultBlockState(), Direction.UP, 3);
        drawLine(level, blockPos.offset(direction.getClockWise().getUnitVec3i().multiply(2)), McddnBlocks.NETHER_BRICK_PILLAR.defaultBlockState(), Direction.UP, 3);

        //this.setBlock(level, blockPos.below().offset(direction.getOpposite().getUnitVec3i()), Blocks.GLOWSTONE.defaultBlockState());

        return true;
    }

    private void drawLine(WorldGenLevel level, BlockPos blockPos, BlockState blockState, Direction direction, int length) {
        for (var i = 0; i < length; i++) {
            this.setBlock(level, blockPos.offset(direction.getUnitVec3i().multiply(i)), blockState);
        }
    }
    private void placeLamp(WorldGenLevel level, BlockPos blockPos, Direction direction) {
        BlockPos mutable = blockPos;
        this.setBlock(level, mutable, Blocks.BLACKSTONE.defaultBlockState());
        mutable = mutable.offset(direction.getOpposite().getUnitVec3i());
        BlockState wallState = Blocks.POLISHED_BLACKSTONE_BRICK_WALL.defaultBlockState().setValue(WallBlock.UP, false).setValue(WallBlock.NORTH, WallSide.LOW).setValue(WallBlock.SOUTH, WallSide.LOW);
        this.setBlock(level, mutable, direction.getAxis() == Direction.Axis.X ? wallState.rotate(Rotation.CLOCKWISE_90) : wallState);
        mutable = mutable.offset(direction.getOpposite().getUnitVec3i());
        wallState = wallState.setValue(WallBlock.UP, true).setValue(WallBlock.SOUTH, WallSide.NONE);
        wallState = switch (direction) {
            case NORTH -> wallState;
            case SOUTH -> wallState.rotate(Rotation.CLOCKWISE_180);
            case EAST -> wallState.rotate(Rotation.CLOCKWISE_90);
            default -> wallState.rotate(Rotation.COUNTERCLOCKWISE_90);
        };
        this.setBlock(level, mutable, wallState);
        this.setBlock(level, mutable.below(), Blocks.IRON_CHAIN.defaultBlockState());
        this.setBlock(level, mutable.below(2), Blocks.REDSTONE_LAMP.defaultBlockState().setValue(RedstoneLampBlock.LIT, true));
        this.setBlock(level, mutable.below(3), Blocks.POLISHED_BLACKSTONE_BUTTON.defaultBlockState().setValue(ButtonBlock.POWERED, true).setValue(FaceAttachedHorizontalDirectionalBlock.FACE, AttachFace.CEILING));
    }
    private Direction getDirection(WorldGenLevel level, BlockPos blockPos, ChunkPos chunkPos) {
        if (level.getBlockState(blockPos.below().north()).is(McddnTags.Blocks.BLACKSTONE_TILES)) {
            return Direction.SOUTH;
        } else if (level.getBlockState(blockPos.below().east()).is(McddnTags.Blocks.BLACKSTONE_TILES)) {
            return Direction.WEST;
        } else if (level.getBlockState(blockPos.below().south()).is(McddnTags.Blocks.BLACKSTONE_TILES)) {
            return Direction.NORTH;
        } else if (level.getBlockState(blockPos.below().west()).is(McddnTags.Blocks.BLACKSTONE_TILES)) {
            return Direction.EAST;
        } else if ( !chunkPos.equals(new ChunkPos(blockPos.north())) ^ !chunkPos.equals(new ChunkPos(blockPos.east())) ^ !chunkPos.equals(new ChunkPos(blockPos.south())) ^ !chunkPos.equals(new ChunkPos(blockPos.west()))){
            if ( !chunkPos.equals(new ChunkPos(blockPos.north())) ){
                return Direction.SOUTH;
            } else if ( !chunkPos.equals(new ChunkPos(blockPos.east())) ){
                return Direction.WEST;
            } else if ( !chunkPos.equals(new ChunkPos(blockPos.south())) ){
                return Direction.NORTH;
            } else {
                return Direction.EAST;
            }
        } else if (!chunkPos.equals(new ChunkPos(blockPos.north())) && !chunkPos.equals(new ChunkPos(blockPos.east()))) {
            if (level.getBlockState(blockPos.south(4)).isAir()) {
                return Direction.SOUTH;
            } else if (level.getBlockState(blockPos.west(4)).isAir()) {
                return Direction.WEST;
            } else {
                return null;
            }
        } else if (!chunkPos.equals(new ChunkPos(blockPos.east())) && !chunkPos.equals(new ChunkPos(blockPos.south()))) {
            if (level.getBlockState(blockPos.west(4)).isAir()) {
                return Direction.WEST;
            } else if (level.getBlockState(blockPos.north(4)).isAir()) {
                return Direction.NORTH;
            } else {
                return null;
            }
        } else if (!chunkPos.equals(new ChunkPos(blockPos.south())) && !chunkPos.equals(new ChunkPos(blockPos.west()))) {
            if (level.getBlockState(blockPos.north(4)).isAir()) {
                return Direction.NORTH;
            } else if (level.getBlockState(blockPos.east(4)).isAir()) {
                return Direction.EAST;
            } else {
                return null;
            }
        } else if (!chunkPos.equals(new ChunkPos(blockPos.west())) && !chunkPos.equals(new ChunkPos(blockPos.north()))) {
            if (level.getBlockState(blockPos.east(4)).isAir()) {
                return Direction.EAST;
            } else if (level.getBlockState(blockPos.south(4)).isAir()) {
                return Direction.SOUTH;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
