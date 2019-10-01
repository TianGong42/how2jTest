package com.czp.Operator;

import java.util.Scanner;

public class ComputerBMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入身高（m）:");
		double m = input.nextDouble();
		System.out.println("请输入体重(kg):");
		double kg = input.nextDouble();
		System.out.println("当前的BMI是: " + (kg/(m*m)));
		

	}

}
