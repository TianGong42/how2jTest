package com.czp.interfaceTest;

public class HeroSeventeen {
	public String name;
	protected float hp;
	
	public String toString() {
		return name;
	}
	
	public void finalize() {
		System.out.println("���Ӣ�����ڱ�����");
	}
	
	public static void main(String[] args) {
		//ֻ��һ����
		HeroSeventeen h;
		for(int i = 0;i<1000000;i++) {
			//���������¶���
			//ÿ����һ������ǰһ�����󣬾�û������ָ����
			//��Щ���󣬾������������յ�����
			//���������ѻ��ıȽ϶��ʱ�򣬾ͻᴥ����������
			//һ��������󱻻��գ�����finalize()�����ͻᱻ����
			h = new HeroSeventeen();
		}
	}
}
