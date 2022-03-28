package com.davanchama.koericraft.init;

import com.davanchama.koericraft.KoeriCraft;
import com.davanchama.koericraft.blocks.plants.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.CropBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * A utility class that initialises all blocks of this mod.
 */
public class InitBlocks {
    public CropBlock koeriPlantOne = new KoeriPlantOne();
    public CropBlock koeriPlantTwo = new KoeriPlantTwo();
    public CropBlock koeriPlantThree = new KoeriPlantThree();
    public CropBlock koeriPlantFour = new KoeriPlantFour();
    public CropBlock koeriPlantFive = new KoeriPlantFive();
    public CropBlock koeriPlantSix = new KoeriPlantSix();

    public void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_one"), koeriPlantOne);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_one"), new BlockItem(koeriPlantOne, new FabricItemSettings().group(
          ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_two"), koeriPlantTwo);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_two"), new BlockItem(koeriPlantTwo, new FabricItemSettings().group(
            ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_three"), koeriPlantThree);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_three"), new BlockItem(koeriPlantThree, new FabricItemSettings().group(
            ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_four"), koeriPlantFour);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_four"), new BlockItem(koeriPlantFour, new FabricItemSettings().group(
            ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_five"), koeriPlantFive);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_five"), new BlockItem(koeriPlantFive, new FabricItemSettings().group(
            ItemGroup.BUILDING_BLOCKS)));
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_six"), koeriPlantSix);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_six"), new BlockItem(koeriPlantSix, new FabricItemSettings().group(
            ItemGroup.BUILDING_BLOCKS)));
    }
}
