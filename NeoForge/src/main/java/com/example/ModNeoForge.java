package com.example;

import com.example.config.ModConfigNeoForge;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModStatic.MOD_ID)
public class ModNeoForge {
    public static final Logger LOGGER = LogUtils.getLogger();

    public ModNeoForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ModStatic.modConfig = new ModConfigNeoForge();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Enabling " + ModStatic.MOD_NAME);
    }
}
