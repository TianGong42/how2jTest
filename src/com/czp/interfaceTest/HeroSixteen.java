package com.czp.interfaceTest;

import LOL.Item;

/*
 * 准备显示提供无参的构造方法的父类
 * 在实例化Hero对象的时候，其构造方法会打印方法内容
 * 声明一个类的时候会默认继承Object类
 */
public class HeroSixteen extends Object{

	String name;
	
	float hp;
	float armor;
	int moveSpeed;
	
	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
	}
	
	public HeroSixteen() {
		System.out.println("HeroSixteen的无参构造方法 ");
	}
	
	public HeroSixteen(String name) {
		System.out.println("HeroSixteen的一个有参数的构造方法 ");
	}
	
	public String toString() {
		return name;
	}
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#finalize()
	 * 当一个对象没有任何引用指向的时候，它就满足垃圾回收的条件
	 * 当它被垃圾回收的时候，它的finalize()方法就会被调用
	 * finalize()不是开发人员主动调用的方法，而是由虚拟机JVM调用的
	 */
	public void finalize() {
		System.out.println("这个英雄正在被回收");
	}
	public static void main(String[] args) {
		
		new HeroSixteen();
		HeroSixteen h = new HeroSixteen();
		h.name = "盖伦";
		System.out.println(h.toString());
		//直接打印对象就是对象的toString返回值
		System.out.println(h);
		
	}
}
