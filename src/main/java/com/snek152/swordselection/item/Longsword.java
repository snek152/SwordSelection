package com.snek152.swordselection.item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.vector.Vector3d;

public class Longsword extends SwordItem {
    public Longsword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // Adding lightning properties
    @Override
    public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity wielder){

        if (Math.random()<=0.1 || target.getEntityWorld().isThundering()) {
            LightningBoltEntity bolt = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, target.getEntityWorld());
            bolt.setPosition(target.getPosX(), target.getPosY(), target.getPosZ());
            target.getEntityWorld().addEntity(bolt);
        }

        return true;

    }
}
