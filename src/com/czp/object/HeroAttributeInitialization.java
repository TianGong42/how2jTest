package com.czp.object;

public class HeroAttributeInitialization {

	/*
	 * �������Գ�ʼ��������3��
	 * 1�����������Ե�ʱ���ʼ��
	 * 2�����췽���г�ʼ��
	 * 3����ʼ����
	 */
	public String name = "some hero";   //���������Ե�ʱ���ʼ��
	protected float hp;
	float maxHp;
	
	{
		maxHp = 200; //��ʼ����
	}
	
	public HeroAttributeInitialization() {
		hp = 100;      //���췽���г�ʼ��
	}
	
}
