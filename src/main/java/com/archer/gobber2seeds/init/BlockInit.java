package com.archer.gobber2seeds.init;

import com.archer.gobber2seeds.Gobber2;
import com.archer.gobber2seeds.blocks.BlockGobberPlant;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Gobber2.modid);
	
	public static final RegistryObject<Block> GOBBER2_PLANT = BLOCKS.register("gobber2_plant", () -> new BlockGobberPlant("gobber2_plant", Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
	public static final RegistryObject<Block> GOBBER2_PLANT_NETHER = BLOCKS.register("gobber2_plant_nether", () -> new BlockGobberPlant("gobber2_plant_nether", Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));
	public static final RegistryObject<Block> GOBBER2_PLANT_END = BLOCKS.register("gobber2_plant_end", () -> new BlockGobberPlant("gobber2_plant_end", Block.Properties.of(Material.PLANT).noCollission().randomTicks().instabreak().sound(SoundType.CROP)));

	/*
	public static final RegistryObject<Block> GOBBER2_ORE = BLOCKS.register("gobber2_ore", () -> new BlockOreGobber(Block.Properties.create(Material.ROCK, MaterialColor.IRON).hardnessAndResistance(5.0F, 5.0F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GOBBER2_ORE_NETHER = BLOCKS.register("gobber2_ore_nether", () -> new BlockOreNether(Block.Properties.create(Material.ROCK, MaterialColor.IRON).hardnessAndResistance(5.0F, 5.0F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(4).sound(SoundType.STONE)));
	public static final RegistryObject<Block> GOBBER2_ORE_END = BLOCKS.register("gobber2_ore_end", () -> new BlockOreEnd(Block.Properties.create(Material.ROCK, MaterialColor.IRON).hardnessAndResistance(5.0F, 5.0F).setRequiresTool().harvestTool(ToolType.PICKAXE).harvestLevel(5).sound(SoundType.STONE)));

	public static final RegistryObject<Block> GOBBER2_BLOCK = BLOCKS.register("gobber2_block", () -> new BlockGobberBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> GOBBER2_BLOCK_NETHER = BLOCKS.register("gobber2_block_nether", () -> new BlockNetherBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> GOBBER2_BLOCK_END = BLOCKS.register("gobber2_block_end", () -> new BlockEndBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));

	public static final RegistryObject<Block> GOBBER2_LUCKY_BLOCK = BLOCKS.register("gobber2_lucky_block", () -> new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.STONE)));

	public static final RegistryObject<Block> GOBBER2_GLASS = BLOCKS.register("gobber2_glass", () -> new BlockGobberGlass(Block.Properties.create(Material.GLASS, MaterialColor.STONE).hardnessAndResistance(2.0F, 2.0F).notSolid().setLightLevel((state) -> { return 15; }).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> GOBBER2_GLASS_NETHER = BLOCKS.register("gobber2_glass_nether", () -> new BlockGobberGlassNether(Block.Properties.create(Material.GLASS, MaterialColor.STONE).hardnessAndResistance(2.0F, 2.0F).notSolid().setLightLevel((state) -> { return 15; }).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> GOBBER2_GLASS_END = BLOCKS.register("gobber2_glass_end", () -> new BlockGobberGlassEnd(Block.Properties.create(Material.GLASS, MaterialColor.STONE).hardnessAndResistance(2.0F, 2.0F).notSolid().setLightLevel((state) -> { return 15; }).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> CLEAR_GLASS = BLOCKS.register("clear_glass", () -> new BlockClearGlass(Block.Properties.create(Material.GLASS, MaterialColor.STONE).hardnessAndResistance(2.0F, 2.0F).notSolid().setLightLevel((state) -> { return 15; }).sound(SoundType.GLASS)));
	public static final RegistryObject<Block> BLOCK_HEALER = BLOCKS.register("block_healer", () -> new BlockHealer(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_PROTECTOR = BLOCKS.register("block_protector", () -> new BlockProtector(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_DEFENDER = BLOCKS.register("block_defender", () -> new BlockDefender(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_LOOTER = BLOCKS.register("block_looter", () -> new BlockLooter(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));
	public static final RegistryObject<Block> BLOCK_MATURATOR = BLOCKS.register("block_maturator", () -> new BlockMaturator(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(3.0F, 3.0F).sound(SoundType.METAL)));	
	*/
}

