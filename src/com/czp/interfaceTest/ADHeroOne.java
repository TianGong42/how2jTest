package com.czp.interfaceTest;

public class ADHeroOne extends HeroFifteen implements AD{
	
	@Override
	public void physicAttack() {
		System.out.println("����������");
	}
		//���ظ����battleWin����
		public static void battleWin() {
			System.out.println("ad hero battle win");
		}
		
		public static void main(String[] args) {
			HeroFifteen.battleWin();
			ADHeroOne.battleWin();
		}
	
}
