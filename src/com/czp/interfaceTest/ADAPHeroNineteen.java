package com.czp.interfaceTest;

public class ADAPHeroNineteen extends Heronineteen implements AD,AP{

	@Override
	public void attack() {
		System.out.println("既可以进行物理攻击，也可以进行魔法攻击");
	}
	
	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");
	}
	
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
}
