package deadmonkey.monkeystuff.init;

import deadmonkey.monkeystuff.MonkeyStuff;
import deadmonkey.monkeystuff.Reference;
import deadmonkey.monkeystuff.blocks.ModStairs;
import deadmonkey.monkeystuff.blocks.MonkeyiteBlock;
import deadmonkey.monkeystuff.blocks.MonkeyiteOre;
import deadmonkey.monkeystuff.blocks.activators.ModBlockButton;
import deadmonkey.monkeystuff.blocks.activators.ModBlockPressurePlate;
import deadmonkey.monkeystuff.blocks.fence.ModBlockFence;
import deadmonkey.monkeystuff.blocks.fence.ModBlockFenceGate;
import deadmonkey.monkeystuff.blocks.slab.ModBlockDoubleSlab;
import deadmonkey.monkeystuff.blocks.slab.ModBlockHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ModBlocks 
{
	public static Block monkeyite_ore;
	public static Block monkeyite_block;
	public static Block monkeyite_stairs;
	public static ModBlockHalfSlab monkeyite_slab_half; 
	public static ModBlockDoubleSlab monkeyite_slab_double;
	public static ModBlockFence monkeyite_fence;
	public static ModBlockFenceGate monkeyite_fence_gate;
	public static ModBlockButton monkeyite_button;
	public static ModBlockPressurePlate monkeyite_pressure_plate;
	

	public static void init() 
	{
		monkeyite_ore = new MonkeyiteOre("monkeyite_ore", 2.0F, 4.0F, 3);
		monkeyite_block = new MonkeyiteBlock("monkeyite_block", Material.IRON, 2.0F, 4.0F);
	    monkeyite_stairs = new ModStairs("monkeyite_stairs", monkeyite_block.getDefaultState());
	    monkeyite_slab_half = new ModBlockHalfSlab("monkeyite_slab_half", 2.5F, 4.5F);
	    monkeyite_slab_double = new ModBlockDoubleSlab("monkeyite_slab_double", 2.5F, 4.5F);
	    monkeyite_fence = new ModBlockFence("monkeyite_fence", 2.5F, 4.5F);
	    monkeyite_fence_gate = new ModBlockFenceGate ("monkeyite_fence_gate", 2.5F, 4.5F);
	    monkeyite_button = new ModBlockButton ("monkeyite_button", 2.5F, 4.5F);
	    monkeyite_pressure_plate = new ModBlockPressurePlate ("monkeyite_pressure_plate", 2.5F, 4.5F);
	}
	
	public static void register() {
		registerBlock(monkeyite_ore);
		registerBlock(monkeyite_block);
		registerBlock(monkeyite_stairs);
		registerBlock(monkeyite_slab_half, new ItemSlab(monkeyite_slab_half, monkeyite_slab_half, monkeyite_slab_double));
		ForgeRegistries.BLOCKS.register(monkeyite_slab_double);
		registerBlock(monkeyite_fence);
		registerBlock(monkeyite_fence_gate);
		registerBlock(monkeyite_button);
		registerBlock(monkeyite_pressure_plate);
	}
	
    public static void registerBlock(Block block) 
    {
    	ForgeRegistries.BLOCKS.register(block);
    	block.setCreativeTab(MonkeyStuff.monkeystufftab);
    	ItemBlock item = new ItemBlock(block);
    	item.setRegistryName(block.getRegistryName());
    	ForgeRegistries.ITEMS.register(item);
    	
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
    
    public static void registerBlock(Block block, ItemBlock itemblock) 
    {
    	ForgeRegistries.BLOCKS.register(block);
    	block.setCreativeTab(MonkeyStuff.monkeystufftab);
    	itemblock.setRegistryName(block.getRegistryName());
    	ForgeRegistries.ITEMS.register(itemblock);
    	
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
