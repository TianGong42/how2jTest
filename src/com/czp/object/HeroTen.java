package com.czp.object;

public class HeroTen {
	
	String name;        //����
	float hp;           //Ѫ��
	float armor;        //����
	int moveSpeed;      //�ƶ��ٶ�
	
	public HeroTen(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//����һ��Ӣ�ۣ���������damage��Ѫ
	public void attack(HeroTen hero,int damage) {
		hero.hp = hero.hp - damage;
	}

	public static void main(String[] args) {
		HeroTen teemo = new HeroTen("��Ī",383);
		HeroTen garen = new HeroTen("����",616);
		garen.attack(teemo, 100);
		System.out.println(teemo.hp);

	}

}
