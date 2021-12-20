package com.archer.gobber2seeds.items.seeds;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.ChatFormatting;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemCustomSeed extends ItemNameBlockItem
{

	public ItemCustomSeed(Block crop, Item.Properties builder)
	{
        super(crop, builder);     
    }

	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslatableComponent("item.gobber2.gobber2_seed.line1").withStyle(ChatFormatting.GREEN)));
	}  
}
