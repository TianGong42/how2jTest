package com.czp.object;

public class Weapon extends Item {
	int damage;    //������
	
	public static void main(String[] args) {
		Weapon infintyEdge = new Weapon();
		infintyEdge.damage = 65;    //damage��������Weapon������Ƶ�
		
		infintyEdge.name = "�޾�֮��";
		infintyEdge.price = 3600;
	}
}
