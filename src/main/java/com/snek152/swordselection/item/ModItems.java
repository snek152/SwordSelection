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
                    () -> new Sickles(ItemTier.IRON, 0,-1f,
                            new Item.Properties()
                                    .defaultMaxDamage(210)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Stone sickles
    public static final RegistryObject<Item> STONE_SICKLES =
            Registration.ITEMS.register("stone_sickles",
                    () -> new Sickles(ItemTier.STONE, 0,-1.2f,
                            new Item.Properties()
                                    .defaultMaxDamage(91)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Golden sickles
    public static final RegistryObject<Item> GOLDEN_SICKLES =
            Registration.ITEMS.register("golden_sickles",
                    () -> new Sickles(ItemTier.GOLD, 0,-1.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(1)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Wooden sickles
    public static final RegistryObject<Item> WOODEN_SICKLES =
            Registration.ITEMS.register("wooden_sickles",
                    () -> new Sickles(ItemTier.WOOD, 0,-1.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(19)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Diamond sickles
    public static final RegistryObject<Item> DIAMOND_SICKLES =
            Registration.ITEMS.register("diamond_sickles",
                    () -> new Sickles(ItemTier.DIAMOND, 0,-0.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(1521)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Netherite sickles
    public static final RegistryObject<Item> NETHERITE_SICKLES =
            Registration.ITEMS.register("netherite_sickles",
                    () -> new Sickles(ItemTier.NETHERITE, 0,-0.6f,
                            new Item.Properties()
                                    .defaultMaxDamage(1991)
                                    .group(ItemGroup.COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Iron broadsword
    public static final RegistryObject<Item> IRON_BROADSWORD =
            Registration.ITEMS.register("iron_broadsword",
                    () -> new Broadsword(ItemTier.IRON, 5,-3.3f,
                            new Item.Properties()
                                    .defaultMaxDamage(261)
                                    .group(ItemGroup.COMBAT)));

    // Stone broadsword
    public static final RegistryObject<Item> STONE_BROADSWORD =
            Registration.ITEMS.register("stone_broadsword",
                    () -> new Broadsword(ItemTier.STONE, 5,-3.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(142)
                                    .group(ItemGroup.COMBAT)));

    // Wooden broadsword
    public static final RegistryObject<Item> WOODEN_BROADSWORD =
            Registration.ITEMS.register("wooden_broadsword",
                    () -> new Broadsword(ItemTier.WOOD, 5,-3.5f,
                            new Item.Properties()
                                    .defaultMaxDamage(70)
                                    .group(ItemGroup.COMBAT)));

    // Golden broadsword
    public static final RegistryObject<Item> GOLDEN_BROADSWORD =
            Registration.ITEMS.register("golden_broadsword",
                    () -> new Broadsword(ItemTier.GOLD, 5,-3.5f,
                            new Item.Properties()
                                    .defaultMaxDamage(43)
                                    .group(ItemGroup.COMBAT)));

    // Diamond broadsword
    public static final RegistryObject<Item> DIAMOND_BROADSWORD =
            Registration.ITEMS.register("diamond_broadsword",
                    () -> new Broadsword(ItemTier.DIAMOND, 5,-3.2f,
                            new Item.Properties()
                                    .defaultMaxDamage(1572)
                                    .group(ItemGroup.COMBAT)));

    // Netherite broadsword
    public static final RegistryObject<Item> NETHERITE_BROADSWORD =
            Registration.ITEMS.register("netherite_broadsword",
                    () -> new Broadsword(ItemTier.NETHERITE, 5,-3.1f,
                            new Item.Properties()
                                    .defaultMaxDamage(2042)
                                    .group(ItemGroup.COMBAT)));

    // Iron longsword
    public static final RegistryObject<Item> IRON_LONGSWORD =
            Registration.ITEMS.register("iron_longsword",
                    () -> new Longsword(ItemTier.IRON, 3,-2.2f,
                            new Item.Properties()
                                    .defaultMaxDamage(250)
                                    .group(ItemGroup.COMBAT)));

    // Stone longsword
    public static final RegistryObject<Item> STONE_LONGSWORD =
            Registration.ITEMS.register("stone_longsword",
                    () -> new Longsword(ItemTier.STONE, 3,-2.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(131)
                                    .group(ItemGroup.COMBAT)));

    // Wooden longsword
    public static final RegistryObject<Item> WOODEN_LONGSWORD =
            Registration.ITEMS.register("wooden_longsword",
                    () -> new Longsword(ItemTier.WOOD, 3,-2.6f,
                            new Item.Properties()
                                    .defaultMaxDamage(59)
                                    .group(ItemGroup.COMBAT)));

    // Golden longsword
    public static final RegistryObject<Item> GOLDEN_LONGSWORD =
            Registration.ITEMS.register("golden_longsword",
                    () -> new Longsword(ItemTier.GOLD, 3,-2.6f,
                            new Item.Properties()
                                    .defaultMaxDamage(32)
                                    .group(ItemGroup.COMBAT)));

    // Diamond longsword
    public static final RegistryObject<Item> DIAMOND_LONGSWORD =
            Registration.ITEMS.register("diamond_longsword",
                    () -> new Longsword(ItemTier.DIAMOND, 3,-2f,
                            new Item.Properties()
                                    .defaultMaxDamage(1561)
                                    .group(ItemGroup.COMBAT)));

    // Netherite longsword
    public static final RegistryObject<Item> NETHERITE_LONGSWORD =
            Registration.ITEMS.register("netherite_longsword",
                    () -> new Longsword(ItemTier.NETHERITE, 3,-1.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(2031)
                                    .group(ItemGroup.COMBAT)));

    public static void register() {}
}
