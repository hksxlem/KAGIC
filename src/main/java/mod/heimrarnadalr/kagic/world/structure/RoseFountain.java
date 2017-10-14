package mod.heimrarnadalr.kagic.world.structure;

import java.util.Random;

import mod.akrivus.kagic.init.ModBlocks;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RoseFountain extends RuinStructure {

	public RoseFountain(String type) {
		super(type, 5, Blocks.DIRT.getDefaultState(), true, true);
		this.structures.add("/assets/kagic/structures/RoseFountain.schematic");
		
		//39, 2, 29
		this.chestTables.put(new BlockPos(39, 2, 29), LootTables.ROSE_FOUNTAIN);
		
		this.allowedBiomes.add(Biomes.SWAMPLAND);
		this.allowedBiomes.add(Biomes.MUTATED_SWAMPLAND);
		this.allowedBiomes.add(Biomes.JUNGLE);
		this.allowedBiomes.add(Biomes.JUNGLE_EDGE);
		this.allowedBiomes.add(Biomes.JUNGLE_HILLS);
		this.allowedBiomes.add(Biomes.MUTATED_JUNGLE);
		this.allowedBiomes.add(Biomes.MUTATED_JUNGLE_EDGE);
	}

	@Override
	public boolean checkCorners(World world, BlockPos pos) {
		return true;
	}
	
	@Override
	public boolean generate(World world, Random rand, BlockPos pos) {
		if (rand.nextInt(5) != 0) {
			return false;
		}
		//KAGIC.instance.chatInfoMessage("Random passed; checking world conditions");
		return super.generate(world, rand, pos.down(5));
	}
}