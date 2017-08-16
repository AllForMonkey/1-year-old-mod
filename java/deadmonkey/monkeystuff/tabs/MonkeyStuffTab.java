package deadmonkey.monkeystuff.tabs;

import deadmonkey.monkeystuff.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MonkeyStuffTab extends CreativeTabs {
	
	public MonkeyStuffTab(String label) { super("monkeystufftab");
	this.setBackgroundImageName("monkeystuff.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.monkeyite);
	}
}
