package com.kwpugh.gobber2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kwpugh.gobber2.config.GobberConfig;
import com.kwpugh.gobber2.init.BlockInit;
import com.kwpugh.gobber2.init.ItemInit;
import com.kwpugh.gobber2.util.BlockRenders;
import com.kwpugh.gobber2.util.Gobber2_Group;
import com.kwpugh.gobber2.util.PlayerSpecialAbilities;
import com.kwpugh.gobber2.util.handlers.DragonKillHandler;
import com.kwpugh.gobber2.world.OreGenerator;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(Gobber2.modid)
public class Gobber2 
{	
	public static Gobber2 instance;		
	public static final String modid = "gobber2";
	public static final Logger logger = LogManager.getLogger(modid);	
	public static final CreativeModeTab gobber2 = new Gobber2_Group();
    
	public Gobber2() 
	{
		instance = this;		
		GobberConfig.loadConfig(GobberConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("gobber-general.toml"));
		BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    	ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		
    	FMLJavaModLoadingContext.get().getModEventBus().addListener(this::modSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);		
		MinecraftForge.EVENT_BUS.register(this);
	}
    
	private void modSetup(final FMLCommonSetupEvent event)
	{	
		OreGenerator.registerConfiguredFeatures();
		MinecraftForge.EVENT_BUS.register(new PlayerSpecialAbilities());
		MinecraftForge.EVENT_BUS.register(new DragonKillHandler());

		logger.info("Gobber common setup");
	}
	
	private void clientSetup(final FMLClientSetupEvent event)
	{
		BlockRenders.defineRenders();

		logger.info("Gobber client setup");
	}

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        logger.info("Gobber IMC setup");
    }
    
	private void serverSetup(final FMLDedicatedServerSetupEvent event)
	{
		logger.info("Gobber server setup");
	}
}




