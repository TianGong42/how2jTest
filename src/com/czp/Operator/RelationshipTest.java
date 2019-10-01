package com.czp.Operator;

import java.util.Scanner;

public class RelationshipTest {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 5;
		
		System.out.println(a>b);
		System.out.println(a>=c);
		
		System.out.println(a==b);
		System.out.println(a!=b);
		
		Scanner input = new Scanner(System.in);
		System.out.println("第一个整数: ");
		
		int n = input.nextInt();
		System.out.println("第二个整数： ");
		int m = input.nextInt();
		System.out.println("比较"+ m +">" + n + ":" + (n > m));
		

	}

}
