package com.czp.string;

public class TestMathTwo {
	/*
	 * �ҳ�10000000�����ж�������
	 */
	public static void main(String[] args) {
		int sum =0;   //������
		
		for(int i = 2;i<10000000;i++) {
			boolean b = true;
			for(int j = 2;j<i/2+1;j++) {
				if(i % j == 0) {
					b = false;
				}
			}
			if(b == true) {
				sum++;
				System.out.println(sum);
				
			}
		}
		System.out.println("һǧ�����ڵ�����һ���У�"+ sum);

	}

}
