package com.lulubin.newmob.client.renderer.entity;

import com.lulubin.newmob.client.models.entity.Zomianor;
import com.lulubin.newmob.object.entity.EntityZomianor;
import com.lulubin.newmob.util.Reference;

import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)

public class RenderZomion<T extends EntityZomianor> extends RenderLiving<T>
{
    private static final ResourceLocation ZOMBIE_TEXTURES = new ResourceLocation(Reference.MODID + ":textures/entity/zomanor.png");

    public RenderZomion(RenderManager renderManagerIn)
    {
        super(renderManagerIn, new Zomianor(), 0.5F);
        {
        };
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(T entity)
    {
        return ZOMBIE_TEXTURES;
    }


}

