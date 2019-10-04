package com.czp.array;

public class ForEachTest {

	public static void main(String[] args) {
		int values [] = new int[] {18,62,68,65,9};
		//常规遍历
		for(int i = 0;i<values.length;i++) {
			int each = values[i];
			System.out.print(each+" ");
		}
		System.out.println();
		
		//增强型for循环遍历
		for(int each:values) {
			System.out.print(each + " ");
		}

	}

}
