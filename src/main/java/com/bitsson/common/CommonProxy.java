package com.bitsson.common;

import com.bitsson.packageitem.PackageLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.bitsson.cditem.CdLoader;

/**
 * @author bitsson
 */
public class CommonProxy {
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        CdLoader.regSound();
        CdLoader.regItemRecord();
        PackageLoader.regPackage();
        // TODO
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // TODO
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // TODO
    }
}