package com.remelon.crystallized;

import com.simibubi.create.Create;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipHelper;
import com.simibubi.create.foundation.item.TooltipModifier;
import com.tterrag.registrate.Registrate;

import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.fabric.SimpleFlowableFluid;

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

	public static final CreateRegistrate CREGISTRATE = CreateRegistrate.create("crystallized");

	public static Identifier GenI(String name) {
		return new Identifier(ID, name);
	}

	static {
		CREGISTRATE.setTooltipModifierFactory(item -> new ItemDescription.Modifier(item, TooltipHelper.Palette.STANDARD_CREATE)
				.andThen(TooltipModifier.mapNull(KineticStats.create(item))));
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);


		GroupRegister.registerItemGroups();
		ItemRegistrate.registerModItems();
		FluidRegistrate.register();
		ResourcePack.register();
		CREGISTRATE.register();



	}
}
