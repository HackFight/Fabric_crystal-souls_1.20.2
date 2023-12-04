package ch.hackfight.crystalsouls;

import ch.hackfight.crystalsouls.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import ch.hackfight.crystalsouls.block.ModBlocks;
import ch.hackfight.crystalsouls.item.ModItemGroups;
import ch.hackfight.crystalsouls.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrystalSouls implements ModInitializer {
	public static final String MOD_ID = "crystal-souls";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		LOGGER.info("Initializing Crystal Souls");

		ModItemGroups.registerItemGroups();
		ModItems.registerModitems();

		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();
	}
}