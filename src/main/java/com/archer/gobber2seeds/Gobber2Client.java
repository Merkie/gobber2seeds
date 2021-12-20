package com.archer.gobber2seeds;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = Gobber2.modid, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Gobber2Client
{ 	  
    @SubscribeEvent
    public static void setModelProperties(FMLClientSetupEvent event)
    {
        ;
    }
}
