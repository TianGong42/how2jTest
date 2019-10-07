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
		/*
		 * 1、i1和i2都是item类型
		 * 2、都调用effect方法
		 * 输出不同的结果
		 * 多态：都是同一个类型，调用同一个方法，却能呈现不同的状态
		 * 要实现类的多态，需要如下条件
		 * 1、父类（接口）引用指向子类对象
		 * 2、调用的方法有重写
		 */
		Item i1 = new LifePotion();
		Item i2 = new MagicPotion();
		
		System.out.print("i1 是Item类型,执行effect打印:");
		i1.effect();
		System.out.print("i2也是Item类型,执行effect打印:");
		i2.effect();
	}
}
