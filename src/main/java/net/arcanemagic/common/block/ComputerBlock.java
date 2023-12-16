package net.arcanemagic.common.block;

import net.arcanemagic.ArcaneMystic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.arcanemagic.common.handler.ModTab;

public class ComputerBlock extends Block {
    public ComputerBlock(){
        super(Material.wood);
        setBlockName("PcBlock");
        setBlockTextureName(ArcaneMystic.MOD_ID+":pcblock");
        setCreativeTab(ModTab.INSTANCE);
    }
}
