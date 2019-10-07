package com.czp.interfaceTest;

import LOL.Hero;
import LOL.Mortal;

public class ADHero extends Hero implements AD,Mortal{
	/*
	 * (non-Javadoc)
	 * @see com.czp.interfaceTest.AD#physicAttack()
	 * 设计一类英雄，能够使用物理攻击，
	 * 类：ADHero
	 * 
	 * 实现某给接口，相当于承若了某种约定
	 * 所以，实现了AD接口，就必须提供AD接口中声明的方法physicAttack()
	 * 实现在语法上使用关键字implements
	 */
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	@Override
	public void die() {
		System.out.println("AD英雄死亡");
	}
}
