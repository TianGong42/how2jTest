package com.czp.interfaceTest;

import LOL.Hero;

public class Support extends Hero implements Healer{
	@Override
	public void heal() {
		System.out.println("进行法术治疗");
	}
}
