package com.davanchama.koericraft;

import com.davanchama.koericraft.events.listener.LootTableLoaderListener;
import com.davanchama.koericraft.init.InitBlocks;
import com.davanchama.koericraft.init.InitItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.util.registry.Registry;

import java.util.EventListener;

public class KoeriCraft implements ModInitializer {
    public static final String MOD_ID = "koeri";

    @Override
    public void onInitialize() {
        InitItems.INSTANCE.registerItems();
        InitBlocks.INSTANCE.registerBlocks();
        LootTableLoaderListener.INSTANCE.addKoeriSeedsToGrassLoot();
    }

}
