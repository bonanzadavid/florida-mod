package com.david.floridamod.block;

import com.david.floridamod.FloridaMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FloridaMod.MOD_ID);

    public static final RegistryObject<Block> GATORHIDE_BLOCK = BLOCKS.register("gatorhide_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.MOSS)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}


