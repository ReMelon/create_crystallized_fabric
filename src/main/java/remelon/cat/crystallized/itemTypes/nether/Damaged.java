package remelon.cat.crystallized.itemTypes.nether;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Damaged extends Item {

	public Damaged(Settings settings) {
		super(settings);
	}

	@Override
	public boolean isItemBarVisible(ItemStack stack) {
		return true;
	}

	@Override
	public int getItemBarStep(ItemStack stack) {
		return Math.round(13.0F * MathHelper.clamp(1 / ((float) 3), 0, 1));
	}


	@Override
	public void appendTooltip(ItemStack pStack, @Nullable World pLevel, List<Text> pTooltipComponents, TooltipContext pIsAdvanced) {
		super.appendTooltip(pStack, pLevel, pTooltipComponents, pIsAdvanced);
		pTooltipComponents.add(Text.translatable("item.crystallized.nether.tooltip").formatted(Formatting.GRAY));
		pTooltipComponents.add(Text.translatable("item.crystallized.damaged.tooltip").formatted(Formatting.DARK_GRAY));
	}
}
