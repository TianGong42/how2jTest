package com.czp.interfaceTest;

public class ADHeroNineTeen extends Heronineteen implements AD{
	
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	
	@Override
	public void attack() {
		physicAttack();
	}

}
