package net.goaty.civilisations.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.goaty.civilisations.GoatysCivilisations;
import net.minecraft.item.Item;

import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public final static Item TEST_ITEM = registerItem("test_item", new Item(new FabricItemSettings()));

    private static void addItemsToCreativeTab(FabricItemGroupEntries entries){
        entries.add(TEST_ITEM);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(GoatysCivilisations.MOD_ID, name), item);

    }

    public static void registerModItems(){
        GoatysCivilisations.LOGGER.info("[Civs] Registering items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToCreativeTab);
    }
}