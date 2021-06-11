package com.drgrass.costumes;


import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;


public enum ModArmorMaterial implements IArmorMaterial {

    Cloth(Costumes.MOD_ID + ":zookeeper", 400, new int[] { 2, 5, 6, 2 }, 40,
             SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Beast(Costumes.MOD_ID + ":beast", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Dab(Costumes.MOD_ID + ":dab_police", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Bear(Costumes.MOD_ID + ":bear", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Bob(Costumes.MOD_ID + ":bob", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Dead(Costumes.MOD_ID + ":deapool", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Dr(Costumes.MOD_ID + ":doctorgrass", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Ginger(Costumes.MOD_ID + ":ginger", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Hack(Costumes.MOD_ID + ":hacker", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Husk(Costumes.MOD_ID + ":husk", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Jeb(Costumes.MOD_ID + ":jeb", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Jesse(Costumes.MOD_ID + ":jesse", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F),

    Joker(Costumes.MOD_ID + ":joker", 400, new int[] { 2, 5, 6, 2 }, 40,
    SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);


    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11, 16, 15, 13};
    private final String name;
    private final int maxDamageFactor;
    private final int[]damageReductionArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;

ModArmorMaterial(String name, int maxDamageFactor, int[]damageReductionArray, int enchantability,
                 SoundEvent soundEvent, Float toughness) {
this.name = name;
this.maxDamageFactor = maxDamageFactor;
this.damageReductionArray = damageReductionArray;
this.enchantability = enchantability;
this.soundEvent = soundEvent;
this.toughness = toughness;
}

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return null;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
