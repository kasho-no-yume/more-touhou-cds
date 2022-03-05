package com.bitsson.cditem;

import net.minecraft.item.ItemRecord;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class ItemModRecord extends ItemRecord
{

    public ItemModRecord(String record, SoundEvent soundIn,String name)
    {
        super("moretouhoucds"+record, soundIn);
        this.setUnlocalizedName("moretouhoucds."+name);
    }
}