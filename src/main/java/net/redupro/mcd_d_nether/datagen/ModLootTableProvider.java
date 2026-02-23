package net.redupro.mcd_d_nether.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.redupro.mcd_d_nether.block.ModBlocks;
import net.redupro.mcd_d_nether.block.custom.*;
import net.redupro.mcd_d_nether.block.enums.Quadrant;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.FLUORESCENT_FLOWER);
        dropSelf(ModBlocks.FLUORESCENT_FLOWER_INV);
        dropSelf(ModBlocks.FLUORESCENT_FIG);
        dropSelf(ModBlocks.WARPED_BLOSSOM);
        dropSelf(ModBlocks.SHY_SUCCULENT);
        dropSelf(ModBlocks.MOONLIGHT_MILDEW);
        dropSelf(ModBlocks.MIDNIGHT_MILDEW);
        dropSelf(ModBlocks.FLUORESCENT_FUNGUS);
        dropSelf(ModBlocks.FEELER_FLOWER);
        dropSelf(ModBlocks.FROG_FLOWER);
        dropSelf(ModBlocks.FUNGAL_FERN);
        dropSelf(ModBlocks.SIPHON_STALK);
        dropSelf(ModBlocks.NETHER_WALL_FLOWER);
        dropSelf(ModBlocks.BLOODTHORN_BLOSSOM);
        dropSelf(ModBlocks.GASEOUS_GLOB);
        dropSelf(ModBlocks.OBSERVER_ORCHIDS);
        dropSelf(ModBlocks.STOUTSHROOM);
        dropSelf(ModBlocks.MIDNIGHT_WART_BLOCK);
        dropSelf(ModBlocks.SPORANGIUM);
        dropSelf(ModBlocks.CRIMSON_SPROUTS);
        dropSelf(ModBlocks.CUT_BLACKSTONE);
        add(ModBlocks.CUT_BLACKSTONE_SLAB, createSlabItemTable(ModBlocks.CUT_BLACKSTONE_SLAB));
        dropSelf(ModBlocks.CUT_BLACKSTONE_STAIRS);
        dropSelf(ModBlocks.INSET_POLISHED_BLACKSTONE);
        dropSelf(ModBlocks.SPALLING_CUT_BLACKSTONE);
        dropSelf(ModBlocks.NETHER_BRICK_PILLAR);
        dropSelf(ModBlocks.CUT_NETHERRACK);
        add(ModBlocks.CUT_NETHERRACK_SLAB, createSlabItemTable(ModBlocks.CUT_NETHERRACK_SLAB));
        dropSelf(ModBlocks.CUT_NETHERRACK_STAIRS);
        dropSelf(ModBlocks.CHISELED_POLISHED_NETHERRACK);
        dropSelf(ModBlocks.INSET_POLISHED_NETHERRACK);
        dropSelf(ModBlocks.SPALLING_NETHER_BRICKS);
        dropSelf(ModBlocks.SPALLING_CUT_NETHERRACK);
        dropSelf(ModBlocks.RED_NETHER_BRICK_PILLAR);
        dropSelf(ModBlocks.CUT_RED_NETHERRACK);
        add(ModBlocks.CUT_RED_NETHERRACK_SLAB, createSlabItemTable(ModBlocks.CUT_RED_NETHERRACK_SLAB));
        dropSelf(ModBlocks.CUT_RED_NETHERRACK_STAIRS);
        dropSelf(ModBlocks.CHISELED_POLISHED_RED_NETHERRACK);
        dropSelf(ModBlocks.INSET_POLISHED_RED_NETHERRACK);
        dropSelf(ModBlocks.SPALLING_RED_NETHER_BRICKS);
        dropSelf(ModBlocks.SPALLING_CUT_RED_NETHERRACK);
        dropSelf(ModBlocks.POLISHED_NETHERRACK);
        add(ModBlocks.POLISHED_NETHERRACK_SLAB, createSlabItemTable(ModBlocks.POLISHED_NETHERRACK_SLAB));
        dropSelf(ModBlocks.POLISHED_RED_NETHERRACK);
        add(ModBlocks.POLISHED_RED_NETHERRACK_SLAB, createSlabItemTable(ModBlocks.POLISHED_RED_NETHERRACK_SLAB));
        dropSelf(ModBlocks.POLISHED_DARK_NETHERRACK);
        add(ModBlocks.POLISHED_DARK_NETHERRACK_SLAB, createSlabItemTable(ModBlocks.POLISHED_DARK_NETHERRACK_SLAB));
        dropSelf(ModBlocks.DARK_NETHER_BRICKS);
        add(ModBlocks.DARK_NETHER_BRICK_SLAB, createSlabItemTable(ModBlocks.POLISHED_DARK_NETHERRACK_SLAB));
        dropSelf(ModBlocks.DARK_NETHER_BRICK_STAIRS);
        dropSelf(ModBlocks.DARK_NETHER_BRICK_FENCE);
        dropSelf(ModBlocks.DARK_NETHER_BRICK_WALL);
        dropSelf(ModBlocks.MOLDY_INSET_POLISHED_BLACKSTONE);
        dropSelf(ModBlocks.MOLDY_CUT_BLACKSTONE);
        dropSelf(ModBlocks.MOLDY_INSET_POLISHED_NETHERRACK);
        dropSelf(ModBlocks.MOLDY_CUT_NETHERRACK);
        dropSelf(ModBlocks.MOLDY_INSET_POLISHED_RED_NETHERRACK);
        dropSelf(ModBlocks.MOLDY_CUT_RED_NETHERRACK);
        dropSelf(ModBlocks.ROUGH_NETHERRACK);
        add(ModBlocks.POTTED_WARPED_BLOSSOM, createPotFlowerItemTable(ModBlocks.WARPED_BLOSSOM));
        add(ModBlocks.WARPED_STALK, block -> this.createSinglePropConditionTable(block, TallRootsBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.CRIMSON_STALK, block -> this.createSinglePropConditionTable(block, TallRootsBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.WARPED_WART_FLUFF, block -> this.createSinglePropConditionTable(block, WartFluffBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.NETHER_WART_FLUFF, block -> this.createSinglePropConditionTable(block, WartFluffBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.TALL_SPORANGIUM, block -> this.createSinglePropConditionTable(block, TallRootsBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.WARPED_FILAMENT, block -> this.createSinglePropConditionTable(block, TallRootsBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.CRIMSON_FILAMENT, block -> this.createSinglePropConditionTable(block, TallRootsBlock.HALF, DoubleBlockHalf.LOWER));
        add(ModBlocks.ASHY_BASALT, createSingleItemTable(Items.BASALT));
        add(ModBlocks.WARPED_TRUNK, createSingleItemTable(Items.WARPED_STEM));
        this.add(ModBlocks.RED_BRUSH, block -> this.createSinglePropConditionTable(block, QuadBrushBlock.QUADRANT, Quadrant.QUAD_1));
        this.add(ModBlocks.TEAL_BRUSH, block -> this.createSinglePropConditionTable(block, QuadBrushBlock.QUADRANT, Quadrant.QUAD_1));
        this.add(ModBlocks.CRIMSON_IVY, block -> this.customDropsWithProperty(block, block, IvyBlock.FRUIT, true));
    }

    protected LootTable.Builder customDropsWithProperty(Block block, Block drop, Property<Boolean> property, boolean value) {
        return LootTable.lootTable()
                .withPool(
                        this.applyExplosionCondition(
                                drop,
                                LootPool.lootPool()
                                        .setRolls(ConstantValue.exactly(1.0F))
                                        .add(
                                                LootItem.lootTableItem(drop)
                                                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(property, value)))
                                        )
                        )
                );
    }
}
