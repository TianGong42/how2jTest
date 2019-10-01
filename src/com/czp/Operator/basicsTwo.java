package com.czp.Operator;

public class basicsTwo {

	public static void main(String[] args) {
		//如果有任何运算单元的长度超过int，那么运算结果就按最长的长度计算
		int a = 5;
		long b = 6;
		int c = (int)(a+b);  //a+b的运算结果是long型，所以要进行强制转换
		long d = a+b;
		System.out.println(c);

		//如果任何运算单元的长度都不超过int,那么运算结果就按照int计算
		byte a1 = 1;
		byte b1 = 2;
		byte c1 = (byte)(a+b);  //虽然a b都是byte类型，但是运算结果都是int类型，需要进行强制转换
		int d1 = a1 + b1;
		
		//%取余数，又叫取模
		int i = 5;
		int j = 2;
		System.out.println(i%j);
		
	}

}
