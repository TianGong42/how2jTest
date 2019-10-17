package com.czp.string;

public class TestNumberTwo {

	public static void main(String[] args) {
		/*
		 * 数字转字符串
		 * 方法1：使用String类的静态方法valueOf
		 * 方法2：先把基本类型装箱为对象，然后调用对象的toString
		 */
		
		int i = 5;
		
		//方法1
		String str = String.valueOf(i);
		
		//方法2
		Integer it = i;
		String str2 = it.toString();
		
		/*
		 * 调用Integer的静态方法parseInt
		 *
		 */
		String s = "999";
		int j = Integer.parseInt(str);
		System.out.println(j);
		
		/*
		 * 把浮点数3.14转换为字符串"3.14"
		 * 再把字符串"3.14"转换为浮点数3.14
		 * 
		 */
		
		double d = 3.14;
		String s1 = String.valueOf(d);
		System.out.println(s1);
		
		double d1 = Double.parseDouble(s1);
		System.out.println(d1);
		

	}

}
