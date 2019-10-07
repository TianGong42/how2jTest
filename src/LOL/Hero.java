package LOL;

import com.czp.interfaceTest.AD;
import com.czp.interfaceTest.ADAPHero;
import com.czp.interfaceTest.ADHero;
import com.czp.interfaceTest.APHero;
import com.czp.interfaceTest.Support;

public class Hero {
	
	String name; //姓名
	float hp;    //血量
	float armor; //护甲
	float money; //金钱
	int moveSpeed; //移动速度
	
	
	//获取护甲值
	float getArmor() {
		return armor;
	}
	
	//坑队友
	void keng() {
		System.out.println("坑队友!");
	}
	
	//增加移动速度
	void addSpeed(int speed) {
		//在原有的基础上增加移动速度
		moveSpeed = moveSpeed + speed;
	}
	
	//超神
	void legendary() {
		
	}
	
	//获取当前的血量
	float getHp() {
		return hp;
	}
	
	//回血
	void recovery(float blood) {
		hp = hp + blood;
	}
	
	//使用物品方法
	public void useItem(Item i) {
		i.effect();
	}
	
	//杀死英雄
	public void kill(Mortal m) {
		m.die();
	}
	
	
	public static void main(String[] args) {
		APHero ap1 = new APHero();
		
		
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.money = 350;
		garen.addSpeed(100);
		garen.useItem(lp);
		garen.useItem(mp);
		garen.kill(ap1);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.money = 350;
		
		/*
		 * 类型转换指的时把一个引用指向对象的类型，转换为另一个引用的类型
		 * 把ad引用所指的对象的类型是ADHero
		 *h引用的类型是Hero
		 *把ADHero当做Hero使用，一定是可以
		 *所以子类转父类是可以做到的
		 */
		ADHero ad = new ADHero();
		Hero h = new Hero();
		h = ad;
		
		
		//父类转子类
		Hero h1 = new Hero();
		ADHero a = new ADHero();
		Support s = new Support();
		
//		h1 = ad;
//		ad = (ADHero) h1;
//		h1 = s;
//		ad = (ADHero)h1;
		
		//实现类转换成接口（向上转型)
		ADHero ad1 = new ADHero();
		AD adi = ad;
		
		//接口转换成实现类（向下转型)
//		ADHero ad2 = new ADHero();
//		AD adi1 = ad2;
//		ADHero adhero = (ADHero)adi1;
//		ADAPHero adadHero = (ADAPHero)adi1;
//		adadHero.magicAttack();
		
		//instanceof Hero 判断一个引用所指的对象，是否是Hero类型，或者Hero的子类
		ADHero ada = new ADHero();
		APHero apa = new APHero();
		
		Hero h4 = ada;
		Hero h5 = apa;
		
		//
		System.out.println(h4 instanceof ADHero);
		
		System.out.println(h5 instanceof APHero);
		
		System.out.println(h4 instanceof Hero);
		
		
	}
}
