package com.davanchama.koericraft;

import com.davanchama.koericraft.init.InitBlocks;
import com.davanchama.koericraft.init.InitItems;
import net.fabricmc.api.ModInitializer;

public class KoeriCraft implements ModInitializer {
    public static final String MOD_ID = "koeri";

    @Override
    public void onInitialize() {
        //TODO: fix "Some intrusive holders were not added to registry"
        InitItems initItems = new InitItems();
        initItems.registerItems();
        InitBlocks initBlocks = new InitBlocks();
        initBlocks.registerBlocks();
    }
}
