package com.czp.string;

public class TestNumberTwo {

	public static void main(String[] args) {
		/*
		 * ����ת�ַ���
		 * ����1��ʹ��String��ľ�̬����valueOf
		 * ����2���Ȱѻ�������װ��Ϊ����Ȼ����ö����toString
		 */
		
		int i = 5;
		
		//����1
		String str = String.valueOf(i);
		
		//����2
		Integer it = i;
		String str2 = it.toString();
		
		/*
		 * ����Integer�ľ�̬����parseInt
		 *
		 */
		String s = "999";
		int j = Integer.parseInt(str);
		System.out.println(j);
		
		/*
		 * �Ѹ�����3.14ת��Ϊ�ַ���"3.14"
		 * �ٰ��ַ���"3.14"ת��Ϊ������3.14
		 * 
		 */
		
		double d = 3.14;
		String s1 = String.valueOf(d);
		System.out.println(s1);
		
		double d1 = Double.parseDouble(s1);
		System.out.println(d1);
		

	}

}
