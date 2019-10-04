package com.czp.object;

public class HeroTwo {
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	//方法名和类名一样(包括大小写)
	//没有返回类型
	//如果不写，就会默认提供一个无参的构造方法
	public HeroTwo() {
		System.out.println("实例化一个对象的时候，必然调用构造方法");
	}
	
	public static void main(String[] args) {
		HeroTwo h = new HeroTwo();
	}

}
