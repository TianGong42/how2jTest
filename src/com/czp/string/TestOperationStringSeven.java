package com.czp.string;

public class TestOperationStringSeven {

	public static void main(String[] args) {
		// 把最后一个two单词首字母大写
		String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";

		String[] a = s.split(" ");
		for(int i = a.length-1;i>0;i--) {
			if(a[i].equals("two") ) {
				a[i] = "Two";
				break;
			}
		}
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}

}
