package com.davanchama.koericraft.blocks.plants;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class KoeriPlantFive extends KoeriPlant{
    public KoeriPlantFive() {
        super(FabricBlockSettings.of(Material.PLANT).noCollision().ticksRandomly().strength(0, 0).sounds(
            BlockSoundGroup.CROP).nonOpaque());
    }
}
