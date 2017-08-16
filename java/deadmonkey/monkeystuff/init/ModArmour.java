package deadmonkey.monkeystuff.init;

import deadmonkey.monkeystuff.MonkeyStuff;
import deadmonkey.monkeystuff.Reference;
import deadmonkey.monkeystuff.init.armour.CustomArmor;
import deadmonkey.monkeystuff.items.Monkeyite;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModArmour 
{
	public static final ArmorMaterial monkeyite_armour = EnumHelper.addArmorMaterial("monkeyite_armour", Reference.MODID + ":monkeyite", 5000, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	
    public static Item monkeyite_helmet, monkeyite_chestplate, monkeyite_leggings, monkeyite_boots;
	
    public static void init()
	{
	    monkeyite_helmet = new CustomArmor("monkeyite_helmet", monkeyite_armour, 1, EntityEquipmentSlot.HEAD);
	    monkeyite_chestplate = new CustomArmor("monkeyite_chestplate", monkeyite_armour, 1, EntityEquipmentSlot.CHEST);
	    monkeyite_leggings = new CustomArmor("monkeyite_leggings", monkeyite_armour, 2, EntityEquipmentSlot.LEGS);
	    monkeyite_boots = new CustomArmor("monkeyite_boots", monkeyite_armour, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register() 
	{
		registerItem(monkeyite_helmet);
		registerItem(monkeyite_chestplate);
		registerItem(monkeyite_leggings);
		registerItem(monkeyite_boots);
	}
	
	
	public static void registerItem(Item item) 
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(MonkeyStuff.monkeystufftab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}	

