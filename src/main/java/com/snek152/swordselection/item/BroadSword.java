package com.snek152.swordselection.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.vector.Vector3d;

public class BroadSword extends SwordItem {

    public BroadSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // Adding knockback
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity wielder){

        Vector3d look = wielder.getLookVec().normalize();

        double knockback = 3;

        target.setMotion(look.getX()*knockback,look.getY()*knockback,look.getZ()*knockback);
        return true;

    }
}
