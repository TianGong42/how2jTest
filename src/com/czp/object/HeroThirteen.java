package com.czp.object;

public class HeroThirteen {
	public String name;
	protected float hp;
	float maxHP;
	
	//��Ʒ��������
	public static int itemCapacity = 8;    //������ʱ��  ��ʼ��
	
	static {
		itemCapacity = 6;   //��̬��ʼ���� ��ʼ��
	}
	
	public HeroThirteen() {
		
	}
	
	public static void main(String[] args) {
		System.out.println(HeroThirteen.itemCapacity);
	}
}
