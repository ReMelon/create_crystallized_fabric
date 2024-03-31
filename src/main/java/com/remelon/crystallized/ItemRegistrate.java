package com.remelon.crystallized;

import com.remelon.crystallized.itemTypes.nether.chipped;
import com.remelon.crystallized.itemTypes.nether.damaged;
import com.remelon.crystallized.itemTypes.nether.infinite;
import com.remelon.crystallized.itemTypes.nether.perfect;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;

import static com.remelon.crystallized.Crystallized.CREGISTRATE;


public class ItemRegistrate {
	public static final ItemEntry<Item> GLASS_SLIDE =
			CREGISTRATE.item("glass_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Item> STRONG_SLIDE =
			CREGISTRATE.item("strong_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<infinite> NETHER_STRONG_SLIDE =
			CREGISTRATE.item("strong_nether_slide", infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<perfect> NETHER_SLIDE =
			CREGISTRATE.item("nether_slide", perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<chipped> CHIPPED_NETHER_SLIDE =
			CREGISTRATE.item("chipped_nether_slide", chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.properties(p -> p.maxDamage(10))
					.register();

	public static final ItemEntry<damaged> DAMAGED_NETHER_SLIDE =
			CREGISTRATE.item("damaged_nether_slide", damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();



	public static void registerModItems() {
		Crystallized.LOGGER.info("ItemRegister Loaded");
	}
}
