package remelon.cat.crystallized;

import remelon.cat.crystallized.itemTypes.nether.Chipped;
import remelon.cat.crystallized.itemTypes.nether.Damaged;
import remelon.cat.crystallized.itemTypes.nether.Infinite;
import remelon.cat.crystallized.itemTypes.nether.Perfect;



import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.item.Item;

import static remelon.cat.crystallized.Crystallized.CREGISTRATE;

public class ItemRegistrate {

	// [---------------------------SLIDES---------------------------]

	public static final ItemEntry<Item> GLASS_SLIDE =
			CREGISTRATE.item("glass_slide", Item::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.general.Chipped> CHIPPED_GLASS_SLIDE =
			CREGISTRATE.item("chipped_glass_slide",  remelon.cat.crystallized.itemTypes.general.Chipped::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.general.Damaged> DAMAGED_GLASS_SLIDE =
			CREGISTRATE.item("damaged_glass_slide",  remelon.cat.crystallized.itemTypes.general.Damaged::new)
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
					.register();

	public static final ItemEntry<Damaged> DAMAGED_NETHER_SLIDE =
			CREGISTRATE.item("damaged_nether_slide", Damaged::new)
					.register();

	public static final ItemEntry<Chipped> CHIPPED_NETHER_FILLED =
			CREGISTRATE.item("chipped_nether_filled", Chipped::new)
					.register();

	public static final ItemEntry<Damaged> DAMAGED_NETHER_FILLED =
			CREGISTRATE.item("damaged_nether_filled", Damaged::new)
					.register();


	// [---------------------------CONDUCTIVE SLIDES---------------------------]

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Infinite> CONDUCTIVE_STRONG_SLIDE =
			CREGISTRATE.item("strong_conductive_slide", remelon.cat.crystallized.itemTypes.conductive.Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Infinite> CONDUCTIVE_STRONG_FILLED =
			CREGISTRATE.item("strong_conductive_filled", remelon.cat.crystallized.itemTypes.conductive.Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Perfect> CONDUCTIVE_SLIDE =
			CREGISTRATE.item("conductive_slide", remelon.cat.crystallized.itemTypes.conductive.Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Perfect> CONDUCTIVE_SLIDE_FILLED =
			CREGISTRATE.item("conductive_filled", remelon.cat.crystallized.itemTypes.conductive.Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Chipped> CHIPPED_CONDUCTIVE_SLIDE =
			CREGISTRATE.item("chipped_conductive_slide", remelon.cat.crystallized.itemTypes.conductive.Chipped::new)
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Damaged> DAMAGED_CONDUCTIVE_SLIDE =
			CREGISTRATE.item("damaged_conductive_slide", remelon.cat.crystallized.itemTypes.conductive.Damaged::new)
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Chipped> CHIPPED_CONDUCTIVE_FILLED =
			CREGISTRATE.item("chipped_conductive_filled", remelon.cat.crystallized.itemTypes.conductive.Chipped::new)
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.conductive.Damaged> DAMAGED_CONDUCTIVE_FILLED =
			CREGISTRATE.item("damaged_conductive_filled", remelon.cat.crystallized.itemTypes.conductive.Damaged::new)
					.register();


	// [---------------------------FILLED AMETHYST SLIDES---------------------------]


	public static final ItemEntry<remelon.cat.crystallized.itemTypes.amethyst.Infinite> AMETHYST_STRONG_FILLED =
			CREGISTRATE.item("strong_amethyst_filled", remelon.cat.crystallized.itemTypes.amethyst.Infinite::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.amethyst.Perfect> AMETHYST_SLIDE_FILLED =
			CREGISTRATE.item("amethyst_filled", remelon.cat.crystallized.itemTypes.amethyst.Perfect::new)
					.tab(GroupRegister.CRYSTAL_GROUP.key())
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.amethyst.Chipped> CHIPPED_AMETHYST_SLIDE_FILLED =
			CREGISTRATE.item("chipped_amethyst_filled", remelon.cat.crystallized.itemTypes.amethyst.Chipped::new)
					.register();

	public static final ItemEntry<remelon.cat.crystallized.itemTypes.amethyst.Damaged> DAMAGED_AMETHYST_SLIDE_FILLED =
			CREGISTRATE.item("damaged_amethyst_filled", remelon.cat.crystallized.itemTypes.amethyst.Damaged::new)
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
