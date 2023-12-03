package ch.hackfight.crystalsouls.block;

import ch.hackfight.crystalsouls.CrystalSouls;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    public static final Block CRYSTALLISED_SOUL_ORE = registerBlock("crystallised_soul_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.SCULK).requiresTool()));
    private static Block registerBlock(String name, Block block)
    {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CrystalSouls.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block)
    {
        return Registry.register(Registries.ITEM, new Identifier(CrystalSouls.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks()
    {
        CrystalSouls.LOGGER.info("Registering mod blocks for " + CrystalSouls.MOD_ID);
    }
}
