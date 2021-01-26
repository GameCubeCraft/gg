package com.lulubin.newmob.object.entity;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;

public class EntityZomianor extends EntityZombie{

	public EntityZomianor(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void applyEntityAttributes() {
		// TODO Auto-generated method stub
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(35.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1D);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50D);
	}

}
