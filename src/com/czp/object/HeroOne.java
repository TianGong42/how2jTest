package com.czp.object;

public class HeroOne {
	String name;    //姓名
	float hp;       //血量
	float armor;    //护甲
	int moveSpeed;  //移动速度

	public static void main(String[] args) {
		
		//创建一个对象
		new HeroOne();
		
		//使用一个引用来指向这个对象
		HeroOne h = new HeroOne();
		
		//h1,h2,h3,h4,h5 五个引用，都指向同一个对象
		HeroOne h1 = new HeroOne();
		HeroOne h2 = h1;
		HeroOne h3 = h1;
		HeroOne h4 = h1;
		HeroOne h5 = h4;
		
		
		

	}

}
