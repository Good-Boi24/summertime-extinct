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

    public static final RegistryObject<Item> DNA_DEINOCHEIRUS = ITEMS.register("dna_deinocheirus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DNA_SHONISAURUS = ITEMS.register("dna_shonisaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DNA_SPINOSAURUS = ITEMS.register("dna_spinosaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DNA_HATZEGOPTERYX = ITEMS.register("dna_hatzegopteryx",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DNA_PELAGORNIS = ITEMS.register("dna_pelagornis",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MANGO = ITEMS.register("mango",
            () -> new Item(new Item.Properties().food(ModFoods.MANGO)));

    public static final RegistryObject<Item> FOSSIL_DEINOCHEIRUS = ITEMS.register("fossil_deinocheirus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOSSIL_SHONISAURUS = ITEMS.register("fossil_shonisaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOSSIL_SPINOSAURUS = ITEMS.register("fossil_spinosaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOSSIL_PELAGORNIS = ITEMS.register("fossil_pelagornis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOSSIL_HATZEGOPTERYX = ITEMS.register("fossil_hatzegopteryx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRUSHEDFOSSIL_DEINOCHEIRUS = ITEMS.register("crushedfossil_deinocheirus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSIL_SHONISAURUS = ITEMS.register("crushedfossil_shonisaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSIL_SPINOSAURUS = ITEMS.register("crushedfossil_spinosaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSIL_PELAGORNIS = ITEMS.register("crushedfossil_pelagornis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSIL_HATZEGOPTERYX = ITEMS.register("crushedfossil_hatzegopteryx",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRUSHEDFOSSILPILE_DEINOCHEIRUS = ITEMS.register("crushedfossilpile_deinocheirus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSILPILE_SHONISAURUS = ITEMS.register("crushedfossilpile_shonisaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSILPILE_SPINOSAURUS = ITEMS.register("crushedfossilpile_spinosaurus",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSILPILE_PELAGORNIS = ITEMS.register("crushedfossilpile_pelagornis",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHEDFOSSILPILE_HATZEGOPTERYX = ITEMS.register("crushedfossilpile_hatzegopteryx",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}