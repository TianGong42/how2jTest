package com.czp.Technological;

public class ContinueTest {

	public static void main(String[] args) {
		
		//��ӡ����
		for(int j = 0;j < 10;j++) {
			if(0 == j %2) {
				continue;   //�����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
			}
			System.out.println(j);
		}
		System.out.println("---------------------�ָ���-------------------------");
		//���Ա�������ӡ1-100֮�����������������Ҫô��3��Ҫô5�ı���
		for(int i = 0;i<=100;i++) {
			if(i%3==0||i%5==0) {
				continue;
			}
			System.out.print(i+ " ");
		}

	}

}
