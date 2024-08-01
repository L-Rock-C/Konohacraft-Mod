package net.rock.konohacraftmod.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.rock.konohacraftmod.KonohacraftMod;

public class ModTags {
    public static class Blocks{
        //public static final TagKey<Block> TAG_BLOCK_NAME = tag("tag_name");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(KonohacraftMod.MOD_ID));
        }
    }

    public static class Items{
        public static final TagKey<Item> JUTSU = tag("jutsu");

        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(KonohacraftMod.MOD_ID));
        }
    }
}
