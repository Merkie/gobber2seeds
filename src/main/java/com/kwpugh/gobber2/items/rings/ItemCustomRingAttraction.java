package com.kwpugh.gobber2.items.rings;

import java.util.List;

import javax.annotation.Nullable;

import com.kwpugh.gobber2.config.GobberConfigBuilder;
import com.kwpugh.gobber2.util.EnableUtil;
import com.kwpugh.gobber2.util.MagnetRangeUtil;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemCustomRingAttraction extends Item
{
	public ItemCustomRingAttraction(Properties properties)
	{
		super(properties);
	}
	
	int ringAttractionBlocking = GobberConfigBuilder.RING_ATTRACTION_BLOCK_DISTANCE.get();
	boolean ringAttractionMode = GobberConfigBuilder.RING_ATTRACTION_MODE.get();
	
	static int range;
	
	public void inventoryTick(ItemStack stack, World world, Entity entity, int itemSlot, boolean isSelected)
	{
		if(entity instanceof PlayerEntity && !world.isRemote && EnableUtil.isEnabled(stack))
		{
			PlayerEntity player = (PlayerEntity)entity;
			
			boolean init = MagnetRangeUtil.getCurrentlySet(stack);
			
			// Set default range or read range from NBT if it exists
			if(!init)
			{
				range = 8;
			}
			else
			{
				range = MagnetRangeUtil.getCurrentRange(stack);
			}			

			double x = player.getPosX();
			double y = player.getPosY();
			double z = player.getPosZ();

			// Check for a particular block that stops the attraction
			BlockPos playerPos = new BlockPos(player.getPositionVec());
			for (BlockPos targetPos : BlockPos.getAllInBoxMutable(playerPos.add(-range, -ringAttractionBlocking, -range), playerPos.add(range, ringAttractionBlocking, range)))
			{
				BlockState blockstate = world.getBlockState(targetPos);
				
				if ((blockstate.getBlock() == Blocks.COAL_BLOCK))
				{
					return;
				}				
			}
			
			//Scan for and collect items
			List<ItemEntity> items = entity.world.getEntitiesWithinAABB(ItemEntity.class, new AxisAlignedBB(x - range, y - range, z - range, x + range, y + range, z + range));
			for(ItemEntity e: items)
			{
				if(!player.isSneaking() && !e.getPersistentData().getBoolean("PreventRemoteMovement"))
				{
					if(ringAttractionMode)
					{
						e.onCollideWithPlayer(player);
					}
					else
					{
						double factor = 0.035;
						e.addVelocity((x - e.getPosX()) * factor, (y - e.getPosY()+1.25) * factor, (z - e.getPosZ()) * factor);	
					}
				}
			}

			//Scan for and collect XP Orbs
			List<ExperienceOrbEntity> xp = entity.world.getEntitiesWithinAABB(ExperienceOrbEntity.class, new AxisAlignedBB(x - range, y - range, z - range, x + range, y + range, z + range));
			for(ExperienceOrbEntity orb: xp)
			{
				if(!player.isSneaking())
				{ 
					if(ringAttractionMode)
					{
						orb.onCollideWithPlayer(player);
					}
					else
					{
						double factor = 0.035;
						orb.addVelocity((x - orb.getPosX()) * factor, (y - orb.getPosY()+1.25) * factor, (z - orb.getPosZ()) * factor);	
					}
				}
			}
		}
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand)
    {
		ItemStack stack = player.getHeldItem(hand);	
		
		if((!world.isRemote) && (!player.isSneaking()))
        {
            EnableUtil.changeEnabled(player, hand);
            player.sendStatusMessage(new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line2", EnableUtil.isEnabled(stack)).mergeStyle(TextFormatting.GREEN), true);
            return new ActionResult<ItemStack>(ActionResultType.SUCCESS, player.getHeldItem(hand));
        }		
		
        if((!world.isRemote) && (player.isSneaking()))
        {       	
        	switch(range)
			{
				case 8:
					range = 10;
					MagnetRangeUtil.setCurrentRange(stack, range);
					player.sendStatusMessage((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line5", MagnetRangeUtil.getCurrentRange(stack)).mergeStyle(TextFormatting.GREEN)), true);
					break;
				case 10:
					range = 12;
					MagnetRangeUtil.setCurrentRange(stack, range);
					player.sendStatusMessage((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line5", MagnetRangeUtil.getCurrentRange(stack)).mergeStyle(TextFormatting.GREEN)), true);
					break;
				case 12:
					range = 14;
					MagnetRangeUtil.setCurrentRange(stack, range);
					player.sendStatusMessage((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line5", MagnetRangeUtil.getCurrentRange(stack)).mergeStyle(TextFormatting.GREEN)), true);
					break;
				case 14:
					range = 4;
					MagnetRangeUtil.setCurrentRange(stack, range);
					player.sendStatusMessage((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line5", MagnetRangeUtil.getCurrentRange(stack)).mergeStyle(TextFormatting.GREEN)), true);
					break;			
				case 4:
					range = 8;
					MagnetRangeUtil.setCurrentRange(stack, range);
					player.sendStatusMessage((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line5", MagnetRangeUtil.getCurrentRange(stack)).mergeStyle(TextFormatting.GREEN)), true);
					break;		
				default:
					break;
			}
        }
        
        return super.onItemRightClick(world, player, hand);
    }
	
	@Override
	public boolean hasEffect(ItemStack stack)
	{
		return EnableUtil.isEnabled(stack);
	}
	  
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
	{	
		super.addInformation(stack, worldIn, tooltip, flagIn);
		
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line1").mergeStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line2", EnableUtil.isEnabled(stack)).mergeStyle(TextFormatting.GREEN)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line3").mergeStyle(TextFormatting.YELLOW)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line4").mergeStyle(TextFormatting.RED)));
		tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line6").mergeStyle(TextFormatting.BLUE)));
		
		if(EnableUtil.isEnabled(stack))  // Will still show range 0 on first use until range is changed
		{
			tooltip.add((new TranslationTextComponent("item.gobber2.gobber2_ring_attraction.line5",MagnetRangeUtil.getCurrentRange(stack)).mergeStyle(TextFormatting.LIGHT_PURPLE)));	
		}	
	}     
}
