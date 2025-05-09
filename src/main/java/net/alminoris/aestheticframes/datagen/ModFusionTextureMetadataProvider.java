package net.alminoris.aestheticframes.datagen;

import com.supermartijn642.fusion.api.provider.FusionTextureMetadataProvider;
import com.supermartijn642.fusion.api.texture.DefaultTextureTypes;
import com.supermartijn642.fusion.api.texture.data.ConnectingTextureData;
import com.supermartijn642.fusion.api.texture.data.ConnectingTextureLayout;
import net.alminoris.aestheticframes.AestheticFrames;
import net.alminoris.aestheticframes.util.helper.BlockSetsHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Identifier;

public class ModFusionTextureMetadataProvider extends FusionTextureMetadataProvider
{
    public ModFusionTextureMetadataProvider(DataGenerator generator)
    {
        super(AestheticFrames.MOD_ID, generator);
    }

    @Override
    protected void generate()
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                registerPiecedConnectingTextureType(frameName+"frame_"+name);
                registerFullConnectingTextureType(frameName+"scaled_frame_"+name);
            }
        }

        for(String name : BlockSetsHelper.getStones())
        {
            for(String frameName : BlockSetsHelper.FRAME_TYPES)
            {
                registerPiecedConnectingTextureType(frameName+"frame_"+name);
                registerFullConnectingTextureType(frameName+"scaled_frame_"+name);
            }
        }
    }

    private void registerPiecedConnectingTextureType(String name)
    {
        var textureData = ConnectingTextureData.builder()
                .layout(ConnectingTextureLayout.PIECED)
                .build();
        this.addTextureMetadata(
                Identifier.of(AestheticFrames.MOD_ID,"block/"+name),
                DefaultTextureTypes.CONNECTING,
                textureData
        );
    }

    private void registerFullConnectingTextureType(String name)
    {
        var textureData = ConnectingTextureData.builder()
                .layout(ConnectingTextureLayout.FULL)
                .build();
        this.addTextureMetadata(
                Identifier.of(AestheticFrames.MOD_ID,"block/"+name),
                DefaultTextureTypes.CONNECTING,
                textureData
        );
    }
}