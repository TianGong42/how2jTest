package com.czp.object;

public class HeroOne {
	String name;    //����
	float hp;       //Ѫ��
	float armor;    //����
	int moveSpeed;  //�ƶ��ٶ�

	public static void main(String[] args) {
		
		//����һ������
		new HeroOne();
		
		//ʹ��һ��������ָ���������
		HeroOne h = new HeroOne();
		
		//h1,h2,h3,h4,h5 ������ã���ָ��ͬһ������
		HeroOne h1 = new HeroOne();
		HeroOne h2 = h1;
		HeroOne h3 = h1;
		HeroOne h4 = h1;
		HeroOne h5 = h4;
		
		
		

	}

}
