package com.czp.Operator;

public class BitOperationTest {

	public static void main(String[] args) {
		System.out.println("------------------һ�������Ķ����Ʊ��-----------------------");
		int i = 5;
		String b = (Integer.toBinaryString(i));
		System.out.println(i + " �Ķ����Ʊ���ǣ� " + b);
		System.out.println("--------------------λ��-----------------------------------");
		int j = 5;
		int k = 6;
		System.out.println(Integer.toBinaryString(j));   //5�Ķ�������101
		System.out.println(Integer.toBinaryString(k));   //6�Ķ�������110
		System.out.println(j|k);
		System.out.println("-------------------λ��------------------------------------");
		int q = 5;
		int w = 6;
		System.out.println(Integer.toBinaryString(q));
		System.out.println(Integer.toBinaryString(w));
		System.out.println(q&w);
		
		System.out.println("--------------------�ָ���------���-----------------------------");
		int e = 5 ;
		int r = 6;
		System.out.println(Integer.toBinaryString(e));
		System.out.println(Integer.toBinaryString(r));
		System.out.println(e^r);                       //����5^6��ÿһλ������,�õ�011->3
		
		System.out.println("----------------------ȡ��------------------------");
		byte t = 5;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(~i);
		
		System.out.println("------------------------����--------------------------------------����---------------------------");
		byte y = 6;
		//6�Ķ�������110
		System.out.println(Integer.toBinaryString(y));
		System.out.println(y<<1);                   //6������1λ�󣬱��1100����Ӧ�ĵ�10������12
		System.out.println(y>>1);                   //6������1λ�󣬱��11,��Ӧ��10������3
		
		System.out.println("------------------------��ϰ-------------����2*6----------------");
		byte u = 16;
		System.out.println(u<<1);
		System.out.println("-----------------�������������޷�������-----------------------------");
		int h = -10;
		
		//-10�Ķ�������11111111111111111111111111110110
		//��һλ��1��������λ����������һ������
		System.out.println(Integer.toBinaryString(h));
		
		//�������������������� >>������е�λ���ƣ�������ǰ�油0
		//���ڸ���������������>>������е�λ���ƣ�������ǰ�油1
		
		//-10������λ����1λ���ƶ���ǰ�油��1
		//�õ�11111111111111111111111111111011
		//��Ϊ��һλ��1��������Ȼ��һ����������Ӧ��ʮ������-5
		int m = h>>1;
		System.out.println(Integer.toBinaryString(m));
		System.out.println(m);
		
		
		//-10�޷���������һλ������λҲ�������ƣ��ͱ����0
		//�õ�01111111111111111111111111111011����Ӧ��ʮ������2147483643
		int n = m>>>1;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(n);
		
		
		

	}

}
