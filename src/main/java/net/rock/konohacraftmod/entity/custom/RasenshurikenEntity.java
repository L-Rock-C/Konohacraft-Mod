package net.rock.konohacraftmod.entity.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.rock.konohacraftmod.entity.ModEntities;
import net.rock.konohacraftmod.item.ModItems;

public class RasenshurikenEntity extends ThrowableItemProjectile {

    public RasenshurikenEntity(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public RasenshurikenEntity(Level pLevel) {
        super(ModEntities.RASENSHURIKEN.get(), pLevel);
    }
    public RasenshurikenEntity(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.RASENSHURIKEN.get(), livingEntity, pLevel);
    }

    @Override
    protected Item getDefaultItem() {
        return ModItems.RASENSHURIKEN.get();
    }

    @Override
    protected void onHit(HitResult pResult) {
        if (!this.level().isClientSide()) {
            sendSystemMessage(Component.literal("Using Rasenshuriken"));
        }

        super.onHit(pResult);
    }
}
