package deadmonkey.monkeystuff.blocks.fence;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class ModBlockFence extends BlockFence
{

	public ModBlockFence(String name, float hardness, float resistance) 
	{
		super(Material.IRON, Material.IRON.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setResistance(resistance);
		setHardness(hardness);
		this.useNeighborBrightness = true;
	}

}
