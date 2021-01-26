package com.lulubin.newmob.init;

import java.util.ArrayList;
import java.util.List;

import com.lulubin.newmob.object.blocks.BlockBase;
import com.lulubin.newmob.object.blocks.BlockTransparent;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInit 
{
		public static List<Block> BLOCKS = new ArrayList<Block>();
		
		public static final Block SCP_BLOQUEUR_COMPRESSE = new BlockTransparent("scp_bloqueur_compresse", Material.GLASS);
		
	
}
