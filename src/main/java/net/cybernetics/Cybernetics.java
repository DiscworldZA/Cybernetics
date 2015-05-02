package net.cybernetics;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Cybernetics.MODID, name = Cybernetics.MODNAME, version = Cybernetics.VERSION, dependencies = "")
public class Cybernetics
{
	public static final String MODID = "Cyb";
	public static final String MODNAME = "Cybernetics";
	public static final String VERSION = "v0.0.01 Alpha";
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
	}
}
