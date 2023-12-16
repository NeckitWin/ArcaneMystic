package net.arcanemagic.common.item;

import net.arcanemagic.ArcaneMystic;
import net.arcanemagic.common.handler.ModTab;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class GoldenBread extends ItemFood{
    public GoldenBread(){
        super(20, 5F, false);
        setPotionEffect(Potion.regeneration.id, 9999999, 5, 1F);
        setUnlocalizedName("GoldenBread");
        setTextureName(ArcaneMystic.MOD_ID +":goldenbread");
        setMaxStackSize(16);
        setCreativeTab(ModTab.INSTANCE);
    }
}
