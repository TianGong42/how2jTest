package com.czp.string;

public class TestCharTwo {

	public static void main(String[] args) {
		
		System.out.println(Character.isLetter('a'));       //�ж��Ƿ�Ϊ��ĸ
		System.out.println(Character.isDigit('a'));        //�ж��Ƿ�Ϊ����
		System.out.println(Character.isWhitespace(' '));   //�ж��Ƿ�հ�
		System.out.println(Character.isUpperCase('a'));
		System.out.println(Character.isLowerCase('a'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
		
		//String a = 'a';              //����ֱ�Ӱ�һ���ַ�ת�����ַ���
		String a2 = Character.toString('a');

	}

}
