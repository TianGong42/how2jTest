package com.czp.array;

public class ReversalArray {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		for(int i = 0;i<a.length;i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i] + " ");
		}
		int[] b = new int[5];
		for(int i = 0;i<a.length;i++) {
			b[i] = a[5-i-1];
			System.out.print(b[i] + " ");
		}

	}

}
