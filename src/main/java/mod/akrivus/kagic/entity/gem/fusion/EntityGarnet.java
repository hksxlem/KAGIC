package mod.akrivus.kagic.entity.gem.fusion;

import java.util.ArrayList;

import mod.akrivus.kagic.entity.EntityFusionGem;
import mod.akrivus.kagic.entity.EntityGem;
import mod.heimrarnadalr.kagic.util.Colors;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGarnet extends EntityFusionGem {
	private static final int SKIN_COLOR_BEGIN = 0xBE4459; 
	private static final int SKIN_COLOR_END = 0xCC3281; 

	private static final int HAIR_COLOR_BEGIN = 0x000000;
	private static final int HAIR_COLOR_END = 0x1D0F1F; 
	
	private static final int NUM_HAIRSTYLES = 1;

	public EntityGarnet(World world) {
		super(world);
		this.setSize(0.7F, 2.8F);
		this.visorChanceReciprocal = 1;
		
		// Apply entity attributes.
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(200.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(12.5D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.4D);
		this.getEntityAttribute(SharedMonsterAttributes.KNOCKBACK_RESISTANCE).setBaseValue(2.0D);
	}

	//=========================================================================
	//=== Methods for managing fusion==========================================
	//=========================================================================
	
	@Override
	public boolean addGem(EntityGem gem) {
		if (this.getFusionCount() >= 2) {
			return false;
		} else {
			return super.addGem(gem);
		}
	}

	/*********************************************************
	 * Methods related to rendering.                         *
	 *********************************************************/
	@Override
	public float[] getGemColor() {
		return new float[] { 255F/ 255F, 61F / 255F, 122F / 255F };
	}

	@Override
	protected int generateSkinColor() {
		ArrayList<Integer> skinColors = new ArrayList<Integer>();
		skinColors.add(EntityGarnet.SKIN_COLOR_BEGIN);
		skinColors.add(EntityGarnet.SKIN_COLOR_END);
		return Colors.arbiLerp(skinColors);	}
	
	@Override
	protected int generateHairStyle() {
		return this.rand.nextInt(EntityGarnet.NUM_HAIRSTYLES);
	}
	
	@Override
	protected int generateHairColor() {
		ArrayList<Integer> hairColors = new ArrayList<Integer>();
		hairColors.add(EntityGarnet.HAIR_COLOR_BEGIN);
		hairColors.add(EntityGarnet.HAIR_COLOR_END);
		return Colors.arbiLerp(hairColors);
	}
}