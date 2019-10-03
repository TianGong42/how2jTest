package com.czp.Technological;

public class TechnologicalTest {

	public static void main(String[] args) {
		//黄金分割点
		System.out.println("离黄金分割点(0.618)最近的两个数相处是：");
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
