package deadmonkey.monkeystuff.items;

import deadmonkey.monkeystuff.MonkeyStuff;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Monkeyite extends Item {
	
	public Monkeyite(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MonkeyStuff.monkeystufftab);
	}

}
