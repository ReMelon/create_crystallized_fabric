package com.remelon.crystallized;

import com.simibubi.create.Create;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.FlowableFluid;

import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;

import net.minecraft.item.Items;
import net.minecraft.registry.Registries;

import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Crystallized implements ModInitializer {
	public static final String ID = "crystallized";
	public static final String NAME = "Create: Crystallized";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	public static FlowableFluid STILL_CRYSTAL;
	public static FlowableFluid FLOWING_CRYSTAL;
	public static Item CRYSTAL_BUCKET;
	public static Block CRYSTAL_BLOCK;


	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);


		STILL_CRYSTAL = Registry.register(Registries.FLUID, new Identifier("crystallized", "liquid_crystal"), new LiquidCrystal.Still());
		FLOWING_CRYSTAL = Registry.register(Registries.FLUID, new Identifier("crystallized", "flowing_crystal"), new LiquidCrystal.Flowing());
		CRYSTAL_BUCKET = Registry.register(Registries.ITEM, new Identifier("crystallized", "crystal_bucket"),
				new BucketItem(STILL_CRYSTAL, new Item.Settings().recipeRemainder(Items.BUCKET).maxCount(1)));
		CRYSTAL_BLOCK = Registry.register(Registries.BLOCK, new Identifier("crystallized", "liquid_crystal_block"),
				new FluidBlock(STILL_CRYSTAL, FabricBlockSettings.copyOf(Blocks.WATER)){ });
		GroupRegister.registerItemGroups();
		ItemRegister.registerModItems();



	}
}
