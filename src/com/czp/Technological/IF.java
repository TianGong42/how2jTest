package com.czp.Technological;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���������(m)��");
		float m = input.nextFloat();
		System.out.println("����������(kg):");
		float kg = input.nextFloat();
		float bmi = kg/(m*m);
		System.out.println(bmi);
		if(bmi<18.5) {
			System.out.println("����״̬�ǣ��жȷ���");
		}else if(bmi>=18.5 & bmi<24) {
			System.out.println("����״̬�ǣ�������Χ");
		}else if(bmi >=24 & bmi <30) {
			System.out.println("����״̬�ǣ���ȷ���");
		}else if(bmi >=30 & bmi < 35) {
			System.out.println("����״̬�ǣ��жȷ���");
		}else if(bmi >= 35) {
			System.out.println("����״̬�ǣ��ضȷ���");
			
		}
	
		
	}

}
