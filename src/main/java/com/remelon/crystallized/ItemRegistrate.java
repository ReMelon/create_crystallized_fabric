package com.remelon.crystallized;

import com.remelon.crystallized.itemTypes.nether.Chipped;
import com.remelon.crystallized.itemTypes.nether.Damaged;
import com.remelon.crystallized.itemTypes.nether.Infinite;
import com.remelon.crystallized.itemTypes.nether.Perfect;



import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.item.Item;

import static com.remelon.crystallized.Crystallized.CREGISTRATE;

public class ItemRegistrate {

	// [---------------------------SLIDES---------------------------]

	public static final ItemEntry<Item> GLASS_SLIDE =
			CREGISTRATE.item("glass_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.general.Chipped> CHIPPED_GLASS_SLIDE =
			CREGISTRATE.item("chipped_glass_slide",  com.remelon.crystallized.itemTypes.general.Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.general.Damaged> DAMAGED_GLASS_SLIDE =
			CREGISTRATE.item("damaged_glass_slide",  com.remelon.crystallized.itemTypes.general.Damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Item> STRONG_SLIDE =
			CREGISTRATE.item("strong_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();


	// [---------------------------NETHER SLIDES---------------------------]

	public static final ItemEntry<Infinite> NETHER_STRONG_SLIDE =
			CREGISTRATE.item("strong_nether_slide", Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Infinite> NETHER_STRONG_FILLED =
			CREGISTRATE.item("strong_nether_filled", Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Perfect> NETHER_SLIDE =
			CREGISTRATE.item("nether_slide", Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Perfect> NETHER_SLIDE_FILLED =
			CREGISTRATE.item("nether_filled", Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();




	public static final ItemEntry<Chipped> CHIPPED_NETHER_SLIDE =
			CREGISTRATE.item("chipped_nether_slide", Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Damaged> DAMAGED_NETHER_SLIDE =
			CREGISTRATE.item("damaged_nether_slide", Damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Chipped> CHIPPED_NETHER_FILLED =
			CREGISTRATE.item("chipped_nether_filled", Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Damaged> DAMAGED_NETHER_FILLED =
			CREGISTRATE.item("damaged_nether_filled", Damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();


	// [---------------------------CONDUCTIVE SLIDES---------------------------]

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Infinite> CONDUCTIVE_STRONG_SLIDE =
			CREGISTRATE.item("strong_conductive_slide", com.remelon.crystallized.itemTypes.conductive.Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Infinite> CONDUCTIVE_STRONG_FILLED =
			CREGISTRATE.item("strong_conductive_filled", com.remelon.crystallized.itemTypes.conductive.Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Perfect> CONDUCTIVE_SLIDE =
			CREGISTRATE.item("conductive_slide", com.remelon.crystallized.itemTypes.conductive.Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Perfect> CONDUCTIVE_SLIDE_FILLED =
			CREGISTRATE.item("conductive_filled", com.remelon.crystallized.itemTypes.conductive.Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();



	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Chipped> CHIPPED_CONDUCTIVE_SLIDE =
			CREGISTRATE.item("chipped_conductive_slide", com.remelon.crystallized.itemTypes.conductive.Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Damaged> DAMAGED_CONDUCTIVE_SLIDE =
			CREGISTRATE.item("damaged_conductive_slide", com.remelon.crystallized.itemTypes.conductive.Damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Chipped> CHIPPED_CONDUCTIVE_FILLED =
			CREGISTRATE.item("chipped_conductive_filled", com.remelon.crystallized.itemTypes.conductive.Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.conductive.Damaged> DAMAGED_CONDUCTIVE_FILLED =
			CREGISTRATE.item("damaged_conductive_filled", com.remelon.crystallized.itemTypes.conductive.Damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();


	// [---------------------------FILLED AMETHYST SLIDES---------------------------]


	public static final ItemEntry<com.remelon.crystallized.itemTypes.amethyst.Infinite> AMETHYST_STRONG_FILLED =
			CREGISTRATE.item("strong_amethyst_filled", com.remelon.crystallized.itemTypes.amethyst.Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.amethyst.Perfect> AMETHYST_SLIDE_FILLED =
			CREGISTRATE.item("amethyst_filled", com.remelon.crystallized.itemTypes.amethyst.Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();




	public static final ItemEntry<com.remelon.crystallized.itemTypes.amethyst.Chipped> CHIPPED_AMETHYST_SLIDE_FILLED =
			CREGISTRATE.item("chipped_amethyst_filled", com.remelon.crystallized.itemTypes.amethyst.Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<com.remelon.crystallized.itemTypes.amethyst.Damaged> DAMAGED_AMETHYST_SLIDE_FILLED =
			CREGISTRATE.item("damaged_amethyst_filled", com.remelon.crystallized.itemTypes.amethyst.Damaged::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();


	// [---------------------------OTHER---------------------------]

	public static final ItemEntry<Item> CONDUCTIVE =
			CREGISTRATE.item("conductive_compound", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<Item> NETHER_CRYSTAL =
			CREGISTRATE.item("nether_crystal", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();


	public static void registerModItems() {
		Crystallized.LOGGER.info("ItemRegister Loaded");
	}
}
