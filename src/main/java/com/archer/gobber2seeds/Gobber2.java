package com.archer.gobber2seeds;
import com.archer.gobber2seeds.init.BlockInit;
import com.archer.gobber2seeds.init.ItemInit;
import com.archer.gobber2seeds.util.BlockRenders;
import com.archer.gobber2seeds.util.Gobber2_Group;
import net.minecraft.world.item.CreativeModeTab;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLDedicatedServerSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Gobber2.modid)
public class Gobber2 
{	
	public static Gobber2 instance;		
	public static final String modid = "gobber2seeds";
	public static final Logger logger = LogManager.getLogger(modid);	
	public static final CreativeModeTab gobber2 = new Gobber2_Group();
    
	public Gobber2() 
	{
		instance = this;
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
		logger.info("Gobber seeds common setup");
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
		logger.info("Gobber seeds server setup");
	}
}




