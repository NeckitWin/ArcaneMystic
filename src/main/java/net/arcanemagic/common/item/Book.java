package net.arcanemagic.common.item;

import net.arcanemagic.ArcaneMystic;
import net.minecraft.item.Item;

public class Book extends Item{
    public Book () {
        setUnlocalizedName("book");
        setTextureName(ArcaneMystic.MOD_ID + ":book");
        setMaxStackSize(1);
    }
}
