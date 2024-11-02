package com.drgrass.costumes;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ArmorItem.Type;

public enum ModArmorMaterial implements ArmorMaterial {

    Cloth(Costumes.MOD_ID + ":zookeeper", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Beast(Costumes.MOD_ID + ":beast", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Dab(Costumes.MOD_ID + ":dab_police", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Bear(Costumes.MOD_ID + ":bear", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Bob(Costumes.MOD_ID + ":bob", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Dead(Costumes.MOD_ID + ":deapool", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Dr(Costumes.MOD_ID + ":doctorgrass", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Ginger(Costumes.MOD_ID + ":ginger", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Hack(Costumes.MOD_ID + ":hacker", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Husk(Costumes.MOD_ID + ":husk", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Jeb(Costumes.MOD_ID + ":jeb", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Jesse(Costumes.MOD_ID + ":jesse", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Joker(Costumes.MOD_ID + ":joker", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Magma(Costumes.MOD_ID + ":magma_musen", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Mario(Costumes.MOD_ID + ":mario", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Messi(Costumes.MOD_ID + ":messi", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Micky(Costumes.MOD_ID + ":mouse", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Mumbo(Costumes.MOD_ID + ":mumbo", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Ninja(Costumes.MOD_ID + ":ninja", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Notch(Costumes.MOD_ID + ":notch", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Pink_Sheep(Costumes.MOD_ID + ":pink_sheep", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Ralph(Costumes.MOD_ID + ":ralph", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Spiderman(Costumes.MOD_ID + ":spiderman", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Stray(Costumes.MOD_ID + ":stray", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Sully(Costumes.MOD_ID + ":sully", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Sunglasses(Costumes.MOD_ID + ":sunglasses", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Superman(Costumes.MOD_ID + ":superman", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    TDM(Costumes.MOD_ID + ":tdm", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F),
    Troll(Costumes.MOD_ID + ":troll", 400, new int[]{2, 5, 6, 2}, 40,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F);

    private static final int[] DURABILITY_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;

    ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantability,
                     SoundEvent equipSound, float toughness) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
    }

    @Override
    public int getDurabilityForType(Type type) {
        return DURABILITY_PER_SLOT[type.getSlot().getIndex()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(Type type) {
        return this.protectionAmounts[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(Items.AIR);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}