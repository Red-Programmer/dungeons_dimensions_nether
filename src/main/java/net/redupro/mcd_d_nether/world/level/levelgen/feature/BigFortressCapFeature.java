package net.redupro.mcd_d_nether.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.redupro.mcd_d_nether.block.McddnBlocks;
import net.redupro.mcd_d_nether.util.McddnTags;

public class BigFortressCapFeature extends Feature<NoneFeatureConfiguration> {
    public BigFortressCapFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> featurePlaceContext) {
        WorldGenLevel level = featurePlaceContext.level();
        BlockPos blockPos = featurePlaceContext.origin().below();
        BlockPos corner;
        ChunkPos chunkPos = ChunkPos.containing(blockPos);
        boolean bigNeighbor = level.getBlockState(blockPos.below()).is(McddnTags.Blocks.ORNATE_BLACKSTONE_TILES);
        boolean patchMode = level.getBlockState(blockPos.below()).is(McddnTags.Blocks.BLACKSTONE_TILES) && !bigNeighbor;
        Direction direction = getDirection(level, blockPos, chunkPos);
        if (direction == null) {
            return false;
        }

        corner = blockPos.above(9).offset(direction.getCounterClockWise().getUnitVec3i().multiply(4));
        if (patchMode) {
            for (var j = 0; j < 4; j++) {
                BlockState blockState = j == 0 || j == 3 ? McddnBlocks.POLISHED_NETHERRACK.defaultBlockState() : Blocks.NETHER_BRICKS.defaultBlockState();
                drawLine(level, corner.above(j), blockState, direction.getClockWise(), 9);
            }
        } else if (!bigNeighbor) {
            corner = corner.below(10).offset(direction.getOpposite().getUnitVec3i());
            drawLine(level, corner, McddnBlocks.POLISHED_NETHERRACK.defaultBlockState(), direction.getClockWise(), 9);
            corner = corner.above().offset(direction.getCounterClockWise().getUnitVec3i().multiply(2));
            if (level.getBlockState(blockPos.below(2).offset(direction.getOpposite().getUnitVec3i())).is(Blocks.CHISELED_NETHER_BRICKS)) {
                for (var j = 0; j < 5; j++) {
                    BlockState blockState = j == 4 ? McddnBlocks.POLISHED_NETHERRACK.defaultBlockState() : Blocks.NETHER_BRICKS.defaultBlockState();
                    drawLine(level, corner.above(j), blockState, direction.getClockWise(), 15);
                }
            }
        }
        return true;
    }

    private void drawLine(WorldGenLevel level, BlockPos blockPos, BlockState blockState, Direction direction, int length) {
        for (var i = 0; i < length; i++) {
            this.setBlock(level, blockPos.offset(direction.getUnitVec3i().multiply(i)), blockState);
        }
    }

    private Direction getDirection(WorldGenLevel level, BlockPos blockPos, ChunkPos chunkPos) {
        Direction direction = getBlockDirection(level, blockPos.below(), McddnTags.Blocks.ORNATE_BLACKSTONE_TILES, 1);
        if (direction != null) {
            return direction;
        } else if ( !chunkPos.equals(ChunkPos.containing(blockPos.north())) ^ !chunkPos.equals(ChunkPos.containing(blockPos.east())) ^ !chunkPos.equals(ChunkPos.containing(blockPos.south())) ^ !chunkPos.equals(ChunkPos.containing(blockPos.west()))){
            if ( !chunkPos.equals(ChunkPos.containing(blockPos.north())) ){
                return Direction.SOUTH;
            } else if ( !chunkPos.equals(ChunkPos.containing(blockPos.east())) ){
                return Direction.WEST;
            } else if ( !chunkPos.equals(ChunkPos.containing(blockPos.south())) ){
                return Direction.NORTH;
            } else {
                return Direction.EAST;
            }
        } else if (!chunkPos.equals(ChunkPos.containing(blockPos.north())) && !chunkPos.equals(ChunkPos.containing(blockPos.east()))) {
            if (level.getBlockState(blockPos.south(4)).isAir()) {
                return Direction.SOUTH;
            } else if (level.getBlockState(blockPos.west(4)).isAir()) {
                return Direction.WEST;
            } else {
                return null;
            }
        } else if (!chunkPos.equals(ChunkPos.containing(blockPos.east())) && !chunkPos.equals(ChunkPos.containing(blockPos.south()))) {
            if (level.getBlockState(blockPos.west(4)).isAir()) {
                return Direction.WEST;
            } else if (level.getBlockState(blockPos.north(4)).isAir()) {
                return Direction.NORTH;
            } else {
                return null;
            }
        } else if (!chunkPos.equals(ChunkPos.containing(blockPos.south())) && !chunkPos.equals(ChunkPos.containing(blockPos.west()))) {
            if (level.getBlockState(blockPos.north(4)).isAir()) {
                return Direction.NORTH;
            } else if (level.getBlockState(blockPos.east(4)).isAir()) {
                return Direction.EAST;
            } else {
                return null;
            }
        } else if (!chunkPos.equals(ChunkPos.containing(blockPos.west())) && !chunkPos.equals(ChunkPos.containing(blockPos.north()))) {
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
    private Direction getBlockDirection(WorldGenLevel level, BlockPos blockPos, TagKey<Block> blocks, int dist) {
        if (level.getBlockState(blockPos.north(dist)).is(blocks)) {
            return Direction.SOUTH;
        } else if (level.getBlockState(blockPos.east(dist)).is(blocks)) {
            return Direction.WEST;
        } else if (level.getBlockState(blockPos.south(dist)).is(blocks)) {
            return Direction.NORTH;
        } else if (level.getBlockState(blockPos.west(dist)).is(blocks)) {
            return Direction.EAST;
        }
        return null;
    }
}
