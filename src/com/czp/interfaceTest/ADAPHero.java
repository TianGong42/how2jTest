package com.czp.interfaceTest;

import LOL.Hero;

public class ADAPHero extends Hero implements AD,AP{

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	@Override
	public void physicAttack() {
		System.out.println("������������");
	}
}