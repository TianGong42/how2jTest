package com.czp.object;

public class EnumTest {

	public static void main(String[] args) {
		Season season = Season.SPRING;
		switch(season) {
		case SPRING:
			System.out.println("����");
			break;
		case SUMMER:
			System.out.println("����");
			break;
		case AUTUMN:
			System.out.println("����");
			break;
		case WINTER:
			System.out.println("����");
			break;
		}
		for(Season s : Season.values()) {
			System.out.println(s);
		}

	}

}
