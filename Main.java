/*************************************************************
 ****************CODAKID MINECRAFT MODDING********************
 *************************************************************/

package mymod;

import mymod.CodaKidFiles.CKBiome;
import mymod.CodaKidFiles.Codakid;
import mymod.Dimension_1_Overworld.MakeYourDimension.CustomBiome;
import mymod.Dimension_1_Overworld.MakeYourDimension.CustomOverworldProvider;
import mymod.Dimension_1_Overworld.MakeYourDimension.CustomPortal;
import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main
{
	public static final String MODNAME = "CHECHA'S DiMeNsIoNs";
    public static final String MODID = "dimensions";
    public static final String VERSION = "1.0";

    //DECLARE VARIABLES
    public static int overworldId;
    public static BiomeGenBase myBiome;
    public static Block myOverworldPortal;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    	//INITIALIZE VARIABLES
    	overworldId = 2;
    	myBiome = new CustomBiome();
    	myOverworldPortal = new CustomPortal();
    					
    	//REGISTER ITEMS AND BLOCKS
    	Codakid.registerDimension(overworldId, CustomOverworldProvider.class);
    	GameRegistry.registerBlock(myOverworldPortal, "myOverworldPortal");

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    	//REGISTER TEXTURES

    	//ADD RECIPES

    	//REGISTER MOBS

    	//REGISTER WORLD GENERATOR


    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {



    }

}
