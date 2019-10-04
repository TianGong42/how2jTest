package com.czp.object;

public class ADHero extends HeroOne{
	//方法重载，方法名是一样的，但是参数类型不一样
	public void attack() {
		System.out.println(name + "进行了一次攻击，但是不确定打中了谁了");
	}
	
//	public void attack(HeroOne h1) {
//		System.out.println(name + "对" + h1.name + "进行了一次攻击  ");
//	}
//	
//	public void attack(HeroOne h1, HeroOne h2) {
//		System.out.println(name + "同时对" + h1.name + "和" + h2.name + "进行了攻击 ");
//	}
	
	/*
	 * 这里可以采用可变参数量的参数，只需要设计一个方法
	 */
	public void attack(HeroOne ...heroOnes) {
		for(int i = 0;i < heroOnes.length;i++) {
			System.out.println(name+" 攻击了 " + heroOnes[i].name);
		}
	}
	
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "赏金猎人";
		
		HeroOne h1 = new HeroOne();
		h1.name = "盖伦";
		HeroOne h2 = new HeroOne();
		h2.name = "提莫";
		
		bh.attack();
		bh.attack(h1);
		bh.attack(h1,h2);
	}
	

}
