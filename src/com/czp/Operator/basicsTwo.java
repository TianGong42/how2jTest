package com.czp.Operator;

public class basicsTwo {

	public static void main(String[] args) {
		//������κ����㵥Ԫ�ĳ��ȳ���int����ô�������Ͱ���ĳ��ȼ���
		int a = 5;
		long b = 6;
		int c = (int)(a+b);  //a+b����������long�ͣ�����Ҫ����ǿ��ת��
		long d = a+b;
		System.out.println(c);

		//����κ����㵥Ԫ�ĳ��ȶ�������int,��ô�������Ͱ���int����
		byte a1 = 1;
		byte b1 = 2;
		byte c1 = (byte)(a+b);  //��Ȼa b����byte���ͣ���������������int���ͣ���Ҫ����ǿ��ת��
		int d1 = a1 + b1;
		
		//%ȡ�������ֽ�ȡģ
		int i = 5;
		int j = 2;
		System.out.println(i%j);
		
	}

}
