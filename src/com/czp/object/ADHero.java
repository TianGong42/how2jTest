package com.czp.object;

public class ADHero extends HeroOne{
	//�������أ���������һ���ģ����ǲ������Ͳ�һ��
	public void attack() {
		System.out.println(name + "������һ�ι��������ǲ�ȷ��������˭��");
	}
	
//	public void attack(HeroOne h1) {
//		System.out.println(name + "��" + h1.name + "������һ�ι���  ");
//	}
//	
//	public void attack(HeroOne h1, HeroOne h2) {
//		System.out.println(name + "ͬʱ��" + h1.name + "��" + h2.name + "�����˹��� ");
//	}
	
	/*
	 * ������Բ��ÿɱ�������Ĳ�����ֻ��Ҫ���һ������
	 */
	public void attack(HeroOne ...heroOnes) {
		for(int i = 0;i < heroOnes.length;i++) {
			System.out.println(name+" ������ " + heroOnes[i].name);
		}
	}
	
	public static void main(String[] args) {
		ADHero bh = new ADHero();
		bh.name = "�ͽ�����";
		
		HeroOne h1 = new HeroOne();
		h1.name = "����";
		HeroOne h2 = new HeroOne();
		h2.name = "��Ī";
		
		bh.attack();
		bh.attack(h1);
		bh.attack(h1,h2);
	}
	

}
