package com.czp.array;

import java.util.Arrays;

public class TwoDimensionalArraySortTest {

	public static void main(String[] args) {
		int[][] a = new int[5][8];
		
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		System.out.println("以上是第一次打印");
		int[] b = new int[40];
		int n = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				b[n] = a[i][j];
				n++;
				//System.out.print(a[i][j] + " ");
			}
		}
		Arrays.sort(b);
		n = 0;
		//System.out.println(Arrays.toString(b));
		//排序后打印
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[i].length;j++) {
				a[i][j] = b[n];
				n++;
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		

	}

}
