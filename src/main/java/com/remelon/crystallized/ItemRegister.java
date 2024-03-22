package com.remelon.crystallized;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ItemRegister {
	public static final Item GLASS_SLIDE = registerItem("glass_slide", new Item(new FabricItemSettings()));
	public static final Item MECH_SLIDE = registerItem("mech_slide", new Item(new FabricItemSettings()));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier("crystallized", name), item);
	}

	public static void registerModItems() {
		Crystallized.LOGGER.info("Registering Mod Items for " + Crystallized.ID);
	}
}
