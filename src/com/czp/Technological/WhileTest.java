package com.czp.Technological;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		
		//��ӡ0��4
		int i = 0;
		while(i<5){
			System.out.println(i);
			i++;
		}
		
		/*
		 * ��ӡ0��4
		 * ��while�������ǣ������Ƿ��������ִ��һ�Σ��ٽ����ж�
		 */
		int j = 0;
		do {
			System.out.println(j);
			j++;
		}while(j<5);
		
		//��ϰ���ײ�
		Scanner input = new Scanner(System.in);
		System.out.println("������һ��������");
		int number = input.nextInt();
		int sum = 1;
		while(number>1) {
			sum = number*sum;
			number--;
		}
		System.out.println("�׳��ǣ�"+ sum);

	}

}
