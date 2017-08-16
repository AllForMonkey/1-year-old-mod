package deadmonkey.monkeystuff.handlers;

import deadmonkey.monkeystuff.init.ModArmour;
import deadmonkey.monkeystuff.init.ModBlocks;
import deadmonkey.monkeystuff.init.ModItems;
import deadmonkey.monkeystuff.init.ModTools;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
    public static void registerCrefting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("ms:monkeyite_ore"), new ResourceLocation("ms:monkeyite_blocks"), new ItemStack(ModBlocks.monkeyite_ore), new Object[]{"SSS", "SMS", "SSS", 'M', ModItems.monkeyite, 'S', Blocks.STONE});
		GameRegistry.addShapedRecipe(new ResourceLocation("ms:monkeyite_block"), new ResourceLocation("ms:monkeyite_blocks"), new ItemStack(ModBlocks.monkeyite_block), new Object[]{"MMM", "MMM", "MMM", 'M', ModItems.monkeyite});
		registerArmourCrafting(ModArmour.monkeyite_helmet, ModArmour.monkeyite_chestplate, ModArmour.monkeyite_leggings, ModArmour.monkeyite_boots, ModItems.monkeyite);
		registerToolCrafting(ModTools.monkeyite_axe, ModTools.monkeyite_pickaxe, ModTools.monkeyite_shovel, ModTools.monkeyite_sword, ModItems.monkeyite);
		GameRegistry.addShapelessRecipe(new ResourceLocation("ms:monkeyite"), new ResourceLocation("ms:monkeyite_items"), new ItemStack(ModItems.monkeyite, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(ModBlocks.monkeyite_block))});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(ModBlocks.monkeyite_ore, new ItemStack(ModItems.monkeyite), 10);
	}
	
	private static void registerToolCrafting(Item axe, Item pickaxe, Item shovel, Item sword, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("ms:monkeyite_tools"), new ItemStack(axe), new Object[]{"MM ", "MS ", " S ", 'S', Items.STICK, 'M', ModItems.monkeyite});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("ms:monkeyite_tools"), new ItemStack(pickaxe), new Object[]{"MMM", " S ", " S ", 'S', Items.STICK, 'M', ModItems.monkeyite});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("ms:monkeyite_tools"), new ItemStack(shovel), new Object[]{" M ", " S ", " S ", 'S', Items.STICK, 'M', ModItems.monkeyite});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("ms:monkeyite_tools"), new ItemStack(sword), new Object[]{" M ", " M ", " S ", 'S', Items.STICK, 'M', ModItems.monkeyite});
	}
	
	private static void registerArmourCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("ms:monkeyite_armour"), new ItemStack(helmet), new Object[]{"MMM", "M M", "   ", 'M', ModItems.monkeyite});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("ms:monkeyite_armour"), new ItemStack(chestplate), new Object[]{"M M", "MMM", "MMM", 'M', ModItems.monkeyite});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("ms:monkeyite_armour"), new ItemStack(leggings), new Object[]{"MMM", "M M", "M M", 'M', ModItems.monkeyite});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("ms:monkeyite_armour"), new ItemStack(boots), new Object[]{"   ", "M M", "M M", 'M', ModItems.monkeyite});
	}
}
