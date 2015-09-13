package com.teamname.realitymc.main;

public class CraftingManager {

	public static void mainRegistry() {
		addCraftingRec();
		addSmeltingRec();
	}

	public static void addCraftingRec() {
		
		//ShapedRecipe
		//GameRegistry.addRecipe(new ItemStack(MItem.yadayada,1),new Object[]{"X X","X X",'X', MItem.blah});
	
		//Shapeless
		//GameRegistry.addShapelessRecipe(new ItemStack(MItem.cottonSeed,1),new Object[]{MItem.cotton});
		//GameRegistry.addShapelessRecipe(new ItemStack(Items.string,1),new Object[]{MItem.cotton,MItem.cotton});
		//GameRegistry.addShapelessRecipe(new ItemStack(MItem.cottonCloth,1),new Object[]{MItem.cotton,MItem.cotton,MItem.cotton,MItem.cotton,MItem.cotton,MItem.cotton,MItem.cotton,MItem.cotton,MItem.cotton});
	}

	public static void addSmeltingRec() {
	}

}
