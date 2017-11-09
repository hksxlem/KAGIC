package mod.akrivus.kagic.client.render;

import mod.akrivus.kagic.client.model.fusions.ModelRainbowQuartz;
import mod.akrivus.kagic.entity.gem.fusion.EntityRainbowQuartz;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class RenderRainbowQuartz extends RenderGemBase<EntityRainbowQuartz> {

	public RenderRainbowQuartz() {
		super(Minecraft.getMinecraft().getRenderManager(), new ModelRainbowQuartz(), 0.5F);
	}

	@Override
	protected void preRenderCallback(EntityRainbowQuartz rainbowQuartz, float partialTickTime) {
		//GlStateManager.scale(1.125F * rainbowQuartz.getSizeFactor(), 1.125F * rainbowQuartz.getSizeFactor(), 1.125F * rainbowQuartz.getSizeFactor());
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityRainbowQuartz rainbowQuartz) {
		return new ResourceLocation("kagic:textures/entities/rainbow_quartz/rainbow_quartz.png");
	}
}