package com.czp.interfaceTest;

public class HeroTwenty {
	
	private String name; //name
	float hp;  //Ѫ��
	float armor; //����
	int moveSpeed; //�ƶ��ٶ�
	/*
	 * �Ǿ�̬�ڲ���BattleScore"ս���ɼ�"
	 * �Ǿ�̬�ڲ������ֱ����һ�������涨��
	 */
	class BattleScore{
		int kill;
		int die;
		int assit;
		//�Ǿ�̬�ڲ��ֻ࣬��һ���ⲿ������ڵ�ʱ�򣬲�����˼
		//ս���ɼ�ֻ����һ��Ӣ�۶�����ڵ�ʱ�������˼
		public void legendary() {
			if(kill >= 8) {
				System.out.println(name + "����");
			}else {
				System.out.println(name + "��δ����! ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		HeroTwenty garen = new HeroTwenty();
		garen.name = "����";
		//ʵ�����ڲ���
		//battleScore����ֻ����һ��Ӣ�۶�����ڵ�ʱ�������˼
		//������ʵ�����뽨����һ���ⲿ�����Ļ���֮��
		BattleScore score = garen.new BattleScore();
		score.kill = 9;
		score.legendary();
	}

}
