package com.example;

import com.example.config.ModConfigForge;
import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(ModStatic.MOD_ID)
public class ModForge {
    public static final Logger LOGGER = LogUtils.getLogger();

    public ModForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);
        ModStatic.modConfig = new ModConfigForge();
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Enabling " + ModStatic.MOD_NAME);
    }
}
