package com.czp.Technological;

public class BreakTest {

	public static void main(String[] args) {
		
		//��ӡ����
		for(int j = 0;j<10;j++) {
			if(0==j%2) {
				break;//�����˫����ֱ�ӽ���ѭ��
			}
			System.out.println(j);
		}
		
		/*
		 * ��������������3000������ƽʱ������ÿ��������1000��Ǯ����Ͷ�ʡ�

Ȼ��������������� ����Ʊ�ͻ��� 21������ŵ���ͨ�����ﵽ��ÿ��20%��Ͷ�ʻر��ʡ�

��ô�������ˣ���ÿ����Ͷ��1000��Ǯ�Ľ��࣬����Ͷ�ʶ����꣬������ﵽ100��
���������㰴��ÿ��12000Ͷ����㣬������ÿ�¼�Ϣ��

������ʽ��
F = p* ( (1+r)^n );
F ��������
p ����
r ������
n ���˶�����
		 */
		double f = 0;
		int p = 12000;
		float r = 0.05f;
		int n = 0;
		while(true) {
			if(f>1000000)
				break;
			else {
				f = p* (Math.pow((1+r), n));
				n++;
				System.out.println(f);
			}
			
		}
		System.out.println("100wҪ��" + n + "��");

	}

}
