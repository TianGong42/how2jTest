package com.czp.object;

public class GiantDragonOne {
	
	//私有化构造方法使得该类无法在外部通过new进行实例化
	private GiantDragonOne() {
		
	}
	
	//准备一个类属性，用于指向一个实例化对象，但是暂时先指向null
	private static GiantDragonOne instance;
	
	//public static 方法，返回实例对象
	public static GiantDragonOne getInstance() {
		//第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
		if(null == instance) {
			instance = new GiantDragonOne();
		}
		//返回instance指向的对象
		return instance;
	}
}
