package LOL;

import com.czp.interfaceTest.AD;
import com.czp.interfaceTest.ADAPHero;
import com.czp.interfaceTest.ADHero;
import com.czp.interfaceTest.APHero;
import com.czp.interfaceTest.Support;

public class Hero {
	
	String name; //����
	float hp;    //Ѫ��
	float armor; //����
	float money; //��Ǯ
	int moveSpeed; //�ƶ��ٶ�
	
	
	//��ȡ����ֵ
	float getArmor() {
		return armor;
	}
	
	//�Ӷ���
	void keng() {
		System.out.println("�Ӷ���!");
	}
	
	//�����ƶ��ٶ�
	void addSpeed(int speed) {
		//��ԭ�еĻ����������ƶ��ٶ�
		moveSpeed = moveSpeed + speed;
	}
	
	//����
	void legendary() {
		
	}
	
	//��ȡ��ǰ��Ѫ��
	float getHp() {
		return hp;
	}
	
	//��Ѫ
	void recovery(float blood) {
		hp = hp + blood;
	}
	
	//ʹ����Ʒ����
	public void useItem(Item i) {
		i.effect();
	}
	
	//ɱ��Ӣ��
	public void kill(Mortal m) {
		m.die();
	}
	
	
	public static void main(String[] args) {
		APHero ap1 = new APHero();
		
		
		
		LifePotion lp = new LifePotion();
		MagicPotion mp = new MagicPotion();
		
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.money = 350;
		garen.addSpeed(100);
		garen.useItem(lp);
		garen.useItem(mp);
		garen.kill(ap1);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.money = 350;
		
		/*
		 * ����ת��ָ��ʱ��һ������ָ���������ͣ�ת��Ϊ��һ�����õ�����
		 * ��ad������ָ�Ķ����������ADHero
		 *h���õ�������Hero
		 *��ADHero����Heroʹ�ã�һ���ǿ���
		 *��������ת�����ǿ���������
		 */
		ADHero ad = new ADHero();
		Hero h = new Hero();
		h = ad;
		
		
		//����ת����
		Hero h1 = new Hero();
		ADHero a = new ADHero();
		Support s = new Support();
		
//		h1 = ad;
//		ad = (ADHero) h1;
//		h1 = s;
//		ad = (ADHero)h1;
		
		//ʵ����ת���ɽӿڣ�����ת��)
		ADHero ad1 = new ADHero();
		AD adi = ad;
		
		//�ӿ�ת����ʵ���ࣨ����ת��)
//		ADHero ad2 = new ADHero();
//		AD adi1 = ad2;
//		ADHero adhero = (ADHero)adi1;
//		ADAPHero adadHero = (ADAPHero)adi1;
//		adadHero.magicAttack();
		
		//instanceof Hero �ж�һ��������ָ�Ķ����Ƿ���Hero���ͣ�����Hero������
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
