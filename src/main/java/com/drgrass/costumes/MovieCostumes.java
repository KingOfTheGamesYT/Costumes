package com.drgrass.costumes;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MovieCostumes extends ItemGroup {
    public MovieCostumes() {
        super("moviecostumes");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.Beast_Chest.get());
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }


    @OnlyIn(Dist.CLIENT)
    @Override
    public ResourceLocation getBackgroundImage() {
        return new ResourceLocation( "textures/gui/container/creative_inventory/tab_item_search.png");
    }

    @Override
    public ResourceLocation getTabsImage() {
        return new ResourceLocation("textures/gui/container/creative_inventory/tabs.png");
    }
}
