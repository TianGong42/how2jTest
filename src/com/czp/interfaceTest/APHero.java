package com.czp.interfaceTest;

import LOL.Hero;
import LOL.Mortal;

public class APHero extends Hero implements AP,Mortal {

	@Override
	public void magicAttack() {
		System.out.println("����ħ������");

	}
	
	@Override
	public void die() {
		System.out.println("ħ��Ӣ������");
	}

}
