package com.bitsson.packageitem;

import com.bitsson.cditem.CdLoader;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

/**
 * @author bitsson
 */
public class randomPackage extends Item
{

    public randomPackage(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        Random ran=new Random();
        ItemStack getRecord=new ItemStack(CdLoader.allRecord[ran.nextInt(CdLoader.recordNumber)]);
        playerIn.inventory.addItemStackToInventory(getRecord);
        playerIn.getHeldItem(handIn).shrink(1);
        return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
    }

}
