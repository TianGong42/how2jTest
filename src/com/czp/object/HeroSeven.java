package com.czp.object;

public class HeroSeven {
	
	String name;   //����
	float hp;      //Ѫ��
	int moveSpeed; //�ƶ��ٶ�
	
	//��һ�������Ĺ��췽��
	public HeroSeven(String name) {
		System.out.println("һ�������Ĺ��췽��");
		this.name = name;
	}
	
	//�����������Ĺ��췽��
	//ͨ��this���������õ�һ�����췽��
	public HeroSeven(String name,float hp) {
		this(name);
		System.out.println("���������Ĺ��췽��");
		this.hp = hp;
	}
	
	public static void main(String[] args) {
		HeroSeven teemo = new HeroSeven("��Ī",383);
		System.out.println(teemo.name);
	}

}
