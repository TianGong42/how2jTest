package com.czp.object;

public class giantDragonOneTest {

	public static void main(String[] args) {
		
		//ֻ��ͨ��getInstance�õ�����
		GiantDragonOne g1 = GiantDragonOne.getInstance();
		GiantDragonOne g2 = GiantDragonOne.getInstance();
		GiantDragonOne g3 = GiantDragonOne.getInstance();
		
		//����ͬһ������
		System.out.println(g1 == g2);
		System.out.println(g1 == g3);
	}

}
