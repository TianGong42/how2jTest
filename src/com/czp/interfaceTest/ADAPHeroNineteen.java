package com.czp.interfaceTest;

public class ADAPHeroNineteen extends Heronineteen implements AD,AP{

	@Override
	public void attack() {
		System.out.println("�ȿ��Խ�����������Ҳ���Խ���ħ������");
	}
	
	@Override
	public void magicAttack() {
		System.out.println("����ħ������");
	}
	
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
}
