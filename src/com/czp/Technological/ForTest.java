package com.czp.Technological;

public class ForTest {

	public static void main(String[] args) {
		//ʹ��While��ӡ0��4
		int i = 0;
		while(i<5) {
			System.out.println("whileѭ�����"+i);
			i++;
		}
		
		//ʹ��for��ӡ0��4
		for(int j = 0;j<5;j++) {
			System.out.println("for ѭ�����" + j);
		}

		//----------------�ָ���--------------��ؤ
		/*
		 * �쳯��һ����ؤ�պ飬ȥ����ҪǮ
��һ��Ҫ��1��Ǯ
�ڶ���Ҫ��2��Ǯ
������Ҫ��4��Ǯ
������Ҫ��8��Ǯ
�Դ�����

���⣺ ����ؤ��10�죬�����Ƕ��٣�
		 */
		int sumMoney = 0;
		for(int j = 0;j<10;j++) {
			sumMoney = sumMoney + (int)Math.pow(2, j);
		}
		System.out.println("�����ؤ��������" + sumMoney);
	}

}
