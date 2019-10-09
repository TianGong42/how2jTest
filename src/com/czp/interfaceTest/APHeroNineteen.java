package com.czp.interfaceTest;

public class APHeroNineteen extends Heronineteen implements AP{

	@Override
	public void magicAttack() {
		System.out.println("½øÐÐÄ§·¨¹¥»÷");
	}
	
	@Override
	public void attack() {
		magicAttack();
	}
}
