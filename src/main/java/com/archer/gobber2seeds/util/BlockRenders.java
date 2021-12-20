package com.archer.gobber2seeds.util;

import com.archer.gobber2seeds.init.BlockInit;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;

public class BlockRenders
{
	public static void defineRenders()
	{
		RenderType cutoutMipped = RenderType.cutoutMipped();
		RenderType translucent = RenderType.translucent();

		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOBBER2_PLANT.get(), cutoutMipped);
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOBBER2_PLANT_NETHER.get(), cutoutMipped);
		ItemBlockRenderTypes.setRenderLayer(BlockInit.GOBBER2_PLANT_END.get(), cutoutMipped);
	}	
}