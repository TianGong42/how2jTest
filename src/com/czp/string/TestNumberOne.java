package com.czp.string;

public class TestNumberOne {

	public static void main(String[] args) {
		
		//int的最大值
		System.out.println(Integer.MAX_VALUE);
		//int的最小值
		System.out.println(Integer.MIN_VALUE);
		
		byte i = 5;
		Byte it = new Byte(i);
		byte i1 = it.byteValue();
		System.out.println(i1);
		
		int i2 = 2222;
		Integer i3 = new Integer(i2);
		byte i4 = i3.byteValue();
		System.out.println(i4);
		

	}

}
