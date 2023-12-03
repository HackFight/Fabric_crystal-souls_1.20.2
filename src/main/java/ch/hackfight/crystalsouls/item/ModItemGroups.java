package ch.hackfight.crystalsouls.item;

import ch.hackfight.crystalsouls.CrystalSouls;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import ch.hackfight.crystalsouls.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup CRYSTALLISED_SOULS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CrystalSouls.MOD_ID, "crystallised-soul"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crystallised_souls"))
                    .icon(() -> new ItemStack(ModItems.CRYSTALLISED_SOUL)).entries((displayContext, entries) -> {

                        entries.add(ModItems.CRYSTALLISED_SOUL);
                        entries.add(ModItems.BLANK_RUNESTONE);

                        entries.add(ModBlocks.CRYSTALLISED_SOUL_ORE);

                    }).build());
    public static void registerItemGroups()
    {
        CrystalSouls.LOGGER.info("Initializing item groups for " + CrystalSouls.MOD_ID);
    }
}
