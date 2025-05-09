package net.alminoris.aestheticframes;

import net.alminoris.aestheticframes.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class AestheticFramesDataGenerator implements DataGeneratorEntrypoint
{
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator)
	{
		fabricDataGenerator.addProvider(ModModelProvider::new);
		fabricDataGenerator.addProvider(ModRecipeProvider::new);
		fabricDataGenerator.addProvider(ModLootTableProvider::new);
		fabricDataGenerator.addProvider(ModBlockTagProvider::new);
		fabricDataGenerator.addProvider(ModFusionModelProvider::new);
		fabricDataGenerator.addProvider(ModFusionTextureMetadataProvider::new);
	}
}
