package com.czp.array;

public class SelectionSort {

	public static void main(String[] args) {
		int a[] = new int[] {18,62,68,82,65,9};
		//����ǰ���Ȱ����ݴ�ӡ����
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ��һ�δ�ӡ˳��");
		//ѡ������
		
		//��һ�����ѵ�һλ����������λ���бȽ�
		//�����������λ�õ����ݱȵ�һλС���ͽ��н���
		
		for(int i = 1;i<a.length;i++) {
			if(a[i]<a[0]) {
				int temp = a[i];
				a[i] = a[0];
				a[0] = temp;
			}
		}
		
		//�����ݴ�ӡ����
		//���Է��֣���С��һ������������ǰ��
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ����һ������");
		
		//�ڶ������ڶ�λ��ʣ�µ�����λ���бȽ�
		for(int i = 2;i<a.length;i++) {
			if(a[i]<a[1]) {
				int temp = a[1];
				a[1] = a[i];
				a[i] = temp;
			}
		}
		
		//�����ݴ�ӡ����
		//���Է��֣������ڶ�С���������˵ڶ���λ��
		for(int i = 0;i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		
		//���Է���һ������
		//�ƶ���λ���Ǵ�0 ��������
		//���Կ�����������һ��ѭ��
		for(int j = 0;j<a.length-1;j++) {
			for(int i = j + 1;i < a.length;i++) {
				if(a[i]<a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		
		//�����ݴ�ӡ����
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(" ");
			

	}

}
