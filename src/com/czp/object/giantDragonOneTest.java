package com.czp.object;

public class giantDragonOneTest {

	public static void main(String[] args) {
		
		//只能通过getInstance得到对象
		GiantDragonOne g1 = GiantDragonOne.getInstance();
		GiantDragonOne g2 = GiantDragonOne.getInstance();
		GiantDragonOne g3 = GiantDragonOne.getInstance();
		
		//都是同一个对象
		System.out.println(g1 == g2);
		System.out.println(g1 == g3);
	}

}
