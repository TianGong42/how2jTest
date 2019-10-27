package com.czp.string;

public class StringFormat {

	public static void main(String[] args) {
	String name = "盖伦";
	int kill = 8;
	String title = "超神";
	
	//直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差，易读性差
	String sentence = name + " 在进行了连续  " + kill +  " 次击杀后，获得了  " + title + " 的称号";
	System.out.println(sentence);
	
	//格式化字符串
	//%s表示字符串，%d表述数字，%n表示换行
	String sentenceFormat = "%s 在进行了连续 %d次击杀后， 获得了%s的称号%n";
	String sentence2 = String.format(sentenceFormat, name,kill,title);
	System.out.println(sentence2);
	
	String len = "盖伦";
	System.out.println(len.length());
	String unknowHero = "";
	//可以有长度为0的字符串，即空字符串
	System.out.println(unknowHero.length());

	}

}
