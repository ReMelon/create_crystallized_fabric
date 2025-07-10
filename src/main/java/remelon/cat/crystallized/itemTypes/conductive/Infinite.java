package remelon.cat.crystallized.itemTypes.conductive;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

public class Infinite extends Item {

	public Infinite(Settings settings) {
		super(settings);
	}

	@Override
	public void appendTooltip(ItemStack pStack, @Nullable World pLevel, List<Text> pTooltipComponents, TooltipContext pIsAdvanced) {
		super.appendTooltip(pStack, pLevel, pTooltipComponents, pIsAdvanced);
		pTooltipComponents.add(Text.translatable("item.crystallized.conductive.tooltip").formatted(Formatting.GRAY));
	}
}
