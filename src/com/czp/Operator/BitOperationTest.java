package com.czp.Operator;

public class BitOperationTest {

	public static void main(String[] args) {
		System.out.println("------------------一个整数的二进制表达-----------------------");
		int i = 5;
		String b = (Integer.toBinaryString(i));
		System.out.println(i + " 的二进制表达是： " + b);
		System.out.println("--------------------位或-----------------------------------");
		int j = 5;
		int k = 6;
		System.out.println(Integer.toBinaryString(j));   //5的二进制是101
		System.out.println(Integer.toBinaryString(k));   //6的二进制是110
		System.out.println(j|k);
		System.out.println("-------------------位与------------------------------------");
		int q = 5;
		int w = 6;
		System.out.println(Integer.toBinaryString(q));
		System.out.println(Integer.toBinaryString(w));
		System.out.println(q&w);
		
		System.out.println("--------------------分割线------异或-----------------------------");
		int e = 5 ;
		int r = 6;
		System.out.println(Integer.toBinaryString(e));
		System.out.println(Integer.toBinaryString(r));
		System.out.println(e^r);                       //所以5^6对每一位或运算,得到011->3
		
		System.out.println("----------------------取非------------------------");
		byte t = 5;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(~i);
		
		System.out.println("------------------------左移--------------------------------------右移---------------------------");
		byte y = 6;
		//6的二进制是110
		System.out.println(Integer.toBinaryString(y));
		System.out.println(y<<1);                   //6向左移1位后，变成1100，对应的的10进制是12
		System.out.println(y>>1);                   //6向右移1位后，变成11,对应的10进制是3
		
		System.out.println("------------------------练习-------------计算2*6----------------");
		byte u = 16;
		System.out.println(u<<1);
		System.out.println("-----------------带符号右移与无符号右移-----------------------------");
		int h = -10;
		
		//-10的二进制是11111111111111111111111111110110
		//第一位是1，即符号位，代表这是一个负数
		System.out.println(Integer.toBinaryString(h));
		
		//对于正数，带符号右移 >>会把所有的位右移，并在最前面补0
		//对于负数，带符号右移>>会把所有的位右移，并在最前面补1
		
		//-10带符号位右移1位，移动后前面补齐1
		//得到11111111111111111111111111111011
		//因为第一位是1，所以依然是一个负数，对应的十进制是-5
		int m = h>>1;
		System.out.println(Integer.toBinaryString(m));
		System.out.println(m);
		
		
		//-10无符号向右移一位，符号位也会向右移，就变成了0
		//得到01111111111111111111111111111011，对应的十进制是2147483643
		int n = m>>>1;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(n);
		
		
		

	}

}
