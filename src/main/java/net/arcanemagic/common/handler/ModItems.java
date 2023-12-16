package net.arcanemagic.common.handler;

import net.arcanemagic.common.item.Book;
import net.arcanemagic.common.item.tool.UltraPickaxe;
import net.arcanemagic.common.item.tool.NecromancerStaff;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.arcanemagic.common.item.GoldenBread;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.arcanemagic.common.item.armor.MegaArmor;

public class ModItems {
    public static final Item.ToolMaterial ULTRA_MATERIAL = EnumHelper.addToolMaterial("arcanemagic:ultra_ingot", 99999, 10000, 99999F, 20F, 30);
    public static final ItemArmor.ArmorMaterial ULTRA_ARMOR_MATERIAL = EnumHelper.addArmorMaterial("arcanemagic:ultra_ingot", 99999, new int[]{99999, 99999, 99999, 99999}, 30);
    public static final GoldenBread GOLDEN_BREAD = new GoldenBread();
    public static final UltraPickaxe ADMIN_PICKAXE = new UltraPickaxe();
    public static final Book BOOK = new Book();
    public static final NecromancerStaff NECROMANCER_STAFF = new NecromancerStaff();

    public static final MegaArmor MEGA_HELMET = new MegaArmor("helmet", 0);
    public static final MegaArmor MEGA_PLATE = new MegaArmor("plate", 1);
    public static final MegaArmor MEGA_LEGS = new MegaArmor("legs", 2);
    public static final MegaArmor MEGA_BOOTS = new MegaArmor("boots", 3);

    public static void register() {
        GameRegistry.registerItem(GOLDEN_BREAD, "golden_bread");
        GameRegistry.registerItem(ADMIN_PICKAXE, "admin_pickaxe");
        GameRegistry.registerItem(BOOK, "book");
        GameRegistry.registerItem(NECROMANCER_STAFF, "Necromancers_Staff");
    }
}
