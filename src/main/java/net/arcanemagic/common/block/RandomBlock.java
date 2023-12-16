package net.arcanemagic.common.block;

import net.arcanemagic.ArcaneMystic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RandomBlock extends Block{
    public RandomBlock(){
        super(Material.rock);
        setBlockName("RandomBlock");
        setBlockTextureName(ArcaneMystic.MOD_ID + ":randomblock");
    }
}
