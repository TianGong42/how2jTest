package com.czp.array;

public class CopyArrayTest {

	public static void main(String[] args) {
		int a [] = new int[] {18,62,68,82,65,9};
		
		int b[] = new int[3];  //�����˳�����3�Ŀռ䣬����û�и�ֵ
		//ͨ�����鸳ֵ����a�����ǰ3λ��ֵ��b����
		//����һ��forѭ��
		
//		for(int i = 0;i<b.length;i++) {
//			b[i] = a[i];
//		}
		//��������System.arraycopy(src, srcPos,dest,destPos,length)
		//src:Դ����
		//srcPos��Դ���鸳ֵ���ݵ���ʼλ��
		//dest:Ŀ������
		//destPos�����Ƶ�Ŀ���������ʼλ��
		//length:���Ƶĳ���
		System.arraycopy(a, 0, b, 0, 3);
		
		//��ӡ����
		for(int i = 0;i<b.length;i++) {
			System.out.print(b[i] + " ");
		}

	}

}
