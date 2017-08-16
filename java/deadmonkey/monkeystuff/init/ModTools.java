package deadmonkey.monkeystuff.init;

import deadmonkey.monkeystuff.MonkeyStuff;
import deadmonkey.monkeystuff.Reference;
import deadmonkey.monkeystuff.init.tools.CustomAxe;
import deadmonkey.monkeystuff.init.tools.CustomPickaxe;
import deadmonkey.monkeystuff.init.tools.CustomShovel;
import deadmonkey.monkeystuff.init.tools.CustomSword;
import deadmonkey.monkeystuff.items.Monkeyite;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModTools 
{
	public static final ToolMaterial monkeyite = EnumHelper.addToolMaterial("monkeyite", 4, 2016, 10.0F, 4.0F, 10);
	
    public static Item monkeyite_pickaxe, monkeyite_axe, monkeyite_shovel, monkeyite_sword;
	
    public static void init()
	{
	    monkeyite_pickaxe = new CustomPickaxe("monkeyite_pickaxe", monkeyite);
	    monkeyite_axe = new CustomAxe("monkeyite_axe", monkeyite);
	    monkeyite_shovel = new CustomShovel("monkeyite_shovel", monkeyite);
	    monkeyite_sword = new CustomSword("monkeyite_sword", monkeyite);
	}
	
	public static void register() 
	{
		registerItem(monkeyite_pickaxe);
		registerItem(monkeyite_axe);
		registerItem(monkeyite_shovel);
		registerItem(monkeyite_sword);
	}
	
	
	public static void registerItem(Item item) 
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(MonkeyStuff.monkeystufftab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}	

