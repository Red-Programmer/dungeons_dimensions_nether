package net.redupro.mcd_d_nether.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.redupro.mcd_d_nether.block.McddnBlocks;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

public class McddnRecipeProvider extends FabricRecipeProvider {

    public McddnRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        //Polished Blackstone
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE.asItem(), Items.POLISHED_BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_SLAB.asItem(), Items.POLISHED_BLACKSTONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_STAIRS.asItem(), Items.POLISHED_BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE.asItem(), Items.BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_SLAB.asItem(), Items.BLACKSTONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_STAIRS.asItem(), Items.BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_SLAB.asItem(), McddnBlocks.CUT_BLACKSTONE.asItem(), 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_STAIRS.asItem(), McddnBlocks.CUT_BLACKSTONE.asItem());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_BLACKSTONE_SLAB.asItem(), Ingredient.of(McddnBlocks.CUT_BLACKSTONE.asItem()))
                .unlockedBy(getHasName(McddnBlocks.CUT_BLACKSTONE.asItem()), has(McddnBlocks.CUT_BLACKSTONE.asItem()))
                .save(recipeOutput);
        stairBuilder(McddnBlocks.CUT_BLACKSTONE_STAIRS.asItem(), Ingredient.of(McddnBlocks.CUT_BLACKSTONE.asItem()))
                .unlockedBy(getHasName(McddnBlocks.CUT_BLACKSTONE.asItem()), has(McddnBlocks.CUT_BLACKSTONE.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.SPALLING_CUT_BLACKSTONE.asItem(), McddnBlocks.CUT_BLACKSTONE.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.MOLDY_CUT_BLACKSTONE.asItem())
                .requires(McddnBlocks.CUT_BLACKSTONE.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_BLACKSTONE.asItem(), 2)
                .pattern("# ")
                .pattern(" #")
                .define('#', Items.POLISHED_BLACKSTONE)
                .unlockedBy(getHasName(Items.POLISHED_BLACKSTONE), has(Items.POLISHED_BLACKSTONE))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_BLACKSTONE.asItem(), Items.BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_BLACKSTONE.asItem(), Items.POLISHED_BLACKSTONE);
        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.MOLDY_INSET_POLISHED_BLACKSTONE.asItem())
                .requires(McddnBlocks.INSET_POLISHED_BLACKSTONE.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);

        //Polished Netherrack
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_NETHERRACK.asItem(), Ingredient.of(Items.NETHERRACK))
                .unlockedBy(getHasName(Items.NETHERRACK), has(Items.NETHERRACK))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_NETHERRACK_SLAB.asItem(), Ingredient.of(McddnBlocks.POLISHED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CHISELED_POLISHED_NETHERRACK.asItem(), Ingredient.of(McddnBlocks.POLISHED_NETHERRACK_SLAB))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_NETHERRACK_SLAB), has(McddnBlocks.POLISHED_NETHERRACK_SLAB))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_NETHERRACK_SLAB.asItem(), McddnBlocks.POLISHED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CHISELED_POLISHED_NETHERRACK.asItem(), McddnBlocks.POLISHED_NETHERRACK.asItem());
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_NETHERRACK.asItem(), 2)
                .pattern("# ")
                .pattern(" #")
                .define('#', McddnBlocks.POLISHED_NETHERRACK.asItem())
                .unlockedBy(getHasName(McddnBlocks.POLISHED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_NETHERRACK.asItem(), McddnBlocks.POLISHED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.MOLDY_INSET_POLISHED_NETHERRACK.asItem())
                .requires(McddnBlocks.INSET_POLISHED_NETHERRACK.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK.asItem(), Ingredient.of(McddnBlocks.POLISHED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK.asItem(), McddnBlocks.POLISHED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.MOLDY_CUT_NETHERRACK.asItem())
                .requires(McddnBlocks.CUT_NETHERRACK.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.SPALLING_CUT_NETHERRACK.asItem(), McddnBlocks.CUT_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK_SLAB.asItem(), McddnBlocks.CUT_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK_SLAB.asItem(), McddnBlocks.POLISHED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK_STAIRS.asItem(), McddnBlocks.CUT_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK_STAIRS.asItem(), McddnBlocks.POLISHED_NETHERRACK.asItem());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_NETHERRACK_SLAB.asItem(), Ingredient.of(McddnBlocks.CUT_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.CUT_NETHERRACK.asItem()), has(McddnBlocks.CUT_NETHERRACK.asItem()))
                .save(recipeOutput);
        stairBuilder(McddnBlocks.CUT_NETHERRACK_STAIRS.asItem(), Ingredient.of(McddnBlocks.CUT_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.CUT_NETHERRACK.asItem()), has(McddnBlocks.CUT_NETHERRACK.asItem()))
                .save(recipeOutput);

        //Polished Red Netherrack
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_RED_NETHERRACK.asItem(), 2)
                .pattern("#W")
                .pattern("W#")
                .define('#', Items.NETHERRACK)
                .define('W', Items.NETHER_WART)
                .unlockedBy(getHasName(Items.NETHER_WART), has(Items.NETHER_WART))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_RED_NETHERRACK_SLAB.asItem(), Ingredient.of(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CHISELED_POLISHED_RED_NETHERRACK.asItem(), Ingredient.of(McddnBlocks.POLISHED_RED_NETHERRACK_SLAB))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_RED_NETHERRACK_SLAB), has(McddnBlocks.POLISHED_RED_NETHERRACK_SLAB))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_RED_NETHERRACK_SLAB.asItem(), McddnBlocks.POLISHED_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CHISELED_POLISHED_RED_NETHERRACK.asItem(), McddnBlocks.POLISHED_RED_NETHERRACK.asItem());
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_RED_NETHERRACK.asItem(), 2)
                .pattern("# ")
                .pattern(" #")
                .define('#', McddnBlocks.POLISHED_RED_NETHERRACK.asItem())
                .unlockedBy(getHasName(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.INSET_POLISHED_RED_NETHERRACK.asItem(), McddnBlocks.POLISHED_RED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.MOLDY_INSET_POLISHED_RED_NETHERRACK.asItem())
                .requires(McddnBlocks.INSET_POLISHED_RED_NETHERRACK.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK.asItem(), Ingredient.of(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK.asItem(), McddnBlocks.POLISHED_RED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.MOLDY_CUT_RED_NETHERRACK.asItem())
                .requires(McddnBlocks.CUT_RED_NETHERRACK.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.SPALLING_CUT_RED_NETHERRACK.asItem(), McddnBlocks.CUT_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK_SLAB.asItem(), McddnBlocks.CUT_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK_SLAB.asItem(), McddnBlocks.POLISHED_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK_STAIRS.asItem(), McddnBlocks.CUT_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK_STAIRS.asItem(), McddnBlocks.POLISHED_RED_NETHERRACK.asItem());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.CUT_RED_NETHERRACK_SLAB.asItem(), Ingredient.of(McddnBlocks.CUT_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.CUT_RED_NETHERRACK.asItem()), has(McddnBlocks.CUT_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stairBuilder(McddnBlocks.CUT_RED_NETHERRACK_STAIRS.asItem(), Ingredient.of(McddnBlocks.CUT_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.CUT_RED_NETHERRACK.asItem()), has(McddnBlocks.CUT_RED_NETHERRACK.asItem()))
                .save(recipeOutput);

        //Polished Dark Netherrack
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_DARK_NETHERRACK.asItem(), 8)
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', McddnBlocks.POLISHED_NETHERRACK.asItem())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(McddnBlocks.POLISHED_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_DARK_NETHERRACK_SLAB.asItem(), Ingredient.of(McddnBlocks.POLISHED_DARK_NETHERRACK.asItem()))
                .unlockedBy(getHasName(McddnBlocks.POLISHED_DARK_NETHERRACK.asItem()), has(McddnBlocks.POLISHED_DARK_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.POLISHED_DARK_NETHERRACK_SLAB.asItem(), McddnBlocks.POLISHED_DARK_NETHERRACK.asItem());

        //Dark Nether Bricks
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.DARK_NETHER_BRICKS.asItem(), 8)
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', Items.NETHER_BRICKS)
                .define('B', Items.BLACK_DYE)
                .group("dark_nether_bricks")
                .unlockedBy(getHasName(Items.NETHER_BRICKS), has(Items.NETHER_BRICKS))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.SPALLING_NETHER_BRICKS.asItem(), Items.NETHER_BRICKS);
        shaped(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.NETHER_BRICK_PILLAR.asItem(), 2)
                .pattern("#")
                .pattern("#")
                .define('#', Items.NETHER_BRICKS)
                .unlockedBy(getHasName(Items.NETHER_BRICKS), has(Items.NETHER_BRICKS))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.DARK_NETHER_BRICK_SLAB.asItem(), Ingredient.of(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(McddnBlocks.DARK_NETHER_BRICKS.asItem()), has(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        stairBuilder(McddnBlocks.DARK_NETHER_BRICK_STAIRS.asItem(), Ingredient.of(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(McddnBlocks.DARK_NETHER_BRICKS.asItem()), has(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        fenceBuilder(McddnBlocks.DARK_NETHER_BRICK_FENCE.asItem(), Ingredient.of(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(McddnBlocks.DARK_NETHER_BRICKS.asItem()), has(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.DARK_NETHER_BRICK_WALL.asItem(), Ingredient.of(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(McddnBlocks.DARK_NETHER_BRICKS.asItem()), has(McddnBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.DARK_NETHER_BRICK_SLAB.asItem(), McddnBlocks.DARK_NETHER_BRICKS.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.DARK_NETHER_BRICK_STAIRS.asItem(), McddnBlocks.DARK_NETHER_BRICKS.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, McddnBlocks.DARK_NETHER_BRICK_WALL.asItem(), McddnBlocks.DARK_NETHER_BRICKS.asItem());


        shapeless(RecipeCategory.BUILDING_BLOCKS, McddnBlocks.ROUGH_NETHERRACK.asItem())
                .requires(McddnBlocks.ROUGH_NETHERRACK.asItem())
                .requires(McddnBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, Items.NETHER_WART_BLOCK, Ingredient.of(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .unlockedBy(getHasName(McddnBlocks.NETHER_WART_FLUFF.asItem()), has(McddnBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_WART_BLOCK, Ingredient.of(McddnBlocks.WARPED_WART_FLUFF.asItem()))
                .unlockedBy(getHasName(McddnBlocks.WARPED_WART_FLUFF.asItem()), has(McddnBlocks.WARPED_WART_FLUFF.asItem()))
                .save(recipeOutput);

        //Dyes
        shapeless(RecipeCategory.MISC, Items.RED_DYE)
                .requires(McddnBlocks.OBSERVER_ORCHIDS.asItem())
                .group("red_dye")
                .unlockedBy(getHasName(McddnBlocks.OBSERVER_ORCHIDS.asItem()), has(McddnBlocks.OBSERVER_ORCHIDS.asItem()))
                .save(recipeOutput);
        shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(McddnBlocks.WARPED_BLOSSOM.asItem())
                .group("orange_dye")
                .unlockedBy(getHasName(McddnBlocks.WARPED_BLOSSOM.asItem()), has(McddnBlocks.WARPED_BLOSSOM.asItem()))
                .save(recipeOutput);
    }
}
