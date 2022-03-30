package com.davanchama.koericraft;

import com.davanchama.koericraft.rendering.BlockRenderUtil;
import net.fabricmc.api.ClientModInitializer;

public class KoeriClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderUtil renderer = new BlockRenderUtil();
        renderer.defineRenders();
    }
}
