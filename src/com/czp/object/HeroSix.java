package com.czp.object;

public class HeroSix {
	
	String name;    //姓名
	float hp;       //血量
	float armor;    //护甲
	int moveSpeed;  //速度
	
	//参数名和属性名一样
	//在方法体中，只能访问到参数name
	public void setName1(String name) {
		name = name;
	}
	
	//为了避免setName1中的问题，参数名不得使用其他变量名
	public void setName2(String heroName) {
		name = heroName;
	}
	
	//通过this访问属性
	public void setName3(String name) {
		//name代表的时参数name
		//this.name代表的时属性name
		this.name = name;
	}
	public static void main(String[] args) {
		
		HeroSix h = new HeroSix();
		
		h.setName1("teemo");
		System.out.println(h.name);
		
		h.setName2("garen");;
		System.out.println(h.name);
		
		h.setName3("死歌");
		System.out.println(h.name);
		

	}

}
