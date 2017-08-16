package deadmonkey.monkeystuff.blocks.slab;

public class ModBlockDoubleSlab extends ModBlockSlab
{
	public ModBlockDoubleSlab(String name, float hardness, float resistance) 
	{
	    super(name, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() 
	{
		return true;
	}

}
