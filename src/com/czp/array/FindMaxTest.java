package com.czp.array;

public class FindMaxTest {
	/*
	 * ����һ��5X5�Ķ�ά���顣 Ȼ��ʹ����������ö�ά���顣
�ҳ������ά����������Ǹ�ֵ������ӡ�����ά����

	 */
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int max = 0;
		int n = 0,m = 0;
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.printf("%5d",a[i][j] );
			}
			System.out.println();
		}
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j < a[i].length;j++) {
				if(max<a[i][j]) {
					max = a[i][j];
					n = i;
					m = j;
				}
			}
		}
		System.out.println("�ҳ�������ʱ��" + max);
		System.out.println("��������[" + m +"][" + n + "]" );

	}

}
