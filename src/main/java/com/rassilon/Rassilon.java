package com.rassilon;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(Rassilon.MOD_ID)
public final class Rassilon {
    public static final String MOD_ID = "rassilon";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Rassilon(IEventBus modBus, ModContainer container) {
        LOGGER.info("Project Rassilon initialising");
    }
}
