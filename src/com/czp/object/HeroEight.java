package com.czp.object;

public class HeroEight {
	
	String name;
	float hp;
	float armor;
	int moveSpeed;
	
	public HeroEight(String name,float hp) {
		this.name = name;
		this.hp = hp;
		System.out.println("�����������Ĺ��췽��");
	}
	//����������ĸ������Ĺ��췽�������������������Ĺ��췽��
	public HeroEight(String name, float hp, float armor,int moveSpeed) {
		this(name,hp);
		this.armor = armor;
		this.moveSpeed = moveSpeed;
		System.out.println("�ĸ������Ĺ��췽��");
		
	}
	
	public static void main(String[] args) {
		HeroEight czp = new HeroEight("czp",188,865,74);
	}

}
