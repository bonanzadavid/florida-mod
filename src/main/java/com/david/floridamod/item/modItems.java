package com.david.floridamod.item;

import com.david.floridamod.FloridaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class modItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FloridaMod.MOD_ID);

    //Registers a new item in forge (NEEDED FOR ALL MOD ITEMS)
    public static final RegistryObject<Item> GATORSCUTE = ITEMS.register("gator_scute",
            //Creates a new object for said item
            () -> new Item(new Item.Properties()));
    //Registers a new item in forge (NEEDED FOR ALL MOD ITEMS)
    public static final RegistryObject<Item> GATORHDIE = ITEMS.register("gator_hide",
            //Creates a new object for said item
            () -> new Item(new Item.Properties()));


    //Allows the FloridaMod.class to communicate with modItems.java
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
