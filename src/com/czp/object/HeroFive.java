package com.czp.object;

public class HeroFive {
	
	String name;   //����
	float hp;      //Ѫ��
	float armor;   //����
	int moveSpeed; //�ƶ��ٶ�
	
	//��ӡ�ڴ��е������ַ
	public void showAddressInMemory() {
		System.out.println("��ӡthis�����������ַ" + this);
	}
	public static void main(String[] args) {
		HeroFive garen = new HeroFive();
		garen.name = "����";
		//ֱ�Ӵ�ӡ���󣬻���ʾ�ö������ڴ��е������ַ
		//��ʽ��Hero@c17164 c17164�������ַ��ÿ��ִ�У��õ��ĵ�ַ��һ��һ��
		
		System.out.println("��ӡ���󿴵��������ַ�� " + garen);
		//����showAddressInMemory,��ӡ�ö����this,��ʾ��ͬ�������ַ
		garen.showAddressInMemory();
		
		HeroFive teemo = new HeroFive();
		teemo.name = "��Ī";
		System.out.println("��ӡ���󿴵��������ַ�� " + teemo);
		teemo.showAddressInMemory();

	}

}
