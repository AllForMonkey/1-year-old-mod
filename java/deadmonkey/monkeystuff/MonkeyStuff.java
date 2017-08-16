package deadmonkey.monkeystuff;

import deadmonkey.monkeystuff.init.ModItems;
import deadmonkey.monkeystuff.proxy.CommonProxy;
import deadmonkey.monkeystuff.tabs.MonkeyStuffTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MonkeyStuff {
	
	public static final CreativeTabs monkeystufftab = new MonkeyStuffTab("monkeystufftab");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		proxy.init(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		proxy.postInit(event);
	}
	
}
