package com.czp.object;

public class HeroSix {
	
	String name;    //����
	float hp;       //Ѫ��
	float armor;    //����
	int moveSpeed;  //�ٶ�
	
	//��������������һ��
	//�ڷ������У�ֻ�ܷ��ʵ�����name
	public void setName1(String name) {
		name = name;
	}
	
	//Ϊ�˱���setName1�е����⣬����������ʹ������������
	public void setName2(String heroName) {
		name = heroName;
	}
	
	//ͨ��this��������
	public void setName3(String name) {
		//name�����ʱ����name
		//this.name�����ʱ����name
		this.name = name;
	}
	public static void main(String[] args) {
		
		HeroSix h = new HeroSix();
		
		h.setName1("teemo");
		System.out.println(h.name);
		
		h.setName2("garen");;
		System.out.println(h.name);
		
		h.setName3("����");
		System.out.println(h.name);
		

	}

}
