package com.czp.string;

public class TestPrintOne {

	public static void main(String[] args) {
		String name = "����";
		int kill = 8;
		String title = "����";
		
		//ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���
		String sentence = name + " �ڽ��������� " + kill + " �λ�ɱ�󣬻���� " +  title + " �ĳƺ�";
		System.out.println(sentence);
		
		//ʹ�ø�ʽ�����
		String sentenceFormat = "%s �ڽ��������� %d �λ�ɱ�� ����� %s �ĳƺ�%n";
		System.out.printf("���ǻ��з�%n");
		System.out.printf(sentenceFormat,name,kill,title);
		
		
	}

}
