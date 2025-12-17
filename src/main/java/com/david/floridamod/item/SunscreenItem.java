package com.david.floridamod.item;

import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.InteractionHand;

// This item can be used, granting Fire Resistance for a short duration.
public class SunscreenItem extends Item {

    // Constructor: Sets the item properties (like max stack size)
    public SunscreenItem(Properties properties) {
        super(properties);
    }

    /**
     * Called when the item is right-clicked.
     */
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        // Check if this is running on the client or the server.
        // We only want to apply effects and consume the item on the server.
        if (!level.isClientSide) {
            // 1. Apply the Effect: Fire Resistance (duration is in ticks: 20 ticks = 1 second)
            // Duration: 600 ticks = 30 seconds
            // Amplifier: 0 (Level I)
            int durationInTicks = 600;
            int amplifier = 0;

            player.addEffect(new MobEffectInstance(
                    MobEffects.FIRE_RESISTANCE,
                    durationInTicks,
                    amplifier
            ));

            // 2. Consume the Item: Decrement the stack size (or make it a single-use item)
            itemstack.shrink(1);

            // Optionally, you could play a sound effect here for feedback
            // level.playSound(null, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_CANDLE_BLOCK_PLACE, SoundSource.PLAYERS, 1.0F, 1.0F);
        }

        // Return SUCCESS to indicate the action was performed
        return InteractionResultHolder.success(itemstack);
    }
}