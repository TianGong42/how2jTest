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
	
	public static void main(String[] args) {
		Item xueping = new Item();
		xueping.name = "Ѫƿ";
		xueping.price = 50;
		
		Item caoxie = new Item();
		caoxie.name = "��Ь";
		caoxie.price = 300;
		
		Item changjiang = new Item();
		changjiang.name = "����";
		changjiang.price = 350;
		
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}
}
