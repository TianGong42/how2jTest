package com.czp.string;

public class TestCharOne {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = '1';
		char c3 = '中';
		
		/*
		 * char对应的封装类是Character
		 */
		char b = 'a';
		Character c = b;//自动装箱
		b = c;			//自动拆箱

	}

}
