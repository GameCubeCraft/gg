package com.lulubin.newmob.util.handlers;

import com.lulubin.newmob.object.entity.EntityZomianor;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenderer()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityZomianor.class, new IRenderFactory<EntityZomianor>()
		
		{

			@Override
			public Render<? super EntityZomianor> createRenderFor(RenderManager manager) {
				// TODO Auto-generated method stub
				return null;
			}
			
		});
	}
}
