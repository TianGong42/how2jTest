package LOL;

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
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.money = 350;
		garen.addSpeed(100);
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.money = 350;
	}
}
