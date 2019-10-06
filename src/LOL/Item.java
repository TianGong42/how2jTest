package LOL;

public class Item {
	
	String name;
	int price;
	
	public void buy() {
		System.out.println("购买");
	}
	
	public void effect() {
		System.out.println("物品使用户后，可以由效果");
	}
	
	public static void main(String[] args) {
		Item xueping = new Item();
		xueping.name = "血瓶";
		xueping.price = 50;
		
		Item caoxie = new Item();
		caoxie.name = "草鞋";
		caoxie.price = 300;
		
		Item changjiang = new Item();
		changjiang.name = "长剑";
		changjiang.price = 350;
		
		Item i = new Item();
		i.effect();
		
		LifePotion lp = new LifePotion();
		lp.effect();
		
		MagicPotion mp = new MagicPotion();
		mp.effect();
	}
}
