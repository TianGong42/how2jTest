package com.czp.interfaceTest;

public class HeroTwenty {
	
	private String name; //name
	float hp;  //血量
	float armor; //护甲
	int moveSpeed; //移动速度
	/*
	 * 非静态内部类BattleScore"战斗成绩"
	 * 非静态内部类可以直接在一个类里面定义
	 */
	class BattleScore{
		int kill;
		int die;
		int assit;
		//非静态内部类，只有一个外部对象存在的时候，才有意思
		//战斗成绩只有在一个英雄对象存在的时候才有意思
		public void legendary() {
			if(kill >= 8) {
				System.out.println(name + "超神");
			}else {
				System.out.println(name + "尚未超神! ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		HeroTwenty garen = new HeroTwenty();
		garen.name = "盖伦";
		//实例化内部类
		//battleScore对象只有在一个英雄对象存在的时候才有意思
		//所以其实化必须建立在一个外部类对象的基础之上
		BattleScore score = garen.new BattleScore();
		score.kill = 9;
		score.legendary();
	}

}
