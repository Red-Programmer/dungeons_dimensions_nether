package net.redupro.mcd_d_nether;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.redupro.mcd_d_nether.datagen.ModBlockTagProvider;
import net.redupro.mcd_d_nether.datagen.ModLootTableProvider;
import net.redupro.mcd_d_nether.datagen.ModRecipeProvider;

public class DungeonsDimensionsNetherDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModLootTableProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModRecipeProvider::new);
	}
}
