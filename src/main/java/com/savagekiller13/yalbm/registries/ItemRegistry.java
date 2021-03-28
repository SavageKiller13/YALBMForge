package com.savagekiller13.yalbm.registries;

import com.savagekiller13.yalbm.YALBM;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, YALBM.modid);

    public static final RegistryObject<Item> ITEM_LUCKY_BLOCK = ITEMS.register("lucky_block", () -> new BlockItem(BlockRegistry.LUCKY_BLOCK.get(), new Item.Properties()));

    public static void registerItems() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
