package com.kwpugh.gobber2.blocks.tileentities;

//import java.util.List;
//
//import com.kwpugh.gobber2.config.GobberConfigBuilder;
//import com.kwpugh.gobber2.init.BlockEntityInit;
//import com.kwpugh.gobber2.util.PlayerSpecialAbilities;
//
//import net.minecraft.world.entity.Entity;
//import net.minecraft.world.entity.MobCategory;
//import net.minecraft.world.entity.LivingEntity;
//import net.minecraft.world.entity.Mob;
//import net.minecraft.world.entity.boss.wither.WitherBoss;
//import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
//import net.minecraft.world.entity.decoration.ArmorStand;
//import net.minecraft.world.entity.npc.Villager;
//import net.minecraft.world.entity.npc.WanderingTrader;
//import net.minecraft.entity.monster.BlazeEntity;
//import net.minecraft.world.entity.monster.ElderGuardian;
//import net.minecraft.world.entity.monster.Ghast;
//import net.minecraft.world.entity.monster.Guardian;
//import net.minecraft.world.entity.monster.SpellcasterIllager;
//import net.minecraft.world.entity.monster.Vex;
//import net.minecraft.world.entity.monster.Vindicator;
//import net.minecraft.world.entity.animal.Animal;
//import net.minecraft.world.entity.animal.Dolphin;
//import net.minecraft.world.entity.animal.IronGolem;
//import net.minecraft.world.entity.animal.WaterAnimal;
//import net.minecraft.world.entity.player.Player;
//import net.minecraft.world.level.block.entity.TickableBlockEntity;
//import net.minecraft.world.level.block.entity.BlockEntity;
//import net.minecraft.world.phys.AABB;
//
//
//public class BlockProtectorTile extends BlockEntity implements TickableBlockEntity
//{
//	int radius = GobberConfigBuilder.PROTECTOR_RADIUS.get();
//	boolean killFish = GobberConfigBuilder.DEFENDER_KILL_FISH.get();
//
//    public BlockProtectorTile()
//	{
//		super(BlockEntityInit.BLOCK_PROTECTOR.get());
//	}
//
//	@Override
//    public void tick()
//    {
//		if(level != null && !level.isClientSide)
//		{
//			List<Entity> entities = level.getEntitiesOfClass(LivingEntity.class, new AABB(worldPosition.getX() - radius, worldPosition.getY() - radius, worldPosition.getZ() - radius, worldPosition.getX() + radius, worldPosition.getY() + radius, worldPosition.getZ() + radius), e -> (e instanceof LivingEntity));
//			for(Entity entity : entities)
//			{
//				if(entity instanceof Player)
//				{
//					Player player = (Player)entity;
//
//					int newfoodlevel = 1;
//					float newsatlevel = 0.035F;
//					PlayerSpecialAbilities.giveRegenEffect(level, player, null, newfoodlevel, newsatlevel);
//				}
//
//				MobCategory isCreature = entity.getEntity().getClassification(true);
//
//				// These types of mobs are excluded
//				if(isCreature == MobCategory.CREATURE ||
//					entity instanceof Player ||
//					entity instanceof ArmorStand ||
//					entity instanceof Villager ||
//					entity instanceof WanderingTrader ||
//					entity instanceof Animal ||
//					entity instanceof IronGolem ||
//					entity instanceof Dolphin ||
//					(killFish == false && entity instanceof WaterAnimal) ||
//					entity instanceof Guardian ||
//					entity instanceof ElderGuardian ||
//					entity instanceof SpellcasterIllager ||
//					entity instanceof Vex ||
//					entity instanceof Vindicator ||
//					entity instanceof Ghast ||
//					entity instanceof WitherBoss ||
//					entity instanceof EnderDragon)
//				{
//					continue;
//				}
//
//				if(entity instanceof WaterAnimal && killFish == true)
//				{
//					((Mob) entity).spawnAnim();
//					entity.remove(true);
//				}
//
//				if(entity instanceof Mob)
//				{
//					((Mob) entity).spawnAnim();
//					entity.remove(true);
//				}
//			}
//		}
//    }
//}