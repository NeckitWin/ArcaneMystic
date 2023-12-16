package net.arcanemagic.common.item.tool;

import net.arcanemagic.ArcaneMystic;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.arcanemagic.common.handler.ModItems;
import net.arcanemagic.common.handler.ModTab;

public class UltraPickaxe extends ItemTool {
    public UltraPickaxe() {
        super(2F, ModItems.ULTRA_MATERIAL, null);
        setUnlocalizedName("admin_pickaxe");
        setTextureName(ArcaneMystic.MOD_ID + ":admin_pickaxe");
        setCreativeTab(ModTab.INSTANCE);
        setHarvestLevel("pickaxe", ModItems.ULTRA_MATERIAL.getHarvestLevel());
    }
    // кирка ломает быстро все блоки, что только можно
    @Override
    public float func_150893_a(ItemStack itemStack, Block block) {
        return 999;
    }
    // при правой кнопки мыши получает зелье прыжок 2 уровня на 1 минуту
    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, net.minecraft.world.World world, net.minecraft.entity.player.EntityPlayer player) {
        player.addPotionEffect(new net.minecraft.potion.PotionEffect(8, 3600, 1));
        // и скорость
        player.addPotionEffect(new net.minecraft.potion.PotionEffect(1, 3600, 1));
        return itemStack;
    }
}