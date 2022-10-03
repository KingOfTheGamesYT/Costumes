package com.drgrass.costumes;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class OtherCostumes extends ItemGroup {
    public OtherCostumes() {
        super("othercostumes");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(RegistryHandler.Zookeeper_Helmet.get());
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
