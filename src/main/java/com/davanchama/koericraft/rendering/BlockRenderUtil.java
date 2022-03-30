package com.davanchama.koericraft.rendering;

import com.davanchama.koericraft.init.InitBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class BlockRenderUtil {

    public void defineRenders() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.INSTANCE.koeriPlantOne);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.INSTANCE.koeriPlantTwo);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.INSTANCE.koeriPlantThree);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.INSTANCE.koeriPlantFour);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.INSTANCE.koeriPlantFive);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), InitBlocks.INSTANCE.koeriPlantSix);
    }
}
