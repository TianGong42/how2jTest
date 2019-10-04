package com.czp.object;

public class HeroFour {
	
	String name;     //姓名
	float hp;        //血量
	float armor;     //护甲
	int moveSpeed;   //移动速度
	
	//带一个参数的构造方法
	public HeroFour(String heroname) {
		name = heroname;
	}
	
	//带两个参数的构造方法
	public HeroFour(String heroname,float herohp) {
		name = heroname;
		hp = herohp;
	}
	
	//带四个参数的构造方法
	public HeroFour(String heroName,float heroHp,float heroArmor, int heroMoveSpeed) {
		name = heroName;
		hp = heroHp;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
	}
	
	public static void main(String[] args) {
		HeroFour garen = new HeroFour("盖伦");
		HeroFour teemo = new HeroFour("提莫", 383);
	}

}
