package com.drgrass.costumes;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("costumes")
public class Costumes
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "costumes";

    public Costumes() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        RegistryHandler.init();
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }


    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {

    }
    public static final ItemGroup MC = new ItemGroup("minecraftcostumes") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.Dab_Shirt.get());
        }
    };



    public static final ItemGroup Movie = new ItemGroup("moviecostumes") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.Beast_Chest.get());
        }
    };


    public static final ItemGroup Other = new ItemGroup("othercostumes") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(RegistryHandler.Zookeeper_Helmet.get());
        }
    };
}
