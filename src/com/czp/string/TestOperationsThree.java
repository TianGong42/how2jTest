package com.czp.string;

public class TestOperationsThree {

	public static void main(String[] args) {
		//replaceAll�滻���е�
		//replaceFirstֻ�滻��һ��
		
		String sentence = "����,�ڽ���������8�λ�ɱ��,����˳��� �ĳƺ�";
		String temp = sentence.replaceAll("��ɱ", "����ɱ");
		temp = temp.replaceAll("����", "����");
		System.out.println(temp);
		temp = sentence.replaceFirst(",", "");
		System.out.println(temp);

	}

}
