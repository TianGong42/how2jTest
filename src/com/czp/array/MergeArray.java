package com.czp.array;

public class MergeArray {

	public static void main(String[] args) {
		System.out.println("����a�����ݣ�");
		int[] a = new int[5];
		for(int i = 0;i<a.length;i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("����b������");
		int[] b = new int[5];
		for(int i = 0;i<b.length;i++) {
			b[i] = (int)(Math.random()*100);
			System.out.print(b[i] + " ");
		}
		System.out.println("����c������");
		int[] c = new int[10];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		for(int i = 0;i < c.length;i++) {
			System.out.print(c[i] + " ");
		}
		

	}

}
