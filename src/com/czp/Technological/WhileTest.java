package com.czp.Technological;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		//打印0到4
		int i = 0;
		while(i<5){
			System.out.println(i);
			i++;
		}
		
		/*
		 * 打印0到4
		 * 与while的区别是，无论是否成立，先执行一次，再进行判断
		 */
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while(j<5);
		
		//练习，阶层
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int number = input.nextInt();
		int sum = 1;
		while(number>1) {
			sum = number*sum;
			number--;
		}
		System.out.println("阶乘是："+ sum);

	}

}
