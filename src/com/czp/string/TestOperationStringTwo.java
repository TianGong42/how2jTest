package com.czp.string;

public class TestOperationStringTwo {

	public static void main(String[] args) {
		//trim,去掉首尾空格
		String sentence = "             盖伦,在进行了连续8次击杀后，获得了  超神  的称号            ";
		
		System.out.println(sentence);
		//去掉首尾空格
		System.out.println(sentence.trim());
		
		//toLowerCase 全部变成小写
		//toUpperCase 全部变成大写
		String sentence1 = "Garen";
		System.out.println(sentence1.toLowerCase());
		System.out.println(sentence1.toUpperCase());
		
		//indexOf判断字符或者子字符串出现的位置
		//contains是否包含字符串
		
		System.out.println(sentence.indexOf('8'));
		System.out.println(sentence.indexOf("超神"));
		System.out.println(sentence.lastIndexOf("了"));
		System.out.println(sentence.indexOf(',',5));
		System.out.println(sentence.contains("击杀"));

	}

}
