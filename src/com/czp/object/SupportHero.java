package com.czp.object;

public class SupportHero extends HeroOne{
	//��ϰ������һ������Ӣ��
	public void heal() {
		System.out.println(name  + " ���˸����У���֪����˭����");
	}
	
	public void heal(HeroOne h) {
		System.out.println(name + " ��" + h.name + "��Ѫ");
	}

	public void heal(HeroOne h, int hp) {
		System.out.println(name + " ��" + h.name + hp + "��Ѫ");
	}
	
	public static void main(String[] args) {
		SupportHero CaiWenJi = new SupportHero();
		CaiWenJi.name = "���ļ�";
		
		HeroOne DianWei = new HeroOne();
		DianWei.name = "��Τ";
		CaiWenJi.heal();
		CaiWenJi.heal(DianWei,100);
		
	}
}
