package com.kyraltre.tretackshop.util;


import com.alaharranhonor.swem.forge.util.DualDyeableItem;
import com.kyraltre.tretackshop.TreTackShop;
import com.kyraltre.tretackshop.item.DyeablePastureBlanketItem;
import com.kyraltre.tretackshop.registry.TackShopItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.awt.event.ItemListener;

@Mod.EventBusSubscriber(modid= TreTackShop.MOD_ID, bus= Mod.EventBusSubscriber.Bus.FORGE)
public class EventHandler {

    @SubscribeEvent
    public static void registerItemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, tint) -> tint > 0 ? -1 : ((DyeableTackItem) stack.getItem()).getColor(stack),
                TackShopItems.PASTURE_BLANKET_DYEABLE.get());
    }
}
