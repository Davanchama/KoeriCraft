package com.davanchama.koericraft.events.listener;

import com.davanchama.koericraft.init.InitBlocks;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTableLoaderListener {
    public static LootTableLoaderListener INSTANCE = new LootTableLoaderListener();

    private static final Identifier GRASS_LOOT_TABLE_ID = Blocks.GRASS.getLootTableId();

    public void addKoeriSeedsToGrassLoot() {
        LootTableLoadingCallback.EVENT.register(((resourceManager, manager, id, supplier, setter) -> {
            if (GRASS_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder().rolls(ConstantLootNumberProvider.create(1)).with(
                    ItemEntry.builder(InitBlocks.INSTANCE.koeriSeedOne));
                supplier.pool(poolBuilder);
            }
        }));
    }
}
