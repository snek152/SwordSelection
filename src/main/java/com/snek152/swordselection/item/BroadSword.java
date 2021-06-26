package com.snek152.swordselection.item;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.vector.Vector3d;

public class BroadSword extends SwordItem {

    public BroadSword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity wielder){

        // Gets a vector of length 1 in the direction the player holding this item is looking
        Vector3d look = wielder.getLookVec().normalize();

        // Play around with this value until you get the amount of knockback you want
        double knockback = 3;

        // Adds velocity to the target
        //target.addVelocity(look.getX()*knockback, look.getY()*knockback, look.getZ()*knockback);
        target.setMotion(look.getX()*knockback,look.getY()*knockback,look.getZ()*knockback);
        return true;

    }
}
