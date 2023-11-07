package net.hinno.smelting_expansion.item;

import net.minecraft.world.entity.vehicle.AbstractMinecart;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.MinecartItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Items.*;

public class vanillaItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create (ForgeRegistries.ITEMS, "minecraft");

    public static final RegistryObject<Item> CHEST_MINECART = ITEMS.register ("chest_minecart",
            () -> new MinecartItem (AbstractMinecart.Type.CHEST, (new Item.Properties ()).craftRemainder (MINECART).stacksTo (1)));

    public static final RegistryObject<Item> HOPPER_MINECART = ITEMS.register ("hopper_minecart",
            () -> new MinecartItem (AbstractMinecart.Type.CHEST, (new Item.Properties ()).craftRemainder (MINECART).stacksTo (1)));

    public static final RegistryObject<Item> FURNACE_MINECART = ITEMS.register ("furnace_minecart",
            () -> new MinecartItem (AbstractMinecart.Type.CHEST, (new Item.Properties ()).craftRemainder (MINECART).stacksTo (1)));

    public static final RegistryObject<Item> OAK_CHEST_BOAT = ITEMS.register("oak_chest_boat",
            () ->  new BoatItem(true, Boat.Type.OAK, (new Item.Properties()).craftRemainder (OAK_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> SPRUCE_CHEST_BOAT = ITEMS.register("spruce_chest_boat",
            () ->  new BoatItem(true, Boat.Type.SPRUCE, (new Item.Properties()).craftRemainder (SPRUCE_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> BIRCH_CHEST_BOAT = ITEMS.register ("birch_chest_boat",
            () ->  new BoatItem(true, Boat.Type.BIRCH, (new Item.Properties()).craftRemainder (BIRCH_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> JUNGLE_CHEST_BOAT = ITEMS.register("jungle_chest_boat",
            () ->   new BoatItem(true, Boat.Type.JUNGLE, (new Item.Properties()).craftRemainder (JUNGLE_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> ACACIA_CHEST_BOAT = ITEMS.register("acacia_chest_boat",
            () ->  new BoatItem(true, Boat.Type.ACACIA, (new Item.Properties()).craftRemainder (ACACIA_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> CHERRY_CHEST_BOAT = ITEMS.register("cherry_chest_boat",
            () ->  new BoatItem(true, Boat.Type.CHERRY, (new Item.Properties()).craftRemainder (CHERRY_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> DARK_OAK_CHEST_BOAT = ITEMS.register("dark_oak_chest_boat",
            () ->   new BoatItem(true, Boat.Type.DARK_OAK, (new Item.Properties()).craftRemainder (DARK_OAK_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> MANGROVE_CHEST_BOAT = ITEMS.register("mangrove_chest_boat",
            () ->  new BoatItem(true, Boat.Type.MANGROVE, (new Item.Properties()).craftRemainder (MANGROVE_BOAT).stacksTo(1)));

    public static final RegistryObject<Item> BAMBOO_CHEST_RAFT = ITEMS.register("bamboo_chest_raft",
            () ->   new BoatItem(true, Boat.Type.BAMBOO, (new Item.Properties()).craftRemainder (BAMBOO_RAFT).stacksTo(1)));

}
