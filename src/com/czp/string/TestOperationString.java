package com.czp.string;

public class TestOperationString {

	public static void main(String[] args) {
		String sentence = "����,�ڽ���������8�λ�ɱ��,����� ���� �ĳƺ�";
		//��ȡ�ַ����ĵ�ǰλ��
		char c = sentence.charAt(0);
		System.out.println(c);
		
		char[] cs = sentence.toCharArray();        //��ȡ��Ӧ���ַ�����
		System.out.println(sentence.length() == cs.length);
		

		//��ȡ���ַ���   subString
		//��ȡ�ӵ�������ʼ���ַ��� ����0)
		String subString1 = sentence.substring(3);
		System.out.println(subString1);
		
		//��ȡ�ӵ�3����ʼ���ַ�������0��
		//��5-1��λ�õ��ַ���
		//����ҿ�
		String subString2 = sentence.substring(3,5);
		System.out.println(subString2);
		
		//split���ݷָ������зָ�õ�3���ַ���
		String subSentences[] = sentence.split(",");
		for(String sub:subSentences) {
			System.out.println(sub);
		}
	}

}
