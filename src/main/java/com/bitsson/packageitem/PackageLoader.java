package com.bitsson.packageitem;

import com.bitsson.packageitem.randomPackage;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class PackageLoader
{
    public static randomPackage rPackage=new randomPackage("randompackage");
    public static void regPackage()
    {
        ForgeRegistries.ITEMS.register(rPackage);
    }

    public static void regPackageModel()
    {
        ModelLoader.setCustomModelResourceLocation(rPackage,0,new ModelResourceLocation(rPackage.getRegistryName(),"inventory"));
    }


}
