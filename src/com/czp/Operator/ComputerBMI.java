package com.czp.Operator;

import java.util.Scanner;

public class ComputerBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("��������ߣ�m��:");
		double m = input.nextDouble();
		System.out.println("����������(kg):");
		double kg = input.nextDouble();
		System.out.println("��ǰ��BMI��: " + (kg/(m*m)));
		

	}

}
