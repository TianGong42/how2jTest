package com.czp.interfaceTest;

public class Polymorhpic {

	public static void main(String[] args) {
		//同一个操作符在不同的情境下，具备不同的作用
		//如果+号两侧都是整形，那么+代表数字相加
		//如果+号两侧，任意一个字符串，那么+代表字符串连接
		
		int i = 5;
		int j = 6;
		int k = i + j;    //如果+号两侧都是整形，那么+代表数字相加
		
		System.out.println(k);
		
		int a = 5;
		String b = "5";
		
		String c = a + b;    //如果+号两侧，任意一个是字符串，那么+代表字符串连接
		System.out.println(c);

	}

}
