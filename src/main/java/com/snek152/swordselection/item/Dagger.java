package com.snek152.swordselection.item;

import com.snek152.swordselection.DualWieldingWeapon;
import com.snek152.swordselection.util.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandSource;
import net.minecraft.command.ICommandSource;
import net.minecraft.entity.AreaEffectCloudEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.BasicParticleType;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.potion.PotionUtils;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.*;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeConfig;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Dagger extends SwordItem {
    public Dagger(IItemTier p_i48460_1_, int p_i48460_2_, float p_i48460_3_, Properties p_i48460_4_) {
        super(p_i48460_1_, p_i48460_2_, p_i48460_3_, p_i48460_4_);
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (true) {
            playerIn.swing(handIn, true);
            Minecraft mc = Minecraft.getInstance();

            if (mc.crosshairPickEntity != null && !worldIn.isClientSide) {
                if (worldIn.getEntity(mc.crosshairPickEntity.getId()) instanceof LivingEntity && playerIn.distanceTo(worldIn.getEntity(mc.crosshairPickEntity.getId())) <= 2) {
                    LivingEntity e = (LivingEntity) worldIn.getEntity(mc.crosshairPickEntity.getId());

                    e.hurt(DamageSource.playerAttack(playerIn),4);
                    e.addEffect(new EffectInstance(Effects.POISON,Integer.MAX_VALUE,0,false,false,false));
                    playerIn.getItemInHand(handIn).shrink(1);


//                    e.hurt(DamageSource.playerAttack(playerIn),4);
//                    e.hurt(DamageSource.playerAttack(playerIn),4);
//                    e.hurt(DamageSource.playerAttack(playerIn),4);


                }


            }
        }
        return ActionResult.pass(playerIn.getItemInHand(handIn));

    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity wielder) {
        PlayerEntity player = (PlayerEntity) wielder;
        if (player.distanceTo(target) <= 2) {
            return true;
        } else {
            return false;
        }
    }
}

