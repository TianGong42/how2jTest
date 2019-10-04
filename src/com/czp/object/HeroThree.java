package com.czp.object;

public class HeroThree {
	//一旦提供了一个有参的构造方法
	//同时又没有显示的提供一个无参的构造方法
	//那么默认的无参的构造方法，就没有了
	String name;    //姓名
	float hp;       //血量
	float armor;    //护甲
	int moveSpeed;  //移动速度
	
	//有参的构造方法
	//默认的无参构造方法就失效了
	public HeroThree(String heroname) {
		name = heroname;
	}
	
	public static void main(String[] args) {
		HeroThree garen = new HeroThree("盖伦");
		
		//HeroThree teemo = new HeroThree();  无参的构造方法“木有了”
	}
}
