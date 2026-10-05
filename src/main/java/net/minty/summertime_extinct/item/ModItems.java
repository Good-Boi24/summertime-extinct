package net.minty.summertime_extinct.item;

import net.minty.summertime_extinct.SummertimeExtinct;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SummertimeExtinct.MODID);

    public static final RegistryObject<Item> DNA_BOTTLE = ITEMS.register("dna_bottle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOSSIL_DEINOCHEIRUS = ITEMS.register("fossil_deinocheirus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOSSIL_SHONISAURUS = ITEMS.register("fossil_shonisaurus",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}