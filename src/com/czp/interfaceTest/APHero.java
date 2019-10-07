package com.czp.interfaceTest;

import LOL.Hero;
import LOL.Mortal;

public class APHero extends Hero implements AP,Mortal {

	@Override
	public void magicAttack() {
		System.out.println("进行魔法攻击");

	}
	
	@Override
	public void die() {
		System.out.println("魔法英雄死亡");
	}

}
