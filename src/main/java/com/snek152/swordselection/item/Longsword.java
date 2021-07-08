package com.snek152.swordselection.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.INPC;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.AxisAlignedBB;

import java.util.List;

public class Longsword extends SwordItem {
    public Longsword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // Adding radius attack properties
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity wielder){

        AxisAlignedBB axis = target.getBoundingBox().expand(3,0,3).expand(-3,0,3).expand(3,0,-3).expand(-3,0,-3);
        List<Entity> entities = wielder.getEntityWorld().getEntitiesWithinAABBExcludingEntity(wielder,axis);

        for (Entity e: entities) {
            if (e instanceof LivingEntity && !(e instanceof INPC)) {
                ((PlayerEntity) wielder).attackTargetEntityWithCurrentItem(e);
            }
        }

        return true;

    }
}
