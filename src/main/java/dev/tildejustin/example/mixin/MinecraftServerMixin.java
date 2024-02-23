package dev.tildejustin.example.mixin;

import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.core.Logger;
import org.spongepowered.asm.mixin.*;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerMixin {
    @Shadow
    @Final
    private static Logger LOGGER;
}
