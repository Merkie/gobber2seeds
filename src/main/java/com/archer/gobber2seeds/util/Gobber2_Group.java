package com.archer.gobber2seeds.util;


import com.archer.gobber2seeds.init.ItemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class Gobber2_Group extends CreativeModeTab
{
	public Gobber2_Group() {
		super("gobber2seeds");
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(ItemInit.GOBBER2_SEED.get());
	}
}
