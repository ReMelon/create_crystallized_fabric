package remelon.cat.crystallized;

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
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static remelon.cat.crystallized.Crystallized.CREGISTRATE;
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
		Crystallized.LOGGER.info("FluidsLoaded");
	}

	/*
	Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam ultrices nibh quis malesuada ullamcorper. Nulla ultrices, metus in rhoncus porttitor, magna quam mollis ligula, ac pellentesque risus neque sit amet arcu. Fusce euismod at lorem elementum accumsan. Nam ullamcorper odio ac ante vehicula maximus. Mauris aliquet tortor sed mi pulvinar interdum. Nulla facilisi. Duis lacinia, dolor sit amet dapibus rutrum, felis lectus accumsan arcu, quis sollicitudin arcu dui eu eros.

Nullam id cursus velit. In ac condimentum tellus, id varius dui. Sed eu orci in lectus tempor dictum sit amet nec ex. Etiam non consectetur lacus. Nulla facilisi. Proin vitae diam ut dui semper mollis vel sed magna. Mauris sit amet est eros. Mauris viverra libero justo. Suspendisse consequat mauris id mi semper porta quis eget justo. Cras sed aliquet nisi.

Fusce vel odio ac sapien molestie mattis dapibus bibendum ex. Ut efficitur malesuada magna, vel lacinia odio dapibus sit amet. Ut placerat erat non diam vulputate, in vulputate arcu sodales. Aenean purus est, condimentum et maximus pulvinar, facilisis quis augue. Proin id ipsum sed quam tristique pharetra. Praesent lorem justo, scelerisque nec lectus porta, consectetur faucibus nisl. Duis commodo metus nunc. Vestibulum at diam eu justo tristique vulputate. Nullam molestie nulla vel felis sagittis sagittis. Donec hendrerit ultricies sollicitudin. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer nec diam sagittis, luctus est sit amet, aliquam velit. Nullam ut ex vehicula, accumsan sapien vel, elementum dui. Ut non sollicitudin ante, non posuere elit. Morbi sed facilisis sem. Aliquam egestas accumsan finibus.

Curabitur ullamcorper pharetra luctus. Sed id dictum dui, in eleifend metus. Aliquam maximus congue nulla, non faucibus turpis consectetur quis. Donec tincidunt euismod feugiat. Aenean in iaculis tortor, non aliquam dui. Phasellus euismod finibus ante nec vulputate. Nam et pulvinar massa.

Vestibulum sed ligula et justo viverra tempus. Pellentesque eget porttitor tortor. Pellentesque quis sollicitudin ante. Morbi id libero iaculis, congue mauris nec, commodo velit. Aliquam quis est nec nibh ornare ullamcorper in et nisl. Donec vehicula sapien nec libero porttitor, sed venenatis ante facilisis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam eget maximus enim.

Donec vulputate neque non augue hendrerit ultrices. Vestibulum non consequat nisl. Nullam venenatis dui magna, sed placerat mi luctus at. Sed sit amet augue orci. Maecenas sapien turpis, ullamcorper non diam non, dignissim sodales tellus. Aenean eu arcu vulputate, consectetur tortor eu, vehicula odio. Vivamus vitae tortor sed libero lobortis scelerisque in et dolor. Ut dictum metus eget mi vehicula aliquet. Etiam hendrerit dictum risus, sit amet luctus urna dignissim ac. Sed non cursus est. Duis et sem orci.

Aenean quis orci non neque elementum facilisis non non mi. Vestibulum auctor in erat ac blandit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam euismod luctus arcu, eu maximus lorem faucibus vitae. Aenean et sollicitudin diam. Praesent bibendum magna ut turpis sodales mollis. Donec at rhoncus massa, iaculis faucibus purus. Integer libero lectus, dictum sit amet eros vitae, congue scelerisque dolor. Morbi convallis dolor id mauris.
	 */

}
