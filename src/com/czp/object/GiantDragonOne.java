package com.czp.object;

public class GiantDragonOne {
	
	//˽�л����췽��ʹ�ø����޷����ⲿͨ��new����ʵ����
	private GiantDragonOne() {
		
	}
	
	//׼��һ�������ԣ�����ָ��һ��ʵ�������󣬵�����ʱ��ָ��null
	private static GiantDragonOne instance;
	
	//public static ����������ʵ������
	public static GiantDragonOne getInstance() {
		//��һ�η��ʵ�ʱ�򣬷���instanceû��ָ���κζ�����ʱʵ����һ������
		if(null == instance) {
			instance = new GiantDragonOne();
		}
		//����instanceָ��Ķ���
		return instance;
	}
}
