package com.czp.interfaceTest;

public abstract class HeroTwentyTwo {
	
	String name;
	
	float armor;
	
	int moveSpeed;
	
	public abstract void attack();
	
	public void main(String[] args) {
		ADHeroTwentyTwo adh = new ADHeroTwentyTwo();
		
		//通过打印adh，可以看到adh这个对象属于ADHero类
		adh.attack();
		System.out.println(adh);
		
		HeroTwentyTwo h = new HeroTwentyTwo() {
			public void attack() {
				System.out.println("新的进攻手段");
			}
		};
		h.attack();
		//通过打印h,可以看到h这个对象属于Hero$1这么一个系统自动分配类名
		
		System.out.println(h);
		
	}
}
