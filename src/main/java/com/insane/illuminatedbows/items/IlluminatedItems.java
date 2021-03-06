package com.insane.illuminatedbows.items;

import com.insane.illuminatedbows.EntityIlluminatedArrow;
import com.insane.illuminatedbows.IlluminatedBows;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class IlluminatedItems {
	public static Item illuminatedBow;
	public static Item illuminatedArrow;
	public static Item illuminatedStick;
	public static Item inertBow;
	public static Item inertArrow;
	
	public static void preInit()
	{
		illuminatedBow = new ItemIlluminatedBow();
		GameRegistry.registerItem(illuminatedBow, "illuminatedBow");

		EntityRegistry.registerModEntity(EntityIlluminatedArrow.class, "Illuminated Bow", 0, IlluminatedBows.instance, 64, 10, true);

		illuminatedArrow = new ItemIlluminatedArrow();
		GameRegistry.registerItem(illuminatedArrow, "illuminatedArrow");
		
		illuminatedStick = new ItemIlluminatedStick();
		GameRegistry.registerItem(illuminatedStick, "illuminatedStick");

		inertBow = new ItemInertBow();
		GameRegistry.registerItem(inertBow, "inertBow");

		inertArrow = new ItemInertArrow();
		GameRegistry.registerItem(inertArrow, "inertArrow");
	}

}
