package net.minty.summertime_extinct.entity;

import net.minty.summertime_extinct.SummertimeExtinct;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.entity.MobCategory;
import net.minty.summertime_extinct.entity.custom.DeinocheirusEntity;


public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
        DeferredRegister.create(ForgeRegistries.ENTITIES, SummertimeExtinct.MOD_ID);

    public static final RegistryObject<EntityType<DeinocheirusEntity>> DEINOCHEIRUS =
        ENTITY_TYPES.register("deinocheirus", () -> EntityType.Builder.of(DeinocheirusEntity::new, MobCategory.CREATURE)
            .sized(3.0f, 4.0f)
            .build("deinocheirus"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
