package com.czp.interfaceTest;

public class HeroTwentyOne {
	
	public String name;
	protected float hp;
	
	private static void battleWin() {
		System.out.println("battle win");
	}
	
	/*
	 * ��һ������������һ����̬�ڲ���
	 * ��Ǿ�̬�ڲ��಻ͬ����̬�ڲ���ˮ�����ʵ����������Ҫһ���ⲿ���ʵ��Ϊ����������ֱ��ʵ����
	 * �﷨��new�ⲿ��.��̬�ڲ���()
	 * ��Ϊû��һ���ⲿ���ʵ�������Ծ�̬�ڲ������治���Է����ⲿ���ʵ�����Ժͷ���
	 * ���˿��Է�Ϊ�ⲿ���˽�о�̬��Ա�⣬��̬�ڲ������ͨ��û��ʲô�������
	 */
	//�з���ˮ��
	static class EnemyCrystal{
		int hp = 0;
		
		//���ˮ����Ѫ��Ϊ0��������ʤ��
		public void checkIfVictory() {
			if(hp == 0) {
				HeroTwentyOne.battleWin();
				System.out.println("hello World");
				//��̬�ڲ��಻��ֱ�ӷ����ⲿ��Ķ�������
				//System.out.println(name + " win this game");
			}
		}
	}
	
	public static void main(String[] args) {
		//ʵ������̬�ڲ���
		HeroTwentyOne.EnemyCrystal crystal = new HeroTwentyOne.EnemyCrystal();
		crystal.checkIfVictory();
	}

}
