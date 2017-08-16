package deadmonkey.monkeystuff.init;

import deadmonkey.monkeystuff.MonkeyStuff;
import deadmonkey.monkeystuff.Reference;
import deadmonkey.monkeystuff.items.Monkeyite;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems
{
	public static Item monkeyite;
	
    public static void init()
	{
	    monkeyite = new Monkeyite("monkeyite");
	}
	
	public static void register() 
	{
		registerItem(monkeyite);
	}
	
	
	public static void registerItem(Item item) 
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(MonkeyStuff.monkeystufftab);	
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}	
