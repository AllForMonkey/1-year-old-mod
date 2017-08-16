package deadmonkey.monkeystuff.handlers;

import deadmonkey.monkeystuff.gen.MonkeyStuffOreGen;
import deadmonkey.monkeystuff.init.ModArmour;
import deadmonkey.monkeystuff.init.ModBlocks;
import deadmonkey.monkeystuff.init.ModItems;
import deadmonkey.monkeystuff.init.ModTools;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegistryHandler {
	
	public static void Client() 
	{
		RecipeHandler.registerCrefting();
		RecipeHandler.registerSmelting();
	}
	
	public static void Common() 
	{
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModTools.init();
		ModTools.register();
		
		ModArmour.init();
		ModArmour.register();
		
		GameRegistry.registerWorldGenerator(new MonkeyStuffOreGen(), 0);
	}
	
}
