package com.czp.Technological;

import java.util.Scanner;

public class IsLeapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������    ");
		int year = input.nextInt();
		if(year%4==0 & year % 100 != 0 && year % 400 ==0) {
			System.out.println(year + "������");
		}else {
			System.out.println(year + "��������");
		}

	}

}
