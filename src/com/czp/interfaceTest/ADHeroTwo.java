package com.czp.interfaceTest;

import LOL.Item;
import LOL.LifePotion;

public class ADHeroTwo extends HeroSixteen implements AD{
	
	int moveSpeed = 400;   //�ƶ��ٶ�
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	
	public int getMoveSpeed() {
		return this.moveSpeed;
	}
	
	public int getMoveSpeed2() {
		return this.moveSpeed;
	}
	
	//��дuseItem,�������е�Ӿ�����userItem����
	public void useItem(Item i) {
		System.out.println("adhero use item");
		super.useItem(i);
	}
	
//	public ADHeroTwo(String name) {
//		//�ؼ���super��ʽ���ø���������Ĺ��췽��
//		super(name);
//		System.out.println("AD Hero�Ĺ��췽��");
//	}
	
	
	
	//ʵ����һ��ADHero()���乹�췽���ᱻ����
	//�丸��Ĺ��췽��Ҳ�ᱻ���ã������Ǹ��๹�췽���ȵ��ã����๹�췽����Ĭ�ϵ��ø�����޲ι��췽��
	public static void main(String[] args) {
	ADHeroTwo h = new ADHeroTwo();
	
	LifePotion lp = new LifePotion();
	h.useItem(lp);
	
	System.out.println(h.getMoveSpeed());
	System.out.println(h.getMoveSpeed2());
	}

}
