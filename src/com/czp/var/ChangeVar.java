package com.czp.var;

public class ChangeVar {

	public static void main(String[] args) {
		//��������ת�����򣺴�С�����Զ�ת���Ӵ�Сǿ��ת
	    char c = 'A';
	    short  s = 80;
	    //��Ȼshort��char����16λ��������һ����
	    //���Ǳ˴�֮ǰ����Ȼ��Ҫ����ǿ��ת��
	    c = (char)s;
	    //ֱ��ת��������ֱ������
	    // s = c;
	    
	    long l = 50;
	    int i = 50;
	    
	    // int�Ƚ�С��Ҫ�Ž��Ƚϴ��long,�����ô�������ŵĽ�ȥ
	    l = i;
	    
	    byte b = 5;
	    int i1 = 10;
	    int i2 = 300;
	    
	    b = (byte)i1;
	    //��Ϊi1��ֵ����byte��Χ֮�ڣ����Լ������ǿ��ת�������õ���ֵҲ��10
	    System.out.println(b);
	    
	    //��Ϊi2��ֵ����byte��Χ֮�⣬���Ծͻᰴ��byte�ĳ��Ƚ��н�ȡ
	    //i2��ֵ��300�����Ӧ�Ķ���������100101100
	    //����byte�ĳ���8λ���н�ȡ����ֵΪ00101100��44
	    b = (byte) i2;
	    System.out.println(b);
	    
	    //�鿴һ��������Ӧ�Ķ����Ƶķ���
	    System.out.println(Integer.toBinaryString(i2));
	    
	    short a1 = 1;
	    short a2 = 2;
	    System.out.println(a1 + a2);

	}

}
