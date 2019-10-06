package com.czp.object;

public class HeroEight {
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public HeroEight(String name,float hp) {
		this.name = name;
		this.hp = hp;
		System.out.println("两个个参数的构造方法");
	}
	//这个是下面四个参数的构造方法调用上面两个参数的构造方法
	public HeroEight(String name, float hp, float armor,int moveSpeed) {
		this(name,hp);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		System.out.println("四个参数的构造方法");
		
	}
	
	public static void main(String[] args) {
		HeroEight czp = new HeroEight("czp",188,865,74);
	}

}
