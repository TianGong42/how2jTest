package com.czp.interfaceTest;

public abstract class Heronineteen {
	String name;
	
	float  hp;
	float  armor;
	int moveSpeed;
	/*
	 * ΪHero����һ�����󷽷�attack,���Ұ�Hero����Ϊabstract��
	 * APHero,ADHero,ADAPHero��Hero�����࣬�̳���Hero�����Ժͷ���
	 * ���Ǹ��ԵĹ����ֶβ�һ��������̳�Hero�����Щ����ͱ����ṩ��һ����attack����ʵ��
	 */
	public abstract void attack();
	
	public static void main(String[] args) {
		//��Ȼû�г��󷽷�������һ��������Ϊ�˳����࣬�Ͳ��ܹ�ֱ��ʵ����
		//Heronineteen h = new Heronineteen();
	}

}
