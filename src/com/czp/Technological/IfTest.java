package com.czp.Technological;

public class IfTest {

	public static void main(String[] args) {
		
		boolean b = true;
		//��������ʹ�ӡ
		if(b) {
			System.out.println("yes");
		}
		
		System.out.println("-----------�ָ���-----------------������ʽ��һ�����ʽ-----------------");
		boolean a = false;
		//����ж�����ʽ�������ô�������������
		if(a) {
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		
		//������ʽ2   3  �����Ƿ�Ϊtrue����ִ��
		if(a)
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		
		//���ֻ��һ�����ʽ���Բ���д����������ȥ���ԼһЩ
			if(a) {
				System.out.println("yes1");
			}
			
			if(a)
				System.out.println("yes1");

	}

}
