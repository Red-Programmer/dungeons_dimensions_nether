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
            true
    );
    public static final Block POTTED_WARPED_BLOSSOM = register(
            "potted_warped_blossom",
            settings -> new FlowerPotBlock(WARPED_BLOSSOM, settings), flowerPotProperties(),
            false
    );
    public static final Block CRIMSON_SPROUTS = register(
            "crimson_sprouts",
            NetherSproutsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_SPROUTS).mapColor(MapColor.NETHER),
            true
    );
    public static final Block POTTED_CRIMSON_SPROUTS = register(
            "potted_crimson_sprouts",
            settings -> new FlowerPotBlock(CRIMSON_SPROUTS, settings), flowerPotProperties(),
            false
    );
    public static final Block WARPED_WART_FLUFF = register(
            "warped_wart_fluff",
            WartFluffBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES).replaceable(),
            true
    );
    public static final Block WARPING_VINES = register(
            "warping_vines",
            WarpingVinesBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES).mapColor(MapColor.COLOR_CYAN),
            true
    );
    public static final Block WARPING_VINES_PLANT = register(
            "warping_vines_plant",
            WarpingVinesPlantBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES).mapColor(MapColor.COLOR_CYAN),
            false
    );
    public static final Block WARPED_WART_HANGING = register(
            "warped_wart_hanging",
            WartHangingBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.TWISTING_VINES).replaceable(),
            false
    );
    public static final Block NETHER_WART_FLUFF = register(
            "nether_wart_fluff",
            WartFluffBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES).replaceable(),
            true
    );
    public static final Block WARPED_STALK = register(
            "warped_stalk",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block CRIMSON_STALK = register(
            "crimson_stalk",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true
    );
    public static final Block SHY_SUCCULENT = register(
            "shy_succulent",
            SucculentBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).instabreak().sound(SoundType.FUNGUS).pushReaction(PushReaction.DESTROY).dynamicShape(),
            true
    );
    public static final Block MOONLIGHT_MILDEW = register(
            "moonlight_mildew",
            MildewBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block MIDNIGHT_MILDEW = register(
            "midnight_mildew",
            MildewBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block FLUORESCENT_FLOWER = register(
            "fluorescent_flower",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true
    );
    public static final Block FLUORESCENT_FIG = register(
            "fluorescent_fig",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true
    );
    public static final Block FLUORESCENT_FUNGUS = register(
            "fluorescent_fungus",
            GlobBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS).lightLevel(state -> 7),
            true
    );
    public static final Block FEELER_FLOWER = register(
            "feeler_flower",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block FROG_FLOWER = register(
            "frog_flower",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true
    );
    public static final Block FUNGAL_FERN = register(
            "fungal_fern",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true
    );
    public static final Block SIPHON_STALK = register(
            "siphon_stalk",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true
    );
    public static final Block NETHER_WALL_FLOWER = register(
            "nether_wall_flower",
            NetherWallFlower::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true
    );
    public static final Block BLOODTHORN_BLOSSOM = register(
            "bloodthorn_blossom",
            BloodthornBlossomBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true
    );
    public static final Block FLUORESCENT_FLOWER_INV = register(
            "fluorescent_flower_inv",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block GASEOUS_GLOB = register(
            "gaseous_glob",
            GlobBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS),
            true
    );
    public static final Block OBSERVER_ORCHIDS = register(
            "observer_orchids",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS).lightLevel(state -> 7),
            true
    );
    public static final Block STOUTSHROOM = register(
            "stoutshroom",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS),
            true
    );
    public static final Block RED_BRUSH = register(
            "red_brush",
            QuadBrushBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_FUNGUS),
            true
    );
    public static final Block TEAL_BRUSH = register(
            "teal_brush",
            QuadBrushBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_FUNGUS),
            true
    );
    public static final Block MOONLIGHT_MOULD = register(
            "moonlight_mould",
            MouldBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_CYAN).strength(1.0F).sound(SoundType.WART_BLOCK).pushReaction(PushReaction.DESTROY).noOcclusion(),
            true
    );
    public static final Block MIDNIGHT_MOULD = register(
            "midnight_mould",
            MouldBlock::new,
            BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_PURPLE).strength(1.0F).sound(SoundType.WART_BLOCK).pushReaction(PushReaction.DESTROY).noOcclusion(),
            true
    );
    public static final Block CRIMSON_IVY = register(
            "crimson_ivy",
            IvyBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WEEPING_VINES).lightLevel(Ivy.getLuminanceSupplier(14)),
            true,
            McddnFoodComponents.IVY_FRUIT
    );
    public static final Block MIDNIGHT_WART_BLOCK = register(
            "midnight_wart_block",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_WART_BLOCK).mapColor(MapColor.COLOR_PURPLE),
            true
    );
    public static final Block SPORANGIUM = register(
            "sporangium",
            RootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block TALL_SPORANGIUM = register(
            "tall_sporangium",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block WARPED_FILAMENT = register(
            "warped_filament",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_ROOTS),
            true
    );
    public static final Block CRIMSON_FILAMENT = register(
            "crimson_filament",
            TallRootsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.CRIMSON_ROOTS),
            true
    );
    public static final Block BLACKSTONE_TILES = register(
            "blackstone_tiles",
            "cut_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS),
            true
    );
    public static final Block BLACKSTONE_TILE_SLAB = register(
            "blackstone_tile_slab",
            "cut_blackstone_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block BLACKSTONE_TILES_STAIRS = registerStairsBlock(
            "blackstone_tile_stairs",
            "cut_blackstone_stairs",
            BLACKSTONE_TILES,
            true
    );
    public static final Block ORNATE_BLACKSTONE_TILES = register(
            "ornate_blackstone_tiles",
            "inset_polished_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block SPALLING_BLACKSTONE_TILES = register(
            "spalling_blackstone_tiles",
            "spalling_cut_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block NETHER_BRICK_PILLAR = register(
            "nether_brick_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true
    );
    public static final Block NETHER_TILES = register(
            "nether_tiles",
            "cut_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BLACKSTONE_BRICKS).mapColor(MapColor.NETHER),
            true
    );
    public static final Block NETHER_TILE_SLAB = register(
            "nether_tile_slab",
            "cut_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block NETHER_TILE_STAIRS = registerStairsBlock(
            "nether_tile_stairs",
            "cut_netherrack_stairs",
            NETHER_TILES,
            true
    );
    public static final Block ORNATE_POLISHED_NETHERRACK = register(
            "ornate_polished_netherrack",
            "chiseled_polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block ORNATE_NETHER_TILES = register(
            "ornate_nether_tiles",
            "inset_polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block SPALLING_NETHER_BRICKS = register(
            "spalling_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true
    );
    public static final Block SPALLING_NETHER_TILES = register(
            "spalling_nether_tiles",
            "spalling_cut_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block RED_NETHER_BRICK_PILLAR = register(
            "red_nether_brick_pillar",
            RotatedPillarBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.RED_NETHER_BRICKS),
            true
    );
    public static final Block RED_NETHER_TILES = register(
            "red_nether_tiles",
            "cut_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block RED_NETHER_TILE_SLAB = register(
            "red_nether_tile_slab",
            "cut_red_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block RED_NETHER_TILE_STAIRS = registerStairsBlock(
            "red_nether_tile_stairs",
            "cut_red_netherrack_stairs",
            NETHER_TILES,
            true
    );
    public static final Block ORNATE_POLISHED_RED_NETHERRACK = register(
            "ornate_polished_red_netherrack",
            "chiseled_polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block ORNATE_RED_NETHER_TILES = register(
            "ornate_red_nether_tiles",
            "inset_polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block SPALLING_RED_NETHER_BRICKS = register(
            "spalling_red_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true
    );
    public static final Block SPALLING_RED_NETHER_TILES = register(
            "spalling_red_nether_tiles",
            "spalling_cut_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block POLISHED_NETHERRACK = register(
            "polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block POLISHED_NETHERRACK_SLAB = register(
            "polished_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block POLISHED_RED_NETHERRACK = register(
            "polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block POLISHED_RED_NETHERRACK_SLAB = register(
            "polished_red_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block POLISHED_DARK_NETHERRACK = register(
            "polished_dark_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block POLISHED_DARK_NETHERRACK_SLAB = register(
            "polished_dark_netherrack_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block DARK_NETHER_BRICKS = register(
            "dark_nether_bricks",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true
    );
    public static final Block DARK_NETHER_BRICK_SLAB = register(
            "dark_nether_brick_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true
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
            true
    );
    public static final Block DARK_NETHER_BRICK_WALL = register(
            "dark_nether_brick_wall",
            WallBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_BRICKS),
            true
    );
    public static final Block MOLDY_ORNATE_BLACKSTONE_TILES = register(
            "moldy_ornate_blackstone_tiles",
            "moldy_inset_polished_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block MOLDY_BLACKSTONE_TILES = register(
            "moldy_blackstone_tiles",
            "moldy_cut_blackstone",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(BLACKSTONE_TILES),
            true
    );
    public static final Block MOLDY_ORNATE_NETHER_TILES = register(
            "moldy_ornate_nether_tiles",
            "moldy_inset_polished_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block MOLDY_NETHER_TILES = register(
            "moldy_nether_tiles",
            "moldy_cut_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block MOLDY_ORNATE_RED_NETHER_TILES = register(
            "moldy_ornate_red_nether_tiles",
            "moldy_inset_polished_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block MOLDY_RED_NETHER_TILES = register(
            "moldy_red_nether_tiles",
            "moldy_cut_red_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(NETHER_TILES),
            true
    );
    public static final Block ROUGH_NETHERRACK = register(
            "rough_netherrack",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERRACK),
            true
    );
    public static final Block ASH = register(
            "ash",
            AshLayerBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SNOW).mapColor(MapColor.COLOR_GRAY),
            true
    );
    public static final Block ASHY_BASALT = register(
            "ashy_basalt",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BASALT),
            false
    );
    public static final Block WARPED_TRUNK = register(
            "warped_trunk",
            WarpedTrunk::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.WARPED_STEM),
            false
    );
    public static final Block BONE_FENCE = register(
            "bone_fence",
            FenceBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.BONE_BLOCK),
            true
    );
    public static final Block BASALT_TILES = register(
            "basalt_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_BASALT),
            true
    );
    public static final Block BASALT_TILE_SLAB = register(
            "basalt_tile_slab",
            SlabBlock::new,
            BlockBehaviour.Properties.ofFullCopy(BASALT_TILES),
            true
    );
    public static final Block BASALT_TILE_STAIRS = registerStairsBlock(
            "basalt_tile_stairs",
            BASALT_TILES,
            true
    );
    public static final Block GILDED_BASALT_TILES = register(
            "gilded_basalt_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(BASALT_TILES).sound(SoundType.GILDED_BLACKSTONE),
            true
    );
    public static final Block SPALLING_BASALT_TILES = register(
            "spalling_basalt_tiles",
            Block::new,
            BlockBehaviour.Properties.ofFullCopy(BASALT_TILES),
            true
    );
    public static final Block NETHERITE_BARS = register(
            "netherite_bars",
            IronBarsBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BARS).sound(SoundType.NETHERITE_BLOCK),
            true
    );
    public static final Block NETHERITE_CHAIN = register(
            "netherite_chain",
            NetheriteChainBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_CHAIN).sound(SoundType.NETHERITE_BLOCK),
            true
    );
    public static final Block NETHERITE_SPIKE = register(
            "netherite_spike",
            SpikeBlock::new,
            BlockBehaviour.Properties.ofFullCopy(NETHERITE_BARS),
            true
    );


    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem;
            blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }
    private static Block register(String name, String alias, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));
        Identifier blockId = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name);
        Identifier blockAlias = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, alias);
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem;
            blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));
            Identifier itemId = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name);
            Identifier itemAlias = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, alias);
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
            BuiltInRegistries.ITEM.addAlias(itemAlias, itemId);
        }
        BuiltInRegistries.BLOCK.addAlias(blockAlias, blockId);
        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        
    }
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties settings, boolean shouldRegisterItem, FoodProperties food) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.setId(blockKey));
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem;
            blockItem = new BlockItem(block, new Item.Properties().setId(itemKey).food(food));
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
    private static Block registerStairsBlock(String name, String alias, Block base, boolean shouldRegisterItem) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        StairBlock block = new StairBlock(base.defaultBlockState(), BlockBehaviour.Properties.ofFullCopy(base).setId(blockKey));
        Identifier blockId = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name);
        Identifier blockAlias = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, alias);
        if (shouldRegisterItem) {
            ResourceKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem = new BlockItem(block, new Item.Properties().setId(itemKey));
            Identifier itemId = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, name);
            Identifier itemAlias = Identifier.fromNamespaceAndPath(DungeonsDimensionsNether.MOD_ID, alias);
            BuiltInRegistries.ITEM.addAlias(itemAlias, itemId);
            Registry.register(BuiltInRegistries.ITEM, itemKey, blockItem);
        }
        BuiltInRegistries.BLOCK.addAlias(blockAlias, blockId);
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
            fabricItemGroupEntries.accept(McddnBlocks.WARPING_VINES);
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
            fabricItemGroupEntries.accept(McddnBlocks.ORNATE_BLACKSTONE_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_ORNATE_BLACKSTONE_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.BLACKSTONE_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.BLACKSTONE_TILE_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.BLACKSTONE_TILES_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_BLACKSTONE_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_BLACKSTONE_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.ORNATE_POLISHED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_BRICK_PILLAR);
            fabricItemGroupEntries.accept(McddnBlocks.ORNATE_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_ORNATE_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_TILE_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.NETHER_TILE_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_NETHER_BRICKS);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_RED_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.ORNATE_POLISHED_RED_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.RED_NETHER_BRICK_PILLAR);
            fabricItemGroupEntries.accept(McddnBlocks.ORNATE_RED_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_ORNATE_RED_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.RED_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.RED_NETHER_TILE_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.RED_NETHER_TILE_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.MOLDY_RED_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_RED_NETHER_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_RED_NETHER_BRICKS);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_DARK_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.POLISHED_DARK_NETHERRACK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICKS);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_FENCE);
            fabricItemGroupEntries.accept(McddnBlocks.DARK_NETHER_BRICK_WALL);
            fabricItemGroupEntries.accept(McddnBlocks.BASALT_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.BASALT_TILE_SLAB);
            fabricItemGroupEntries.accept(McddnBlocks.BASALT_TILE_STAIRS);
            fabricItemGroupEntries.accept(McddnBlocks.GILDED_BASALT_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.SPALLING_BASALT_TILES);
            fabricItemGroupEntries.accept(McddnBlocks.ROUGH_NETHERRACK);
            fabricItemGroupEntries.accept(McddnBlocks.BONE_FENCE);
            fabricItemGroupEntries.accept(McddnBlocks.NETHERITE_BARS);
            fabricItemGroupEntries.accept(McddnBlocks.NETHERITE_SPIKE);
            fabricItemGroupEntries.accept(McddnBlocks.NETHERITE_CHAIN);
        });
    }
}
