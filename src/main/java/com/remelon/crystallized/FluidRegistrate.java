package com.remelon.crystallized;

import com.simibubi.create.AllCreativeModeTabs;
import com.tterrag.registrate.fabric.SimpleFlowableFluid;
import com.tterrag.registrate.util.entry.FluidEntry;

import net.fabricmc.fabric.api.transfer.v1.fluid.FluidConstants;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariant;
import net.fabricmc.fabric.api.transfer.v1.fluid.FluidVariantAttributeHandler;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.EmptyItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.fluid.base.FullItemFluidStorage;
import net.fabricmc.fabric.api.transfer.v1.item.ItemVariant;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static com.remelon.crystallized.Crystallized.CREGISTRATE;
import static com.simibubi.create.Create.REGISTRATE;
import static net.minecraft.item.Items.BUCKET;

public class FluidRegistrate {

	public static final Identifier CRYSTAL_STILL_GEN = Crystallized.GenI("fluid/liquid_crystal_still");
	public static final Identifier CRYSTAL_FLOW_GEN = Crystallized.GenI("fluid/liquid_crystal_flow");

	public static final FluidEntry<SimpleFlowableFluid.Flowing> CRYSTALFLUID = CREGISTRATE
			.fluid("liquid_crystal", CRYSTAL_STILL_GEN, CRYSTAL_FLOW_GEN)
			.lang("Liquid Crystal")
			.fluidProperties(p -> p.levelDecreasePerBlock(2)
					.tickRate(25)
					.flowSpeed(4)
					.blastResistance(100f))
			.fluidAttributes(()->new FluidVariantAttributeHandler(){
				@Override
				public Text getName(FluidVariant fluidVariant) {
					return Text.translatable("fluid.crystallized.crystal");
				}
				@Override
				public boolean isLighterThanAir(FluidVariant variant) {
					return false;
				}
			})
			.source(SimpleFlowableFluid.Source::new)
			.bucket()
			.tab(GroupRegister.CRYSTAL_GROUP.key())
			.lang("Bucket of Liquid Crystal")
			.build()
			.onRegisterAfter(RegistryKeys.ITEM, crystal -> {
				Fluid source = crystal.getStill();
				FluidStorage.combinedItemApiProvider(source.getBucketItem()).register(context ->
						new FullItemFluidStorage(context, bucket -> ItemVariant.of(BUCKET), FluidVariant.of(source), FluidConstants.BUCKET));

				FluidStorage.combinedItemApiProvider(BUCKET).register(context ->
						new EmptyItemFluidStorage(context, bucket -> ItemVariant.of(source.getBucketItem()), source, FluidConstants.BUCKET));
			})

			.register();


	public static void register() {
		Crystallized.LOGGER.info("Registering Crystal Fluid");
	}

}
