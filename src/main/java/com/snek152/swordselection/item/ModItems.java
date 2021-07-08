package com.snek152.swordselection.item;

import com.snek152.swordselection.util.Config;
import com.snek152.swordselection.util.Registration;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    // Iron sickles

    public static final RegistryObject<Item> IRON_SICKLES =
            Registration.ITEMS.register("iron_sickles",
                    () -> new Sickles(ItemTier.IRON, Config.SICKLES.get()-3,-1f,
                            new Item.Properties()
                                    .defaultMaxDamage(210)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Iron broadsword
    public static final RegistryObject<Item> IRON_BROADSWORD =
            Registration.ITEMS.register("iron_broadsword",
                    () -> new Broadsword(ItemTier.IRON, 5,-3.3f,
                            new Item.Properties()
                                    .defaultMaxDamage(261)
                                    .group(ItemGroup.COMBAT)));

    // Iron longsword
    public static final RegistryObject<Item> IRON_LONGSWORD =
            Registration.ITEMS.register("iron_longsword",
                    () -> new Longsword(ItemTier.IRON, 3,-2.2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .group(ItemGroup.COMBAT)));

    // Stone sickles
    public static final RegistryObject<Item> STONE_SICKLES =
            Registration.ITEMS.register("stone_sickles",
                    () -> new Sickles(ItemTier.STONE, 0,-1.2f,
                            new Item.Properties()
                                    .defaultMaxDamage(91)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Stone broadsword
    public static final RegistryObject<Item> STONE_BROADSWORD =
            Registration.ITEMS.register("stone_broadsword",
                    () -> new Broadsword(ItemTier.STONE, 5,-3.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(142)
                                    .group(ItemGroup.COMBAT)));

    // Stone longsword
    public static final RegistryObject<Item> STONE_LONGSWORD =
            Registration.ITEMS.register("stone_longsword",
                    () -> new Longsword(ItemTier.STONE, 3,-2.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(131)
                                    .group(ItemGroup.COMBAT)));
    public static void register() {}
}
