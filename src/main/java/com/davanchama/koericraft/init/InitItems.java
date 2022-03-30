package com.davanchama.koericraft.init;

import com.davanchama.koericraft.KoeriCraft;
import com.davanchama.koericraft.items.powders.*;
import com.davanchama.koericraft.items.seeds.KoeriSeed;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

/**
 * A utility class that registers all items of this mod.
 * @author Davanchama
 */
public class InitItems {

    public static InitItems INSTANCE = new InitItems();

    /**
     * Registers the items of KoeriCraft.
     */
    public void registerItems() {
        // registers six different koeri powders
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_powder_one"), new KoeriPowderOne());
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_powder_two"), new KoeriPowderTwo());
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_powder_three"), new KoeriPowderThree());
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_powder_four"), new KoeriPowderFour());
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_powder_five"), new KoeriPowderFive());
        Registry.register(Registry.ITEM, new Identifier(KoeriCraft.MOD_ID, "koeri_powder_six"), new KoeriPowderSix());

    }
}
