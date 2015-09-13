package com.teamname.realitymc.main;

import com.teamname.realitymc.creativetabs.MCreativeTabs;
import com.teamname.realitymc.item.RealMBlock;
import com.teamname.realitymc.item.RealMItem;
import com.teamname.realitymc.lib.RefStrings;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = RefStrings.MODID, name = RefStrings.NAME, version = RefStrings.VERSION)
public class MainRegistry {

	@SidedProxy(clientSide = RefStrings.CLIENTSIDE, serverSide = RefStrings.SERVERSIDE)
	public static ServerProxy proxy;

	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent) {

		MCreativeTabs.InitializeTabs();
		RealMBlock.mainRegistry();
		RealMItem.mainRegistry();
		CraftingManager.mainRegistry();

		proxy.registerRenderInfo();
	}

	@EventHandler
	public static void Load(FMLInitializationEvent Event) {

		// makes grass drop seed
		MinecraftForge.addGrassSeed(new ItemStack(RealMItem.blackCurrantSeed), 3);
	}

	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent) {
	}
}
