package me.samkemp.mods.samstestmod.item.custom;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Objects;

public class FuelItem extends Item {

    private int burnTime = 0;
    private String tooltip = "";

    public FuelItem(Properties properties, int burnTime, String tooltip) {
        super(properties);
        this.burnTime = burnTime;
        this.tooltip = tooltip;
    }

    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return this.burnTime;
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        if(!Objects.equals(this.tooltip, ""))
        {
            if(Screen.hasShiftDown())
            {
                tooltipComponents.add(Component.translatable(tooltip));
            }
            else {
                tooltipComponents.add(Component.translatable("tooltip.samstestmod.press_shift"));
            }

        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }
}