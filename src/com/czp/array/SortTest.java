package com.czp.array;

public class SortTest {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i = 0;i<a.length;i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i] + " ");
		}
		System.out.println("初始化打印");
		
		//选择排序法,从小到大打印
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("选择排序，从小到大打印");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//System.out.println("冒泡排序，从大到小");
	

	}

}
