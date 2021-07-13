package com.snek152.swordselection.item;

import com.snek152.swordselection.util.Config;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

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

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity playerIn, int itemSlot, boolean isSelected) {
        if (playerIn.getType() == EntityType.PLAYER) {
            if (stack.getItem().getClass() == Broadsword.class && isSelected) {
                ((PlayerEntity) playerIn).addEffect(new EffectInstance(Effects.MOVEMENT_SLOWDOWN,0,0,false,false,false));
            }

        }

    }
}
