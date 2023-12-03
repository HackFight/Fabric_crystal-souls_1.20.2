package ch.hackfight.crystalsouls.item;

import ch.hackfight.crystalsouls.CrystalSouls;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item CRYSTALLISED_SOUL = registerItem("crystallised_soul", new Item(new FabricItemSettings()));
    public static final Item BLANK_RUNESTONE = registerItem("blank_runestone", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(CRYSTALLISED_SOUL);
        entries.add(BLANK_RUNESTONE);
    }
    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registries.ITEM, new Identifier(CrystalSouls.MOD_ID, name), item);
    }
    public static void registerModitems()
    {
        CrystalSouls.LOGGER.info("Registering mod items for " + CrystalSouls.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
