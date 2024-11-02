package com.drgrass.costumes;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Costumes.MOD_ID);
    public static DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Costumes.MOD_ID);
    public static final List<Supplier<? extends ItemLike>> MC = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> MOVIE = new ArrayList<>();
    public static final List<Supplier<? extends ItemLike>> OTHER = new ArrayList<>();

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        CREATIVE_TABS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Armor
    public static final RegistryObject<ArmorItem> Zookeeper_Helmet = addToOtherTab(ITEMS.register("zookeeperhelmet", () ->
            new ArmorItem(ModArmorMaterial.Cloth, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Zookeeper_Chest = addToOtherTab(ITEMS.register("zookeeperbody", () ->
            new ArmorItem(ModArmorMaterial.Cloth, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Zookeeper_Pants = addToOtherTab(ITEMS.register("zookeeperlegs", () ->
            new ArmorItem(ModArmorMaterial.Cloth, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Zookeeper_bootst = addToOtherTab(ITEMS.register("zookeeperboots", () ->
            new ArmorItem(ModArmorMaterial.Cloth, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Beast_Helmet = addToMovieTab(ITEMS.register("beasthelmet", () ->
            new ArmorItem(ModArmorMaterial.Beast, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Beast_Chest = addToMovieTab(ITEMS.register("beastbody", () ->
            new ArmorItem(ModArmorMaterial.Beast, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Beast_Pants = addToMovieTab(ITEMS.register("beastlegs", () ->
            new ArmorItem(ModArmorMaterial.Beast, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Beast_boots = addToMovieTab(ITEMS.register("beastboots", () ->
            new ArmorItem(ModArmorMaterial.Beast, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Dab_Shirt = addToMCTab(ITEMS.register("dabpolicebody", () ->
            new ArmorItem(ModArmorMaterial.Dab, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bear_Helmet = addToOtherTab(ITEMS.register("bearhelmet", () ->
            new ArmorItem(ModArmorMaterial.Bear, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bear_Chest = addToOtherTab(ITEMS.register("bearbody", () ->
            new ArmorItem(ModArmorMaterial.Bear, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bear_Pants = addToOtherTab(ITEMS.register("bearlegs", () ->
            new ArmorItem(ModArmorMaterial.Bear, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bear_bootst = addToOtherTab(ITEMS.register("bearboots", () ->
            new ArmorItem(ModArmorMaterial.Bear, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bob_Helmet = addToMovieTab(ITEMS.register("bobhelmet", () ->
            new ArmorItem(ModArmorMaterial.Bob, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bob_Chest = addToMovieTab(ITEMS.register("bobbody", () ->
            new ArmorItem(ModArmorMaterial.Bob, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bob_Pants = addToMovieTab(ITEMS.register("boblegs", () ->
            new ArmorItem(ModArmorMaterial.Bob, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Bob_boots = addToMovieTab(ITEMS.register("bobboots", () ->
            new ArmorItem(ModArmorMaterial.Bob, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Deadpool_Helmet = addToMovieTab(ITEMS.register("deadpoolhelmet", () ->
            new ArmorItem(ModArmorMaterial.Dead, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Deadpool_Chest = addToMovieTab(ITEMS.register("deadpoolbody", () ->
                new ArmorItem(ModArmorMaterial.Dead, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Deadpool_Pants = addToMovieTab(ITEMS.register("deadpoollegs", () ->
                new ArmorItem(ModArmorMaterial.Dead, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Deadpool_Boots = addToMovieTab(ITEMS.register("deadpoolboots", () ->
                new ArmorItem(ModArmorMaterial.Dead, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Drgrass_Helmet = addToMCTab(ITEMS.register("doctorgrassarmorhelmet", () ->
                new ArmorItem(ModArmorMaterial.Dr, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Drgrass_Chest = addToMCTab(ITEMS.register("doctorgrassarmorbody", () ->
                new ArmorItem(ModArmorMaterial.Dr, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Drgrass_Leggings = addToMCTab(ITEMS.register("doctorgrasslegs", () ->
                new ArmorItem(ModArmorMaterial.Dr, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Drgrass_Boots = addToMCTab(ITEMS.register("doctorgrassboots", () ->
                new ArmorItem(ModArmorMaterial.Dr, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ginger_Helmet = addToMovieTab(ITEMS.register("gingerbreadhelmet", () ->
                new ArmorItem(ModArmorMaterial.Ginger, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ginger_Chest = addToMovieTab(ITEMS.register("gingerbreadbody", () ->
                new ArmorItem(ModArmorMaterial.Ginger, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ginger_Pants = addToMovieTab(ITEMS.register("gingerbreadlegs", () ->
                new ArmorItem(ModArmorMaterial.Ginger, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ginger_Boots = addToMovieTab(ITEMS.register("gingerbreadboots", () ->
                new ArmorItem(ModArmorMaterial.Ginger, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Hacker_Helmet = addToMCTab(ITEMS.register("hackerhelmet", () ->
                new ArmorItem(ModArmorMaterial.Hack, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Husk_Helmet = addToMCTab(ITEMS.register("huskhelmet", () ->
                new ArmorItem(ModArmorMaterial.Husk, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Husk_Chest = addToMCTab(ITEMS.register("huskbody", () ->
                new ArmorItem(ModArmorMaterial.Husk, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Husk_Pants = addToMCTab(ITEMS.register("husklegs", () ->
                new ArmorItem(ModArmorMaterial.Husk, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jeb_Helmet = addToMCTab(ITEMS.register("jebhelmet", () ->
                new ArmorItem(ModArmorMaterial.Jeb, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jeb_Chest = addToMCTab(ITEMS.register("jebbody", () ->
                new ArmorItem(ModArmorMaterial.Jeb, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jeb_Pants = addToMCTab(ITEMS.register("jeblegs", () ->
                new ArmorItem(ModArmorMaterial.Jeb, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jeb_Boots = addToMCTab(ITEMS.register("jebboots", () ->
                new ArmorItem(ModArmorMaterial.Jeb, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jesse_Helmet = addToMCTab(ITEMS.register("jessehelmet", () ->
                new ArmorItem(ModArmorMaterial.Jesse, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jesse_Chest = addToMCTab(ITEMS.register("jessebody", () ->
                new ArmorItem(ModArmorMaterial.Jesse, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jesse_Pants = addToMCTab(ITEMS.register("jesselegs", () ->
                new ArmorItem(ModArmorMaterial.Jesse, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Jesse_Boots = addToMCTab(ITEMS.register("jesseboots", () ->
                new ArmorItem(ModArmorMaterial.Jesse, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Joker_Helmet = addToMovieTab(ITEMS.register("jokerhelmet", () ->
                new ArmorItem(ModArmorMaterial.Joker, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Joker_Chest = addToMovieTab(ITEMS.register("jokerbody", () ->
                new ArmorItem(ModArmorMaterial.Joker, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Joker_Pants = addToMovieTab(ITEMS.register("jokerlegs", () ->
                new ArmorItem(ModArmorMaterial.Joker, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Joker_Boots = addToMovieTab(ITEMS.register("jokerboots", () ->
                new ArmorItem(ModArmorMaterial.Joker, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> MagmaMusen_Helmet = addToMCTab(ITEMS.register("magmamusenhelmet", () ->
                new ArmorItem(ModArmorMaterial.Magma, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Mario_Helmet = addToMovieTab(ITEMS.register("mariohelmet", () ->
                new ArmorItem(ModArmorMaterial.Mario, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Mario_Chest = addToMovieTab(ITEMS.register("mariobody", () ->
                new ArmorItem(ModArmorMaterial.Mario, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Mario_Pants = addToMovieTab(ITEMS.register("mariolegs", () ->
                new ArmorItem(ModArmorMaterial.Mario, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Mario_Boots = addToMovieTab(ITEMS.register("marioboots", () ->
                new ArmorItem(ModArmorMaterial.Mario, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Messi_Chest = addToOtherTab(ITEMS.register("messibody", () ->
                new ArmorItem(ModArmorMaterial.Messi, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Messi_Pants = addToOtherTab(ITEMS.register("messilegs", () ->
                new ArmorItem(ModArmorMaterial.Messi, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Messi_Boots = addToOtherTab(ITEMS.register("messiboots", () ->
                new ArmorItem(ModArmorMaterial.Messi, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Micky_Helmet = addToMovieTab(ITEMS.register("mickeymousehelmet", () ->
                new ArmorItem(ModArmorMaterial.Micky, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Micky_Chest = addToMovieTab(ITEMS.register("mickeymousebody", () ->
                new ArmorItem(ModArmorMaterial.Micky, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Micky_Pants = addToMovieTab(ITEMS.register("mickeymouselegs", () ->
                new ArmorItem(ModArmorMaterial.Micky, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Micky_Boots = addToMovieTab(ITEMS.register("mickeymouseboots", () ->
                new ArmorItem(ModArmorMaterial.Micky, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Mumbo_Helmet = addToMCTab(ITEMS.register("mumbohelmet", () ->
                new ArmorItem(ModArmorMaterial.Mumbo, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ninja_Mask = addToOtherTab(ITEMS.register("ninjahelmet", () ->
                new ArmorItem(ModArmorMaterial.Ninja, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ninja_Chest = addToOtherTab(ITEMS.register("ninjabody", () ->
                new ArmorItem(ModArmorMaterial.Ninja, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ninja_Pants = addToOtherTab(ITEMS.register("ninjalegs", () ->
                new ArmorItem(ModArmorMaterial.Ninja, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ninja_Boots = addToOtherTab(ITEMS.register("ninjaboots", () ->
                new ArmorItem(ModArmorMaterial.Ninja, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Notch_Chest = addToMCTab(ITEMS.register("notchbody", () ->
                new ArmorItem(ModArmorMaterial.Notch, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Notch_Pants = addToMCTab(ITEMS.register("notchlegs", () ->
                new ArmorItem(ModArmorMaterial.Notch, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Notch_Boots = addToMCTab(ITEMS.register("notchboots", () ->
                new ArmorItem(ModArmorMaterial.Notch, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Pink_Sheep_Helmet = addToMCTab(ITEMS.register("pinksheephelmet", () ->
                new ArmorItem(ModArmorMaterial.Pink_Sheep, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Pink_Sheep_Chest = addToMCTab(ITEMS.register("pinksheepbody", () ->
                new ArmorItem(ModArmorMaterial.Pink_Sheep, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Pink_Sheep_Legs = addToMCTab(ITEMS.register("pinksheeplegs", () ->
                new ArmorItem(ModArmorMaterial.Pink_Sheep, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ralph_Chest = addToMovieTab(ITEMS.register("ralphbody", () ->
                new ArmorItem(ModArmorMaterial.Ralph, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Ralph_Legs = addToMovieTab(ITEMS.register("ralphlegs", () ->
                new ArmorItem(ModArmorMaterial.Ralph, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Spiderman_Mask = addToMovieTab(ITEMS.register("spidermanhelmet", () ->
                new ArmorItem(ModArmorMaterial.Spiderman, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Spiderman_Chest = addToMovieTab(ITEMS.register("spidermanbody", () ->
                new ArmorItem(ModArmorMaterial.Spiderman, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Spiderman_Pants = addToMovieTab(ITEMS.register("spidermanlegs", () ->
                new ArmorItem(ModArmorMaterial.Spiderman, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Spiderman_Boots = addToMovieTab(ITEMS.register("spidermanboots", () ->
                new ArmorItem(ModArmorMaterial.Spiderman, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Stray_Mask = addToMCTab(ITEMS.register("strayhelmet", () ->
                new ArmorItem(ModArmorMaterial.Stray, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Stray_Chest = addToMCTab(ITEMS.register("straybody", () ->
                new ArmorItem(ModArmorMaterial.Stray, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Stray_Pants = addToMCTab(ITEMS.register("straylegs", () ->
                new ArmorItem(ModArmorMaterial.Stray, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Sully_Mask = addToMovieTab(ITEMS.register("sullyhelmet", () ->
                new ArmorItem(ModArmorMaterial.Sully, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Sully_Chest = addToMovieTab(ITEMS.register("sullybody", () ->
                new ArmorItem(ModArmorMaterial.Sully, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Sully_Pants = addToMovieTab(ITEMS.register("sullylegs", () ->
                new ArmorItem(ModArmorMaterial.Sully, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Sully_Boots = addToMovieTab(ITEMS.register("sullyboots", () ->
                new ArmorItem(ModArmorMaterial.Sully, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Sunglasses_Mask = addToMCTab(ITEMS.register("sunglasseshelmet", () ->
                new ArmorItem(ModArmorMaterial.Sunglasses, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Superman_Chest = addToMovieTab(ITEMS.register("supermanbody", () ->
                new ArmorItem(ModArmorMaterial.Superman, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Superman_Pants = addToMovieTab(ITEMS.register("supermanlegs", () ->
                new ArmorItem(ModArmorMaterial.Superman, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Superman_Boots = addToMovieTab(ITEMS.register("supermanboots", () ->
                new ArmorItem(ModArmorMaterial.Superman, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> TDM_Mask = addToMCTab(ITEMS.register("tdmhelmet", () ->
                new ArmorItem(ModArmorMaterial.TDM, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> TDM_Chest = addToMCTab(ITEMS.register("tdmbody", () ->
                new ArmorItem(ModArmorMaterial.TDM, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> TDM_Pants = addToMCTab(ITEMS.register("tdmlegs", () ->
                new ArmorItem(ModArmorMaterial.TDM, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> TDM_Boots = addToMCTab(ITEMS.register("tdmboots", () ->
                new ArmorItem(ModArmorMaterial.TDM, ArmorItem.Type.BOOTS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Troll_Mask = addToMCTab(ITEMS.register("trollhelmet", () ->
                new ArmorItem(ModArmorMaterial.Troll, ArmorItem.Type.HELMET, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Troll_Chest = addToMCTab(ITEMS.register("trollbody", () ->
                new ArmorItem(ModArmorMaterial.Troll, ArmorItem.Type.CHESTPLATE, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Troll_Pants = addToMCTab(ITEMS.register("trolllegs", () ->
                new ArmorItem(ModArmorMaterial.Troll, ArmorItem.Type.LEGGINGS, new Item.Properties())));
    public static final RegistryObject<ArmorItem> Troll_Boots = addToMCTab(ITEMS.register("trollboots", () ->
                new ArmorItem(ModArmorMaterial.Troll, ArmorItem.Type.BOOTS, new Item.Properties())));

    //Tabs
    public static final RegistryObject<CreativeModeTab> MC_TAB = CREATIVE_TABS.register("minecraftcostumes", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.minecraftcostumes"))
            .icon(() -> new ItemStack(RegistryHandler.Dab_Shirt.get()))
            .withSearchBar()
            .withBackgroundLocation(new ResourceLocation("textures/gui/container/creative_inventory/tab_item_search.png"))
            .displayItems((type, output) -> {
                MC.forEach(itemLike -> output.accept(itemLike.get()));
            })
            .build());
    public static final RegistryObject<CreativeModeTab> MOVIE_TAB = CREATIVE_TABS.register("moviecostumes", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.moviecostumes"))
            .icon(() -> new ItemStack(RegistryHandler.Bear_Chest.get()))
            .withSearchBar()
            .withBackgroundLocation(new ResourceLocation("textures/gui/container/creative_inventory/tab_item_search.png"))
            .displayItems((type, output) -> {
                MOVIE.forEach(itemLike -> output.accept(itemLike.get()));
            })
            .build());
    public static final RegistryObject<CreativeModeTab> OTHER_TAB = CREATIVE_TABS.register("othercostumes", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.othercostumes"))
            .icon(() -> new ItemStack(RegistryHandler.Zookeeper_Helmet.get()))
            .withSearchBar()
            .withBackgroundLocation(new ResourceLocation("textures/gui/container/creative_inventory/tab_item_search.png"))
            .displayItems((type, output) -> {
                OTHER.forEach(itemLike -> output.accept(itemLike.get()));
            })
            .build());

    public static <I extends Item> RegistryObject<I> addToMCTab(RegistryObject<I> itemLike) {
        MC.add(itemLike);
        return itemLike;
    }

    public static <I extends Item> RegistryObject<I> addToMovieTab(RegistryObject<I> itemLike) {
        MOVIE.add(itemLike);
        return itemLike;
    }

    public static <I extends Item> RegistryObject<I> addToOtherTab(RegistryObject<I> itemLike) {
        OTHER.add(itemLike);
        return itemLike;
    }
}