package com.czp.Technological;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入身高(m)：");
		float m = input.nextFloat();
		System.out.println("请输入体重(kg):");
		float kg = input.nextFloat();
		float bmi = kg/(m*m);
		System.out.println(bmi);
		if(bmi<18.5) {
			System.out.println("身体状态是：中度肥胖");
		}else if(bmi>=18.5 & bmi<24) {
			System.out.println("身体状态是：正常范围");
		}else if(bmi >=24 & bmi <30) {
			System.out.println("身体状态是：轻度肥胖");
		}else if(bmi >=30 & bmi < 35) {
			System.out.println("身体状态是：中度肥胖");
		}else if(bmi >= 35) {
			System.out.println("身体状态是：重度肥胖");
			
		}
	
		
	}

}
