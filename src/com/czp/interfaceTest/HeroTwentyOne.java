package com.czp.interfaceTest;

public class HeroTwentyOne {
	
	public String name;
	protected float hp;
	
	private static void battleWin() {
		System.out.println("battle win");
	}
	
	/*
	 * 在一个类里面声明一个静态内部类
	 * 与非静态内部类不同，静态内部类水晶类的实例化，不需要一个外部类的实例为基础，可以直接实例化
	 * 语法：new外部类.静态内部类()
	 * 因为没有一个外部类的实例，所以静态内部类里面不可以访问外部类的实例属性和方法
	 * 除了可以方为外部类的私有静态成员外，静态内部类和普通类没有什么大的区别
	 */
	//敌方的水晶
	static class EnemyCrystal{
		int hp = 0;
		
		//如果水晶的血量为0，则宣布胜利
		public void checkIfVictory() {
			if(hp == 0) {
				HeroTwentyOne.battleWin();
				System.out.println("hello World");
				//静态内部类不能直接访问外部类的对象属性
				//System.out.println(name + " win this game");
			}
		}
	}
	
	public static void main(String[] args) {
		//实例化静态内部类
		HeroTwentyOne.EnemyCrystal crystal = new HeroTwentyOne.EnemyCrystal();
		crystal.checkIfVictory();
	}

}
