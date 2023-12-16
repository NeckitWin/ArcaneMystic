package net.arcanemagic.common.block;

import net.arcanemagic.ArcaneMystic;
import net.arcanemagic.common.tile.StorageTile;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.arcanemagic.common.handler.ModTab;

public class StorageBlock extends BlockContainer{
    public StorageBlock(){
        super(Material.wood);
        setBlockName("storage");
        setBlockTextureName(ArcaneMystic.MOD_ID+":storage");
        setCreativeTab(ModTab.INSTANCE);
    }
    @Override
    public TileEntity createNewTileEntity(World world, int metadata){
        return new StorageTile();
    }
}
