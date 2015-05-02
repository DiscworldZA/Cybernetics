package net.cybernetics;

import net.cybernetics.block.CybBlocks;
import net.cybernetics.item.CybItems;
import net.cybernetics.ref.ModRef;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ModRef.MODID, name = ModRef.MODNAME, version = ModRef.VERSION, dependencies = "")
public class Cybernetics
{	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//Init Blocks
		CybBlocks.Init();
		
		//Init Items
		CybItems.Init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		
	}
}
