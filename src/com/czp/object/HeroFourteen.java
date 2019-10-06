package com.czp.object;

public class HeroFourteen {

	public static void main(String[] args) {
		HeroType herotype = HeroType.TAKN;
		
		switch(herotype) {
		case TAKN:
			System.out.println("这是坦克");
			break;
		case WIZARD:
			System.out.println("这是法师");
		}

	}

}
