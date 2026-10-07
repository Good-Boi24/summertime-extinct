package net.minty.summertime_extinct.entity.client;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.EntityModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;


public class DeinocheirusModel<T extends Entity> extends EntityModel<T> {
	private final ModelPart root;
	private final ModelPart upper;
	private final ModelPart neck;
	private final ModelPart skull;
	private final ModelPart jaw;
	private final ModelPart arms;
	private final ModelPart shoulderR;
	private final ModelPart armR;
	private final ModelPart handR;
	private final ModelPart shoulderL;
	private final ModelPart armL;
	private final ModelPart handL;
	private final ModelPart lower;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart legs;
	private final ModelPart thighR;
	private final ModelPart calfR;
	private final ModelPart footR;
	private final ModelPart thighL;
	private final ModelPart calfL;
	private final ModelPart footL;
	private final ModelPart bb_main;

	public DeinocheirusModel(ModelPart root) {
		this.root = root.getChild("root");
		this.upper = this.root.getChild("upper");
		this.neck = this.upper.getChild("neck");
		this.skull = this.neck.getChild("skull");
		this.jaw = this.skull.getChild("jaw");
		this.arms = this.upper.getChild("arms");
		this.shoulderR = this.arms.getChild("shoulderR");
		this.armR = this.shoulderR.getChild("armR");
		this.handR = this.armR.getChild("handR");
		this.shoulderL = this.arms.getChild("shoulderL");
		this.armL = this.shoulderL.getChild("armL");
		this.handL = this.armL.getChild("handL");
		this.lower = this.root.getChild("lower");
		this.tail = this.lower.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.legs = this.lower.getChild("legs");
		this.thighR = this.legs.getChild("thighR");
		this.calfR = this.thighR.getChild("calfR");
		this.footR = this.calfR.getChild("footR");
		this.thighL = this.legs.getChild("thighL");
		this.calfL = this.thighL.getChild("calfL");
		this.footL = this.calfL.getChild("footL");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition root = partdefinition.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(-6.0F, 17.0F, -17.0F));

		PartDefinition upper = root.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(98, 0).addBox(0.25F, -36.5F, -21.0F, 19.0F, 24.0F, 22.0F, new CubeDeformation(0.0F))
		.texOffs(100, 88).addBox(0.0F, -37.0F, -25.0F, 20.0F, 21.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.5F, 1.0F, 0.0F));

		PartDefinition neck = upper.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(110, 167).addBox(1.0F, -31.0F, -22.0F, 10.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(3.75F, -5.25F, -10.0F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(162, 167).addBox(0.0F, -9.0F, -5.0F, 8.0F, 21.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -31.0F, -22.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition skull = neck.addOrReplaceChild("skull", CubeListBuilder.create().texOffs(176, 88).addBox(1.5F, -44.5F, -36.0F, 9.0F, 10.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(180, 15).addBox(3.5F, -43.25F, -47.0F, 5.0F, 3.0F, 14.0F, new CubeDeformation(0.0F))
		.texOffs(108, 198).addBox(2.5F, -41.25F, -48.0F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, 4.75F));

		PartDefinition jaw = skull.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 190).addBox(2.5F, -40.25F, -47.0F, 5.0F, 4.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition arms = upper.addOrReplaceChild("arms", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition shoulderR = arms.addOrReplaceChild("shoulderR", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = shoulderR.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 191).addBox(-4.0F, -3.0F, -1.0F, 5.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.0F, -24.0F, -13.75F, 0.2618F, 0.0F, 0.0F));

		PartDefinition armR = shoulderR.addOrReplaceChild("armR", CubeListBuilder.create().texOffs(196, 143).addBox(17.75F, -17.7F, -11.65F, 4.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition handR = armR.addOrReplaceChild("handR", CubeListBuilder.create(), PartPose.offset(7.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = handR.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(134, 198).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.6F, -1.05F, -9.65F, 0.0F, 0.0F, 0.0436F));

		PartDefinition shoulderL = arms.addOrReplaceChild("shoulderL", CubeListBuilder.create(), PartPose.offset(-37.5F, 0.0F, 0.0F));

		PartDefinition cube_r4 = shoulderL.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(62, 191).addBox(-4.0F, -3.0F, -2.0F, 5.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(38.5F, -24.0F, -13.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition armL = shoulderL.addOrReplaceChild("armL", CubeListBuilder.create().texOffs(196, 124).addBox(35.0F, -17.7F, -11.65F, 4.0F, 13.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition handL = armL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offset(7.0F, 0.0F, 0.0F));

		PartDefinition cube_r5 = handL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(154, 199).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.15F, -1.05F, -9.65F, 0.0F, 0.0F, -0.0436F));

		PartDefinition lower = root.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(0, 61).addBox(-0.25F, -37.25F, -2.0F, 21.0F, 26.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 1.0F, 0.0F));

		PartDefinition cube_r6 = lower.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -8.0F, -17.0F, 11.0F, 23.0F, 38.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.75F, -35.25F, 3.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition tail = lower.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(3.5F, -5.0F, 0.0F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(76, 127).addBox(-14.0F, -7.0F, -9.0F, 14.0F, 15.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.75F, -23.75F, 34.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(52, 162).addBox(2.0F, -29.25F, 45.0F, 9.0F, 9.0F, 20.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 11.0F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 116).addBox(-14.0F, -2.0F, -1.0F, 15.0F, 11.0F, 23.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, -23.0F, 67.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r9 = tail3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(100, 46).addBox(-7.0F, -4.0F, -8.0F, 6.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.5F, -24.25F, 58.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition legs = lower.addOrReplaceChild("legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 2.0F));

		PartDefinition thighR = legs.addOrReplaceChild("thighR", CubeListBuilder.create().texOffs(144, 127).addBox(-11.25F, -8.0F, -12.0F, 9.0F, 23.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(25.0F, -25.0F, 14.5F));

		PartDefinition calfR = thighR.addOrReplaceChild("calfR", CubeListBuilder.create().texOffs(182, 32).addBox(1.0F, 11.5F, 9.0F, 7.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.5F, -1.0F, -12.0F));

		PartDefinition footR = calfR.addOrReplaceChild("footR", CubeListBuilder.create().texOffs(176, 109).addBox(1.5F, -1.0F, -0.75F, 8.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 31.0F, 4.0F));

		PartDefinition thighL = legs.addOrReplaceChild("thighL", CubeListBuilder.create().texOffs(0, 150).addBox(-11.25F, -7.0F, -10.0F, 9.0F, 23.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -26.0F, 12.5F));

		PartDefinition calfL = thighL.addOrReplaceChild("calfL", CubeListBuilder.create().texOffs(182, 59).addBox(1.0F, 11.5F, 9.0F, 7.0F, 20.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.5F, 0.0F, -10.0F));

		PartDefinition footL = calfL.addOrReplaceChild("footL", CubeListBuilder.create().texOffs(180, 0).addBox(1.5F, -1.0F, -0.75F, 8.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 31.0F, 4.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(-158, -158).addBox(-5.0F, -53.5F, -70.5F, 2.0F, 2.0F, 160.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}