package com.kwpugh.gobber2.init;

import com.kwpugh.gobber2.Gobber2;
import com.kwpugh.gobber2.items.armor.DragonElytra;
import com.kwpugh.gobber2.items.armor.ItemCustomArmorDragon;
import com.kwpugh.gobber2.items.armor.ItemCustomArmorEnd;
import com.kwpugh.gobber2.items.armor.ItemCustomArmorGobber;
import com.kwpugh.gobber2.items.armor.ItemCustomArmorNether;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionBreathing;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionConduit;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionDolphin;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionExp;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionGlowing;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionHero;
import com.kwpugh.gobber2.items.medallions.ItemCustomMedallionStepping;
import com.kwpugh.gobber2.items.rings.ItemCustomRingAbove;
import com.kwpugh.gobber2.items.rings.ItemCustomRingAcceleration;
import com.kwpugh.gobber2.items.rings.ItemCustomRingAirwalking;
import com.kwpugh.gobber2.items.rings.ItemCustomRingAscent;
import com.kwpugh.gobber2.items.rings.ItemCustomRingAttraction;
import com.kwpugh.gobber2.items.rings.ItemCustomRingBlaze;
import com.kwpugh.gobber2.items.rings.ItemCustomRingBlink;
import com.kwpugh.gobber2.items.rings.ItemCustomRingCuring;
import com.kwpugh.gobber2.items.rings.ItemCustomRingDismissal;
import com.kwpugh.gobber2.items.rings.ItemCustomRingEnderchest;
import com.kwpugh.gobber2.items.rings.ItemCustomRingExplorer;
import com.kwpugh.gobber2.items.rings.ItemCustomRingFarmer;
import com.kwpugh.gobber2.items.rings.ItemCustomRingHaste;
import com.kwpugh.gobber2.items.rings.ItemCustomRingHusbandry;
import com.kwpugh.gobber2.items.rings.ItemCustomRingLeaping;
import com.kwpugh.gobber2.items.rings.ItemCustomRingMiner;
import com.kwpugh.gobber2.items.rings.ItemCustomRingPhoenix;
import com.kwpugh.gobber2.items.rings.ItemCustomRingPyro;
import com.kwpugh.gobber2.items.rings.ItemCustomRingRepair;
import com.kwpugh.gobber2.items.rings.ItemCustomRingReturn;
import com.kwpugh.gobber2.items.rings.ItemCustomRingStealth;
import com.kwpugh.gobber2.items.rings.ItemCustomRingSunshine;
import com.kwpugh.gobber2.items.rings.ItemCustomRingSwiftness;
import com.kwpugh.gobber2.items.rings.ItemCustomRingTeleport;
import com.kwpugh.gobber2.items.rings.ItemCustomRingTraveler;
import com.kwpugh.gobber2.items.rings.ItemCustomRingVision;
import com.kwpugh.gobber2.items.rings.ItemCustomRingVoid;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffClearing;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffEnsnarement;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffFarmer;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffHarvest;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffNature;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffSniper;
import com.kwpugh.gobber2.items.staffs.ItemCustomStaffStars;
import com.kwpugh.gobber2.items.toolbaseclasses.TreeAxeBase;
import com.kwpugh.gobber2.items.tools.axe.ItemCustomAxe;
import com.kwpugh.gobber2.items.tools.axe.ItemCustomAxeEnd;
import com.kwpugh.gobber2.items.tools.axe.ItemCustomAxeNether;
import com.kwpugh.gobber2.items.tools.axe.ItemCustomTreeAxeEnd;
import com.kwpugh.gobber2.items.tools.bow.ItemCustomBow;
import com.kwpugh.gobber2.items.tools.bow.ItemCustomBowEnd;
import com.kwpugh.gobber2.items.tools.bow.ItemCustomBowNether;
import com.kwpugh.gobber2.items.tools.excavator.ItemCustomExcavator;
import com.kwpugh.gobber2.items.tools.excavator.ItemCustomExcavatorEnd;
import com.kwpugh.gobber2.items.tools.excavator.ItemCustomExcavatorNether;
import com.kwpugh.gobber2.items.tools.hammer.ItemCustomHammer;
import com.kwpugh.gobber2.items.tools.hammer.ItemCustomHammerEnd;
import com.kwpugh.gobber2.items.tools.hammer.ItemCustomHammerNether;
import com.kwpugh.gobber2.items.tools.hoe.ItemCustomHoeEnd;
import com.kwpugh.gobber2.items.tools.paxel.ItemCustomPaxel;
import com.kwpugh.gobber2.items.tools.paxel.ItemCustomPaxelEnd;
import com.kwpugh.gobber2.items.tools.paxel.ItemCustomPaxelNether;
import com.kwpugh.gobber2.items.tools.paxel.ItemCustomPaxelStars;
import com.kwpugh.gobber2.items.tools.pickaxe.ItemCustomPickaxe;
import com.kwpugh.gobber2.items.tools.pickaxe.ItemCustomPickaxeEnd;
import com.kwpugh.gobber2.items.tools.pickaxe.ItemCustomPickaxeNether;
import com.kwpugh.gobber2.items.tools.shovel.ItemCustomShovel;
import com.kwpugh.gobber2.items.tools.shovel.ItemCustomShovelEnd;
import com.kwpugh.gobber2.items.tools.shovel.ItemCustomShovelNether;
import com.kwpugh.gobber2.items.tools.sword.ItemCustomSword;
import com.kwpugh.gobber2.items.tools.sword.ItemCustomSwordEnd;
import com.kwpugh.gobber2.items.tools.sword.ItemCustomSwordNether;
import com.kwpugh.gobber2.items.tools.sword.ItemCustomSwordSniper;
import com.kwpugh.gobber2.items.tools.sword.ItemCustomSwordTraveler;
import com.kwpugh.gobber2.lists.*;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit
{
	public static final Tier GOBBER_TOOL_MATERIAL = new GobberToolMaterial();
	public static final ArmorMaterial GOBBER_ARMOR_MATERIAL = new GobberArmorMaterial();

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gobber2.modid);

	public static final RegistryObject<Item> GOBBER2_ORE = ITEMS.register("gobber2_ore", () -> new BlockItem(BlockInit.GOBBER2_ORE.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_ORE_NETHER = ITEMS.register("gobber2_ore_nether", () -> new BlockItem(BlockInit.GOBBER2_ORE_NETHER.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_ORE_END = ITEMS.register("gobber2_ore_end", () -> new BlockItem(BlockInit.GOBBER2_ORE_END.get(), new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_LUCKY_BLOCK = ITEMS.register("gobber2_lucky_block", () -> new BlockItem(BlockInit.GOBBER2_LUCKY_BLOCK.get(), new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_BLOCK = ITEMS.register("gobber2_block", () -> new BlockItem(BlockInit.GOBBER2_BLOCK.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BLOCK_NETHER = ITEMS.register("gobber2_block_nether", () -> new BlockItem(BlockInit.GOBBER2_BLOCK_NETHER.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BLOCK_END = ITEMS.register("gobber2_block_end", () -> new BlockItem(BlockInit.GOBBER2_BLOCK_END.get(), new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_GLASS = ITEMS.register("gobber2_glass", () -> new BlockItem(BlockInit.GOBBER2_GLASS.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_GLASS_NETHER = ITEMS.register("gobber2_glass_nether", () -> new BlockItem(BlockInit.GOBBER2_GLASS_NETHER.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_GLASS_END = ITEMS.register("gobber2_glass_end", () -> new BlockItem(BlockInit.GOBBER2_GLASS_END.get(), new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> CLEAR_GLASS = ITEMS.register("clear_glass", () -> new BlockItem(BlockInit.CLEAR_GLASS.get(), new Item.Properties().tab(Gobber2.gobber2)));
	
	public static final RegistryObject<Item> GOBBER2_GLOBETTE = ITEMS.register("gobber2_globette", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_GLOBETTE_NETHER = ITEMS.register("gobber2_globette_nether", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_GLOBETTE_END = ITEMS.register("gobber2_globette_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_GLOB = ITEMS.register("gobber2_glob", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_GLOB_NETHER = ITEMS.register("gobber2_glob_nether", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_GLOB_END = ITEMS.register("gobber2_glob_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_INGOT = ITEMS.register("gobber2_ingot", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_INGOT_NETHER = ITEMS.register("gobber2_ingot_nether", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_INGOT_END = ITEMS.register("gobber2_ingot_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_ROD = ITEMS.register("gobber2_rod", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_ROD_NETHER = ITEMS.register("gobber2_rod_nether", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_ROD_END = ITEMS.register("gobber2_rod_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));

//	public static final RegistryObject<Item> GOBBER2_FOO = ITEMS.register("gobber2_foo", () -> new ItemCustomFuel(new Item.Properties().tab(Gobber2.gobber2), 64000));
//	public static final RegistryObject<Item> GOBBER2_FOO_NETHER = ITEMS.register("gobber2_foo_nether", () -> new ItemCustomFuel(new Item.Properties().tab(Gobber2.gobber2), 96000));
//	public static final RegistryObject<Item> GOBBER2_FOO_END = ITEMS.register("gobber2_foo_end", () -> new ItemCustomFuel(new Item.Properties().tab(Gobber2.gobber2), 128000));

	public static final RegistryObject<Item> GOBBER2_SWORD = ITEMS.register("gobber2_sword", () -> new ItemCustomSword(GOBBER_TOOL_MATERIAL, 9, -2.0f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOW = ITEMS.register("gobber2_bow", () -> new ItemCustomBow((new Item.Properties()).stacksTo(1).tab(Gobber2.gobber2).durability(3800)));
	public static final RegistryObject<Item> GOBBER2_PICKAXE = ITEMS.register("gobber2_pickaxe", () -> new ItemCustomPickaxe(GOBBER_TOOL_MATERIAL, 4, -2.4f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_SHOVEL = ITEMS.register("gobber2_shovel", () -> new ItemCustomShovel(GOBBER_TOOL_MATERIAL, 5.0f, -3.0f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_AXE = ITEMS.register("gobber2_axe", () -> new ItemCustomAxe(GOBBER_TOOL_MATERIAL, 8.0f, -2.9f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_TREE_AXE = ITEMS.register("gobber2_tree_axe", () -> new TreeAxeBase(GOBBER_TOOL_MATERIAL, 8.0f, -2.9f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_HOE = ITEMS.register("gobber2_hoe", () -> new HoeItem(GOBBER_TOOL_MATERIAL, 0, 2.1f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_HAMMER = ITEMS.register("gobber2_hammer", () -> new ItemCustomHammer(GOBBER_TOOL_MATERIAL, 7, -2.9f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_EXCAVATOR = ITEMS.register("gobber2_excavator", () -> new ItemCustomExcavator(GOBBER_TOOL_MATERIAL, 5.0f, -3.0f, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_PAXEL = ITEMS.register("gobber2_paxel", () -> new ItemCustomPaxel(8, -2.9f, GOBBER_TOOL_MATERIAL, null, new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_HELMET = ITEMS.register("gobber2_helmet", () -> new ItemCustomArmorGobber(GOBBER_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_CHESTPLATE = ITEMS.register("gobber2_chestplate", () -> new ItemCustomArmorGobber(GOBBER_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_LEGGINGS = ITEMS.register("gobber2_leggings", () -> new ItemCustomArmorGobber(GOBBER_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOOTS = ITEMS.register("gobber2_boots", () -> new ItemCustomArmorGobber(GOBBER_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_SWORD_NETHER = ITEMS.register("gobber2_sword_nether", () -> new ItemCustomSwordNether(ToolMaterialList.GOBBER2_NETHER, 11, -1.8f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOW_NETHER = ITEMS.register("gobber2_bow_nether", () -> new ItemCustomBowNether((new Item.Properties()).fireResistant().stacksTo(1).tab(Gobber2.gobber2).durability(5200)));
	public static final RegistryObject<Item> GOBBER2_PICKAXE_NETHER = ITEMS.register("gobber2_pickaxe_nether", () -> new ItemCustomPickaxeNether(ToolMaterialList.GOBBER2_NETHER, 5, -2.3f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_SHOVEL_NETHER = ITEMS.register("gobber2_shovel_nether", () -> new ItemCustomShovelNether(ToolMaterialList.GOBBER2_NETHER, 6.0f, -2.8f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_AXE_NETHER = ITEMS.register("gobber2_axe_nether", () -> new ItemCustomAxeNether(ToolMaterialList.GOBBER2_NETHER, 10.0f, -2.8f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_TREE_AXE_NETHER = ITEMS.register("gobber2_tree_axe_nether", () -> new TreeAxeBase(ToolMaterialList.GOBBER2_NETHER, 10.0f, -2.8f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_HOE_NETHER = ITEMS.register("gobber2_hoe_nether", () -> new HoeItem(ToolMaterialList.GOBBER2_NETHER, 0, 2.2f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_HAMMER_NETHER = ITEMS.register("gobber2_hammer_nether", () -> new ItemCustomHammerNether(ToolMaterialList.GOBBER2_NETHER, 8, -2.8f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_EXCAVATOR_NETHER = ITEMS.register("gobber2_excavator_nether", () -> new ItemCustomExcavatorNether(ToolMaterialList.GOBBER2_NETHER, 6.0f, -2.8f, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_PAXEL_NETHER = ITEMS.register("gobber2_paxel_nether", () -> new ItemCustomPaxelNether(10, -2.8f, ToolMaterialList.GOBBER2_NETHER, null, new Item.Properties().fireResistant().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_HELMET_NETHER = ITEMS.register("gobber2_helmet_nether", () -> new ItemCustomArmorNether(ArmorMaterialList.GOBBER2_NETHER, EquipmentSlot.HEAD, new Item.Properties().fireResistant().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_CHESTPLATE_NETHER = ITEMS.register("gobber2_chestplate_nether", () -> new ItemCustomArmorNether(ArmorMaterialList.GOBBER2_NETHER, EquipmentSlot.CHEST, new Item.Properties().fireResistant().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_LEGGINGS_NETHER = ITEMS.register("gobber2_leggings_nether", () -> new ItemCustomArmorNether(ArmorMaterialList.GOBBER2_NETHER, EquipmentSlot.LEGS, new Item.Properties().fireResistant().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOOTS_NETHER = ITEMS.register("gobber2_boots_nether", () -> new ItemCustomArmorNether(ArmorMaterialList.GOBBER2_NETHER, EquipmentSlot.FEET, new Item.Properties().fireResistant().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_SWORD_END = ITEMS.register("gobber2_sword_end", () -> new ItemCustomSwordEnd(ToolMaterialList.GOBBER2_END, 14, -1.6f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_SWORD_SNIPER = ITEMS.register("gobber2_sword_sniper", () -> new ItemCustomSwordSniper(ToolMaterialList.GOBBER2_END, 14, -1.6f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_SWORD_TRAVELER = ITEMS.register("gobber2_sword_traveler", () -> new ItemCustomSwordTraveler(ToolMaterialList.GOBBER2_END, 14, -1.6f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOW_END = ITEMS.register("gobber2_bow_end", () -> new ItemCustomBowEnd((new Item.Properties()).stacksTo(1).durability(8000).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_PICKAXE_END = ITEMS.register("gobber2_pickaxe_end", () -> new ItemCustomPickaxeEnd(ToolMaterialList.GOBBER2_END, 6, -2.2f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_SHOVEL_END = ITEMS.register("gobber2_shovel_end", () -> new ItemCustomShovelEnd(ToolMaterialList.GOBBER2_END, 8.0f, -2.6f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_AXE_END = ITEMS.register("gobber2_axe_end", () -> new ItemCustomAxeEnd(ToolMaterialList.GOBBER2_END, 14.0f, -2.7f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_TREE_AXE_END = ITEMS.register("gobber2_tree_axe_end", () -> new ItemCustomTreeAxeEnd(ToolMaterialList.GOBBER2_END, 14.0f, -2.7f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_HOE_END = ITEMS.register("gobber2_hoe_end", () -> new ItemCustomHoeEnd(ToolMaterialList.GOBBER2_END, 0, 2.2f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_HAMMER_END = ITEMS.register("gobber2_hammer_end", () -> new ItemCustomHammerEnd(ToolMaterialList.GOBBER2_END, 10, -2.7f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_EXCAVATOR_END = ITEMS.register("gobber2_excavator_end", () -> new ItemCustomExcavatorEnd(ToolMaterialList.GOBBER2_END, 8.0f, -2.6f, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_PAXEL_END = ITEMS.register("gobber2_paxel_end", () -> new ItemCustomPaxelEnd(13, -2.7f, ToolMaterialList.GOBBER2_END, null, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_PAXEL_STARS = ITEMS.register("gobber2_paxel_stars", () -> new ItemCustomPaxelStars(13, -2.7f, ToolMaterialList.GOBBER2_END, null, new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_LINKS_END = ITEMS.register("gobber2_links_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_HELMET_END = ITEMS.register("gobber2_helmet_end", () -> new ItemCustomArmorEnd(ArmorMaterialList.GOBBER2_END, EquipmentSlot.HEAD, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_CHESTPLATE_END = ITEMS.register("gobber2_chestplate_end", () -> new ItemCustomArmorEnd(ArmorMaterialList.GOBBER2_END, EquipmentSlot.CHEST, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_LEGGINGS_END = ITEMS.register("gobber2_leggings_end", () -> new ItemCustomArmorEnd(ArmorMaterialList.GOBBER2_END, EquipmentSlot.LEGS, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOOTS_END = ITEMS.register("gobber2_boots_end", () -> new ItemCustomArmorEnd(ArmorMaterialList.GOBBER2_END, EquipmentSlot.FEET, new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> DRAGON_STAR = ITEMS.register("dragon_star", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> DRAGON_ELYTRA = ITEMS.register("dragon_elytra", () -> new DragonElytra(new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_HELMET_DRAGON = ITEMS.register("gobber2_helmet_dragon", () -> new ItemCustomArmorDragon(ArmorMaterialList.GOBBER2_DRAGON, EquipmentSlot.HEAD, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_CHESTPLATE_DRAGON = ITEMS.register("gobber2_chestplate_dragon", () -> new ItemCustomArmorDragon(ArmorMaterialList.GOBBER2_DRAGON, EquipmentSlot.CHEST, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_LEGGINGS_DRAGON = ITEMS.register("gobber2_leggings_dragon", () -> new ItemCustomArmorDragon(ArmorMaterialList.GOBBER2_DRAGON, EquipmentSlot.LEGS, new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_BOOTS_DRAGON = ITEMS.register("gobber2_boots_dragon", () -> new ItemCustomArmorDragon(ArmorMaterialList.GOBBER2_DRAGON, EquipmentSlot.FEET, new Item.Properties().tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_RING = ITEMS.register("gobber2_ring", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_ATTRACTION = ITEMS.register("gobber2_ring_attraction", () -> new ItemCustomRingAttraction(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_RETURN = ITEMS.register("gobber2_ring_return", () -> new ItemCustomRingReturn(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_ASCENT = ITEMS.register("gobber2_ring_ascent", () -> new ItemCustomRingAscent(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_ABOVE = ITEMS.register("gobber2_ring_above", () -> new ItemCustomRingAbove(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_MINER = ITEMS.register("gobber2_ring_miner", () -> new ItemCustomRingMiner(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_FARMER = ITEMS.register("gobber2_ring_farmer", () -> new ItemCustomRingFarmer(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_HUSBANDRY = ITEMS.register("gobber2_ring_husbandry", () -> new ItemCustomRingHusbandry(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_SWIFTNESS = ITEMS.register("gobber2_ring_swiftness", () -> new ItemCustomRingSwiftness(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_SUNSHINE = ITEMS.register("gobber2_ring_sunshine", () -> new ItemCustomRingSunshine(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_RING_NETHER = ITEMS.register("gobber2_ring_nether", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_ACCELERATION = ITEMS.register("gobber2_ring_acceleration", () -> new ItemCustomRingAcceleration(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_LEAPING = ITEMS.register("gobber2_ring_leaping", () -> new ItemCustomRingLeaping(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_CURING = ITEMS.register("gobber2_ring_curing", () -> new ItemCustomRingCuring(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_VISION = ITEMS.register("gobber2_ring_vision", () -> new ItemCustomRingVision(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_PHOENIX = ITEMS.register("gobber2_ring_phoenix", () -> new ItemCustomRingPhoenix(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_HASTE = ITEMS.register("gobber2_ring_haste", () -> new ItemCustomRingHaste(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_BLAZE = ITEMS.register("gobber2_ring_blaze", () -> new ItemCustomRingBlaze(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_REPAIR = ITEMS.register("gobber2_ring_repair", () -> new ItemCustomRingRepair(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_RING_END = ITEMS.register("gobber2_ring_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_DISMISSAL = ITEMS.register("gobber2_ring_dismissal", () -> new ItemCustomRingDismissal(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_PYRO = ITEMS.register("gobber2_ring_pyro", () -> new ItemCustomRingPyro(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_ENDERCHEST = ITEMS.register("gobber2_ring_enderchest", () -> new ItemCustomRingEnderchest(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_TRAVELER = ITEMS.register("gobber2_ring_traveler", () -> new ItemCustomRingTraveler(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_VOID = ITEMS.register("gobber2_ring_void", () -> new ItemCustomRingVoid(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_AIRWALKING = ITEMS.register("gobber2_ring_airwalking", () -> new ItemCustomRingAirwalking(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_STEALTH = ITEMS.register("gobber2_ring_stealth", () -> new ItemCustomRingStealth(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_TELEPORT = ITEMS.register("gobber2_ring_teleport", () -> new ItemCustomRingTeleport(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_BLINK = ITEMS.register("gobber2_ring_blink", () -> new ItemCustomRingBlink(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_RING_EXPLORER = ITEMS.register("gobber2_ring_explorer", () -> new ItemCustomRingExplorer(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_MEDALLION = ITEMS.register("gobber2_medallion", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_STEPPING = ITEMS.register("gobber2_medallion_stepping", () -> new ItemCustomMedallionStepping(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_BREATHING = ITEMS.register("gobber2_medallion_breathing", () -> new ItemCustomMedallionBreathing(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_HERO = ITEMS.register("gobber2_medallion_hero", () -> new ItemCustomMedallionHero(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_NETHER = ITEMS.register("gobber2_medallion_nether", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_GLOWING = ITEMS.register("gobber2_medallion_glowing", () -> new ItemCustomMedallionGlowing(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_EXP = ITEMS.register("gobber2_medallion_exp", () -> new ItemCustomMedallionExp());
	public static final RegistryObject<Item> GOBBER2_MEDALLION_END = ITEMS.register("gobber2_medallion_end", () -> new Item(new Item.Properties().tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_CONDUIT = ITEMS.register("gobber2_medallion_conduit", () -> new ItemCustomMedallionConduit(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_MEDALLION_DOLPHIN = ITEMS.register("gobber2_medallion_dolphin", () -> new ItemCustomMedallionDolphin(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOBBER2_STAFF_CLEARING = ITEMS.register("gobber2_staff_clearing", () -> new ItemCustomStaffClearing(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_STAFF_NATURE = ITEMS.register("gobber2_staff_nature", () -> new ItemCustomStaffNature(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_STAFF_FARMER = ITEMS.register("gobber2_staff_farmer", () -> new ItemCustomStaffFarmer(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_STAFF_HARVEST = ITEMS.register("gobber2_staff_harvest", () -> new ItemCustomStaffHarvest(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_STAFF_STARS = ITEMS.register("gobber2_staff_stars", () -> new ItemCustomStaffStars(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_STAFF_ENSNAREMENT = ITEMS.register("gobber2_staff_ensnarement", () -> new ItemCustomStaffEnsnarement(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOBBER2_STAFF_SNIPER = ITEMS.register("gobber2_staff_sniper", () -> new ItemCustomStaffSniper(new Item.Properties().stacksTo(1).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOO = ITEMS.register("gobber2_goo", () -> new Item(new Item.Properties().food(FoodList.gooFood).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_APPLE = ITEMS.register("gobber2_gooey_apple", () -> new Item(new Item.Properties().food(FoodList.gooeyApple).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_BREAD = ITEMS.register("gobber2_gooey_bread", () -> new Item(new Item.Properties().food(FoodList.gooeyBread).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_BEEF = ITEMS.register("gobber2_gooey_beef", () -> new Item(new Item.Properties().food(FoodList.gooeyBeef).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_BEEFSTEW = ITEMS.register("gobber2_gooey_beefstew", () -> new Item(new Item.Properties().food(FoodList.gooeyBeefstew).tab(Gobber2.gobber2)));

	public static final RegistryObject<Item> GOO_NETHER = ITEMS.register("gobber2_goo_nether", () -> new Item(new Item.Properties().food(FoodList.gooFoodNether).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_APPLE_NETHER = ITEMS.register("gobber2_gooey_apple_nether", () -> new Item(new Item.Properties().food(FoodList.gooeyAppleNether).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_BREAD_NETHER = ITEMS.register("gobber2_gooey_bread_nether", () -> new Item(new Item.Properties().food(FoodList.gooeyBreadNether).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_BEEF_NETHER = ITEMS.register("gobber2_gooey_beef_nether", () -> new Item(new Item.Properties().food(FoodList.gooeyBeefNether).tab(Gobber2.gobber2)));
	public static final RegistryObject<Item> GOOEY_BEEFSTEW_NETHER = ITEMS.register("gobber2_gooey_beefstew_nether", () -> new Item(new Item.Properties().food(FoodList.gooeyBeefstewNether).tab(Gobber2.gobber2)));

//	public static final RegistryObject<Item> BLOCK_HEALER = ITEMS.register("block_healer", () -> new BlockItem(BlockInit.BLOCK_HEALER.get(), new Item.Properties().tab(Gobber2.gobber2)));
//	public static final RegistryObject<Item> BLOCK_PROTECTOR = ITEMS.register("block_protector", () -> new BlockItem(BlockInit.BLOCK_PROTECTOR.get(), new Item.Properties().tab(Gobber2.gobber2)));
//	public static final RegistryObject<Item> BLOCK_DEFENDER = ITEMS.register("block_defender", () -> new BlockItem(BlockInit.BLOCK_DEFENDER.get(), new Item.Properties().tab(Gobber2.gobber2)));
//	public static final RegistryObject<Item> BLOCK_MATURATOR = ITEMS.register("block_maturator", () -> new BlockItem(BlockInit.BLOCK_MATURATOR.get(), new Item.Properties().tab(Gobber2.gobber2)));
//	public static final RegistryObject<Item> BLOCK_LOOTER = ITEMS.register("block_looter", () -> new BlockItem(BlockInit.BLOCK_LOOTER.get(), new Item.Properties().tab(Gobber2.gobber2)));
}
