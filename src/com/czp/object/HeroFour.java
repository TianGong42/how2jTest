package com.czp.object;

public class HeroFour {
	
	String name;     //����
	float hp;        //Ѫ��
	float armor;     //����
	int moveSpeed;   //�ƶ��ٶ�
	
	//��һ�������Ĺ��췽��
	public HeroFour(String heroname) {
		name = heroname;
	}
	
	//�����������Ĺ��췽��
	public HeroFour(String heroname,float herohp) {
		name = heroname;
		hp = herohp;
	}
	
	//���ĸ������Ĺ��췽��
	public HeroFour(String heroName,float heroHp,float heroArmor, int heroMoveSpeed) {
		name = heroName;
		hp = heroHp;
		armor = heroArmor;
		moveSpeed = heroMoveSpeed;
	}
	
	public static void main(String[] args) {
		HeroFour garen = new HeroFour("����");
		HeroFour teemo = new HeroFour("��Ī", 383);
	}

}
