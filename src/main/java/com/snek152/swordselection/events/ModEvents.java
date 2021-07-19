package com.snek152.swordselection.events;

import com.snek152.swordselection.item.Dagger;
import com.snek152.swordselection.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Effects;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.Collection;

public class ModEvents {
    @SubscribeEvent
    public void onDaggerDrop(LivingDropsEvent event) {
        LivingEntity entity = event.getEntityLiving();
        World world = event.getEntity().getCommandSenderWorld();
        Collection<ItemEntity> drops = event.getDrops();
        DamageSource d = event.getSource();
        LivingEntity e = (LivingEntity) d.getDirectEntity();
        if (entity.hasEffect(Effects.POISON) && e instanceof PlayerEntity && Math.random() <= 0.5) {
            PlayerEntity player = (PlayerEntity) e;
            ItemStack itemstack = new ItemStack(Items.IRON_INGOT);
            drops.add(new ItemEntity(world,entity.getX(),entity.getY(),entity.getZ(),itemstack));
        }
    }
}
