package com.lulubin.newmob;

import org.apache.logging.log4j.core.Logger;

import com.lulubin.newmob.proxy.CommonProxy;
import com.lulubin.newmob.util.Reference;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.SidedProxy;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	public static org.apache.logging.log4j.Logger logger;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e)
	{
		logger = e.getModLog();
		
		proxy.preInit();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e)
	{
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e)
	{
		
	}
}
