package com.czp.array;

import java.util.Arrays;

public class JudgeEqualArraysTest {

	public static void main(String[] args) {
		//�Ƚ���������������Ƿ�һ��
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println("ʹ��ͬһ��ֵ�������������");
		int c[] = new int[10];
		
		Arrays.fill(c, 5);
		System.out.println(Arrays.toString(c));

	}

}
