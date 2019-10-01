package com.czp.Technological;

public class IfTest {

	public static void main(String[] args) {
		
		boolean b = true;
		//如果成立就打印
		if(b) {
			System.out.println("yes");
		}
		
		System.out.println("-----------分割线-----------------多个表达式与一个表达式-----------------");
		boolean a = false;
		//如果有多个表达式，必须用大括弧包括起来
		if(a) {
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		
		//否则表达式2   3  无论是否为true都会执行
		if(a)
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		
		//如果只有一个表达式可以不用写括弧，看上去会简约一些
			if(a) {
				System.out.println("yes1");
			}
			
			if(a)
				System.out.println("yes1");

	}

}
