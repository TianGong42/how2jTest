package com.czp.string;

public class CreateStringTest {

	public static void main(String[] args) {
		String garen = "����";    //����ֵ���������������ֵ�ͻᴴ��һ���ַ�������
		String teemo = new String("��Ī");  //�����������ַ�������
		char[] cs = new char[] {'��','˹','��'};
		String hero = new String(cs);     //ͨ���ַ����ִ���һ���ַ�������
		String hero3 = garen + teemo;     //ͨ��+�Ϻý����ַ���ƴ��
		

	}

}
