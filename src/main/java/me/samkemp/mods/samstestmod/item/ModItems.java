package me.samkemp.mods.samstestmod.item;

import me.samkemp.mods.samstestmod.SamsTestMod;
import me.samkemp.mods.samstestmod.item.custom.ChiselItem;
import me.samkemp.mods.samstestmod.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SamsTestMod.MOD_ID);

    // NORMAL ITEMS
    public static final DeferredItem<Item> TIN_RAW = ITEMS.register("tin_raw",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_INGOT = ITEMS.register("tin_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TIN_NUGGET = ITEMS.register("tin_nugget",
            () -> new Item(new Item.Properties()));

    // FOODS
    public static final DeferredItem<Item> BREAD_SLICE = ITEMS.register("bread_slice",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BREAD_SLICE)));
    public static final DeferredItem<Item> BREAD_SANDWICH = ITEMS.register("bread_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.BREAD_SANDWICH)));
    public static final DeferredItem<Item> CARROT_SANDWICH = ITEMS.register("carrot_sandwich",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CARROT_SANDWICH)));

    // SPECIAL ITEMS
    public static final DeferredItem<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static final DeferredItem<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            () -> new ChiselItem(new Item.Properties().durability(128)));

    public static final DeferredItem<Item> SUPER_COAL = ITEMS.register("super_coal",
            () -> new FuelItem(new Item.Properties(), 150000, "tooltip.samstestmod.super_coal"));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}