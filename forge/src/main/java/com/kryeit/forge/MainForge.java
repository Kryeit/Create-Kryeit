package com.kryeit.forge;

import com.kryeit.Main;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.function.Consumer;

@Mod(Main.MOD_ID)
public class MainForge {
    public MainForge() {
        Main.init();
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        Main.registrate().registerEventListeners(modEventBus);
    }

}
