package LOL;

public class Item {
	
	String name;
	int price;
	
	public void buy() {
		System.out.println("����");
	}
	
	public void effect() {
		System.out.println("��Ʒʹ�û��󣬿�����Ч��");
	}
	
	public String toString() {
		return name + price;
	}
	
	public void finalize() {
		System.out.println("��ǰ�������ڱ�����");
	}
	
	public boolean equals(Object o) {
		if(o instanceof Item) {
			Item i = (Item)o;
			return this.name == i.name & this.price == i.price;
		}
		return false;
	}
	
	public static void main(String[] args) {
		/*
		 * 1��i1��i2����item����
		 * 2��������effect����
		 * �����ͬ�Ľ��
		 * ��̬������ͬһ�����ͣ�����ͬһ��������ȴ�ܳ��ֲ�ͬ��״̬
		 * Ҫʵ����Ķ�̬����Ҫ��������
		 * 1�����ࣨ�ӿڣ�����ָ���������
		 * 2�����õķ�������д
		 */
		Item i1 = new LifePotion();
		Item i2 = new MagicPotion();
		
		System.out.print("i1 ��Item����,ִ��effect��ӡ:");
		i1.effect();
		System.out.print("i2Ҳ��Item����,ִ��effect��ӡ:");
		i2.effect();
	}
}
