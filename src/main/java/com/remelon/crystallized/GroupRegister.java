package com.remelon.crystallized;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class GroupRegister {
	public static final CreativeModeTab CRYSTAL_GROUP = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
			new ResourceLocation("crystallized", "tab"),
			FabricItemGroup.builder()
					.title(Component.translatable("crystallized.group"))
					.icon(() -> new ItemStack(ItemRegister.GLASS_SLIDE)).displayItems((displayContext, entries) -> {
						entries.accept(ItemRegister.GLASS_SLIDE);
						entries.accept(ItemRegister.MECH_SLIDE);
					})
					.build());

	public static void registerItemGroups() {
		Crystallized.LOGGER.info("Registering Item Groups for " + Crystallized.ID);
	}


}
