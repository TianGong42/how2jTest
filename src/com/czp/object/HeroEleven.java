package com.czp.object;

public class HeroEleven {
	String name;    //����
	float hp;       //Ѫ��
	float armor;    //����
	int moveSpeed;  //�ƶ��ٶ�
	
	public HeroEleven() {
		
	}
	
	public HeroEleven(String name, float hp) {
		this.name = name;
		this.hp = hp;
	}
	
	//����
	public void revive(HeroEleven h) {
		h = new HeroEleven("��Ī",383);
	}
	
	public static void main(String[] args) {
		HeroEleven teemo = new HeroEleven("��Ī",383);
	    
		//�ܵ�400�˺�,����
		teemo.hp = teemo.hp - 400;
		System.out.println(teemo.hp);
		
		//������⣬����teemo��һ�����ã���Ϊ�����copy��һ����Σ�Ȼ�󴴽���һ������������Ҳ�ܹ֡���˵��
		teemo.revive(teemo);
		System.out.println(teemo.hp);
		
		
	}
}
