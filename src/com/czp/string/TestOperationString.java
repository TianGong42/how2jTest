package com.czp.string;

public class TestOperationString {

	public static void main(String[] args) {
		String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";
		//获取字符串的当前位置
		char c = sentence.charAt(0);
		System.out.println(c);
		
		char[] cs = sentence.toCharArray();        //获取对应的字符数字
		System.out.println(sentence.length() == cs.length);
		

		//截取子字符串   subString
		//截取从第三个开始的字符串 （基0)
		String subString1 = sentence.substring(3);
		System.out.println(subString1);
		
		//截取从第3个开始的字符串（基0）
		//到5-1的位置的字符串
		//左闭右开
		String subString2 = sentence.substring(3,5);
		System.out.println(subString2);
		
		//split根据分隔符进行分割，得到3个字符串
		String subSentences[] = sentence.split(",");
		for(String sub:subSentences) {
			System.out.println(sub);
		}
	}

}
