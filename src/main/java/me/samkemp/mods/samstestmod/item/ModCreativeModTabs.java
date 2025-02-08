package me.samkemp.mods.samstestmod.item;

import me.samkemp.mods.samstestmod.SamsTestMod;
import me.samkemp.mods.samstestmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SamsTestMod.MOD_ID);

    public static final Supplier<CreativeModeTab> SAMS_TEST_MOD_TAB = CREATIVE_MODE_TAB.register("sams_test_mod_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TIN_INGOT.get()))
                    .title(Component.translatable("creativetab.samstestmod"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // Food
                        output.accept(ModItems.BREAD_SLICE);
                        output.accept(ModItems.BREAD_SANDWICH);
                        output.accept(ModItems.CARROT_SANDWICH);

                        // Tools

                        // Special Items
                        output.accept(ModItems.IRON_CHISEL);
                        output.accept(ModItems.DIAMOND_CHISEL);
                        output.accept(ModItems.SUPER_COAL);

                        // Special Blocks
                        output.accept(ModBlocks.MAGIC_BLOCK);

                        // Material: Tin
                        // Items
                        output.accept(ModItems.TIN_RAW);
                        output.accept(ModItems.TIN_INGOT);
                        output.accept(ModItems.TIN_NUGGET);
                        // Blocks
                        output.accept(ModBlocks.TIN_BLOCK);
                        output.accept(ModBlocks.TIN_ORE);
                        output.accept(ModBlocks.TIN_DEEPSLATE_ORE);
                        output.accept(ModBlocks.TIN_RAW_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
