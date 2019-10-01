package com.czp.Operator;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 10;
		int j = 5;
		int a = i + j;
		int b = i - j;
		int c = i * j;
		int d = i / j;
		
		int n = input.nextInt();
		System.out.println("第一个整数" + n);
		int m = input.nextInt();
		System.out.println("第二个整数：" + m);
		System.out.println("两个整数的和是: " + (n + m));

	}

}
