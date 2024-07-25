package net.rock.konohacraftmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.rock.konohacraftmod.KonohacraftMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KonohacraftMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KONOHACRAFT_TAB = CREATIVE_MODE_TABS.register("konohacraft_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEELPLATE.get()))
                            .title(Component.translatable("creativetab.konogacraft_tab"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.STEELPLATE.get());
                                // item to creativetable
                            })
                            .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
