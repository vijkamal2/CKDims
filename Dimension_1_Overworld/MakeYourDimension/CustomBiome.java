package mymod.Dimension_1_Overworld.MakeYourDimension;

import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class CustomBiome extends BiomeGenBase {
	
	public CustomBiome() {
		
		super(45);
		this.setBiomeName("Glowstone Mountains");
		
		this.setHeight(BiomeGenBase.height_MidHills);
		this.topBlock = Blocks.glowstone.getDefaultState();
		this.fillerBlock = Blocks.emerald_block.getDefaultState();
		
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityGiantZombie.class, 40, 1, 1));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityBlaze.class, 40, 1, 1));
		this.spawnableMonsterList.add(new BiomeGenBase.SpawnListEntry(EntityPigZombie.class, 40, 1, 1));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityOcelot.class, 40, 1, 10));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityMooshroom.class, 40, 1, 10));
		this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityPig.class, 40, 1, 10));



		

		
	}

}
