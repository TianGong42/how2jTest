package com.czp.object;

public class SupportHero extends HeroOne{
	//练习，创建一个治疗英雄
	public void heal() {
		System.out.println(name  + " 放了个大招，不知道给谁治疗");
	}
	
	public void heal(HeroOne h) {
		System.out.println(name + " 给" + h.name + "加血");
	}

	public void heal(HeroOne h, int hp) {
		System.out.println(name + " 给" + h.name + hp + "点血");
	}
	
	public static void main(String[] args) {
		SupportHero CaiWenJi = new SupportHero();
		CaiWenJi.name = "蔡文姬";
		
		HeroOne DianWei = new HeroOne();
		DianWei.name = "典韦";
		CaiWenJi.heal();
		CaiWenJi.heal(DianWei,100);
		
	}
}
