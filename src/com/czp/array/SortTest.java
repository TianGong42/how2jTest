package com.czp.array;

public class SortTest {

	public static void main(String[] args) {
		int[] a = new int[5];
		for(int i = 0;i<a.length;i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i] + " ");
		}
		System.out.println("��ʼ����ӡ");
		
		//ѡ������,��С�����ӡ
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("ѡ�����򣬴�С�����ӡ");
		for(int i = 0;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//System.out.println("ð�����򣬴Ӵ�С");
	

	}

}
