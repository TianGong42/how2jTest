package com.czp.array;

public class BubbleSort {
	//冒泡排序
	public static void main(String[] args) {
		int a [] = new int[] {18,62,68,82,65,9};
		//排序前，先把内容打印出来
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" 初始内容");
		//冒泡法排序
		
		//第一步：从第一位开始，把相邻两位进行比较
		//如果发现前面的比后面的大，就把大的数据交换在后面
		
		for(int i = 0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		//把内容打印出来
		//可以发现，最大的到了最后面
		for(int i = 0;i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" 第一次排序");
		
		//第二步：再来一次，只不过不用比较最后一位
		for(int i = 0;i<a.length-2;i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println(" "); 
		//可以发现一个规律
		//后边界在收缩
		//所以可以在外面套一层循环
		
		for(int j = 0;j<a.length;j++) {
			for(int i = 0;i < a.length-j-1;i++) {
				if(a[i]>a[i+1]) {
					int temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
		//把内容打印出来
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
		

	}

}
