package mymod.Dimension_1_Overworld.MakeYourDimension;

import mymod.CodaKidFiles.CustomPortalParent;
import net.minecraft.block.Block;
import net.minecraft.util.EnumParticleTypes;

public class CustomPortal extends CustomPortalParent {
	public CustomPortal() {
		
		super(EnumParticleTypes.CRIT_MAGIC);
		this.setUnlocalizedName("myOverworldPortal");
		
	}

}
