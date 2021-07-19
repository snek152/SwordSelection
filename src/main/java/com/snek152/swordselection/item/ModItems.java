package com.snek152.swordselection.item;

import com.snek152.swordselection.util.Config;
import com.snek152.swordselection.util.Registration;
import net.minecraft.item.*;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    static int sicklesoffset = Config.SICKLES_DURABILITY_OFFSET.get();
    static int broadswordoffset = Config.BROADSWORD_DURABILITY_OFFSET.get();
    static int longswordoffset = Config.LONGSWORD_DURABILITY_OFFSET.get();
    // Iron sickles
    public static final RegistryObject<Item> IRON_SICKLES =
            Registration.ITEMS.register("iron_sickles",
                    () -> new Sickles(ItemTier.IRON, 0,-1f,
                            new Item.Properties()
                                    .defaultDurability(250-sicklesoffset)
                                    .tab(ItemGroup.TAB_COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Stone sickles
    public static final RegistryObject<Item> STONE_SICKLES =
            Registration.ITEMS.register("stone_sickles",
                    () -> new Sickles(ItemTier.STONE, 0,-1f,
                            new Item.Properties()
                                    .defaultDurability(131-sicklesoffset)
                                    .tab(ItemGroup.TAB_COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Golden sickles
    public static final RegistryObject<Item> GOLDEN_SICKLES =
            Registration.ITEMS.register("golden_sickles",
                    () -> new Sickles(ItemTier.GOLD, 0,-1f,
                            new Item.Properties()
                                    .defaultDurability(32-sicklesoffset)
                                    .tab(ItemGroup.TAB_COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Wooden sickles
    public static final RegistryObject<Item> WOODEN_SICKLES =
            Registration.ITEMS.register("wooden_sickles",
                    () -> new Sickles(ItemTier.WOOD, 0,-1f,
                            new Item.Properties()
                                    .defaultDurability(59-sicklesoffset)
                                    .tab(ItemGroup.TAB_COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Diamond sickles
    public static final RegistryObject<Item> DIAMOND_SICKLES =
            Registration.ITEMS.register("diamond_sickles",
                    () -> new Sickles(ItemTier.DIAMOND, 0,-1f,
                            new Item.Properties()
                                    .defaultDurability(1561-sicklesoffset)
                                    .tab(ItemGroup.TAB_COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Netherite sickles
    public static final RegistryObject<Item> NETHERITE_SICKLES =
            Registration.ITEMS.register("netherite_sickles",
                    () -> new Sickles(ItemTier.NETHERITE, 0,-1f,
                            new Item.Properties()
                                    .defaultDurability(2031-sicklesoffset)
                                    .tab(ItemGroup.TAB_COMBAT)
                                    .addToolType(ToolType.HOE,0)));

    // Iron broadsword
    public static final RegistryObject<Item> IRON_BROADSWORD =
            Registration.ITEMS.register("iron_broadsword",
                    () -> new Broadsword(ItemTier.IRON, 5,-3.3f,
                            new Item.Properties()
                                    .defaultDurability(250+broadswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Stone broadsword
    public static final RegistryObject<Item> STONE_BROADSWORD =
            Registration.ITEMS.register("stone_broadsword",
                    () -> new Broadsword(ItemTier.STONE, 5,-3.3f,
                            new Item.Properties()
                                    .defaultDurability(131+broadswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Wooden broadsword
    public static final RegistryObject<Item> WOODEN_BROADSWORD =
            Registration.ITEMS.register("wooden_broadsword",
                    () -> new Broadsword(ItemTier.WOOD, 5,-3.3f,
                            new Item.Properties()
                                    .defaultDurability(59+broadswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Golden broadsword
    public static final RegistryObject<Item> GOLDEN_BROADSWORD =
            Registration.ITEMS.register("golden_broadsword",
                    () -> new Broadsword(ItemTier.GOLD, 5,-3.3f,
                            new Item.Properties()
                                    .defaultDurability(32+broadswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Diamond broadsword
    public static final RegistryObject<Item> DIAMOND_BROADSWORD =
            Registration.ITEMS.register("diamond_broadsword",
                    () -> new Broadsword(ItemTier.DIAMOND, 5,-3.3f,
                            new Item.Properties()
                                    .defaultDurability(1561+broadswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Netherite broadsword
    public static final RegistryObject<Item> NETHERITE_BROADSWORD =
            Registration.ITEMS.register("netherite_broadsword",
                    () -> new Broadsword(ItemTier.NETHERITE, 5,-3.3f,
                            new Item.Properties()
                                    .defaultDurability(2031+broadswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Iron longsword
    public static final RegistryObject<Item> IRON_LONGSWORD =
            Registration.ITEMS.register("iron_longsword",
                    () -> new Longsword(ItemTier.IRON, 3,-2.2f,
                            new Item.Properties()
                                    .defaultDurability(250+longswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Stone longsword
    public static final RegistryObject<Item> STONE_LONGSWORD =
            Registration.ITEMS.register("stone_longsword",
                    () -> new Longsword(ItemTier.STONE, 3,-2.2f,
                            new Item.Properties()
                                    .defaultDurability(131+longswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Wooden longsword
    public static final RegistryObject<Item> WOODEN_LONGSWORD =
            Registration.ITEMS.register("wooden_longsword",
                    () -> new Longsword(ItemTier.WOOD, 3,-2.2f,
                            new Item.Properties()
                                    .defaultDurability(59+longswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Golden longsword
    public static final RegistryObject<Item> GOLDEN_LONGSWORD =
            Registration.ITEMS.register("golden_longsword",
                    () -> new Longsword(ItemTier.GOLD, 3,-2.2f,
                            new Item.Properties()
                                    .defaultDurability(32+longswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Diamond longsword
    public static final RegistryObject<Item> DIAMOND_LONGSWORD =
            Registration.ITEMS.register("diamond_longsword",
                    () -> new Longsword(ItemTier.DIAMOND, 3,-2.2f,
                            new Item.Properties()
                                    .defaultDurability(1561+longswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));

    // Netherite longsword
    public static final RegistryObject<Item> NETHERITE_LONGSWORD =
            Registration.ITEMS.register("netherite_longsword",
                    () -> new Longsword(ItemTier.NETHERITE, 3,-2.2f,
                            new Item.Properties()
                                    .defaultDurability(2031+longswordoffset)
                                    .tab(ItemGroup.TAB_COMBAT)));


    public static final RegistryObject<Item> IRON_DAGGER =
            Registration.ITEMS.register("iron_dagger",
                    () -> new Dagger(ItemTier.IRON,0,0f,
                            new Item.Properties().defaultDurability(250).tab(ItemGroup.TAB_COMBAT)));

    public static void register() {}
}
