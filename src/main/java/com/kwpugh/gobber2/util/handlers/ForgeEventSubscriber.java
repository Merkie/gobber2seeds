package com.kwpugh.gobber2.util.handlers;

import com.kwpugh.gobber2.Gobber2;
import com.kwpugh.gobber2.config.GobberConfigBuilder;
import com.kwpugh.gobber2.util.PlayerEquipsUtil;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.event.entity.living.LivingSetAttackTargetEvent;
import net.minecraftforge.event.entity.living.LootingLevelEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Gobber2.modid, bus = EventBusSubscriber.Bus.FORGE )
public final class ForgeEventSubscriber
{
	//Config values
	static int extraXPOrbs = GobberConfigBuilder.MEDALLION_EXP_ORBS.get();
	static int extraLoot = GobberConfigBuilder.MEDALLION_EXP_LOOT.get();
	static boolean enableVoidProtection = GobberConfigBuilder.ENABLE_DRAGON_ARMOR_VOID_PROTECTION.get();
	
	//Cancels various damages to the player
    @SubscribeEvent(receiveCanceled = true, priority= EventPriority.HIGHEST)
    public static void onLivingHurtEvent(LivingAttackEvent event)
    {
        if (event.getEntityLiving() instanceof PlayerEntity)
        {
            PlayerEntity player = (PlayerEntity) event.getEntityLiving();
            
            //Void protection
            if(enableVoidProtection)
            {
            	if ((event.getSource() == DamageSource.OUT_OF_WORLD) &&
            			PlayerEquipsUtil.isPlayerGotVoidProtection(player))
            	{
            		if (event.isCancelable()) event.setCanceled(true);
            	} 
            }
            
            //No Fall Damage
            if ((event.getSource() == DamageSource.FALL) &&
                PlayerEquipsUtil.isPlayerGotFallProtection(player))
            {
                if (event.isCancelable()) event.setCanceled(true);
            } 
            
            //Fire & lava damage
            if (((event.getSource() == DamageSource.IN_FIRE) ||
            		(event.getSource() == DamageSource.ON_FIRE) || 
            		(event.getSource() == DamageSource.LAVA)) && 
            		PlayerEquipsUtil.isPlayerGotFireProtection(player))
            {
                if (event.isCancelable()) event.setCanceled(true);
            } 
            
            //Drowning
            if ((event.getSource() == DamageSource.DROWN) &&
                    PlayerEquipsUtil.isPlayerGotWaterBreathing(player))
            {
            	if (event.isCancelable()) event.setCanceled(true);
            }
        } 
    }
    
    //Allows player to not be seen by hostile mobs
    @SubscribeEvent
    public static void onLivingSetAttackTarget(LivingSetAttackTargetEvent event)
    {
    	if (event.getTarget() instanceof PlayerEntity && event.getEntityLiving()instanceof MobEntity)
        {	
    		PlayerEntity player = (PlayerEntity) event.getTarget();
    		MobEntity attacker = (MobEntity) event.getEntityLiving();
    		
    		//hostile mobs won't target player
    		if (PlayerEquipsUtil.isPlayerGotStealth(player))
    		{
    			attacker.setAttackTarget(null);
    		}
        }
    }    

    //Gives extra loot drops when killing a mob
    @SubscribeEvent
    public static void onKillingLootEvent(LootingLevelEvent event)
    {    	
    	if(event.getDamageSource() !=null && event.getDamageSource().getTrueSource() !=null)
    	{	
			if(event.getEntity() instanceof MobEntity && event.getDamageSource().getTrueSource() instanceof PlayerEntity)
			{
				PlayerEntity player = (PlayerEntity) event.getDamageSource().getTrueSource();
				
				//Give extra XP when killing a mob
				if (PlayerEquipsUtil.isPlayerGotExpToken(player))
				{
					event.setLootingLevel(extraLoot);
				}
			}
    	} 	
    }
    
    //Gives greater XP when killing mobs that normally drop XP on death
    @SubscribeEvent
    public static void onKillingExpDropEvent(LivingExperienceDropEvent event)
    {
    	if (event.getAttackingPlayer() instanceof PlayerEntity && event.getEntityLiving()instanceof MobEntity)
    	{
    		PlayerEntity player = (PlayerEntity) event.getAttackingPlayer();
    		
     		if (PlayerEquipsUtil.isPlayerGotExpToken(player))
    		{
    			int orgExp = event.getOriginalExperience();
    			int newExp = orgExp * extraXPOrbs;
    			event.setDroppedExperience(newExp);
    		} 
    	}
    }
    
    //Gives greater XP when mining ores that normally drop XP
    @SubscribeEvent
    public static void onMiningExpDropEvent(BreakEvent event)
    {
    	Block block = event.getState().getBlock();
    	
    	if(block == Blocks.REDSTONE_ORE ||
    			block == Blocks.COAL_ORE ||
    			block == Blocks.LAPIS_ORE ||
    			block == Blocks.DIAMOND_ORE ||
    			block == Blocks.EMERALD_ORE ||
    			block == Blocks.NETHER_QUARTZ_ORE)
    	{
       		if(event.getPlayer() instanceof PlayerEntity)
    		{
    			PlayerEntity player = (PlayerEntity) event.getPlayer();

    			if (PlayerEquipsUtil.isPlayerGotExpToken(player))
    			{ 
    				if(!(EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, player.getHeldItemMainhand()) != 0))
    				{
    					event.setExpToDrop(extraXPOrbs);
    				}
    				
    			}
    		}
    	}
    	
    }
} 