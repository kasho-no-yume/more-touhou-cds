package com.bitsson.moretouhoucds;

import com.bitsson.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


/**
 * @author bitsson
 */
@Mod(modid = MoreCds.MODID, name = MoreCds.NAME, version = MoreCds.VERSION, acceptedMinecraftVersions = "1.12.2")
public class MoreCds
{
    public static final String MODID = "moretouhoucds";
    public static final String NAME = "more Touhou Music CDs";
    public static final String VERSION = "1.0.2";

    @Instance(MoreCds.MODID)
    public static MoreCds instance;

    @SidedProxy(clientSide = "com.bitsson.client.ClientProxy",
            serverSide = "com.bitsson.common.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        // TODO
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // TODO
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        // TODO
    }
}