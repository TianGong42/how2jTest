package com.czp.interfaceTest;

public class ADHeroNineTeen extends Heronineteen implements AD{
	
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	@Override
	public void attack() {
		physicAttack();
	}

}
