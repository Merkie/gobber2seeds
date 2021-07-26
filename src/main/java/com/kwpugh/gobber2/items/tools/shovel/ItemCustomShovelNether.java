package com.kwpugh.gobber2.items.tools.shovel;

import com.kwpugh.gobber2.init.ItemInit;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShovelItem;

public class ItemCustomShovelNether extends ShovelItem
{
	public ItemCustomShovelNether (Tier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}

	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GOBBER2_INGOT_NETHER.get();
	}
}