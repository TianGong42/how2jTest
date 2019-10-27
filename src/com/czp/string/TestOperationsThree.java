package com.czp.string;

public class TestOperationsThree {

	public static void main(String[] args) {
		//replaceAll替换所有的
		//replaceFirst只替换第一个
		
		String sentence = "盖伦,在进行了连续8次击杀后,获得了超神 的称号";
		String temp = sentence.replaceAll("击杀", "被击杀");
		temp = temp.replaceAll("超神", "超鬼");
		System.out.println(temp);
		temp = sentence.replaceFirst(",", "");
		System.out.println(temp);

	}

}
