package com.david.floridamod.datagen;

import com.david.floridamod.block.ModBlocks;
import com.david.floridamod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries){
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate(){
        dropSelf(ModBlocks.GATORHIDE_BLOCK.get());

        //IF YOU MAKE AN ORE AND YOU WANT IT TO DROP ITEMS, DO THIS HERE FOR ALL ITEMS
        //SET THEM TO THE BLOCK AND ITEM DROP.
         this.add(ModBlocks.GATORHIDE_BLOCK.get(),
                block -> createOreDrop(ModBlocks.GATORHIDE_BLOCK.get(), ModItems.GATORSCUTE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
