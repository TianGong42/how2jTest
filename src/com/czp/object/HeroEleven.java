package com.czp.object;

public class HeroEleven {
	String name;    //姓名
	float hp;       //血量
	float armor;    //护甲
	int moveSpeed;  //移动速度
	
	public HeroEleven() {
		
	}
	
	public HeroEleven(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//复活
	public void revive(HeroEleven h) {
		h = new HeroEleven("提莫",383);
	}
	
	public static void main(String[] args) {
		HeroEleven teemo = new HeroEleven("提莫",383);
	    
		//受到400伤害,挂了
		teemo.hp = teemo.hp - 400;
		System.out.println(teemo.hp);
		
		//按照理解，这里teemo是一个引用，作为入参新copy了一份入参，然后创建了一个对象。这个理解也很怪。再说了
		teemo.revive(teemo);
		System.out.println(teemo.hp);
		
		
	}
}
