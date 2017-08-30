package mymod.Dimension_1_Overworld.MakeYourDimension;

import mymod.Main;
import mymod.CodaKidFiles.CustomWorldProviderParent;
import net.minecraft.world.biome.WorldChunkManager;
import mymod.CodaKidFiles.WorldChunkManagerCK;

public class CustomOverworldProvider extends CustomWorldProviderParent {
	
	@Override                                                                                    
	public void registerWorldChunkManager() {
		
		this.dimensionId = Main.overworldId;
		this.worldChunkMgr = new WorldChunkManagerCK(Main.myBiome);
		
	}

}
