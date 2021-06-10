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
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.HEAD, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Zookeeper_Chest = ITEMS.register("zookeeperbody", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.CHEST, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Zookeeper_Pants = ITEMS.register("zookeeperlegs", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.LEGS, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Zookeeper_bootst = ITEMS.register("zookeeperboots", () ->
            new ArmorItem(ModArmorMaterial.Cloth, EquipmentSlotType.FEET, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Beast_Helmet = ITEMS.register("beasthelmet", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.HEAD, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Beast_Chest = ITEMS.register("beastbody", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.CHEST, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Beast_Pants = ITEMS.register("beastlegs", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.LEGS, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Beast_boots = ITEMS.register("beastboots", () ->
            new ArmorItem(ModArmorMaterial.Beast, EquipmentSlotType.FEET, new Item.Properties()));//.group(DangerZone.ARMOR)));

    public static final RegistryObject<ArmorItem> Dab_Shirt = ITEMS.register("dabpolicebody", () ->
            new ArmorItem(ModArmorMaterial.Dab, EquipmentSlotType.CHEST, new Item.Properties()));//.group(DangerZone.ARMOR)));

}
