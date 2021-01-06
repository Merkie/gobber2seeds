package com.kwpugh.gobber2.items.tools.sword;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.gobber2.init.ItemInit;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemCustomSwordNether extends SwordItem
{
	public ItemCustomSwordNether(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) 
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn)
    {
        if (!worldIn.isRemote)
        {
        	//TBD
        }
        return new ActionResult<ItemStack>(ActionResultType.PASS, playerIn.getHeldItem(handIn));
    }
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker)
	{
		if(target instanceof WitherSkeletonEntity)
	    {
			target.remove(true);
	       	target.entityDropItem(Items.WITHER_SKELETON_SKULL, 1);
	    }
	 
		if (attacker.world.getDimensionKey() == World.THE_NETHER  &&
				attacker instanceof PlayerEntity) 
		{
			DamageSource source = DamageSource.causePlayerDamage((PlayerEntity) attacker);
			source.setMagicDamage().setDamageBypassesArmor();
			target.attackEntityFrom(source, 30);
		}
		
		stack.damageItem(1, attacker, (p_220045_0_) -> {
	         p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
	    	});
	      
		return true;
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}
    
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GOBBER2_INGOT_NETHER.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_sword_nether.line1").mergeStyle(TextFormatting.GREEN)));
	}
}
