package com.czp.object;

public class HeroTwelve {
	//�����ԣ��ֽо�̬����,���һ�����������������ԡ���ô���еĶ���
	//�������ԣ��ֽ�ʵ�����ԣ��Ǿ�̬����
	public String name;  //ʵ�����ԣ��������ԣ��Ǿ�̬����
	protected float hp;
	static String copyright;   //�����ԣ���̬����
	
	public static void main(String[] args) {
		HeroTwelve garen = new HeroTwelve();
		garen.name = "����";
		
		HeroTwelve.copyright = "��Ȩ��Riot Games��˾����";
		
		System.out.println(garen.name);
		System.out.println(garen.copyright);
		
		HeroTwelve teemo = new HeroTwelve();
		teemo.name="��Ī";
		System.out.println(teemo.name);
		System.out.println(teemo.copyright);
		
		garen.copyright = "Blizzard Entertainment Enterprise";
		System.out.println(teemo.copyright);
	}

}
