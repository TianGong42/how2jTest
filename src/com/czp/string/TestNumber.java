package com.czp.string;

public class TestNumber {

	public static void main(String[] args) {
		int i = 5;
		/*
		 * 所有的基本类型，都对应的类类型
		 * 比如int对应的类是Integer
		 * 这种类就叫做封装类
		 */
		//把一个基本类型的变量，转换为Integer对象
		Integer it = new Integer(i);
		//把一个Integer对象，转换为一个基本类型的int
		int i2 = it.intValue();
		
		int  j = 5;
		Integer jt = new Integer(j);
		//Integer是Number的子类，所以打印true
		System.out.println(jt instanceof Number);

	}

}
