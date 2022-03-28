package com.davanchama.koericraft.items.powders;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class KoeriPowder extends Item {
    public KoeriPowder() {
        super(new FabricItemSettings().group(ItemGroup.FOOD));
    }
}
