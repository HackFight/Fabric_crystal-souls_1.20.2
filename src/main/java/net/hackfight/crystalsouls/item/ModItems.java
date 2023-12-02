package net.hackfight.crystalsouls.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.hackfight.crystalsouls.CrystalSouls;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item CRYSTALIZED_SOUL = registerItem("crystalized_soul", new Item(new FabricItemSettings()));
    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries)
    {
        entries.add(CRYSTALIZED_SOUL);
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
