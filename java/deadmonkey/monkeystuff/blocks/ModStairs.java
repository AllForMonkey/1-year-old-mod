package deadmonkey.monkeystuff.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class ModStairs extends BlockStairs 
{
	public ModStairs(String name, IBlockState modelState) 
	{
		super(modelState);
		setUnlocalizedName(name);
		setRegistryName(name);
		this.useNeighborBrightness = true;
	}

}
