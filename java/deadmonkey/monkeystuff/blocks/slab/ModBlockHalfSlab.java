package deadmonkey.monkeystuff.blocks.slab;

public class ModBlockHalfSlab extends ModBlockSlab
{

	public ModBlockHalfSlab(String name, float hardness, float resistance) 
	{
		super(name, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() 
	{
		return false;
	}

}
