package com.czp.string;

public class ChangeCharToUp {

	public static void main(String[] args) {
		//������ַ����޸�ΪӢ�Ĵ�д��ͷ
		String s = "let there be light";
		String[] c = s.split(" ");
		for(String e : c) {
			short a =(short) (e.charAt(0) - 32);
			String b = e.substring(1,e.length());
			System.out.print((char)a + b + " ");
		}

	}

}
