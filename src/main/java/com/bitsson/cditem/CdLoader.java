package com.bitsson.cditem;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import scala.tools.nsc.doc.model.Public;

@Mod.EventBusSubscriber
public class CdLoader
{
    //唱片名列表
    public static String[] allRecordName={"kashonoyume","intermezzo","unowen","biancan","yingsezhihai","chunfengzhimeng","cuimengxiang","dongfangfeixiangtian","dongfeng",
            "dongfangcuimengxiang","xingyunliushui","honglou","huaruhuanxiangyiban","huazhiqishi","jinxiaoshi","mengyuxianshidejingjie","musecangran","penglaichuanshuo",
            "pingyihua","qingsedahai","shanjiaodeshenshe","shanghaihongchaguan","suiyue","tiankongdehuazhidu","tongji","wangshideqinggan","weizhidehua","qichongzou",
            "yinghuayinghua","mukougawanozuki","huanxiangxiang","reincarnation","tiankonghedahai","youxuandefengshu","keaideguniang","fengkuangdewuzhe","baiselvren",
            "huanxiangbaiselvren","beiyinnidesiji","mishenmoduoluo","ouxiangshijie","renxingcaipan","xiwangzhixing","peaceful","alicemaestra","xihua","bolishenshe","dreamland",
            "xiaochuidemoli"};

    public static int recordNumber=allRecordName.length;
    //定义音效事件
    public static SoundEvent[] allMusic=new SoundEvent[recordNumber];
    public static SoundEvent xhmusic=new SoundEvent(new ResourceLocation("moretouhoucds","xxhh"));
    public static void soundInit()
    {
        for(int i=0;i<recordNumber;i++)
        {
            allMusic[i]=new SoundEvent(new ResourceLocation("moretouhoucds", allRecordName[i]));
            allMusic[i].setRegistryName(allRecordName[i]);
        }

    }

    //注册音效文件
    public static void regSound()
    {
        // 这里设定的是音效事件的注册名，和上面那个 sounds.json 用的无关！
        // 为方便起见可以使用一样的名字，这里为了说明差别使用了不一样的名字
        soundInit();
        xhmusic.setRegistryName("xxhh");
        for(int i=0;i<recordNumber;i++)
        {
    //        event.getRegistry().register(allMusic[i].setRegistryName(new ResourceLocation("moretouhoucds", allRecordName[i])));
            ForgeRegistries.SOUND_EVENTS.register(allMusic[i]);
        }
        ForgeRegistries.SOUND_EVENTS.register(xhmusic);
    }



    //定义新唱片
    public static ItemModRecord[] allRecord=new ItemModRecord[recordNumber];
    public static ItemModRecord xhRecord=new ItemModRecord("xxhh",xhmusic,"xxhh");
    public static void recordInit()
    {
        soundInit();
        for(int i=0;i<recordNumber;i++)
        {
            allRecord[i]=new ItemModRecord(allRecordName[i],allMusic[i],allRecordName[i]);
            allRecord[i].setRegistryName("moretouhoucds:"+allRecordName[i]);
        }
        xhRecord.setRegistryName("moretouhoucds:xxhh");
    }



    //注册唱片物品
    public static void regItemRecord()
    {
        recordInit();
        for(int i=0;i<recordNumber;i++)
        {
        //    revent.getRegistry().register(allRecord[i].setRegistryName("moretouhoucds:"+allRecordName[i]));
            ForgeRegistries.ITEMS.register(allRecord[i]);
        }
        ForgeRegistries.ITEMS.register(xhRecord);
    }

    //注册模型
    public static void registerItemModel()
    {
        for(int i=0;i<recordNumber;i++)
        {
            ModelLoader.setCustomModelResourceLocation(allRecord[i],0,new ModelResourceLocation(allRecord[i].getRegistryName(),"inventory"));
        }
        ModelLoader.setCustomModelResourceLocation(xhRecord,0,new ModelResourceLocation(xhRecord.getRegistryName(),"inventory"));
    }

}
