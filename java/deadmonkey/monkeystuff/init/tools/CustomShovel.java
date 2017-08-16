package deadmonkey.monkeystuff.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class CustomShovel extends ItemSpade {

	public CustomShovel(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
	}

}
