package com.remelon.crystallized;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;


import static net.minecraft.world.item.Items.registerItem;

public class ItemRegister {
	public static final Item GLASS_SLIDE = registerItem("glass_slide", new Item(new FabricItemSettings()));
	public static final Item MECH_SLIDE = registerItem("mech_slide", new Item(new FabricItemSettings()));
	public static final Item NETHER_BASE = registerItem("nether_base", new Item(new FabricItemSettings()));
	public static final Item MECH_NETHER_BASE = registerItem("mech_nether_base", new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation("crystallized", name), item);
	}

	public static void registerModItems() {
		Crystallized.LOGGER.info("Registering Mod Items for " + Crystallized.ID);
	}
}
