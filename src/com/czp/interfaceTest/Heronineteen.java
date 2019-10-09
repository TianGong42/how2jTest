package com.czp.interfaceTest;

public abstract class Heronineteen {
	String name;
	
	float  hp;
	float  armor;
	int moveSpeed;
	/*
	 * 为Hero增加一个抽象方法attack,并且把Hero声明为abstract的
	 * APHero,ADHero,ADAPHero是Hero的子类，继承了Hero的属性和方法
	 * 但是各自的攻击手段不一样，随意继承Hero类后，这些子类就必须提供不一样的attack方法实现
	 */
	public abstract void attack();
	
	public static void main(String[] args) {
		//虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接实例化
		//Heronineteen h = new Heronineteen();
	}

}
