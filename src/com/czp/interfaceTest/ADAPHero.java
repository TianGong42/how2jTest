package com.czp.interfaceTest;

import LOL.Hero;
import LOL.Mortal;

public class ADAPHero extends Hero implements AD,AP,Mortal{

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	
	@Override
	public void die() {
		System.out.println("����ħ������");
	}
}
