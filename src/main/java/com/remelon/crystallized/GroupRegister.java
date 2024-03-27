package com.remelon.crystallized;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.Create;
import com.simibubi.create.foundation.utility.Components;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;


public class GroupRegister {
	public static final TabInfo CRYSTAL_GROUP = register("Crystallized",
			() -> FabricItemGroup.builder()
					.displayName(Text.translatable("crystallized.itemtab"))
					.icon(() -> new ItemStack(ItemRegister.GLASS_SLIDE))
					.entries((displayContext, entries) -> {
						entries.add(ItemRegister.MECH_SLIDE);
						entries.add(ItemRegister.GLASS_SLIDE);
					})
					.build());




	private static TabInfo register(String name, Supplier<ItemGroup> supplier) {
		Identifier id = new Identifier("crystallized", "itemtab");
		RegistryKey<ItemGroup> key = RegistryKey.of(RegistryKeys.ITEM_GROUP, id);
		ItemGroup tab = supplier.get();
		Registry.register(Registries.ITEM_GROUP, key, tab);
		return new TabInfo(key, tab);
	}

	public record TabInfo(RegistryKey<ItemGroup> key, ItemGroup tab) {
	}

	public static void registerItemGroups() {
		Crystallized.LOGGER.info("Registering Item Groups for " + Crystallized.ID);
	}



}
