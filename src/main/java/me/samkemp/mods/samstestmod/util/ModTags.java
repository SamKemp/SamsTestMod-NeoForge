package me.samkemp.mods.samstestmod.util;

import me.samkemp.mods.samstestmod.SamsTestMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> TIN_ORE = createCommonTag("ores/tin");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(SamsTestMod.MOD_ID, name));
        }
        private static TagKey<Block> createCommonTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TIN_INGOTS = createCommonTag("ingots/tin");
        public static final TagKey<Item> LEAD_INGOTS = createCommonTag("ingots/lead");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(SamsTestMod.MOD_ID, name));
        }
        private static TagKey<Item> createCommonTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", name));
        }
    }
}
