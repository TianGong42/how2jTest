package com.czp.object;

public class HeroNight {
	
	//�������ʹ���,�ڷ����ڣ��޷��޸ķ�����Ļ������Ͳ���
	String name;   //����
	float hp;      //Ѫ��
	float armor;   //����
	int moveSpeed; //�ƶ��ٶ�
	
	public HeroNight() {
		
	}
	
	//��Ѫ
	public void huixue(int xp) {
		hp = hp = xp;
		//��Ѫ��Ϻ�Ѫƿ=0
		xp = 0;
	}
	
	public HeroNight(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}

	public static void main(String[] args) {
		HeroNight teemo = new HeroNight("��Ī",383);
		//Ѫƿ,��ֵ��100
		int xueping = 100;
		
		//��Īͨ�����Ѫƿ��Ѫ
		teemo.huixue(xueping);
		System.out.println(xueping);

	}

}
