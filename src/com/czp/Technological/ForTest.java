package com.czp.Technological;

public class ForTest {

	public static void main(String[] args) {
		//使用While打印0到4
		int i = 0;
		while(i<5) {
			System.out.println("while循环输出"+i);
			i++;
		}
		
		//使用for打印0到4
		for(int j = 0;j<5;j++) {
			System.out.println("for 循环输出" + j);
		}

		//----------------分割线--------------乞丐
		/*
		 * 天朝有一个乞丐姓洪，去天桥要钱
第一天要了1块钱
第二天要了2块钱
第三天要了4块钱
第四天要了8块钱
以此类推

问题： 洪乞丐干10天，收入是多少？
		 */
		int sumMoney = 0;
		for(int j = 0;j<10;j++) {
			sumMoney = sumMoney + (int)Math.pow(2, j);
		}
		System.out.println("最后乞丐的收入是" + sumMoney);
	}

}
