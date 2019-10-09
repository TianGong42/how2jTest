package com.czp.interfaceTest;

public class HeroEighteen {
	public String name;
	protected float hp;
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * equals()用于判断两个对象的内容是否相同
	 * 假设，当两个英雄的hp相同的时候，我们就认为这两个英雄相同
	 * 下面的判断里面，首先要判断o对象是否属于HeroEighteen对象，
	 * 如果是，做一个强制的类型转换，然后判断属性值是否相等
	 */
	public boolean equals(Object o) {
		if(o instanceof HeroEighteen) {
			HeroEighteen h = (HeroEighteen)o;
			return this.hp == h.hp;
		}
		return false;
	}
	
	public static void main(String[] args) {
		HeroEighteen h1 = new HeroEighteen();
		h1.hp= 300;
		HeroEighteen h2 = new HeroEighteen();
		h2.hp = 400;
		HeroEighteen h3 = new HeroEighteen();
		h3.hp = 300;
		
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
		
		System.out.println(h1==h2);
		System.out.println(h1==h3);
	}

}
