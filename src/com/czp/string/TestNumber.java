package com.czp.string;

public class TestNumber {

	public static void main(String[] args) {
		int i = 5;
		/*
		 * ���еĻ������ͣ�����Ӧ��������
		 * ����int��Ӧ������Integer
		 * ������ͽ�����װ��
		 */
		//��һ���������͵ı�����ת��ΪInteger����
		Integer it = new Integer(i);
		//��һ��Integer����ת��Ϊһ���������͵�int
		int i2 = it.intValue();
		
		int  j = 5;
		Integer jt = new Integer(j);
		//Integer��Number�����࣬���Դ�ӡtrue
		System.out.println(jt instanceof Number);

	}

}
