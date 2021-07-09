package com.snek152.swordselection.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class Config {
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.IntValue BROADSWORD_KNOCKBACK_MULTIPLIER;
    public static ForgeConfigSpec.BooleanValue DUAL_WIELDING;

    static {
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        broadswordKnockback(CLIENT_BUILDER);
        dualWielding(CLIENT_BUILDER);

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

    public static void loadConfigFile(ForgeConfigSpec config, String path) {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }
}
