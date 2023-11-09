package com.kyraltre.tretackshop.item;

import com.alaharranhonor.swem.forge.items.SWEMHorseArmorItem;
import com.alaharranhonor.swem.forge.items.tack.PastureBlanketItem;
import com.kyraltre.tretackshop.util.DyeableTackItem;
import net.minecraft.world.item.DyeableLeatherItem;
import net.minecraft.world.item.Item;

public class DyeablePastureBlanketItem extends PastureBlanketItem implements DyeableTackItem {
    public DyeablePastureBlanketItem(SWEMHorseArmorItem.HorseArmorTier tier, int armorValue, String texture, Item.Properties builder) {
        super(tier, armorValue, texture, builder);
    }

}
