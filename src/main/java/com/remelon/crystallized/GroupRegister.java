package com.remelon.crystallized;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class GroupRegister {
	public static final ItemGroup CRYSTAL_GROUP = Registry.register(Registries.ITEM_GROUP,
			new Identifier("crystallized", "itemtab"),
			FabricItemGroup.builder().displayName(Text.translatable("crystaltab"))
					.icon(() -> new ItemStack(ItemRegister.GLASS_SLIDE)).entries((displayContext, entries) -> {
						entries.add(ItemRegister.MECH_SLIDE);
						entries.add(ItemRegister.GLASS_SLIDE);
						entries.add(Crystallized.CRYSTAL_BUCKET);


					}).build());

	public static void registerItemGroups() {
		Crystallized.LOGGER.info("Registering Item Groups for " + Crystallized.ID);
	}


}
