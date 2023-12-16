package net.arcanemagic.common.item.armor;

import net.arcanemagic.ArcaneMystic;
import net.minecraft.item.ItemArmor;
import net.arcanemagic.common.handler.ModItems;
import net.arcanemagic.common.handler.ModTab;

public class MegaArmor extends ItemArmor {
    public MegaArmor(String elementName, int armorType) {
        super(ModItems.ULTRA_ARMOR_MATERIAL, 0, armorType);
        setUnlocalizedName("ruby_" + elementName);
        setTextureName(ArcaneMystic.MOD_ID + ":ruby_" + elementName);
        setCreativeTab(ModTab.INSTANCE);
    }
}