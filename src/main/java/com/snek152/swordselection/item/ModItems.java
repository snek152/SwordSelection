package com.snek152.swordselection.item;

import com.snek152.swordselection.SwordSelection;
import com.snek152.swordselection.util.Registration;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import javax.swing.text.html.parser.Entity;
import java.util.Vector;

public class ModItems {
    public static final RegistryObject<Item> IRON_SICKLES =
            Registration.ITEMS.register("iron_sickles",
                    () -> new SwordItem(ItemTier.IRON, 0,-1f,
                            new Item.Properties()
                                    .defaultMaxDamage(200)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.PICKAXE,0)));
    public static final RegistryObject<Item> IRON_BROADSWORD =
            Registration.ITEMS.register("iron_broadsword",
                    () -> new BroadSword(ItemTier.IRON, 5,-3.3f,
                            new Item.Properties()
                                    .defaultMaxDamage(150)
                                    .group(ItemGroup.COMBAT)));


    public static void register() {}
}
