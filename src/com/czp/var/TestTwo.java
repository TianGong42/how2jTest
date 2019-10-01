package com.czp.var;

public class TestTwo {

	public static void main(String[] args) {
		long val = 26L;     //以L结尾的字面值表示long型
		int decVal = 26;    //默认就是int型
		int hexVal = 0x1a;  //16进制
		int oxVal = 032;    //8进制
		int binVal = 0b11010; //2进制
		System.out.println(oxVal);

		
		float f1 = 123.4F;  //以F结尾的字面值表示folat类型
		double d1 = 123.4;  //默认就是double类型
		double d2 = 1.235e2;//科学计数法表示double
		
		String name = "盖伦";
		char a = 'c';
		
		//以下是转义字符
		char tab = '\t';
		char carriageReturn = '\r'; //回车
		char doubleQuote = '\"';    //双引号
		char singleQuote = '\'';    //单引号
		char backslash = '\\';      //反斜杠
	}

}
