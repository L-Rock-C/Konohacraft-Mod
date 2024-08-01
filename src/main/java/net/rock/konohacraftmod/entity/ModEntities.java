package net.rock.konohacraftmod.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rock.konohacraftmod.KonohacraftMod;
import net.rock.konohacraftmod.entity.custom.RasenshurikenEntity;

public class ModEntities{
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KonohacraftMod.MOD_ID);

    public static final RegistryObject<EntityType<RasenshurikenEntity>> RASENSHURIKEN =
            ENTITY_TYPES.register("rasenshuriken", () -> EntityType.Builder.<RasenshurikenEntity>of(RasenshurikenEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("rasenshuriken"));


    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
