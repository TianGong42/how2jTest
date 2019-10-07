package com.czp.interfaceTest;

import LOL.Item;
import LOL.LifePotion;

public class ADHeroTwo extends HeroSixteen implements AD{
	
	int moveSpeed = 400;   //移动速度
	@Override
	public void physicAttack() {
		System.out.println("进行物理攻击");
	}
	
	public int getMoveSpeed() {
		return this.moveSpeed;
	}
	
	public int getMoveSpeed2() {
		return this.moveSpeed;
	}
	
	//重写useItem,并在其中电泳父类的userItem方法
	public void useItem(Item i) {
		System.out.println("adhero use item");
		super.useItem(i);
	}
	
//	public ADHeroTwo(String name) {
//		//关键字super显式调用父类带参数的构造方法
//		super(name);
//		System.out.println("AD Hero的构造方法");
//	}
	
	
	
	//实例化一个ADHero()，其构造方法会被调用
	//其父类的构造方法也会被调用，并且是父类构造方法先调用，子类构造方法会默认调用父类的无参构造方法
	public static void main(String[] args) {
	ADHeroTwo h = new ADHeroTwo();
	
	LifePotion lp = new LifePotion();
	h.useItem(lp);
	
	System.out.println(h.getMoveSpeed());
	System.out.println(h.getMoveSpeed2());
	}

}
