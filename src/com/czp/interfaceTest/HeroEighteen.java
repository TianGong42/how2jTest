package com.czp.interfaceTest;

public class HeroEighteen {
	public String name;
	protected float hp;
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 * equals()�����ж���������������Ƿ���ͬ
	 * ���裬������Ӣ�۵�hp��ͬ��ʱ�����Ǿ���Ϊ������Ӣ����ͬ
	 * ������ж����棬����Ҫ�ж�o�����Ƿ�����HeroEighteen����
	 * ����ǣ���һ��ǿ�Ƶ�����ת����Ȼ���ж�����ֵ�Ƿ����
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
