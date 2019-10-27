package com.czp.string;

public class TestMathTwo {
	/*
	 * 找出10000000以内有多少质数
	 */
	public static void main(String[] args) {
		int sum =0;   //计数器
		
		for(int i = 2;i<10000000;i++) {
			boolean b = true;
			for(int j = 2;j<i/2+1;j++) {
				if(i % j == 0) {
					b = false;
				}
			}
			if(b == true) {
				sum++;
				System.out.println(sum);
				
			}
		}
		System.out.println("一千万以内的质数一共有："+ sum);

	}

}
