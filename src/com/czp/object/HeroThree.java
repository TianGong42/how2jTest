package com.czp.object;

public class HeroThree {
	//һ���ṩ��һ���вεĹ��췽��
	//ͬʱ��û����ʾ���ṩһ���޲εĹ��췽��
	//��ôĬ�ϵ��޲εĹ��췽������û����
	String name;    //����
	float hp;       //Ѫ��
	float armor;    //����
	int moveSpeed;  //�ƶ��ٶ�
	
	//�вεĹ��췽��
	//Ĭ�ϵ��޲ι��췽����ʧЧ��
	public HeroThree(String heroname) {
		name = heroname;
	}
	
	public static void main(String[] args) {
		HeroThree garen = new HeroThree("����");
		
		//HeroThree teemo = new HeroThree();  �޲εĹ��췽����ľ���ˡ�
	}
}
