package com.czp.string;

public class TestCharTwo {

	public static void main(String[] args) {
		
		System.out.println(Character.isLetter('a'));       //判断是否为字母
		System.out.println(Character.isDigit('a'));        //判断是否为数字
		System.out.println(Character.isWhitespace(' '));   //判断是否空白
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('a'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		//String a = 'a';              //不能直接把一个字符转换成字符串
		String a2 = Character.toString('a');

	}

}
