package net.arcanemagic.common.item.tool;

import net.arcanemagic.ArcaneMystic;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.init.Items;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.entity.monster.EntitySkeleton;
import net.arcanemagic.common.handler.ModItems;
import net.arcanemagic.common.handler.ModTab;

public class NecromancerStaff extends ItemSword {
    public NecromancerStaff() {
        super(ModItems.ULTRA_MATERIAL);
        setUnlocalizedName("Necromancers_Staff");
        setTextureName(ArcaneMystic.MOD_ID + ":nekrostaff");
        setCreativeTab(ModTab.INSTANCE);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if (!world.isRemote) {
            EntitySkeleton skeleton = new EntitySkeleton(world);
            skeleton.setPosition(player.posX + 1, player.posY, player.posZ);
            skeleton.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
            world.spawnEntityInWorld(skeleton);
            EntitySkeleton skeleton1 = new EntitySkeleton(world);
            skeleton1.setPosition(player.posX - 1, player.posY, player.posZ);
            skeleton1.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
            world.spawnEntityInWorld(skeleton1);
            EntitySkeleton skeleton2 = new EntitySkeleton(world);
            skeleton2.setPosition(player.posX, player.posY, player.posZ + 1);
            skeleton2.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
            world.spawnEntityInWorld(skeleton2);
        }
        return itemStack;
    }

    @Override
    public boolean hitEntity(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase1) {
        if (!entityLivingBase.worldObj.isRemote) {
            EntityLightningBolt lightningBolt = new EntityLightningBolt(entityLivingBase.worldObj, entityLivingBase.posX, entityLivingBase.posY, entityLivingBase.posZ);
            for (int i = 0; i < 10; i++) {
                entityLivingBase.worldObj.addWeatherEffect(lightningBolt);
            }
        }
        return true;
    }
}