package LOL;

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
	
	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "����";
		garen.hp = 616.28f;
		garen.armor = 27.536f;
		garen.moveSpeed = 350;
		garen.money = 350;
		garen.addSpeed(100);
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 383f;
		teemo.armor = 14f;
		teemo.moveSpeed = 330;
		teemo.money = 350;
	}
}
