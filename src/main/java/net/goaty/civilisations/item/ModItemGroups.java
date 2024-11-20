package net.goaty.civilisations.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.goaty.civilisations.GoatysCivilisations;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup MAIN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(GoatysCivilisations.MOD_ID, "main_item_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.main"))
                    .icon(() -> new ItemStack(ModItems.Paycheck)).entries((displayContext, entries) -> {
                        entries.add(ModItems.Paycheck);

            }).build());

    public static void registerItemGroups(){
        GoatysCivilisations.LOGGER.info("[CIVS] Registering Item groups");
    }
}
