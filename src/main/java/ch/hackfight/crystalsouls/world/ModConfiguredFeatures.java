package ch.hackfight.crystalsouls.world;

import ch.hackfight.crystalsouls.CrystalSouls;
import ch.hackfight.crystalsouls.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures
{
    public static final RegistryKey<ConfiguredFeature<?, ?>> CRYSTALLISED_SOUL_ORE_KEY = registerKey("crystallised_soul_ore");
    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context)
    {
        RuleTest sculkReplaceable = new BlockMatchRuleTest(Blocks.SCULK);

        List<OreFeatureConfig.Target> overworldCrystallisedSoulOres =
                List.of(OreFeatureConfig.createTarget(sculkReplaceable, ModBlocks.CRYSTALLISED_SOUL_ORE.getDefaultState()));

        register(context, CRYSTALLISED_SOUL_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldCrystallisedSoulOres, 20));
    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name)
    {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(CrystalSouls.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration)
    {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
