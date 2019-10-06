package com.czp.object;

public class HeroSeven {
	
	String name;   //姓名
	float hp;      //血量
	int moveSpeed; //移动速度
	
	//带一个参数的构造方法
	public HeroSeven(String name) {
		System.out.println("一个参数的构造方法");
		this.name = name;
	}
	
	//带两个参数的构造方法
	//通过this方法来调用第一个构造方法
	public HeroSeven(String name,float hp) {
		this(name);
		System.out.println("两个参数的构造方法");
		this.hp = hp;
	}
	
	public static void main(String[] args) {
		HeroSeven teemo = new HeroSeven("提莫",383);
		System.out.println(teemo.name);
	}

}
