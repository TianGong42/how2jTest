package com.czp.var;

public class field {

	int i = 1;    //��������i
	public void method1(int i) {   //����Ҳ��i
		System.out.println(i);
		
	}
	
	public static void main(String[] args) {
		new field().method1(5);
	}

}
