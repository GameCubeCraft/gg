package com.lulubin.newmob.object.items;

import com.lulubin.newmob.Main;
import com.lulubin.newmob.init.ItemInit;
import com.lulubin.newmob.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0);
	}
}
