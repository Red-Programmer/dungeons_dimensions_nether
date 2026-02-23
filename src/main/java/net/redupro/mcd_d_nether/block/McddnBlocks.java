package net.redupro.mcd_d_nether.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.redupro.mcd_d_nether.DungeonsDimensionsNether;
import net.redupro.mcd_d_nether.block.custom.*;
import net.redupro.mcd_d_nether.item.McddnFoodComponents;
import org.spongepowered.include.com.google.common.base.Function;

import static net.minecraft.world.level.block.Blocks.flowerPotProperties;

@SuppressWarnings("DataFlowIssue")
public class McddnBlocks {
    public static final Block WARPED_BLOSSOM = register(
            "warped_blossom",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block POTTED_WARPED_BLOSSOM = register(
            "potted_warped_blossom",
            settings -> new FlowerPotBlock(WARPED_BLOSSOM, settings), flowerPotProperties(),
            false,
            null
    );
    public static final Block WARPED_WART_FLUFF = register(
            "warped_wart_fluff",
            WartFluffBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES),
            true,
            null
    );
    public static final Block NETHER_WART_FLUFF = register(
            "nether_wart_fluff",
            WartFluffBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES),
            true,
            null
    );
    public static final Block CRIMSON_SPROUTS = register(
            "crimson_sprouts",
            NetherSproutsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_SPROUTS).mapColor(MapColor.NETHER),
            true,
            null
    );
    public static final Block WARPED_STALK = register(
            "warped_stalk",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block CRIMSON_STALK = register(
            "crimson_stalk",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true,
            null
    );
    public static final Block SHY_SUCCULENT = register(
            "shy_succulent",
            SucculentBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instabreak().sound(SoundType.FUNGUS).pushReaction(PushReaction.DESTROY).dynamicShape(),
            true,
            null
    );
    public static final Block MOONLIGHT_MILDEW = register(
            "moonlight_mildew",
            MildewBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block MIDNIGHT_MILDEW = register(
            "midnight_mildew",
            MildewBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block FLUORESCENT_FLOWER = register(
            "fluorescent_flower",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true,
            null
    );
    public static final Block FLUORESCENT_FIG = register(
            "fluorescent_fig",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true,
            null
    );
    public static final Block FLUORESCENT_FUNGUS = register(
            "fluorescent_fungus",
            GlobBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS).lightLevel(state -> 7),
            true,
            null
    );
    public static final Block FEELER_FLOWER = register(
            "feeler_flower",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block FROG_FLOWER = register(
            "frog_flower",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true,
            null
    );
    public static final Block FUNGAL_FERN = register(
            "fungal_fern",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true,
            null
    );
    public static final Block SIPHON_STALK = register(
            "siphon_stalk",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true,
            null
    );
    public static final Block NETHER_WALL_FLOWER = register(
            "nether_wall_flower",
            NetherWallFlower::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true,
            null
    );
    public static final Block BLOODTHORN_BLOSSOM = register(
            "bloodthorn_blossom",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true,
            null
    );
    public static final Block FLUORESCENT_FLOWER_INV = register(
            "fluorescent_flower_inv",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block GASEOUS_GLOB = register(
            "gaseous_glob",
            GlobBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS),
            true,
            null
    );
    public static final Block OBSERVER_ORCHIDS = register(
            "observer_orchids",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS).lightLevel(state -> 7),
            true,
            null
    );
    public static final Block STOUTSHROOM = register(
            "stoutshroom",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS),
            true,
            null
    );
    public static final Block RED_BRUSH = register(
            "red_brush",
            QuadBrushBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS),
            true,
            null
    );
    public static final Block TEAL_BRUSH = register(
            "teal_brush",
            QuadBrushBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true,
            null
    );
    public static final Block MOONLIGHT_MOULD = register(
            "moonlight_mould",
            MouldBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(1.0F).sound(SoundType.WART_BLOCK).pushReaction(PushReaction.DESTROY),
            true,
            null
    );
    public static final Block MIDNIGHT_MOULD = register(
            "midnight_mould",
            MouldBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(1.0F).sound(SoundType.WART_BLOCK).pushReaction(PushReaction.DESTROY),
            true,
            null
    );
    public static final Block CRIMSON_IVY = register(
            "crimson_ivy",
            IvyBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS).lightLevel(Ivy.getLuminanceSupplier(14)),
            true,
            McddnFoodComponents.IVY_FRUIT
    );
    public static final Block MIDNIGHT_WART_BLOCK = register(
            "midnight_wart_block",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK).mapColor(MapColor.COLOR_PURPLE),
            true,
            null
    );
    public static final Block SPORANGIUM = register(
            "sporangium",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block TALL_SPORANGIUM = register(
            "tall_sporangium",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block WARPED_FILAMENT = register(
            "warped_filament",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true,
            null
    );
    public static final Block CRIMSON_FILAMENT = register(
            "crimson_filament",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true,
            null
    );
    public static final Block CUT_BLACKSTONE = register(
            "cut_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS),
            true,
            null
    );
    public static final Block CUT_BLACKSTONE_SLAB = register(
            "cut_blackstone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_BLACKSTONE),
            true,
            null
    );
    public static final Block CUT_BLACKSTONE_STAIRS = registerStairsBlock(
            "cut_blackstone_stairs",
            CUT_BLACKSTONE,
            true
    );
    public static final Block INSET_POLISHED_BLACKSTONE = register(
            "inset_polished_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_BLACKSTONE),
            true,
            null
    );
    public static final Block SPALLING_CUT_BLACKSTONE = register(
            "spalling_cut_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_BLACKSTONE),
            true,
            null
    );
    public static final Block NETHER_BRICK_PILLAR = register(
            "nether_brick_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block CUT_NETHERRACK = register(
            "cut_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).mapColor(MapColor.NETHER),
            true,
            null
    );
    public static final Block CUT_NETHERRACK_SLAB = register(
            "cut_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block CUT_NETHERRACK_STAIRS = registerStairsBlock(
            "cut_netherrack_stairs",
            CUT_NETHERRACK,
            true
    );
    public static final Block CHISELED_POLISHED_NETHERRACK = register(
            "chiseled_polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block INSET_POLISHED_NETHERRACK = register(
            "inset_polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block SPALLING_NETHER_BRICKS = register(
            "spalling_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block SPALLING_CUT_NETHERRACK = register(
            "spalling_cut_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block RED_NETHER_BRICK_PILLAR = register(
            "red_nether_brick_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS),
            true,
            null
    );
    public static final Block CUT_RED_NETHERRACK = register(
            "cut_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block CUT_RED_NETHERRACK_SLAB = register(
            "cut_red_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block CUT_RED_NETHERRACK_STAIRS = registerStairsBlock(
            "cut_red_netherrack_stairs",
            CUT_NETHERRACK,
            true
    );
    public static final Block CHISELED_POLISHED_RED_NETHERRACK = register(
            "chiseled_polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block INSET_POLISHED_RED_NETHERRACK = register(
            "inset_polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block SPALLING_RED_NETHER_BRICKS = register(
            "spalling_red_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block SPALLING_CUT_RED_NETHERRACK = register(
            "spalling_cut_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block POLISHED_NETHERRACK = register(
            "polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block POLISHED_NETHERRACK_SLAB = register(
            "polished_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block POLISHED_RED_NETHERRACK = register(
            "polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block POLISHED_RED_NETHERRACK_SLAB = register(
            "polished_red_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block POLISHED_DARK_NETHERRACK = register(
            "polished_dark_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block POLISHED_DARK_NETHERRACK_SLAB = register(
            "polished_dark_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block DARK_NETHER_BRICKS = register(
            "dark_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block DARK_NETHER_BRICK_SLAB = register(
            "dark_nether_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block DARK_NETHER_BRICK_STAIRS = registerStairsBlock(
            "dark_nether_brick_stairs",
            DARK_NETHER_BRICKS,
            true
    );
    public static final Block DARK_NETHER_BRICK_FENCE = register(
            "dark_nether_brick_fence",
            FenceBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block DARK_NETHER_BRICK_WALL = register(
            "dark_nether_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true,
            null
    );
    public static final Block MOLDY_INSET_POLISHED_BLACKSTONE = register(
            "moldy_inset_polished_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_BLACKSTONE),
            true,
            null
    );
    public static final Block MOLDY_CUT_BLACKSTONE = register(
            "moldy_cut_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_BLACKSTONE),
            true,
            null
    );
    public static final Block MOLDY_INSET_POLISHED_NETHERRACK = register(
            "moldy_inset_polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block MOLDY_CUT_NETHERRACK = register(
            "moldy_cut_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block MOLDY_INSET_POLISHED_RED_NETHERRACK = register(
            "moldy_inset_polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block MOLDY_CUT_RED_NETHERRACK = register(
            "moldy_cut_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(CUT_NETHERRACK),
            true,
            null
    );
    public static final Block ROUGH_NETHERRACK = register(
            "rough_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK),
            true,
            null
    );
    public static final Block ASH = register(
            "ash",
            AshLayerBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW).mapColor(MapColor.COLOR_GRAY),
            true,
            null
    );
    public static final Block ASHY_BASALT = register(
            "ashy_basalt",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT),
            false,
            null
    );
    public static final Block WARPED_TRUNK = register(
            "warped_trunk",
            WarpedTrunk::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_STEM),
            false,
            null
    );


    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem, FoodProperties food) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem;
            if (food != null) {
                blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).food(food));
            } else {
                blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));
            }
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }
    private static Block registerStairsBlock(String name, Block base, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        StairBlock block = new StairBlock(base.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(base).setId(blockKey));
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }
    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name));
    }
    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name));
    }

    public static void registerMcddnBlocks() {
        DungeonsDimensionsNether.LOGGER.info("Registering Mod Blocks for " + DungeonsDimensionsNether.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.NATURAL_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.accept(McddnBlocks.WARPED_BLOSSOM);
            fabricItemGroupEntries.accept(McddnBlocks.WARPED_WART_FLUFF);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_WART_FLUFF);
            fabricItemGroupEntries.accept(McddnBlocks.WARPED_STALK);
            fabricItemGroupEntries.accept(McddnBlocks.CRIMSON_STALK);
            fabricItemGroupEntries.accept(McddnBlocks.SHY_SUCCULENT);
            fabricItemGroupEntries.accept(McddnBlocks.MOONLIGHT_MILDEW);
            fabricItemGroupEntries.accept(McddnBlocks.MIDNIGHT_MILDEW);
            fabricItemGroupEntries.accept(McddnBlocks.FLUORESCENT_FLOWER);
            fabricItemGroupEntries.accept(McddnBlocks.FLUORESCENT_FIG);
            fabricItemGroupEntries.accept(McddnBlocks.FLUORESCENT_FUNGUS);
            fabricItemGroupEntries.accept(McddnBlocks.FEELER_FLOWER);
            fabricItemGroupEntries.accept(McddnBlocks.FROG_FLOWER);
            fabricItemGroupEntries.accept(McddnBlocks.FUNGAL_FERN);
            fabricItemGroupEntries.accept(McddnBlocks.SIPHON_STALK);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_WALL_FLOWER);
            fabricItemGroupEntries.accept(McddnBlocks.BLOODTHORN_BLOSSOM);
            fabricItemGroupEntries.accept(McddnBlocks.FLUORESCENT_FLOWER_INV);
            fabricItemGroupEntries.accept(McddnBlocks.GASEOUS_GLOB);
            fabricItemGroupEntries.accept(McddnBlocks.OBSERVER_ORCHIDS);
            fabricItemGroupEntries.accept(McddnBlocks.STOUTSHROOM);
            fabricItemGroupEntries.accept(McddnBlocks.RED_BRUSH);
            fabricItemGroupEntries.accept(McddnBlocks.TEAL_BRUSH);
            fabricItemGroupEntries.accept(McddnBlocks.MOONLIGHT_MOULD);
            fabricItemGroupEntries.accept(McddnBlocks.MIDNIGHT_MOULD);
            fabricItemGroupEntries.accept(McddnBlocks.CRIMSON_IVY);
            fabricItemGroupEntries.accept(McddnBlocks.MIDNIGHT_WART_BLOCK);
            fabricItemGroupEntries.accept(McddnBlocks.SPORANGIUM);
            fabricItemGroupEntries.accept(McddnBlocks.TALL_SPORANGIUM);
            fabricItemGroupEntries.accept(McddnBlocks.WARPED_FILAMENT);
            fabricItemGroupEntries.accept(McddnBlocks.CRIMSON_FILAMENT);
            fabricItemGroupEntries.accept(McddnBlocks.CRIMSON_SPROUTS);
            fabricItemGroupEntries.accept(McddnBlocks.ASH);
        });
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.accept(McddnBlocks.INSET_POLISHED_BLACKSTONE);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_INSET_POLISHED_BLACKSTONE);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_BLACKSTONE);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_BLACKSTONE_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_BLACKSTONE_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_CUT_BLACKSTONE);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_CUT_BLACKSTONE);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.CHISELED_POLISHED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_BRICK_PILLAR);
            fabricItemGroupEntries.accept(McddnBlocks.INSET_POLISHED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_INSET_POLISHED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_NETHERRACK_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_CUT_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_CUT_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_NETHER_BRICKS);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_RED_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.CHISELED_POLISHED_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.RED_NETHER_BRICK_PILLAR);
            fabricItemGroupEntries.accept(McddnBlocks.INSET_POLISHED_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_INSET_POLISHED_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_RED_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.CUT_RED_NETHERRACK_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_CUT_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_CUT_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_RED_NETHER_BRICKS);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_DARK_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_DARK_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICKS);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_FENCE);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_WALL);
            fabricItemGroupEntries.accept(McddnBlocks.ROUGH_NETHERRACK);
        });
    }
}
