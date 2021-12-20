package com.archer.gobber2seeds.init;

import com.archer.gobber2seeds.Gobber2;
import com.archer.gobber2seeds.items.seeds.ItemCustomSeed;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Gobber2.modid);

	public static final RegistryObject<Item> GOBBER2_SEED = ITEMS.register("gobber2_seed", () -> new ItemCustomSeed(BlockInit.GOBBER2_PLANT.get(), (new Item.Properties().tab(Gobber2.gobber2))));
	public static final RegistryObject<Item> GOBBER2_SEED_NETHER = ITEMS.register("gobber2_seed_nether", () -> new ItemCustomSeed(BlockInit.GOBBER2_PLANT_NETHER.get(), (new Item.Properties().tab(Gobber2.gobber2))));
	public static final RegistryObject<Item> GOBBER2_SEED_END = ITEMS.register("gobber2_seed_end", () -> new ItemCustomSeed(BlockInit.GOBBER2_PLANT_END.get(), (new Item.Properties().tab(Gobber2.gobber2))));
}

