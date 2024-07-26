package net.rock.konohacraftmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rock.konohacraftmod.KonohacraftMod;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KonohacraftMod.MOD_ID);

    public static final RegistryObject<Item> METALPLATE = ITEMS.register("metalplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLDPLATE = ITEMS.register("goldplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMONDPLATE = ITEMS.register("diamondplate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITEPLATE = ITEMS.register("netheriteplate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SHURIKEN = ITEMS.register("shuriken",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KUNAI = ITEMS.register("kunai",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
