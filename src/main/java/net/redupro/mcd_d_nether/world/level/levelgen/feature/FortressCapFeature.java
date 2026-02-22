package net.redupro.mcd_d_nether.world.level.levelgen.feature;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CrossCollisionBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WallSide;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import net.redupro.mcd_d_nether.block.ModBlocks;
import net.redupro.mcd_d_nether.util.ModTags;

public class FortressCapFeature extends Feature<NoneFeatureConfiguration> {
    public FortressCapFeature(Codec<NoneFeatureConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> featurePlaceContext) {
        WorldGenLevel level = featurePlaceContext.level();
        BlockPos blockPos = featurePlaceContext.origin();
        BlockPos corner;
        Direction direction;
        ChunkPos chunkPos = new ChunkPos(blockPos);

        if (level.getBlockState(blockPos.below()).is(ModTags.Blocks.BLACKSTONE_TILES)) {
            return false;
        }

        if (level.getBlockState(blockPos.below().north()).is(ModTags.Blocks.BLACKSTONE_TILES)) {
            direction = Direction.SOUTH;
        } else if (level.getBlockState(blockPos.below().east()).is(ModTags.Blocks.BLACKSTONE_TILES)) {
            direction = Direction.WEST;
        } else if (level.getBlockState(blockPos.below().south()).is(ModTags.Blocks.BLACKSTONE_TILES)) {
            direction = Direction.NORTH;
        } else if (level.getBlockState(blockPos.below().west()).is(ModTags.Blocks.BLACKSTONE_TILES)) {
            direction = Direction.EAST;
        } else if ( !chunkPos.equals(new ChunkPos(blockPos.north())) ^ !chunkPos.equals(new ChunkPos(blockPos.east())) ^ !chunkPos.equals(new ChunkPos(blockPos.south())) ^ !chunkPos.equals(new ChunkPos(blockPos.west()))){
            if ( !chunkPos.equals(new ChunkPos(blockPos.north())) ){
                direction = Direction.SOUTH;
            } else if ( !chunkPos.equals(new ChunkPos(blockPos.east())) ){
                direction = Direction.WEST;
            } else if ( !chunkPos.equals(new ChunkPos(blockPos.south())) ){
                direction = Direction.NORTH;
            } else {
                direction = Direction.EAST;
            }
        } else {
            return false;
        }

        corner = blockPos.below(3).offset(direction.getOpposite().getNormal()).offset(direction.getCounterClockWise().getNormal().multiply(4));
        for (var j = 0; j < 16; j++) {
            BlockState blockState = j == 0 || j == 7 || j == 12 || j == 15 ? ModBlocks.POLISHED_NETHERRACK.defaultBlockState() : Blocks.NETHER_BRICKS.defaultBlockState();
            drawLine(level, corner.above(j), blockState, direction.getClockWise(), 9);
        }


        for (var i = 0; i < 9; i++) {
            if (!level.getBlockState(corner.above(24).offset(direction.getClockWise().getNormal().multiply(i))).isAir()) {
                drawLine(level, corner.above(23).offset(direction.getClockWise().getNormal().multiply(i)), Blocks.NETHER_BRICKS.defaultBlockState(), Direction.DOWN, featurePlaceContext.random().nextIntBetweenInclusive(1, 3));
            }
        }



        drawLine(level, corner.above(12).offset(direction.getOpposite().getNormal()), ModBlocks.INSET_POLISHED_NETHERRACK.defaultBlockState(), direction.getClockWise(), 9);
        corner = corner.offset(direction.getOpposite().getNormal()).above(2);
        for (var j = 0; j < 5; j++) {
            BlockState blockState = j == 4 ? ModBlocks.POLISHED_NETHERRACK.defaultBlockState() : Blocks.NETHER_BRICKS.defaultBlockState();
            drawLine(level, corner.above(j), blockState, direction.getClockWise(), 9);
        }
        corner = corner.offset(direction.getOpposite().getNormal());
        drawLine(level, corner.offset(direction.getClockWise().getNormal().multiply(2)), ModBlocks.INSET_POLISHED_NETHERRACK.defaultBlockState(), direction.getClockWise(), 5);
        corner = corner.offset(direction.getOpposite().getNormal());
        if (level.getBlockState(corner.offset(direction.getClockWise().getNormal().multiply(4))).is(ModTags.Blocks.BLACKSTONE_TILES)) {
            drawLine(level, corner.offset(direction.getClockWise().getNormal().multiply(3)), ModBlocks.INSET_POLISHED_BLACKSTONE.defaultBlockState(), direction.getClockWise(), 3);
        }
        BlockState fence = Blocks.NETHER_BRICK_FENCE.defaultBlockState().setValue(CrossCollisionBlock.NORTH, true).setValue(CrossCollisionBlock.EAST, true).setValue(CrossCollisionBlock.WEST, true);
        Rotation fenceRotation = direction == Direction.NORTH ? Rotation.NONE : direction == Direction.SOUTH ? Rotation.CLOCKWISE_180 : direction == Direction.EAST ? Rotation.CLOCKWISE_90 : Rotation.COUNTERCLOCKWISE_90;
        blockPos = blockPos.offset(direction.getOpposite().getNormal()).below();
        this.setBlock(level, blockPos, ModBlocks.POLISHED_NETHERRACK.defaultBlockState());
        this.setBlock(level, blockPos.above(), fence.rotate(fenceRotation).rotate(Rotation.CLOCKWISE_180));
        this.setBlock(level, blockPos.above(2), fence.rotate(fenceRotation).rotate(Rotation.CLOCKWISE_180));
        this.setBlock(level, blockPos.above(3), Blocks.CHISELED_NETHER_BRICKS.defaultBlockState());
        blockPos = blockPos.offset(direction.getOpposite().getNormal());
        this.setBlock(level, blockPos, ModBlocks.POLISHED_NETHERRACK.defaultBlockState());
        this.setBlock(level, blockPos.above(), fence.rotate(fenceRotation));
        this.setBlock(level, blockPos.above(2), fence.rotate(fenceRotation));
        this.setBlock(level, blockPos.above(3), Blocks.CHISELED_NETHER_BRICKS.defaultBlockState());
        blockPos = blockPos.above();
        this.setBlock(level, blockPos.above(3).offset(direction.getCounterClockWise().getNormal().multiply(2)), ModBlocks.CHISELED_POLISHED_NETHERRACK.defaultBlockState());
        this.setBlock(level, blockPos.above(3).offset(direction.getClockWise().getNormal().multiply(2)), ModBlocks.CHISELED_POLISHED_NETHERRACK.defaultBlockState());
        drawLine(level, blockPos.offset(direction.getCounterClockWise().getNormal().multiply(2)), ModBlocks.NETHER_BRICK_PILLAR.defaultBlockState(), Direction.UP, 3);
        drawLine(level, blockPos.offset(direction.getClockWise().getNormal().multiply(2)), ModBlocks.NETHER_BRICK_PILLAR.defaultBlockState(), Direction.UP, 3);

        //this.setBlock(level, blockPos.below().offset(direction.getOpposite().getUnitVec3i()), Blocks.GLOWSTONE.defaultBlockState());

        return true;
    }

    private void drawLine(WorldGenLevel level, BlockPos blockPos, BlockState blockState, Direction direction, int length) {
        for (var i = 0; i < length; i++) {
            this.setBlock(level, blockPos.offset(direction.getNormal().multiply(i)), blockState);
        }
    }
}
