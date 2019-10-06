package com.czp.object;

public class HeroTwelve {
	//类属性，又叫静态属性,如果一个属性申明成类属性。那么所有的对象
	//对象属性，又叫实例属性，非静态属性
	public String name;  //实例属性，对象属性，非静态属性
	protected float hp;
	static String copyright;   //类属性，静态属性
	
	public static void main(String[] args) {
		HeroTwelve garen = new HeroTwelve();
		garen.name = "盖伦";
		
		HeroTwelve.copyright = "版权由Riot Games公司所有";
		
		System.out.println(garen.name);
		System.out.println(garen.copyright);
		
		HeroTwelve teemo = new HeroTwelve();
		teemo.name="提莫";
		System.out.println(teemo.name);
		System.out.println(teemo.copyright);
		
		garen.copyright = "Blizzard Entertainment Enterprise";
		System.out.println(teemo.copyright);
	}

}
