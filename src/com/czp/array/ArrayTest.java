package com.czp.array;

public class ArrayTest {

	public static void main(String[] args) {
		// ����һ������
		int[] a;
		//����һ��������5�����飬����ʹ������aָ�������
		a = new int[5];
		int[] b = new int[5]; //������ͬʱ��ָ��һ������
		
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		System.out.println(a.length);  //��ӡ����ĳ���
		a[4] = 100;   //�±�4��ʵ�����ǡ���5�����������һ��
		//a[5] = 101;   //�±�5��ʵ�����ǡ���6������������Χ�����������±�Խ���쳣
		
		

	}

}
