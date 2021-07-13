package com.snek152.swordselection.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.INPC;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class Longsword extends SwordItem {
    public Longsword(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    // Adding radius attack properties
    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity wielder){

        AxisAlignedBB axis = target.getBoundingBox().expandTowards(3,0,3).expandTowards(-3,0,3).expandTowards(3,0,-3).expandTowards(-3,0,-3);
        List<Entity> entities = wielder.getCommandSenderWorld().getEntities(wielder,axis);

        for (Entity e: entities) {
            if (e instanceof LivingEntity && !(e instanceof INPC)) {
                ((PlayerEntity) wielder).attack(e);
            }
        }

        return true;

    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity playerIn, int itemSlot, boolean isSelected) {
        if (playerIn.getType() == EntityType.PLAYER) {
            if (stack.getItem().getClass() == Longsword.class && isSelected && Math.random() <= 0.1) {
                AxisAlignedBB axis = playerIn.getBoundingBox().expandTowards(1,0,1).expandTowards(-1,0,1).expandTowards(1,0,-1).expandTowards(-1,0,-1);
                List<Entity> entities = playerIn.getCommandSenderWorld().getEntities(playerIn,axis);

                for (Entity e: entities) {
                    if (e instanceof LivingEntity && !(e instanceof INPC)) {

                        e.hurt(DamageSource.playerAttack((PlayerEntity) playerIn),((SwordItem)stack.getItem()).getDamage());
                    }
                }
            }

        }

    }
}
