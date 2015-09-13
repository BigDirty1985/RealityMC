package com.teamname.realitymc.item;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

public class BlackCurrantPlant extends BlockCrops {

	Random r = new Random();
	
	@Override
	protected Item func_149866_i() {
		
		return RealMItem.blackCurrantSeed;
		
	}

	@Override
	protected Item func_149865_P() {
		return RealMItem.blackCurrant;
	}
	
	
	/**
	 * The type of render function that is called for this block
	 */
	@Override
	public int getRenderType() {
		return 6;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random p_149745_1_) {
		return r.nextInt(3)+1;
	}
}
