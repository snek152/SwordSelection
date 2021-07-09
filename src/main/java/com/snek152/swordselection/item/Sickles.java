package com.snek152.swordselection.item;

import com.google.common.collect.Multimap;
import com.snek152.swordselection.DualWieldingWeapon;
import com.snek152.swordselection.util.Config;
import com.snek152.swordselection.util.Registration;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Hand;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class Sickles extends DualWieldingWeapon {
    public Sickles(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

}
