package com.czp.Operator;

import java.util.Scanner;

public class ThreeElementOperation {

	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		
		int k = i < j ? 99:98;
		System.out.println(k);
		//相当于
		if(i < j) {
			k = 99;
		}else {
			k = 98;
		}
		
		System.out.println(k);
		
		Scanner input = new Scanner(System.in);
		System.out.println("今天是周几？");
		int n = input.nextInt();
		System.out.println(n!=6 & n!=7 ? "今天是工作日":"今天是周末");

	}

}
