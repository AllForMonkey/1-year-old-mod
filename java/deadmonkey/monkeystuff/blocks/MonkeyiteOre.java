package deadmonkey.monkeystuff.blocks;

import deadmonkey.monkeystuff.init.CustomBlock;
import net.minecraft.block.Block;

public class MonkeyiteOre extends CustomBlock {

	public MonkeyiteOre(String name, float hardness, float resistance, int harvestLevel) {
		super(name, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}

}
