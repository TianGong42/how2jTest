package com.czp.array;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		//数组复制
		int a[] = new int[]{18,62,68,82,65,9};
		
		//copyOfRange(int[] original, int from ,int to)
		//第一个参数表示源数组
		//第二个参数表示开始位置(取得到)
		//第三个参数表示结束位置(取不到)
		int[] b = Arrays.copyOfRange(a, 0, 3);
		
		for(int i = 0;i < b.length;i++) {
			System.out.print(b[i] + " ");
		}
		
		
		System.out.println();
		//如果打印一个数组的内容，就需要通过for循环挨个遍历，一一打印
		//但是Arrays提供一个toString()方法，直接把一个数组，转换成字符串，这样方便观察数组的内容
		System.out.println("--------------分割线--------------------数组转字符串--------------");
		String content = Arrays.toString(a);
		System.out.println(content);
		
		System.out.println("-------------分割线----------------------排序------------------------");
		//Arrays工具类提供了一个sort方法，只需要一行代码即可完成排序功能
		Arrays.sort(a);
		System.out.println("排序之后");
		System.out.println(Arrays.toString(a));
		
		System.out.println("--------------搜索---------------分割线--------------------");
		//使用binarySearch之前，必须先使用sort进行排序
		System.out.println("数字 62出现的位置:" + Arrays.binarySearch(a, 62));

	}

}
