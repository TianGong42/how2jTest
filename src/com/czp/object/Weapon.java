package com.czp.object;

public class Weapon extends Item {
	int damage;    //攻击力
	
	public static void main(String[] args) {
		Weapon infintyEdge = new Weapon();
		infintyEdge.damage = 65;    //damage属性在类Weapon中新设计的
		
		infintyEdge.name = "无尽之刃";
		infintyEdge.price = 3600;
	}
}
