package net.awakaxis.axistweaks;

import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Axistweaks implements ModInitializer {
	public static final String MOD_ID = "axistweaks";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
	}
}