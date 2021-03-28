package com.savagekiller13.yalbm.registries;

import com.savagekiller13.yalbm.YALBM;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, YALBM.modid);

    public static final RegistryObject<Block> LUCKY_BLOCK = BLOCKS.register("lucky_block", () -> new Block(AbstractBlock.Properties.of(Material.METAL)));

    public static void registerBlocks() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
