package com.czp.string;

public class TestOperationStringTwo {

	public static void main(String[] args) {
		//trim,ȥ����β�ո�
		String sentence = "             ����,�ڽ���������8�λ�ɱ�󣬻����  ����  �ĳƺ�            ";
		
		System.out.println(sentence);
		//ȥ����β�ո�
		System.out.println(sentence.trim());
		
		//toLowerCase ȫ�����Сд
		//toUpperCase ȫ����ɴ�д
		String sentence1 = "Garen";
		System.out.println(sentence1.toLowerCase());
		System.out.println(sentence1.toUpperCase());
		
		//indexOf�ж��ַ��������ַ������ֵ�λ��
		//contains�Ƿ�����ַ���
		
		System.out.println(sentence.indexOf('8'));
		System.out.println(sentence.indexOf("����"));
		System.out.println(sentence.lastIndexOf("��"));
		System.out.println(sentence.indexOf(',',5));
		System.out.println(sentence.contains("��ɱ"));

	}

}
