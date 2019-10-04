package com.czp.array;

import java.util.Arrays;

public class JudgeEqualArraysTest {

	public static void main(String[] args) {
		//比较两个数组的内容是否一样
		int a[] = new int[] { 18, 62, 68, 82, 65, 9 };
		int b[] = new int[] { 18, 62, 68, 82, 65, 8 };
		
		System.out.println(Arrays.equals(a, b));
		
		System.out.println("使用同一个值，填充整个数组");
		int c[] = new int[10];
		
		Arrays.fill(c, 5);
		System.out.println(Arrays.toString(c));

	}

}
