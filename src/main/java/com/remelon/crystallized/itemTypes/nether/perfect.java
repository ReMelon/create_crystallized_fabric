package com.remelon.crystallized.itemTypes.nether;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;

import java.util.List;

public class perfect extends Item {

	public perfect(Settings settings) {
		super(settings);
	}

	@Override
	public void appendTooltip(ItemStack pStack, @Nullable World pLevel, List<Text> pTooltipComponents, TooltipContext pIsAdvanced) {
		super.appendTooltip(pStack, pLevel, pTooltipComponents, pIsAdvanced);
		pTooltipComponents.add(Text.translatable("item.crystallized.perfect.tooltip").formatted(Formatting.GRAY));
		pTooltipComponents.add(Text.translatable("item.crystallized.perfect.tooltip2").formatted(Formatting.DARK_GRAY));
	}
}
