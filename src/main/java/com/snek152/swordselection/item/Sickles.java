package com.snek152.swordselection.item;

import com.google.common.collect.Multimap;
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

public class Sickles extends SwordItem {
    public Sickles(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.getHeldItem(Hand.MAIN_HAND).getItem().getClass() == Sickles.class) {
            playerIn.swing(handIn, true);
            Minecraft mc = Minecraft.getInstance();

            if (mc.pointedEntity != null) {
                playerIn.attackTargetEntityWithCurrentItem(worldIn.getEntityByID(mc.pointedEntity.getEntityId()));
            }
        }
        return ActionResult.resultPass(playerIn.getHeldItem(handIn));

    }
}
