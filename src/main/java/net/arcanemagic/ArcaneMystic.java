package net.arcanemagic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.arcanemagic.common.CommonProxy;
import static net.arcanemagic.ArcaneMystic.*;

@Mod(modid = MOD_ID, version = VERSION, name = MOD_NAME)
public class ArcaneMystic {
    public static final String MOD_ID = "ArcaneMystic";
    public static final String MOD_NAME = "ArcaneMystic";
    public static final String VERSION = "1.0.0";

    @SidedProxy(
            clientSide = "net.arcanemagic.common.ClientProxy",
            serverSide = "net.arcanemagic.common.CommonProxy"
    )
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}