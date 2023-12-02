package net.hackfight.crystalsouls;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalSouls implements ModInitializer {
	public static final String MOD_ID = "crystal-souls";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing Crystal Souls");
	}
}