package com.remelon.crystallized.itemTypes.nether;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

public class Chipped extends Item {

	public Chipped(Settings settings) {
		super(settings.maxDamage(99));
	}


	@Override
	public boolean isItemBarVisible(ItemStack stack) {
		return true;
	}

	@Override
	public int getItemBarStep(ItemStack stack) {
		return Math.round(13.0F * MathHelper.clamp(((float) 1.75) / ((float) 3), 0, 1));
	}

	@Override
	public void appendTooltip(ItemStack pStack, @Nullable World pLevel, List<Text> pTooltipComponents, TooltipContext pIsAdvanced) {
		super.appendTooltip(pStack, pLevel, pTooltipComponents, pIsAdvanced);
		pTooltipComponents.add(Text.translatable("item.crystallized.nether.tooltip").formatted(Formatting.GRAY));
		pTooltipComponents.add(Text.translatable("item.crystallized.chipped.tooltip").formatted(Formatting.DARK_GRAY));
	}



}
