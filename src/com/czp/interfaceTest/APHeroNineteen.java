package com.czp.interfaceTest;

public class APHeroNineteen extends Heronineteen implements AP{

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	@Override
	public void attack() {
		magicAttack();
	}
}
