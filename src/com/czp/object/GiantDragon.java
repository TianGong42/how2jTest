package com.czp.object;

/*
 * GiantDragon应该只有一只，通过私有化其构造方法，是的外部无法通过new得到新的实例
 * GiantDragon提供了一个public static 的getInstance方法，外部调用者通过该方法
 * 获取12行定义的对象，而且每一次都是获取同一个对象。从而达到单例模式的目的
 * 这种单例模式又叫做饿汉式单例模式，无论如何斗殴会创建一个实例
 */
public class GiantDragon {
	
	//私有化构造方法使得该类无法再外部通过new进行实例化
	private GiantDragon() {
		
	}
	
	//准备一个类属性，指向一个实例化对象。因为是类属性，所以只有一个
	private static GiantDragon instance = new GiantDragon();
	
	//public static 方法，提示给调用者获取12行定义的对象
	public static GiantDragon getInstance() {
		return instance;
	}
}
