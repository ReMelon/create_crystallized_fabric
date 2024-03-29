package com.remelon.crystallized;

import com.remelon.crystallized.itemTypes.chipped;
import com.remelon.crystallized.itemTypes.damaged;
import com.remelon.crystallized.itemTypes.perfect;
import com.simibubi.create.foundation.item.ItemDescription;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.util.entry.ItemEntry;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.remelon.crystallized.Crystallized.CREGISTRATE;


public class ItemRegistrate {
	public static final ItemEntry<Item> GLASS_SLIDE =
			CREGISTRATE.item("glass_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Item> MECH_SLIDE =
			CREGISTRATE.item("mech_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Item> NETHER_MECH_SLIDE =
			CREGISTRATE.item("nether_mech_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<perfect> NETHER_SLIDE =
			CREGISTRATE.item("nether_slide", perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<chipped> CHIPPED_NETHER_SLIDE =
			CREGISTRATE.item("chipped_nether_slide", chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<damaged> DAMAGED_NETHER_SLIDE =
			CREGISTRATE.item("damaged_nether_slide", damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();



	public static final ItemEntry<Item> MECH_NETHER_SLIDE =
			CREGISTRATE.item("mech_nether_slide", Item::new)

					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static void registerModItems() {
		Crystallized.LOGGER.info("ItemRegister Loaded");
	}
}
