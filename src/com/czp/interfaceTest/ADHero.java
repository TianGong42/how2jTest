package com.czp.interfaceTest;

import LOL.Hero;
import LOL.Mortal;

public class ADHero extends Hero implements AD,Mortal{
	/*
	 * (non-Javadoc)
	 * @see com.czp.interfaceTest.AD#physicAttack()
	 * ���һ��Ӣ�ۣ��ܹ�ʹ����������
	 * �ࣺADHero
	 * 
	 * ʵ��ĳ���ӿڣ��൱�ڳ�����ĳ��Լ��
	 * ���ԣ�ʵ����AD�ӿڣ��ͱ����ṩAD�ӿ��������ķ���physicAttack()
	 * ʵ�����﷨��ʹ�ùؼ���implements
	 */
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
	@Override
	public void die() {
		System.out.println("ADӢ������");
	}
}
