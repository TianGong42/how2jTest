package com.czp.interfaceTest;

public interface Mortal {
	
	public void die();
	
	default public void revive() {
		System.out.println("��Ӣ�۸�����");
	}
}
