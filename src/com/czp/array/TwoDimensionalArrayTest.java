package com.czp.array;

public class TwoDimensionalArrayTest {

	public static void main(String[] args) {
		//��ʼ����ά����
		int[][] a = new int[2][3];
		a[1][2] = 5;   //����ֱ�ӷ�Ϊһά���飬��Ϊ�Ѿ������˿ռ�
		
		//ֻ�����˶�ά����
		int[][] b = new int[2][];   //������һά���飬ÿ��һά����ĳ�����δ����
		b[0] = new int[3];          //����ʵ�ַ��䳤�ȣ��ſ��Է���
		b[0][2] = 5;
		
		//ָ�����ݵ�ͬ�£�����ռ�
		int[][] c = new int[][] {
			{1,2,4},
			{4,5},
			{6,7,8,9}
	};

}
}
