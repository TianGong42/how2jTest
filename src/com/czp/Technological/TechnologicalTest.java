package com.czp.Technological;

public class TechnologicalTest {

	public static void main(String[] args) {
		//�ƽ�ָ��
		System.out.println("��ƽ�ָ��(0.618)������������ദ�ǣ�");
		int i,j = 0;
		float mix = 1;
		for(int n = 1;n<=20;n++) {
			
			for(int m = 1;m<=20;m++) {
				float a = n / m;
				if(Math.abs(a - 0.618)<mix) {
					mix = (float) Math.abs(a-0.618); 
				}
			}
		}

	}

}
