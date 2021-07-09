package com.snek152.swordselection.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class Config {
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.IntValue BROADSWORD_KNOCKBACK_MULTIPLIER;
    public static ForgeConfigSpec.BooleanValue DUAL_WIELDING;
    public static ForgeConfigSpec.IntValue SICKLES_DURABILITY_OFFSET;
    public static ForgeConfigSpec.IntValue BROADSWORD_DURABILITY_OFFSET;
    public static ForgeConfigSpec.IntValue LONGSWORD_DURABILITY_OFFSET;

    static {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        broadswordKnockback(CLIENT_BUILDER);
        dualWielding(CLIENT_BUILDER);
        sicklesDurability(CLIENT_BUILDER);
        broadswordDurability(CLIENT_BUILDER);
        longswordDurability(CLIENT_BUILDER);

        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static void broadswordKnockback(ForgeConfigSpec.Builder CLIENT_BUILDER) {
        BROADSWORD_KNOCKBACK_MULTIPLIER = CLIENT_BUILDER.comment("The knockback multiplier of the broadsword")
                .defineInRange("broadsword_knockback_multiplier",3,1,Integer.MAX_VALUE);
    }

    private static void dualWielding(ForgeConfigSpec.Builder CLIENT_BUILDER) {
        DUAL_WIELDING = CLIENT_BUILDER.comment("Whether dual wielding is enabled or not")
                .define("dual_wielding",true);
    }

    private static void sicklesDurability(ForgeConfigSpec.Builder CLIENT_BUILDER) {
        SICKLES_DURABILITY_OFFSET = CLIENT_BUILDER.comment("The durability offset of sickles. This value will be subtracted from the durability of the tier")
                .defineInRange("sickles_durability_offset",30,Integer.MIN_VALUE+2031,31);
    }

    private static void broadswordDurability(ForgeConfigSpec.Builder CLIENT_BUILDER) {
        BROADSWORD_DURABILITY_OFFSET = CLIENT_BUILDER.comment("The durability offset of broadsword. This value will be added to the durability of the tier")
                .defineInRange("broadsword_durability_offset",11,-31,Integer.MAX_VALUE-2031);
    }

    private static void longswordDurability(ForgeConfigSpec.Builder CLIENT_BUILDER) {
        LONGSWORD_DURABILITY_OFFSET = CLIENT_BUILDER.comment("The durability offset of longsword. This value will be added to the durability of the tier")
                .defineInRange("sickles_durability_offset",0,-31,Integer.MAX_VALUE-2031);
    }

    public static void loadConfigFile(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }
}
