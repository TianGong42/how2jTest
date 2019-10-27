package com.czp.string;

public class TestRandomString {

	public static void main(String[] args) {
		int[] a = new int[62];
		for(int i = 0;i<a.length;i++) {
			if(i < 10) {
				a[i] = (short)(i + 48);
			}
			else if(i<36) {
				
				a[i] = (short)(i + 55);
			}else if(i<a.length) {
				a[i] = (short)(i + 61);
			}
		}
		char[] cs = new char[5];
		for(int i = 0;i<cs.length;i++) {
			cs[i] =(char) a[(int)(Math.random()*62)];
			System.out.println(cs[i]);
		}
		String s = new String(cs);
		System.out.println(s);

	}

}
