package com.kwpugh.gobber2.items.rings;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.kwpugh.gobber2.config.GobberConfigBuilder;

import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemCustomRingExplorer extends Item
{
	public ItemCustomRingExplorer(Properties properties)
	{
		super(properties);
	}
	
	int ringExplorerCooldown = GobberConfigBuilder.RING_EXPLORER_COOLDOWN.get();
	
    int min = GobberConfigBuilder.RING_EXPLORER_MIN_RANGE.get();
    int max = GobberConfigBuilder.RING_EXPLORER_MAX_RANGE.get();
    
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
	{
		ItemStack stack = player.getHeldItem(hand);
		player.getCooldownTracker().setCooldown(this, ringExplorerCooldown);
		
		if (!world.getDimensionKey().equals(World.OVERWORLD))
		{
			player.sendStatusMessage(new TranslationTextComponent("item.gobber2.gobber2_ring_above.line5"), true);
			return ActionResult.resultSuccess(stack);	
		}
		
		if (!world.isRemote)
		{
			//ServerPlayerEntity serverPlayer = (ServerPlayerEntity)player;
			ServerWorld serverWorld = (ServerWorld)world;		
			BlockPos worldSpawn = serverWorld.getSpawnPoint();
		
			Random rand = new Random();
	
	        int x = (int) Math.round(worldSpawn.getX()) + rand.nextInt(max + min) - min;
	        //int y = world.getMaxHeight();
	        int y = 255;
	        int z = (int) Math.round(worldSpawn.getZ()) + rand.nextInt(max + min) - min;
	
	        Chunk chunk = world.getChunk(x >> 4, z >> 4);
	        Biome biome = world.getBiome(new BlockPos(x, y, z));
	
	        if ( (biome.getCategory().getName().equals("ocean")) || 
	        	(biome.getCategory().getName().equals("river")) || 
	        	(biome.getCategory().getName().equals("beach"))  )
	        {	
	        	if(world.isRemote)  //test for server
	        	{
	        		player.getCooldownTracker().removeCooldown(this);
	        	}
	        	
	        	return onItemRightClick(world, player, hand);
	        }
	
	        while (y > 0) {
	            y--;
	            BlockPos groundPos = new BlockPos(x, y-2, z);
	            if (!chunk.getBlockState(groundPos).getMaterial().equals(Material.AIR) && 
	            		(!chunk.getBlockState(groundPos).getBlock().equals(Blocks.BEDROCK) &&
	            		(!chunk.getBlockState(groundPos).getBlock().equals(Blocks.WATER) &&
	            				y-2 != 1))    )
	            {
	                BlockPos legPos = new BlockPos(x, y-1, z);
	                if (chunk.getBlockState(legPos).getMaterial().equals(Material.AIR))
	                {
	                    BlockPos headPos = new BlockPos(x, y, z);
	                    if (chunk.getBlockState(headPos).getMaterial().equals(Material.AIR))
	                    {
	                    	player.stopRiding();
	    	           		((ServerPlayerEntity)player).connection.setPlayerLocation(x, y, z, player.rotationYaw, player.rotationPitch);
	    	           		
	    	           		world.playSound(null, player.getPosX(), player.getPosY(), player.getPosZ(), SoundEvents.ENTITY_ENDERMAN_TELEPORT, SoundCategory.PLAYERS, 1.0F, 1.0F);
	    	           		
	    	           		return ActionResult.resultSuccess(stack);
	                    }
	                }
	            }
	        }		        
	        player.sendStatusMessage(new TranslationTextComponent("Sorry, no spot found, try again after cooldown"), true);
	        return ActionResult.resultSuccess(stack);		 
        }

        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, stack);
	}
	
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{
		super.addInformation(stack, worldIn, tooltip, flagIn);
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_explorer.line1").mergeStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_explorer.line2",min, max).mergeStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_explorer.line3").mergeStyle(TextFormatting.YELLOW)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring.cooldown",ringExplorerCooldown).mergeStyle(TextFormatting.LIGHT_PURPLE)));
	}  
}
