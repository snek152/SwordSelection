package com.snek152.swordselection.item;

import com.snek152.swordselection.util.Config;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.vector.Vector3d;

public class Broadsword extends SwordItem {

    public Broadsword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // Adding knockback
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity wielder){

        Vector3d look = wielder.getLookAngle().normalize();

        double knockback = Config.BROADSWORD_KNOCKBACK_MULTIPLIER.get();

        target.setDeltaMovement(look.x*knockback,look.y*knockback,look.z*knockback);
        return true;

    }
}
