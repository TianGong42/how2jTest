package com.czp.interfaceTest;

import LOL.Item;

/*
 * ׼����ʾ�ṩ�޲εĹ��췽���ĸ���
 * ��ʵ����Hero�����ʱ���乹�췽�����ӡ��������
 * ����һ�����ʱ���Ĭ�ϼ̳�Object��
 */
public class HeroSixteen extends Object{

	String name;
	
	float hp;
	float armor;
	int moveSpeed;
	
	public void useItem(Item i) {
		System.out.println("hero use item");
		i.effect();
	}
	
	public HeroSixteen() {
		System.out.println("HeroSixteen���޲ι��췽�� ");
	}
	
	public HeroSixteen(String name) {
		System.out.println("HeroSixteen��һ���в����Ĺ��췽�� ");
	}
	
	public static void main(String[] args) {
		new HeroSixteen();
		HeroSixteen h = new HeroSixteen();
		h.name = "����";
		System.out.println(h.toString());
		//ֱ�Ӵ�ӡ������Ƕ����toString����ֵ
		System.out.println(h);
	}
}
