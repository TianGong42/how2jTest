package com.czp.string;

public class StringFormat {

	public static void main(String[] args) {
	String name = "����";
	int kill = 8;
	String title = "����";
	
	//ֱ��ʹ��+�����ַ������ӣ�����о���ȽϷ���������ά���Բ�׶��Բ�
	String sentence = name + " �ڽ���������  " + kill +  " �λ�ɱ�󣬻����  " + title + " �ĳƺ�";
	System.out.println(sentence);
	
	//��ʽ���ַ���
	//%s��ʾ�ַ�����%d�������֣�%n��ʾ����
	String sentenceFormat = "%s �ڽ��������� %d�λ�ɱ�� �����%s�ĳƺ�%n";
	String sentence2 = String.format(sentenceFormat, name,kill,title);
	System.out.println(sentence2);
	
	String len = "����";
	System.out.println(len.length());
	String unknowHero = "";
	//�����г���Ϊ0���ַ����������ַ���
	System.out.println(unknowHero.length());

	}

}
