package com.kwpugh.gobber2.util;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class PlayerSpecialAbilities
{	
	//Set player health to max on tick update
	public static void giveFullHealth(World world, PlayerEntity player, ItemStack itemstack)
	{
    	player.setHealth(20);
	}

	//Set player health beyond normal max health
	public static void giveNewMaxHealth(World world, PlayerEntity player, ItemStack itemstack, double newMax)
	{		
		//player.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(newMax);
		float healthAsFloat = (float) newMax;
		player.setHealth(healthAsFloat);
	}
	
	//Increases the player's food level to max on tick update, based on inputs
	public static void giveRegenEffect(World world, PlayerEntity player, ItemStack itemstack, int newfoodlevel, float newsatlevel)
	{
		if (player.ticksExisted % 180 == 0)
		{
			player.getFoodStats().addStats(newfoodlevel, newsatlevel);
		}
	}
		
	//Set player saturation level to max 
	public static void giveSaturationEffect(World world, PlayerEntity player, ItemStack itemstack)
	{
		player.getFoodStats().setFoodSaturationLevel(7.0F);
	}
	
	//gives extra yellow hears and a variable rate
	public static void giveYellowHearts(World world, LivingEntity player, ItemStack itemstack, int extraHearts, float absorptionRate)
	{
		float current = player.getAbsorptionAmount();
		
		if(player.getHealth() < 20 || current >= extraHearts)
		{
			return;
		}
		
		if(current >= (extraHearts - 1))
		{
			if (player.ticksExisted % 180 == 0)
			{
				player.setAbsorptionAmount(extraHearts);
			} 
			return;
		}
		if(current < (extraHearts - 1))
		{
			if (player.ticksExisted % 180 == 0)
			{
				player.setAbsorptionAmount(current + absorptionRate);
			}
		}
	}	

	//Set player yellow hearts to none on tick update
	public static void giveNoExtraHearts(World world, PlayerEntity player, ItemStack itemstack)
	{
		player.setAbsorptionAmount(0);
	}
	
	//Set player oxygen to max on tick update
	public static void giveBreathing(World world, PlayerEntity player, ItemStack itemstack)
	{
		player.setAir(300);
	}
	
	//Gives player Dolphin's Grace
	public static void giveDolphinEffect(World world, PlayerEntity player, ItemStack itemstack)
	{
		if (player.ticksExisted % 180 == 0 && player.isInWater())
		{
			player.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 600, 0, false, false));
		} 
	}
	
	//Gives player Conduit Effect
	public static void giveConduitEffect(World world, PlayerEntity player, ItemStack itemstack)
	{
		if (player.ticksExisted % 180 == 0 && player.isInWater())
		{
			player.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 600, 2, false, false));
		} 
	}
}
