package com.czp.Technological;

public class ContinueTest {

	public static void main(String[] args) {
		
		//打印单数
		for(int j = 0;j < 10;j++) {
			if(0 == j %2) {
				continue;   //如果是双数，后面的代码不执行，直接进行下一次循环
			}
			System.out.println(j);
		}
		System.out.println("---------------------分割线-------------------------");
		//忽略倍数，打印1-100之间的数，如果这个数，要么是3，要么5的倍数
		for(int i = 0;i<=100;i++) {
			if(i%3==0||i%5==0) {
				continue;
			}
			System.out.print(i+ " ");
		}

	}

}
