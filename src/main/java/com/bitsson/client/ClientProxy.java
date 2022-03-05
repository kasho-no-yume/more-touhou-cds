package com.bitsson.client;

import com.bitsson.common.CommonProxy;
import com.bitsson.packageitem.PackageLoader;
import net.minecraftforge.common.MinecraftForge;
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
public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);
        CdLoader.registerItemModel();
        PackageLoader.regPackageModel();;
    }
    @Override
    public void init(FMLInitializationEvent event) {
        super.init(event);
    }
    @Override
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
    }
}