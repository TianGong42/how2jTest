package com.czp.string;

public class TestOperationsStringFive {

	public static void main(String[] args) {
		//Ó¢ÎÄÈÆ¿ÚÁî
		String s = "peter piper picked a peck of pickled peppers";
		char[] a = s.toCharArray();
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			if(a[i] == 'p') {
				sum++;
			}
		}
		System.out.println(sum);

	}

}
