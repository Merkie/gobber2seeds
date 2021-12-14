package com.kwpugh.gobber2.items.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.gobber2.config.GobberConfigBuilder;
import com.kwpugh.gobber2.init.ItemInit;
import com.kwpugh.gobber2.util.PlayerSpecialAbilities;

import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.network.chat.Component;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import net.minecraft.world.item.Item.Properties;

public class ItemCustomArmorEnd extends ArmorItem
{
	public ItemCustomArmorEnd(ArmorMaterial materialIn, EquipmentSlot slots, Properties builder)
	{
		super(materialIn, slots, builder);
	}
	
	boolean enablePerks = GobberConfigBuilder.ENABLE_GOBBER_END_ARMOR_HEALTH_PERKS.get();
	int hunger = GobberConfigBuilder.GOBBER_END_ARMOR_HUNGER.get();
	double saturation = GobberConfigBuilder.GOBBER_END_ARMOR_SATURATION.get();
	
	@Override
	public void onArmorTick(final ItemStack stack, final Level world, final Player player)
	{
		if(!enablePerks) return;
		//Full Set Bonus			
		ItemStack head = player.getItemBySlot(EquipmentSlot.HEAD);
		ItemStack chest = player.getItemBySlot(EquipmentSlot.CHEST);
		ItemStack legs = player.getItemBySlot(EquipmentSlot.LEGS);
		ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);	
 
		setDamage(head, 0);
		setDamage(chest, 0);
		setDamage(legs, 0);
		setDamage(feet, 0);
    
		boolean isWearingFullEndArmor = head != null && head.getItem() == ItemInit.GOBBER2_HELMET_END.get() && 
				chest != null && chest.getItem() == ItemInit.GOBBER2_CHESTPLATE_END.get() &&
				legs != null && legs.getItem() == ItemInit.GOBBER2_LEGGINGS_END.get() && 
				feet != null && feet.getItem() == ItemInit.GOBBER2_BOOTS_END.get();
		
		if(isWearingFullEndArmor)
		{
			//Additional full set bonuses
			if(player.getEffect(MobEffects.BLINDNESS) != null)
			{
				player.removeEffect(MobEffects.BLINDNESS);
			}
	
			if(player.getEffect(MobEffects.MOVEMENT_SLOWDOWN) != null)
			{
				player.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
			}
			
			if(player.getEffect(MobEffects.DIG_SLOWDOWN) != null)
			{
				player.removeEffect(MobEffects.DIG_SLOWDOWN);
			}
			
			if(player.getEffect(MobEffects.HARM) != null)
			{
				player.removeEffect(MobEffects.HARM);
			}
			
			if(player.getEffect(MobEffects.CONFUSION) != null)
			{
				player.removeEffect(MobEffects.CONFUSION);
			}
			
			if(player.getEffect(MobEffects.HUNGER) != null)
			{
				player.removeEffect(MobEffects.HUNGER);
			}
			
			if(player.getEffect(MobEffects.POISON) != null)
			{
				player.removeEffect(MobEffects.POISON);
			}
			
			if(player.getEffect(MobEffects.WITHER) != null)
			{
				player.removeEffect(MobEffects.WITHER);
			}
			
			if(player.getEffect(MobEffects.UNLUCK) != null)
			{
				player.removeEffect(MobEffects.UNLUCK);
			}
			
			if(player.getEffect(MobEffects.WEAKNESS) != null)
			{
				player.removeEffect(MobEffects.WEAKNESS);
			}
		} 
     
		//Check ArmorUtil for additional perks applied to armor

	    //Helmet
	    if(head.getItem() == ItemInit.GOBBER2_HELMET_END.get())
		{
			PlayerSpecialAbilities.giveYellowHearts(world, player, stack, 10, 0.33F);	
			PlayerSpecialAbilities.giveRegenEffect(world, player, stack, hunger, (float) saturation);
		}
		else
		{
			PlayerSpecialAbilities.giveNoExtraHearts(world, player, stack);
		}

	    
	    //Chestplate
	    if(chest.getItem() == ItemInit.GOBBER2_CHESTPLATE_END.get())
		{				
	 		//something
		 }		

	    
	    
	    //Leggings
	    if(legs.getItem() == ItemInit.GOBBER2_LEGGINGS_END.get())
		{
	    	//TBD
		}
		else
		{
			//something
		}		
	    
	    
	    
	    //Boots
	    if(feet.getItem() == ItemInit.GOBBER2_BOOTS_END.get())
		{
	    	//something
	    }
		else
	    {
			//something
	    }		
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}
	
	@Override
	public void onCraftedBy(ItemStack stack, Level worldIn, Player playerIn)
	{
		if(GobberConfigBuilder.END_GOBBER_ARMOR_UNBREAKABLE.get())
		{
			stack.getOrCreateTag().putBoolean("Unbreakable", true);
		}
	}
	
	@Override
	public boolean isValidRepairItem(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == ItemInit.GOBBER2_INGOT_END.get();
	}
	
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn)
	{
		super.appendHoverText(stack, worldIn, tooltip, flagIn);
		
		if(enablePerks)
		{
			tooltip.add((new TranslatableComponent("item.gobber2.gobber2_armor_end.line1").withStyle(ChatFormatting.LIGHT_PURPLE)));
			tooltip.add((new TranslatableComponent("item.gobber2.gobber2_armor_end.line2").withStyle(ChatFormatting.LIGHT_PURPLE)));
			tooltip.add((new TranslatableComponent("item.gobber2.gobber2_armor_end.line3").withStyle(ChatFormatting.LIGHT_PURPLE)));
			tooltip.add((new TranslatableComponent("item.gobber2.gobber2_armor_end.line4").withStyle(ChatFormatting.LIGHT_PURPLE)));
			tooltip.add((new TranslatableComponent("item.gobber2.gobber2_armor_end.line5").withStyle(ChatFormatting.GOLD)));	
		}
	}
}