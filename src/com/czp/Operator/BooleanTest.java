package com.czp.Operator;

public class BooleanTest {

	public static void main(String[] args) {
		//������  ���۵�һ�����ʽ��ֵ��true������false���ڶ���ֵ�����ᱻ����
		int i = 2;
		System.out.println(i==1 & i++ == 2);
		System.out.println(i);
		
		//��·�� ֻҪ��һ�����ʽ��ֵ��false�ģ��ڶ����˱��ʽ��ֵ���Ͳ���Ҫ��������
		int j = 2;
		//��Ϊj==1����false,�����ұߵ�j++��û��ִ�У�����j��ֵ����2
		System.out.println(j == 1 && j++ == 2);
		System.out.println(j);
		System.out.println("-----------�ָ���-----------------------------");
		
		//��·��   ���۵�һ�����ʽ��ֵ��true����false,�ڶ�����ֵ�����ᱻ����
		int a = 2;
		System.out.println(a == 1 | a++ == 2);  //�������i++���ᱻִ�У�����i��ֵ�����3
		System.out.println(a);
		//��·�� ֻҪ��һ�����ʽ��ֵ��true�ģ��ڶ������ʽ��ֵ���Ͳ���Ҫ����������
		int b = 2;
		System.out.println(b == 2 || b++ == 2);  //��Ϊj==2����true,�����ұߵ�j++��û��ִ���ˣ�j=2
		System.out.println(b);
		
		
		System.out.println("------------------�ָ���----ȡ��-------------------------");
		boolean c = true;
		
		System.out.println(c);
		System.out.println(!c);
		
		System.out.println("--------------------�ָ���----���-----------------------");
		//��ͬ,�����档��ͬ�����ؼ�
		boolean d = true;
		boolean e = true;
		System.out.println(d^e);
		System.out.println(d^!e);
		System.out.println("--------------------�ָ���-----ϰ��-------------------");
		int f = 1;
		boolean g = !(f++ == 3) ^ (f++ ==2) && (f++==3);   //���һ��f++û��ִ��
		System.out.println(g);
		System.out.println(f);

	}

}
