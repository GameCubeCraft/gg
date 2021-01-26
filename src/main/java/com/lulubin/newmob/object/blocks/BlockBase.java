package com.lulubin.newmob.object.blocks;

import com.lulubin.newmob.Main;
import com.lulubin.newmob.init.BlockInit;
import com.lulubin.newmob.init.ItemInit;
import com.lulubin.newmob.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel 
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		setHardness(8.0F);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
		
		
		
	}
	
	public boolean isOpaqueCube()
	{
	    return false;
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
		
	}

}
