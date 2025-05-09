package net.alminoris.aestheticframes.datagen;

import com.supermartijn642.fusion.api.model.DefaultModelTypes;
import com.supermartijn642.fusion.api.model.ModelInstance;
import com.supermartijn642.fusion.api.model.data.ConnectingModelDataBuilder;
import com.supermartijn642.fusion.api.predicate.DefaultConnectionPredicates;
import com.supermartijn642.fusion.api.provider.FusionModelProvider;
import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.block.ModBlocks;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.util.Identifier;

public class ModFusionModelProvider extends FusionModelProvider
{
    public ModFusionModelProvider(FabricDataOutput output)
    {
        super(AestheticFrames.MOD_ID, output);
    }

    @Override
    protected void generate()
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                registerConnectingModel(frameName+"frame_"+name);
            }

            for(String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
            {
                registerConnectingModel(frameName+"scaled_frame_"+name);
            }
        }

        for(String name : BlockSetsHelper.getStones())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                registerConnectingModel(frameName+"frame_"+name);
            }

            for(String frameName : BlockSetsHelper.SCALED_FRAME_TYPES)
            {
                registerConnectingModel(frameName+"scaled_frame_"+name);
            }
        }
    }

    private void registerConnectingModel(String name)
    {
        var modelData = ConnectingModelDataBuilder.builder()
                .parent(Identifier.of("minecraft", "block/cube_all"))
                .texture("all", Identifier.of(AestheticFrames.MOD_ID, "block/"+name))
                .connection(DefaultConnectionPredicates.isSameBlock())
                .build();
        var modelInstance = ModelInstance.of(DefaultModelTypes.CONNECTING, modelData);
        this.addModel(Identifier.of(AestheticFrames.MOD_ID, "block/"+name), modelInstance);
    }
}
