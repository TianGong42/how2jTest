package com.czp.object;

/*
 * GiantDragonӦ��ֻ��һֻ��ͨ��˽�л��乹�췽�����ǵ��ⲿ�޷�ͨ��new�õ��µ�ʵ��
 * GiantDragon�ṩ��һ��public static ��getInstance�������ⲿ������ͨ���÷���
 * ��ȡ12�ж���Ķ��󣬶���ÿһ�ζ��ǻ�ȡͬһ�����󡣴Ӷ��ﵽ����ģʽ��Ŀ��
 * ���ֵ���ģʽ�ֽ�������ʽ����ģʽ��������ζ�Ź�ᴴ��һ��ʵ��
 */
public class GiantDragon {
	
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new����ʵ����
	private GiantDragon() {
		
	}
	
	//׼��һ�������ԣ�ָ��һ��ʵ����������Ϊ�������ԣ�����ֻ��һ��
	private static GiantDragon instance = new GiantDragon();
	
	//public static ��������ʾ�������߻�ȡ12�ж���Ķ���
	public static GiantDragon getInstance() {
		return instance;
	}
}
