package com.czp.Operator;

import java.util.Scanner;

public class ThreeElementOperation {

	public static void main(String[] args) {
		int i = 5;
		int j = 6;
		
		int k = i < j ? 99:98;
		System.out.println(k);
		//�൱��
		if(i < j) {
			k = 99;
		}else {
			k = 98;
		}
		
		System.out.println(k);
		
		Scanner input = new Scanner(System.in);
		System.out.println("�������ܼ���");
		int n = input.nextInt();
		System.out.println(n!=6 & n!=7 ? "�����ǹ�����":"��������ĩ");

	}

}
