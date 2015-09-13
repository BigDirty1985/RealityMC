package com.teamname.realitymc.item;

import com.teamname.realitymc.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;



public class RealMBlock {
	public static void mainRegistry() {
		initializeBlock();
		registerBlock();
	}

	
	public static Block blackCurrantPlant;
	
	public static void initializeBlock() {
		
		blackCurrantPlant = new BlackCurrantPlant().setBlockName("blackCurrantPlant").setCreativeTab(CreativeTabs.tabBlock).setBlockTextureName(RefStrings.MODID + ":blackCurrant");
	}

	public static void registerBlock() {
		GameRegistry.registerBlock(blackCurrantPlant, blackCurrantPlant.getUnlocalizedName());
	}

}
