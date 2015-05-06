package net.cybernetics;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.cybernetics.block.CybBlocks;
import net.cybernetics.generic.CommonProxy;
import net.cybernetics.item.CybItems;
import net.cybernetics.ref.ModRef;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModRef.MODID, name = ModRef.MODNAME, version = ModRef.VERSION, dependencies = "")
public class Cybernetics
{

    public static final Logger LOGGER = LogManager.getLogger("Cybernetics");

    @SidedProxy(clientSide = "sekwah.mods.narutomod.client.ClientProxy", serverSide = "sekwah.mods.narutomod.generic.CommonProxy")
    public static CommonProxy proxy;

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
