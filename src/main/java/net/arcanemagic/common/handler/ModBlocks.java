package net.arcanemagic.common.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.arcanemagic.ArcaneMystic;
import net.arcanemagic.common.block.ComputerBlock;
import net.arcanemagic.common.block.FaceBlock;
import net.arcanemagic.common.block.RandomBlock;
import net.arcanemagic.common.block.StorageBlock;
import net.arcanemagic.common.tile.StorageTile;

public class ModBlocks {
    public static final RandomBlock RBLOCK = new RandomBlock();
    public static final FaceBlock FACE_BLOCK = new FaceBlock();
    public static final StorageBlock STORAGE_BLOCK = new StorageBlock();
    public static final ComputerBlock PCBLOCK = new ComputerBlock();

    public static void register () {
        GameRegistry.registerBlock(RBLOCK, "RandomBlock");
        GameRegistry.registerBlock(FACE_BLOCK,"FaceBlock");
        GameRegistry.registerBlock(STORAGE_BLOCK,"StorageBlock");
        GameRegistry.registerBlock(PCBLOCK,"PcBlock");
        GameRegistry.registerTileEntity(StorageTile.class, ArcaneMystic.MOD_ID+":storage");
    }
}
