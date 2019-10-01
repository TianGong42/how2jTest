package com.czp.var;

public class field {

	int i = 1;    //属性名是i
	public void method1(int i) {   //参数也是i
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		new field().method1(5);
	}

}
