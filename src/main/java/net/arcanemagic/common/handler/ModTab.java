package net.arcanemagic.common.handler;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.arcanemagic.ArcaneMystic;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModTab extends CreativeTabs {
    public static final ModTab INSTANCE = new ModTab();

    private ModTab() {
        super(ArcaneMystic.MOD_ID);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return ModItems.ADMIN_PICKAXE;
    }
}