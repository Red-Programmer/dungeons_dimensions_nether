package net.redupro.mcd_d_nether.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.redupro.mcd_d_nether.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void buildRecipes(RecipeOutput recipeOutput) {
        //Polished Blackstone
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE.asItem(), Items.POLISHED_BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_SLAB.asItem(), Items.POLISHED_BLACKSTONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_STAIRS.asItem(), Items.POLISHED_BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE.asItem(), Items.BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_SLAB.asItem(), Items.BLACKSTONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_STAIRS.asItem(), Items.BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_SLAB.asItem(), ModBlocks.CUT_BLACKSTONE.asItem(), 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_STAIRS.asItem(), ModBlocks.CUT_BLACKSTONE.asItem());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_BLACKSTONE_SLAB.asItem(), Ingredient.of(ModBlocks.CUT_BLACKSTONE.asItem()))
                .unlockedBy(getHasName(ModBlocks.CUT_BLACKSTONE.asItem()), has(ModBlocks.CUT_BLACKSTONE.asItem()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CUT_BLACKSTONE_STAIRS.asItem(), Ingredient.of(ModBlocks.CUT_BLACKSTONE.asItem()))
                .unlockedBy(getHasName(ModBlocks.CUT_BLACKSTONE.asItem()), has(ModBlocks.CUT_BLACKSTONE.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPALLING_CUT_BLACKSTONE.asItem(), ModBlocks.CUT_BLACKSTONE.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLDY_CUT_BLACKSTONE.asItem())
                .requires(ModBlocks.CUT_BLACKSTONE.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_BLACKSTONE.asItem(), 2)
                .pattern("# ")
                .pattern(" #")
                .define('#', Items.POLISHED_BLACKSTONE)
                .unlockedBy(getHasName(Items.POLISHED_BLACKSTONE), has(Items.POLISHED_BLACKSTONE))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_BLACKSTONE.asItem(), Items.BLACKSTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_BLACKSTONE.asItem(), Items.POLISHED_BLACKSTONE);
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLDY_INSET_POLISHED_BLACKSTONE.asItem())
                .requires(ModBlocks.INSET_POLISHED_BLACKSTONE.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);

        //Polished Netherrack
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK.asItem(), Ingredient.of(Items.NETHERRACK))
                .unlockedBy(getHasName(Items.NETHERRACK), has(Items.NETHERRACK))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK_SLAB.asItem(), Ingredient.of(ModBlocks.POLISHED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.POLISHED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_NETHERRACK.asItem(), Ingredient.of(ModBlocks.POLISHED_NETHERRACK_SLAB))
                .unlockedBy(getHasName(ModBlocks.POLISHED_NETHERRACK_SLAB), has(ModBlocks.POLISHED_NETHERRACK_SLAB))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_NETHERRACK_SLAB.asItem(), ModBlocks.POLISHED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_NETHERRACK.asItem(), ModBlocks.POLISHED_NETHERRACK.asItem());
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_NETHERRACK.asItem(), 2)
                .pattern("# ")
                .pattern(" #")
                .define('#', ModBlocks.POLISHED_NETHERRACK.asItem())
                .unlockedBy(getHasName(ModBlocks.POLISHED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_NETHERRACK.asItem(), ModBlocks.POLISHED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLDY_INSET_POLISHED_NETHERRACK.asItem())
                .requires(ModBlocks.INSET_POLISHED_NETHERRACK.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK.asItem(), Ingredient.of(ModBlocks.POLISHED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.POLISHED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK.asItem(), ModBlocks.POLISHED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLDY_CUT_NETHERRACK.asItem())
                .requires(ModBlocks.CUT_NETHERRACK.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPALLING_CUT_NETHERRACK.asItem(), ModBlocks.CUT_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK_SLAB.asItem(), ModBlocks.CUT_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK_SLAB.asItem(), ModBlocks.POLISHED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK_STAIRS.asItem(), ModBlocks.CUT_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK_STAIRS.asItem(), ModBlocks.POLISHED_NETHERRACK.asItem());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_NETHERRACK_SLAB.asItem(), Ingredient.of(ModBlocks.CUT_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.CUT_NETHERRACK.asItem()), has(ModBlocks.CUT_NETHERRACK.asItem()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CUT_NETHERRACK_STAIRS.asItem(), Ingredient.of(ModBlocks.CUT_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.CUT_NETHERRACK.asItem()), has(ModBlocks.CUT_NETHERRACK.asItem()))
                .save(recipeOutput);

        //Polished Red Netherrack
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RED_NETHERRACK.asItem(), 2)
                .pattern("#W")
                .pattern("W#")
                .define('#', Items.NETHERRACK)
                .define('W', Items.NETHER_WART)
                .unlockedBy(getHasName(Items.NETHER_WART), has(Items.NETHER_WART))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RED_NETHERRACK_SLAB.asItem(), Ingredient.of(ModBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.POLISHED_RED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        chiseledBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_RED_NETHERRACK.asItem(), Ingredient.of(ModBlocks.POLISHED_RED_NETHERRACK_SLAB))
                .unlockedBy(getHasName(ModBlocks.POLISHED_RED_NETHERRACK_SLAB), has(ModBlocks.POLISHED_RED_NETHERRACK_SLAB))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_RED_NETHERRACK_SLAB.asItem(), ModBlocks.POLISHED_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_POLISHED_RED_NETHERRACK.asItem(), ModBlocks.POLISHED_RED_NETHERRACK.asItem());
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_RED_NETHERRACK.asItem(), 2)
                .pattern("# ")
                .pattern(" #")
                .define('#', ModBlocks.POLISHED_RED_NETHERRACK.asItem())
                .unlockedBy(getHasName(ModBlocks.POLISHED_RED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.INSET_POLISHED_RED_NETHERRACK.asItem(), ModBlocks.POLISHED_RED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLDY_INSET_POLISHED_RED_NETHERRACK.asItem())
                .requires(ModBlocks.INSET_POLISHED_RED_NETHERRACK.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK.asItem(), Ingredient.of(ModBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.POLISHED_RED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK.asItem(), ModBlocks.POLISHED_RED_NETHERRACK.asItem());
        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOLDY_CUT_RED_NETHERRACK.asItem())
                .requires(ModBlocks.CUT_RED_NETHERRACK.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPALLING_CUT_RED_NETHERRACK.asItem(), ModBlocks.CUT_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK_SLAB.asItem(), ModBlocks.CUT_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK_SLAB.asItem(), ModBlocks.POLISHED_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK_STAIRS.asItem(), ModBlocks.CUT_RED_NETHERRACK.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK_STAIRS.asItem(), ModBlocks.POLISHED_RED_NETHERRACK.asItem());
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_RED_NETHERRACK_SLAB.asItem(), Ingredient.of(ModBlocks.CUT_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.CUT_RED_NETHERRACK.asItem()), has(ModBlocks.CUT_RED_NETHERRACK.asItem()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.CUT_RED_NETHERRACK_STAIRS.asItem(), Ingredient.of(ModBlocks.CUT_RED_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.CUT_RED_NETHERRACK.asItem()), has(ModBlocks.CUT_RED_NETHERRACK.asItem()))
                .save(recipeOutput);

        //Polished Dark Netherrack
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_NETHERRACK.asItem(), 8)
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', ModBlocks.POLISHED_NETHERRACK.asItem())
                .define('B', Items.BLACK_DYE)
                .unlockedBy(getHasName(ModBlocks.POLISHED_NETHERRACK.asItem()), has(ModBlocks.POLISHED_NETHERRACK.asItem()))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_NETHERRACK_SLAB.asItem(), Ingredient.of(ModBlocks.POLISHED_DARK_NETHERRACK.asItem()))
                .unlockedBy(getHasName(ModBlocks.POLISHED_DARK_NETHERRACK.asItem()), has(ModBlocks.POLISHED_DARK_NETHERRACK.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_DARK_NETHERRACK_SLAB.asItem(), ModBlocks.POLISHED_DARK_NETHERRACK.asItem());

        //Dark Nether Bricks
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_NETHER_BRICKS.asItem(), 8)
                .pattern("###")
                .pattern("#B#")
                .pattern("###")
                .define('#', Items.NETHER_BRICKS)
                .define('B', Items.BLACK_DYE)
                .group("dark_nether_bricks")
                .unlockedBy(getHasName(Items.NETHER_BRICKS), has(Items.NETHER_BRICKS))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPALLING_NETHER_BRICKS.asItem(), Items.NETHER_BRICKS);
        shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHER_BRICK_PILLAR.asItem(), 2)
                .pattern("#")
                .pattern("#")
                .define('#', Items.NETHER_BRICKS)
                .unlockedBy(getHasName(Items.NETHER_BRICKS), has(Items.NETHER_BRICKS))
                .save(recipeOutput);
        slabBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_NETHER_BRICK_SLAB.asItem(), Ingredient.of(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(ModBlocks.DARK_NETHER_BRICKS.asItem()), has(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        stairBuilder(ModBlocks.DARK_NETHER_BRICK_STAIRS.asItem(), Ingredient.of(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(ModBlocks.DARK_NETHER_BRICKS.asItem()), has(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        fenceBuilder(ModBlocks.DARK_NETHER_BRICK_FENCE.asItem(), Ingredient.of(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(ModBlocks.DARK_NETHER_BRICKS.asItem()), has(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        wallBuilder(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_NETHER_BRICK_WALL.asItem(), Ingredient.of(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .unlockedBy(getHasName(ModBlocks.DARK_NETHER_BRICKS.asItem()), has(ModBlocks.DARK_NETHER_BRICKS.asItem()))
                .save(recipeOutput);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_NETHER_BRICK_SLAB.asItem(), ModBlocks.DARK_NETHER_BRICKS.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_NETHER_BRICK_STAIRS.asItem(), ModBlocks.DARK_NETHER_BRICKS.asItem());
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_NETHER_BRICK_WALL.asItem(), ModBlocks.DARK_NETHER_BRICKS.asItem());


        shapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROUGH_NETHERRACK.asItem())
                .requires(ModBlocks.ROUGH_NETHERRACK.asItem())
                .requires(ModBlocks.NETHER_WART_FLUFF.asItem())
                .unlockedBy(getHasName(ModBlocks.NETHER_WART_FLUFF.asItem()), has(ModBlocks.NETHER_WART_FLUFF.asItem()))
                .save(recipeOutput);
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, Items.NETHER_WART_BLOCK, Ingredient.of(ModBlocks.NETHER_WART_FLUFF.asItem()));
        polishedBuilder(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_WART_BLOCK, Ingredient.of(ModBlocks.WARPED_WART_FLUFF.asItem()));

        //Dyes
        shapeless(RecipeCategory.MISC, Items.RED_DYE)
                .requires(ModBlocks.OBSERVER_ORCHIDS.asItem())
                .group("red_dye")
                .unlockedBy(getHasName(ModBlocks.OBSERVER_ORCHIDS.asItem()), has(ModBlocks.OBSERVER_ORCHIDS.asItem()))
                .save(recipeOutput);
        shapeless(RecipeCategory.MISC, Items.ORANGE_DYE)
                .requires(ModBlocks.WARPED_BLOSSOM.asItem())
                .group("orange_dye")
                .unlockedBy(getHasName(ModBlocks.WARPED_BLOSSOM.asItem()), has(ModBlocks.WARPED_BLOSSOM.asItem()))
                .save(recipeOutput);
    }
}
