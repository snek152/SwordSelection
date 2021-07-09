package com.snek152.swordselection;

import com.snek152.swordselection.item.Sickles;
import com.snek152.swordselection.util.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class DualWieldingWeapon extends SwordItem {
    public DualWieldingWeapon(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builderIn) {
        super(tier, attackDamageIn, attackSpeedIn, builderIn);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (playerIn.getHeldItem(Hand.MAIN_HAND).getItem().getClass().getSuperclass() == DualWieldingWeapon.class && Config.DUAL_WIELDING.get()) {
            playerIn.swing(handIn, true);
            Minecraft mc = Minecraft.getInstance();

            if (mc.pointedEntity != null) {
                playerIn.attackTargetEntityWithCurrentItem(worldIn.getEntityByID(mc.pointedEntity.getEntityId()));
            }
        }
        return ActionResult.resultPass(playerIn.getHeldItem(handIn));

    }
}
