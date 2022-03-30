package com.davanchama.koericraft.init;

import com.davanchama.koericraft.KoeriCraft;
import com.davanchama.koericraft.blocks.plants.*;
import com.davanchama.koericraft.items.seeds.KoeriSeed;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.CropBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * A utility class that initialises all blocks of this mod.
 */
public class InitBlocks {
    public static InitBlocks INSTANCE = new InitBlocks();

    public CropBlock koeriPlantOne = new KoeriPlantOne();
    public CropBlock koeriPlantTwo = new KoeriPlantTwo();
    public CropBlock koeriPlantThree = new KoeriPlantThree();
    public CropBlock koeriPlantFour = new KoeriPlantFour();
    public CropBlock koeriPlantFive = new KoeriPlantFive();
    public CropBlock koeriPlantSix = new KoeriPlantSix();

    public KoeriSeed koeriSeedOne = new KoeriSeed(koeriPlantOne, new Item.Settings().group(ItemGroup.FOOD));
    public KoeriSeed koeriSeedTwo = new KoeriSeed(koeriPlantTwo, new Item.Settings().group(ItemGroup.FOOD));
    public KoeriSeed koeriSeedThree = new KoeriSeed(koeriPlantThree, new Item.Settings().group(ItemGroup.FOOD));
    public KoeriSeed koeriSeedFour = new KoeriSeed(koeriPlantFour, new Item.Settings().group(ItemGroup.FOOD));
    public KoeriSeed koeriSeedFive = new KoeriSeed(koeriPlantFive, new Item.Settings().group(ItemGroup.FOOD));
    public KoeriSeed koeriSeedSix = new KoeriSeed(koeriPlantSix, new Item.Settings().group(ItemGroup.FOOD));

    public void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_one"), koeriPlantOne);
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_two"), koeriPlantTwo);
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_three"), koeriPlantThree);
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_four"), koeriPlantFour);
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_five"), koeriPlantFive);
        Registry.register(Registry.BLOCK, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_six"), koeriPlantSix);

        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_one_seeds"), koeriSeedOne);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_two_seeds"), koeriSeedTwo);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_three_seeds"), koeriSeedThree);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_four_seeds"), koeriSeedFour);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_five_seeds"), koeriSeedFive);
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_plant_six_seeds"), koeriSeedSix);
    }
}
