package mymod.Dimension_1_Overworld.MakeYourDimension;

import mymod.Main;
import mymod.CodaKidFiles.GlobalRendererParent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.IWorldAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class CustomGlobalRenderer extends GlobalRendererParent implements IWorldAccess, IResourceManagerReloadListener
{
	
	public CustomGlobalRenderer(Minecraft mcIn) {
		super(mcIn);
	}
	
	@Override
	public void renderSky(float partialTicks, int pass)
    {
		
    }
	
}