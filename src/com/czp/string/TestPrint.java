package com.czp.string;

import java.util.Scanner;

public class TestPrint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������");
		String addr = input.next();
		System.out.println("�����빫˾����:");
		String type = input.next();
		System.out.println("�����빫˾����:");
		String companyName = input.next();
		System.out.println("�������ϰ�����");
		String bossName = input.next();
		System.out.println("�������");
		int price = input.nextInt();
		System.out.println("�������Ʒ��");
		String product = input.next();
		System.out.println("������۸������λ");
		String unit = input.next();
		System.out.printf("%s���%s%s�����ˣ����˵��ϰ�%s�Ժ��ζģ�Ƿ����"
				+ "%d���ڣ���������С��������!����û�а취������%s�ֹ���!ԭ�۶���һ%s�ࡢ��%s�ࡢ��%s���%s"
				+ "������ȫ��ֻ����ʮ�飬ͳͳֻҪ��ʮ��!%s���˵����㲻����!����������������˴���꣬�㲻�����ʣ��㻹��Ѫ��Ǯ������Ѫ��Ǯ!", 
				addr,type,companyName,bossName,price,product,unit,unit,unit,product,bossName);

	}

}
