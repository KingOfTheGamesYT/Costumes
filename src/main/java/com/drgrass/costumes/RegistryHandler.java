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

    public static final RegistryObject<ArmorItem> Husk_Helmet = ITEMS.register("huskhelmet", () ->
            new ArmorItem(ModArmorMaterial.Husk, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Husk_Chest = ITEMS.register("huskbody", () ->
            new ArmorItem(ModArmorMaterial.Husk, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Husk_Pants = ITEMS.register("husklegs", () ->
            new ArmorItem(ModArmorMaterial.Husk, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jeb_Helmet = ITEMS.register("jebhelmet", () ->
            new ArmorItem(ModArmorMaterial.Jeb, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jeb_Chest = ITEMS.register("jebbody", () ->
            new ArmorItem(ModArmorMaterial.Jeb, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jeb_Pants = ITEMS.register("jeblegs", () ->
            new ArmorItem(ModArmorMaterial.Jeb, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jeb_Boots = ITEMS.register("jebboots", () ->
            new ArmorItem(ModArmorMaterial.Jeb, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jesse_Helmet = ITEMS.register("jessehelmet", () ->
            new ArmorItem(ModArmorMaterial.Jesse, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jesse_Chest = ITEMS.register("jessebody", () ->
            new ArmorItem(ModArmorMaterial.Jesse, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jesse_Pants = ITEMS.register("jesselegs", () ->
            new ArmorItem(ModArmorMaterial.Jesse, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Jesse_Boots = ITEMS.register("jesseboots", () ->
            new ArmorItem(ModArmorMaterial.Jesse, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Joker_Helmet = ITEMS.register("jokerhelmet", () ->
            new ArmorItem(ModArmorMaterial.Joker, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Joker_Chest = ITEMS.register("jokerbody", () ->
            new ArmorItem(ModArmorMaterial.Joker, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Joker_Pants = ITEMS.register("jokerlegs", () ->
            new ArmorItem(ModArmorMaterial.Joker, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Joker_boots = ITEMS.register("jokerboots", () ->
            new ArmorItem(ModArmorMaterial.Joker, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> MagmaMusen_Helmet = ITEMS.register("magmamusenhelmet", () ->
            new ArmorItem(ModArmorMaterial.Magma, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.MC)));

    public static final RegistryObject<ArmorItem> Mario_Helmet = ITEMS.register("mariohelmet", () ->
            new ArmorItem(ModArmorMaterial.Mario, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Mario_Chest = ITEMS.register("mariobody", () ->
            new ArmorItem(ModArmorMaterial.Mario, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Mario_Pants = ITEMS.register("mariolegs", () ->
            new ArmorItem(ModArmorMaterial.Mario, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Mario_boots = ITEMS.register("marioboots", () ->
            new ArmorItem(ModArmorMaterial.Mario, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Messi_Chest = ITEMS.register("messibody", () ->
            new ArmorItem(ModArmorMaterial.Messi, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Messi_Pants = ITEMS.register("messilegs", () ->
            new ArmorItem(ModArmorMaterial.Messi, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Messi_bootst = ITEMS.register("messiboots", () ->
            new ArmorItem(ModArmorMaterial.Messi, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Other)));

    public static final RegistryObject<ArmorItem> Micky_Helmet = ITEMS.register("mickeymousehelmet", () ->
            new ArmorItem(ModArmorMaterial.Micky, EquipmentSlotType.HEAD, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Micky_Chest = ITEMS.register("mickeymousebody", () ->
            new ArmorItem(ModArmorMaterial.Micky, EquipmentSlotType.CHEST, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Micky_Pants = ITEMS.register("mickeymouselegs", () ->
            new ArmorItem(ModArmorMaterial.Micky, EquipmentSlotType.LEGS, new Item.Properties().group(Costumes.Movie)));

    public static final RegistryObject<ArmorItem> Micky_boots = ITEMS.register("mickeymouseboots", () ->
            new ArmorItem(ModArmorMaterial.Micky, EquipmentSlotType.FEET, new Item.Properties().group(Costumes.Movie)));

}
