package com.czp.interfaceTest;

public class Fish extends Animal implements Pet{

	private String name;
	
	protected Fish(int legs) {
		super(legs);
		
	}
	
	public void Fish() {
		
	}
	@Override
	public void walk() {
		System.out.println("鱼不能走且没有腿");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
