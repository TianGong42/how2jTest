package com.czp.object;

public class Armor extends Item{

	int ac;
	
	public static void main(String[] args) {
		Armor ClothArmor = new Armor();
		ClothArmor.name = "²¼¼×";
		ClothArmor.price = 300;
		ClothArmor.ac = 15;
		
		Armor LockNail = new Armor();
		LockNail.name = "Ëø×Ó¼×";
		LockNail.price = 500;
		LockNail.ac = 40;

	}
}
