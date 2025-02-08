package me.samkemp.mods.samstestmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {

    public static final FoodProperties BREAD_SLICE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.06f)
            .alwaysEdible()
            .fast()
            .build();
    public static final FoodProperties BREAD_SANDWICH = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.18f)
            .build();

    public static final FoodProperties CARROT_SANDWICH = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.72f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 400), 1)
            .build();
}
