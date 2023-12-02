package net.hackfight.crystalsouls.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hackfight.crystalsouls.CrystalSouls;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup CRYSTALIZED_SOULS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CrystalSouls.MOD_ID, "crystalized-soul"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.crystalized_souls"))
                    .icon(() -> new ItemStack(ModItems.CRYSTALIZED_SOUL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.CRYSTALIZED_SOUL);
                    }).build());
    public static void registerItemGroups()
    {
        CrystalSouls.LOGGER.info("Initializing item groups for " + CrystalSouls.MOD_ID);
    }
}
