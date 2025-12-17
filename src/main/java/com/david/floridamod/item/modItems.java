package com.david.floridamod.item;


import com.david.floridamod.FloridaMod;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class modItems {

        public static final DeferredRegister<Item> ITEMS =
                 DeferredRegister.create(ForgeRegistries.ITEMS, FloridaMod.MOD_ID);

        public static final RegistryObject<Item> GATORSCUTE = ITEMS.register("gator_scute",
                () -> new Item(new Item.Properties()));
        public static final RegistryObject<Item> GATORHIDE = ITEMS.register("gator_hide",
                () -> new Item(new Item.Properties()));
                

        public static final RegistryObject<Item> GATORHELMET = ITEMS.register("gator_helmet",
                () -> new ArmorItem(ModArmorMaterials.GATOR_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                        new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(18))));
        public static final RegistryObject<Item> GATORCHESTPLATE = ITEMS.register("gator_chestplate",
                () -> new ArmorItem(ModArmorMaterials.GATOR_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                        new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(18)))); 
        public static final RegistryObject<Item> GATORLEGGINGS = ITEMS.register("gator_leggings",
                () -> new ArmorItem(ModArmorMaterials.GATOR_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                        new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(18)))); 
        public static final RegistryObject<Item> GATORBOOTS = ITEMS.register("gator_boots",
                () -> new ArmorItem(ModArmorMaterials.GATOR_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                        new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(18))));
    public static final RegistryObject<Item> SUNSCREEN = ITEMS.register("sunscreen",
            () -> new SunscreenItem(new Item.Properties()
                    .stacksTo(16)



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}