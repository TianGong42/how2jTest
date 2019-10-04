package com.czp.array;

public class FindMaxTest {
	/*
	 * 定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
找出这个二维数组里，最大的那个值，并打印出其二维坐标

	 */
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int max = 0;
		int n = 0,m = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.printf("%5d",a[i][j] );
			}
			System.out.println();
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				if(max<a[i][j]) {
					max = a[i][j];
					n = i;
					m = j;
				}
			}
		}
		System.out.println("找出来最大的时：" + max);
		System.out.println("其坐标是[" + m +"][" + n + "]" );

	}

}
