package com.teamname.realitymc.item;

import com.teamname.realitymc.creativetabs.MCreativeTabs;
import com.teamname.realitymc.lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

public class RealMItem {
	public static void mainRegistry() {
		initializeItem();
		registerItem();
	}

	public static Item blackCurrant;
	public static Item blackCurrantSeed;
	

	public static void initializeItem() {

		// items
		blackCurrant = new Item().setUnlocalizedName("blackCurrant")
				.setCreativeTab(MCreativeTabs.tabsItem)
				.setTextureName(RefStrings.MODID + ":blackCurrant");
		blackCurrantSeed = new ItemSeeds(RealMBlock.blackCurrantPlant, Blocks.farmland)
				.setUnlocalizedName("blackCurrantSeed")
				.setCreativeTab(MCreativeTabs.tabsItem)
				.setTextureName(RefStrings.MODID + ":blackCurrant_seed");
	
		

	}

	public static void registerItem() {
		GameRegistry.registerItem(blackCurrant, blackCurrant.getUnlocalizedName());
		GameRegistry.registerItem(blackCurrantSeed, blackCurrantSeed.getUnlocalizedName());
		
	}

}
