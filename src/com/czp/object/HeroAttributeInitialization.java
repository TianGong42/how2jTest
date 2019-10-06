package com.czp.object;

public class HeroAttributeInitialization {

	/*
	 * 对象属性初始化方法有3种
	 * 1、声明该属性的时候初始化
	 * 2、构造方法中初始化
	 * 3、初始化块
	 */
	public String name = "some hero";   //声明该属性的时候初始化
	protected float hp;
	float maxHp;
	
	{
		maxHp = 200; //初始化块
	}
	
	public HeroAttributeInitialization() {
		hp = 100;      //构造方法中初始化
	}
	
}
