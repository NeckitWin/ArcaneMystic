package net.arcanemagic.common;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import net.arcanemagic.common.handler.ModBlocks;
import net.arcanemagic.common.handler.ModItems;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.register();
        ModBlocks.register();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

    }
}