package com.czp.interfaceTest;

public abstract class HeroTwentyTwo {
	
	String name;
	
	float armor;
	
	int moveSpeed;
	
	public abstract void attack();
	
	public void main(String[] args) {
		ADHeroTwentyTwo adh = new ADHeroTwentyTwo();
		
		//ͨ����ӡadh�����Կ���adh�����������ADHero��
		adh.attack();
		System.out.println(adh);
		
		HeroTwentyTwo h = new HeroTwentyTwo() {
			public void attack() {
				System.out.println("�µĽ����ֶ�");
			}
		};
		h.attack();
		//ͨ����ӡh,���Կ���h�����������Hero$1��ôһ��ϵͳ�Զ���������
		
		System.out.println(h);
		
	}
}
