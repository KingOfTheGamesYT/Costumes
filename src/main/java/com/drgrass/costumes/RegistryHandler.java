package com.drgrass.costumes;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Costumes.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Armor
    public static final RegistryObject<ArmorItem> Zookeeper_Helmet = ITEMS.register("zookeeperhelmet", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Zookeeper_Chest = ITEMS.register("zookeeperbody", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Zookeeper_Pants = ITEMS.register("zookeeperlegs", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Zookeeper_bootst = ITEMS.register("zookeeperboots", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Beast_Helmet = ITEMS.register("beasthelmet", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Beast_Chest = ITEMS.register("beastbody", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Beast_Pants = ITEMS.register("beastlegs", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Beast_boots = ITEMS.register("beastboots", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Dab_Shirt = ITEMS.register("dabpolicebody", () ->
            new ArmorItem(ModArmorMaterial.Dab, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Bear_Helmet = ITEMS.register("bearhelmet", () ->
            new ArmorItem(ModArmorMaterial.Bear, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Bear_Chest = ITEMS.register("bearbody", () ->
            new ArmorItem(ModArmorMaterial.Bear, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Bear_Pants = ITEMS.register("bearlegs", () ->
            new ArmorItem(ModArmorMaterial.Bear, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Bear_bootst = ITEMS.register("bearboots", () ->
            new ArmorItem(ModArmorMaterial.Bear, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Bob_Helmet = ITEMS.register("bobhelmet", () ->
            new ArmorItem(ModArmorMaterial.Bob, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Bob_Chest = ITEMS.register("bobbody", () ->
            new ArmorItem(ModArmorMaterial.Bob, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Bob_Pants = ITEMS.register("boblegs", () ->
            new ArmorItem(ModArmorMaterial.Bob, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Bob_boots = ITEMS.register("bobboots", () ->
            new ArmorItem(ModArmorMaterial.Bob, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Deadpool_Helmet = ITEMS.register("deadpoolhelmet", () ->
            new ArmorItem(ModArmorMaterial.Dead, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Deadpool_Chest = ITEMS.register("deadpoolbody", () ->
            new ArmorItem(ModArmorMaterial.Dead, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Deadpool_Pants = ITEMS.register("deadpoollegs", () ->
            new ArmorItem(ModArmorMaterial.Dead, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Deadpool_boots = ITEMS.register("deadpoolboots", () ->
            new ArmorItem(ModArmorMaterial.Dead, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Drgrass_Helmet = ITEMS.register("doctorgrassarmorhelmet", () ->
            new ArmorItem(ModArmorMaterial.Dr, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Drgrass = ITEMS.register("doctorgrassarmorbody", () ->
            new ArmorItem(ModArmorMaterial.Dr, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Drgrass_Leggings = ITEMS.register("doctorgrasslegs", () ->
            new ArmorItem(ModArmorMaterial.Dr, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Drgrass_boots = ITEMS.register("doctorgrassboots", () ->
            new ArmorItem(ModArmorMaterial.Dr, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Ginger_Helmet = ITEMS.register("gingerbreadhelmet", () ->
            new ArmorItem(ModArmorMaterial.Ginger, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Ginger_Chest = ITEMS.register("gingerbreadbody", () ->
            new ArmorItem(ModArmorMaterial.Ginger, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Ginger_Pants = ITEMS.register("gingerbreadlegs", () ->
            new ArmorItem(ModArmorMaterial.Ginger, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Ginger_boots = ITEMS.register("gingerbreadboots", () ->
            new ArmorItem(ModArmorMaterial.Ginger, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Hacker_Helmet = ITEMS.register("hackerhelmet", () ->
            new ArmorItem(ModArmorMaterial.Hack, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.MC)));


}
