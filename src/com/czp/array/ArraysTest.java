package com.czp.array;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		//���鸴��
		int a[] = new int[]{18,62,68,82,65,9};
		
		//copyOfRange(int[] original, int from ,int to)
		//��һ��������ʾԴ����
		//�ڶ���������ʾ��ʼλ��(ȡ�õ�)
		//������������ʾ����λ��(ȡ����)
		int[] b = Arrays.copyOfRange(a, 0, 3);
		
		for(int i = 0;i < b.length;i++) {
			System.out.print(b[i] + " ");
		}
		
		
		System.out.println();
		//�����ӡһ����������ݣ�����Ҫͨ��forѭ������������һһ��ӡ
		//����Arrays�ṩһ��toString()������ֱ�Ӱ�һ�����飬ת�����ַ�������������۲����������
		System.out.println("--------------�ָ���--------------------����ת�ַ���--------------");
		String content = Arrays.toString(a);
		System.out.println(content);
		
		System.out.println("-------------�ָ���----------------------����------------------------");
		//Arrays�������ṩ��һ��sort������ֻ��Ҫһ�д��뼴�����������
		Arrays.sort(a);
		System.out.println("����֮��");
		System.out.println(Arrays.toString(a));
		
		System.out.println("--------------����---------------�ָ���--------------------");
		//ʹ��binarySearch֮ǰ��������ʹ��sort��������
		System.out.println("���� 62���ֵ�λ��:" + Arrays.binarySearch(a, 62));

	}

}
