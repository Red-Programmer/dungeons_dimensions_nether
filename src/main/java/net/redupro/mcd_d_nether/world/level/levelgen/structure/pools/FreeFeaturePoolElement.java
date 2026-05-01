package net.redupro.mcd_d_nether.world.level.levelgen.structure.pools;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.*;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.Identifier;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.JigsawBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.entity.JigsawBlockEntity;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.structure.pools.FeaturePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

import java.util.List;

public class FreeFeaturePoolElement extends FeaturePoolElement {
    public static final MapCodec<FreeFeaturePoolElement> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(PlacedFeature.CODEC.fieldOf("feature").forGetter(freeFeaturePoolElement -> freeFeaturePoolElement.feature), projectionCodec())
                    .apply(instance, FreeFeaturePoolElement::new)
    );
    private static final Identifier DEFAULT_JIGSAW_NAME = Identifier.withDefaultNamespace("wing");
    private Holder<PlacedFeature> feature;
    private @Nullable CompoundTag defaultJigsawNBT;

    protected FreeFeaturePoolElement(Holder<PlacedFeature> holder, StructureTemplatePool.Projection projection) {
        super(holder, projection);
        this.feature = holder;
        this.defaultJigsawNBT = this.fillDefaultJigsawNBT();
    }
    private CompoundTag fillDefaultJigsawNBT() {
        CompoundTag compoundTag = new CompoundTag();
        compoundTag.store("name", Identifier.CODEC, DEFAULT_JIGSAW_NAME);
        compoundTag.putString("final_state", "minecraft:air");
        compoundTag.store("pool", JigsawBlockEntity.POOL_CODEC, Pools.EMPTY);
        compoundTag.store("target", Identifier.CODEC, JigsawBlockEntity.EMPTY_ID);
        compoundTag.store("joint", JigsawBlockEntity.JointType.CODEC, JigsawBlockEntity.JointType.ROLLABLE);
        return compoundTag;
    }

    @Override
    public @NotNull List<StructureTemplate.JigsawBlockInfo> getShuffledJigsawBlocks(
            StructureTemplateManager structureTemplateManager, BlockPos blockPos, Rotation rotation, RandomSource randomSource
    ) {
        return List.of(
                StructureTemplate.JigsawBlockInfo.of(
                        new StructureTemplate.StructureBlockInfo(
                                blockPos,
                                Blocks.JIGSAW.defaultBlockState().setValue(JigsawBlock.ORIENTATION, FrontAndTop.fromFrontAndTop(rotation.rotate(Direction.NORTH), Direction.UP)),
                                this.defaultJigsawNBT
                        )
                )
        );
    }
}
