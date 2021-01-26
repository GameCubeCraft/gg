package com.lulubin.newmob.client.models.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import org.lwjgl.opengl.GL11;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class Zomianor extends ModelBase {
    public ModelRenderer field_178723_h;
    public ModelRenderer field_178721_j;
    public ModelRenderer field_78116_c;
    public ModelRenderer field_78115_e;
    public ModelRenderer field_178724_i;
    public ModelRenderer field_178722_k;
    public ModelRenderer shape8;
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape10_1;
    public ModelRenderer shape12;
    public ModelRenderer shape12_1;
    public ModelRenderer shape12_2;
    public ModelRenderer shape12_3;
    public ModelRenderer field_178723_h_1;
    public ModelRenderer field_178721_j_1;
    public ModelRenderer field_78116_c_1;
    public ModelRenderer field_78115_e_1;
    public ModelRenderer field_178724_i_1;
    public ModelRenderer field_178722_k_1;
    public ModelRenderer shape8_1;
    public ModelRenderer shape9_1;
    public ModelRenderer shape10_2;
    public ModelRenderer shape10_3;
    public ModelRenderer shape12_4;
    public ModelRenderer shape12_5;
    public ModelRenderer shape12_6;
    public ModelRenderer shape12_7;

    public Zomianor() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.field_178722_k = new ModelRenderer(this, 0, 16);
        this.field_178722_k.mirror = true;
        this.field_178722_k.setRotationPoint(1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_178722_k.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178722_k, -1.5241159442609702F, 0.0480541368295579F, -0.08009022804926329F);
        this.field_178722_k_1 = new ModelRenderer(this, 0, 16);
        this.field_178722_k_1.mirror = true;
        this.field_178722_k_1.setRotationPoint(1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_178722_k_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178722_k_1, -1.5241159442609702F, 0.0480541368295579F, -0.08009022804926329F);
        this.shape12_6 = new ModelRenderer(this, 7, 7);
        this.shape12_6.setRotationPoint(16.7F, -3.9F, -2.5F);
        this.shape12_6.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape12_2 = new ModelRenderer(this, 7, 7);
        this.shape12_2.setRotationPoint(16.7F, -3.9F, -2.5F);
        this.shape12_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.shape10 = new ModelRenderer(this, 7, 7);
        this.shape10.setRotationPoint(-20.0F, -3.8F, 9.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape10, 0.08203047484373349F, -0.07534469367031398F, 0.008726646259971648F);
        this.field_178724_i = new ModelRenderer(this, 40, 16);
        this.field_178724_i.mirror = true;
        this.field_178724_i.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_178724_i.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178724_i, -1.3962634801864624F, 0.5645233241758432F, 0.027189946180614304F);
        this.shape8 = new ModelRenderer(this, 6, 10);
        this.shape8.setRotationPoint(-0.5F, 4.3F, 3.3F);
        this.shape8.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.8F);
        this.setRotateAngle(shape8, 0.045553093477052F, 0.0F, 0.04241150082346221F);
        this.shape12_5 = new ModelRenderer(this, 7, 7);
        this.shape12_5.setRotationPoint(-20.2F, 5.6F, -2.5F);
        this.shape12_5.addBox(0.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F);
        this.shape10_1 = new ModelRenderer(this, 7, 7);
        this.shape10_1.setRotationPoint(18.0F, -4.0F, 9.0F);
        this.shape10_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape10_1, 0.0F, -0.613458627821363F, 0.0F);
        this.shape12_1 = new ModelRenderer(this, 7, 7);
        this.shape12_1.setRotationPoint(-20.2F, 5.6F, -2.5F);
        this.shape12_1.addBox(0.0F, -0.7F, 0.0F, 1, 1, 1, 0.0F);
        this.shape12 = new ModelRenderer(this, 7, 7);
        this.shape12.setRotationPoint(23.1F, 0.1F, 9.0F);
        this.shape12.addBox(-18.8F, -3.6F, -0.9F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape12, 6.291281921471221F, 0.0F, 0.0F);
        this.field_78115_e_1 = new ModelRenderer(this, 16, 16);
        this.field_78115_e_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e_1.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.shape10_2 = new ModelRenderer(this, 7, 7);
        this.shape10_2.setRotationPoint(-20.0F, -3.8F, 9.0F);
        this.shape10_2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape10_2, 0.08203047484373349F, -0.07534469367031398F, 0.008726646259971648F);
        this.field_178723_h_1 = new ModelRenderer(this, 40, 16);
        this.field_178723_h_1.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_178723_h_1.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178723_h_1, -1.3962634801864624F, -0.6446135522251065F, 0.10000000149011613F);
        this.shape12_4 = new ModelRenderer(this, 7, 7);
        this.shape12_4.setRotationPoint(23.1F, 0.1F, 9.0F);
        this.shape12_4.addBox(-18.8F, -3.6F, -0.9F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape12_4, 6.291281921471221F, 0.0F, 0.0F);
        this.shape10_3 = new ModelRenderer(this, 7, 7);
        this.shape10_3.setRotationPoint(18.0F, -4.0F, 9.0F);
        this.shape10_3.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.setRotateAngle(shape10_3, 0.0F, -0.613458627821363F, 0.0F);
        this.field_78115_e = new ModelRenderer(this, 16, 16);
        this.field_78115_e.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78115_e.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
        this.field_78116_c_1 = new ModelRenderer(this, 0, 0);
        this.field_78116_c_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c_1.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(field_78116_c_1, 0.0F, 0.0F, 0.49655941390543257F);
        this.field_178723_h = new ModelRenderer(this, 40, 16);
        this.field_178723_h.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.field_178723_h.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178723_h, -1.3962634801864624F, -0.6446135522251065F, 0.10000000149011613F);
        this.shape8_1 = new ModelRenderer(this, 6, 10);
        this.shape8_1.setRotationPoint(-0.5F, 4.3F, 3.3F);
        this.shape8_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.8F);
        this.setRotateAngle(shape8_1, 0.045553093477052F, 0.0F, 0.04241150082346221F);
        this.field_178724_i_1 = new ModelRenderer(this, 40, 16);
        this.field_178724_i_1.mirror = true;
        this.field_178724_i_1.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.field_178724_i_1.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178724_i_1, -1.3962634801864624F, 0.5645233241758432F, 0.027189946180614304F);
        this.field_78116_c = new ModelRenderer(this, 0, 0);
        this.field_78116_c.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.field_78116_c.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);
        this.setRotateAngle(field_78116_c, 0.0F, 0.0F, 0.49655941390543257F);
        this.shape9 = new ModelRenderer(this, 7, 8);
        this.shape9.setRotationPoint(-20.0F, 3.8F, 8.5F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.field_178721_j_1 = new ModelRenderer(this, 0, 16);
        this.field_178721_j_1.setRotationPoint(-1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_178721_j_1.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178721_j_1, -1.5431984781369363F, 0.06407218243941076F, 0.09610827365911598F);
        this.shape12_7 = new ModelRenderer(this, 7, 7);
        this.shape12_7.setRotationPoint(17.9F, 3.7F, -3.9F);
        this.shape12_7.addBox(0.0F, 0.1F, 0.1F, 1, 1, 1, 0.0F);
        this.field_178721_j = new ModelRenderer(this, 0, 16);
        this.field_178721_j.setRotationPoint(-1.899999976158142F, 12.0F, 0.10000000149011612F);
        this.field_178721_j.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.setRotateAngle(field_178721_j, -1.5431984781369363F, 0.06407218243941076F, 0.09610827365911598F);
        this.shape12_3 = new ModelRenderer(this, 7, 7);
        this.shape12_3.setRotationPoint(17.9F, 3.7F, -3.9F);
        this.shape12_3.addBox(0.0F, 0.1F, 0.1F, 1, 1, 1, 0.0F);
        this.shape9_1 = new ModelRenderer(this, 7, 8);
        this.shape9_1.setRotationPoint(-20.0F, 3.8F, 8.5F);
        this.shape9_1.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.field_178722_k.render(f5);
        this.field_178722_k_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_6.offsetX, this.shape12_6.offsetY, this.shape12_6.offsetZ);
        GlStateManager.translate(this.shape12_6.rotationPointX * f5, this.shape12_6.rotationPointY * f5, this.shape12_6.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 1.2D, 12.5D);
        GlStateManager.translate(-this.shape12_6.offsetX, -this.shape12_6.offsetY, -this.shape12_6.offsetZ);
        GlStateManager.translate(-this.shape12_6.rotationPointX * f5, -this.shape12_6.rotationPointY * f5, -this.shape12_6.rotationPointZ * f5);
        this.shape12_6.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_2.offsetX, this.shape12_2.offsetY, this.shape12_2.offsetZ);
        GlStateManager.translate(this.shape12_2.rotationPointX * f5, this.shape12_2.rotationPointY * f5, this.shape12_2.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 1.2D, 12.5D);
        GlStateManager.translate(-this.shape12_2.offsetX, -this.shape12_2.offsetY, -this.shape12_2.offsetZ);
        GlStateManager.translate(-this.shape12_2.rotationPointX * f5, -this.shape12_2.rotationPointY * f5, -this.shape12_2.rotationPointZ * f5);
        this.shape12_2.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape10.offsetX, this.shape10.offsetY, this.shape10.offsetZ);
        GlStateManager.translate(this.shape10.rotationPointX * f5, this.shape10.rotationPointY * f5, this.shape10.rotationPointZ * f5);
        GlStateManager.scale(2.4D, 10.1D, 1.1D);
        GlStateManager.translate(-this.shape10.offsetX, -this.shape10.offsetY, -this.shape10.offsetZ);
        GlStateManager.translate(-this.shape10.rotationPointX * f5, -this.shape10.rotationPointY * f5, -this.shape10.rotationPointZ * f5);
        this.shape10.render(f5);
        GlStateManager.popMatrix();
        this.field_178724_i.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape8.offsetX, this.shape8.offsetY, this.shape8.offsetZ);
        GlStateManager.translate(this.shape8.rotationPointX * f5, this.shape8.rotationPointY * f5, this.shape8.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.0D, 3.2D);
        GlStateManager.translate(-this.shape8.offsetX, -this.shape8.offsetY, -this.shape8.offsetZ);
        GlStateManager.translate(-this.shape8.rotationPointX * f5, -this.shape8.rotationPointY * f5, -this.shape8.rotationPointZ * f5);
        this.shape8.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_5.offsetX, this.shape12_5.offsetY, this.shape12_5.offsetZ);
        GlStateManager.translate(this.shape12_5.rotationPointX * f5, this.shape12_5.rotationPointY * f5, this.shape12_5.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 2.3D, 12.5D);
        GlStateManager.translate(-this.shape12_5.offsetX, -this.shape12_5.offsetY, -this.shape12_5.offsetZ);
        GlStateManager.translate(-this.shape12_5.rotationPointX * f5, -this.shape12_5.rotationPointY * f5, -this.shape12_5.rotationPointZ * f5);
        this.shape12_5.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape10_1.offsetX, this.shape10_1.offsetY, this.shape10_1.offsetZ);
        GlStateManager.translate(this.shape10_1.rotationPointX * f5, this.shape10_1.rotationPointY * f5, this.shape10_1.rotationPointZ * f5);
        GlStateManager.scale(2.4D, 10.1D, 1.1D);
        GlStateManager.translate(-this.shape10_1.offsetX, -this.shape10_1.offsetY, -this.shape10_1.offsetZ);
        GlStateManager.translate(-this.shape10_1.rotationPointX * f5, -this.shape10_1.rotationPointY * f5, -this.shape10_1.rotationPointZ * f5);
        this.shape10_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_1.offsetX, this.shape12_1.offsetY, this.shape12_1.offsetZ);
        GlStateManager.translate(this.shape12_1.rotationPointX * f5, this.shape12_1.rotationPointY * f5, this.shape12_1.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 2.3D, 12.5D);
        GlStateManager.translate(-this.shape12_1.offsetX, -this.shape12_1.offsetY, -this.shape12_1.offsetZ);
        GlStateManager.translate(-this.shape12_1.rotationPointX * f5, -this.shape12_1.rotationPointY * f5, -this.shape12_1.rotationPointZ * f5);
        this.shape12_1.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12.offsetX, this.shape12.offsetY, this.shape12.offsetZ);
        GlStateManager.translate(this.shape12.rotationPointX * f5, this.shape12.rotationPointY * f5, this.shape12.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 1.2D, 12.5D);
        GlStateManager.translate(-this.shape12.offsetX, -this.shape12.offsetY, -this.shape12.offsetZ);
        GlStateManager.translate(-this.shape12.rotationPointX * f5, -this.shape12.rotationPointY * f5, -this.shape12.rotationPointZ * f5);
        this.shape12.render(f5);
        GlStateManager.popMatrix();
        this.field_78115_e_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape10_2.offsetX, this.shape10_2.offsetY, this.shape10_2.offsetZ);
        GlStateManager.translate(this.shape10_2.rotationPointX * f5, this.shape10_2.rotationPointY * f5, this.shape10_2.rotationPointZ * f5);
        GlStateManager.scale(2.4D, 10.1D, 1.1D);
        GlStateManager.translate(-this.shape10_2.offsetX, -this.shape10_2.offsetY, -this.shape10_2.offsetZ);
        GlStateManager.translate(-this.shape10_2.rotationPointX * f5, -this.shape10_2.rotationPointY * f5, -this.shape10_2.rotationPointZ * f5);
        this.shape10_2.render(f5);
        GlStateManager.popMatrix();
        this.field_178723_h_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_4.offsetX, this.shape12_4.offsetY, this.shape12_4.offsetZ);
        GlStateManager.translate(this.shape12_4.rotationPointX * f5, this.shape12_4.rotationPointY * f5, this.shape12_4.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 1.2D, 12.5D);
        GlStateManager.translate(-this.shape12_4.offsetX, -this.shape12_4.offsetY, -this.shape12_4.offsetZ);
        GlStateManager.translate(-this.shape12_4.rotationPointX * f5, -this.shape12_4.rotationPointY * f5, -this.shape12_4.rotationPointZ * f5);
        this.shape12_4.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape10_3.offsetX, this.shape10_3.offsetY, this.shape10_3.offsetZ);
        GlStateManager.translate(this.shape10_3.rotationPointX * f5, this.shape10_3.rotationPointY * f5, this.shape10_3.rotationPointZ * f5);
        GlStateManager.scale(2.4D, 10.1D, 1.1D);
        GlStateManager.translate(-this.shape10_3.offsetX, -this.shape10_3.offsetY, -this.shape10_3.offsetZ);
        GlStateManager.translate(-this.shape10_3.rotationPointX * f5, -this.shape10_3.rotationPointY * f5, -this.shape10_3.rotationPointZ * f5);
        this.shape10_3.render(f5);
        GlStateManager.popMatrix();
        this.field_78115_e.render(f5);
        this.field_78116_c_1.render(f5);
        this.field_178723_h.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape8_1.offsetX, this.shape8_1.offsetY, this.shape8_1.offsetZ);
        GlStateManager.translate(this.shape8_1.rotationPointX * f5, this.shape8_1.rotationPointY * f5, this.shape8_1.rotationPointZ * f5);
        GlStateManager.scale(1.1D, 1.0D, 3.2D);
        GlStateManager.translate(-this.shape8_1.offsetX, -this.shape8_1.offsetY, -this.shape8_1.offsetZ);
        GlStateManager.translate(-this.shape8_1.rotationPointX * f5, -this.shape8_1.rotationPointY * f5, -this.shape8_1.rotationPointZ * f5);
        this.shape8_1.render(f5);
        GlStateManager.popMatrix();
        this.field_178724_i_1.render(f5);
        this.field_78116_c.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape9.offsetX, this.shape9.offsetY, this.shape9.offsetZ);
        GlStateManager.translate(this.shape9.rotationPointX * f5, this.shape9.rotationPointY * f5, this.shape9.rotationPointZ * f5);
        GlStateManager.scale(40.0D, 2.3D, 1.4D);
        GlStateManager.translate(-this.shape9.offsetX, -this.shape9.offsetY, -this.shape9.offsetZ);
        GlStateManager.translate(-this.shape9.rotationPointX * f5, -this.shape9.rotationPointY * f5, -this.shape9.rotationPointZ * f5);
        this.shape9.render(f5);
        GlStateManager.popMatrix();
        this.field_178721_j_1.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_7.offsetX, this.shape12_7.offsetY, this.shape12_7.offsetZ);
        GlStateManager.translate(this.shape12_7.rotationPointX * f5, this.shape12_7.rotationPointY * f5, this.shape12_7.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 2.3D, 12.5D);
        GlStateManager.translate(-this.shape12_7.offsetX, -this.shape12_7.offsetY, -this.shape12_7.offsetZ);
        GlStateManager.translate(-this.shape12_7.rotationPointX * f5, -this.shape12_7.rotationPointY * f5, -this.shape12_7.rotationPointZ * f5);
        this.shape12_7.render(f5);
        GlStateManager.popMatrix();
        this.field_178721_j.render(f5);
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape12_3.offsetX, this.shape12_3.offsetY, this.shape12_3.offsetZ);
        GlStateManager.translate(this.shape12_3.rotationPointX * f5, this.shape12_3.rotationPointY * f5, this.shape12_3.rotationPointZ * f5);
        GlStateManager.scale(2.3D, 2.3D, 12.5D);
        GlStateManager.translate(-this.shape12_3.offsetX, -this.shape12_3.offsetY, -this.shape12_3.offsetZ);
        GlStateManager.translate(-this.shape12_3.rotationPointX * f5, -this.shape12_3.rotationPointY * f5, -this.shape12_3.rotationPointZ * f5);
        this.shape12_3.render(f5);
        GlStateManager.popMatrix();
        GlStateManager.pushMatrix();
        GlStateManager.translate(this.shape9_1.offsetX, this.shape9_1.offsetY, this.shape9_1.offsetZ);
        GlStateManager.translate(this.shape9_1.rotationPointX * f5, this.shape9_1.rotationPointY * f5, this.shape9_1.rotationPointZ * f5);
        GlStateManager.scale(40.0D, 2.3D, 1.4D);
        GlStateManager.translate(-this.shape9_1.offsetX, -this.shape9_1.offsetY, -this.shape9_1.offsetZ);
        GlStateManager.translate(-this.shape9_1.rotationPointX * f5, -this.shape9_1.rotationPointY * f5, -this.shape9_1.rotationPointZ * f5);
        this.shape9_1.render(f5);
        GlStateManager.popMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
        boolean flag = entityIn instanceof EntityZombie && ((EntityZombie)entityIn).isArmsRaised();
        float f = MathHelper.sin(this.swingProgress * (float)Math.PI);
        float f1 = MathHelper.sin((1.0F - (1.0F - this.swingProgress) * (1.0F - this.swingProgress)) * (float)Math.PI);
        this.field_178724_i.rotateAngleZ = 0.0F;
        this.field_178723_h.rotateAngleZ = 0.0F;
        this.field_178724_i.rotateAngleY = -(0.1F - f * 0.6F);
        this.field_178723_h.rotateAngleY = 0.1F - f * 0.6F;
        float f2 = -(float)Math.PI / (flag ? 1.5F : 2.25F);
        this.field_178724_i.rotateAngleX = f2;
        this.field_178723_h.rotateAngleX = f2;
        this.field_178724_i.rotateAngleX += f * 1.2F - f1 * 0.4F;
        this.field_178723_h.rotateAngleX += f * 1.2F - f1 * 0.4F;
        this.field_178724_i.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.field_178723_h.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.field_178724_i.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.field_178723_h.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    }
}
