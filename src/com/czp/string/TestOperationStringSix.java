package com.czp.string;

public class TestOperationStringSix {

	public static void main(String[] args) {
		//�� lengendary �ĳɼ����дСдģʽ���� LeNgEnDaRy
		String s = "lengendary";
		char[] a = s.toCharArray();
		
		for(int i = 0;i<a.length;i++) {
			if(i%2 == 0) {
				System.out.print((char)(short)(a[i]-32));
			}else {
				System.out.print(a[i]);
			}
		}
	}

}
