package com.czp.Technological;

public class OutBreakTest {

	public static void main(String[] args) {
		/*
		 * ����boolean���������ⲿѭ��
		 * ��Ҫ���ڲ�ѭ�����޸��������ֵ
		 * ÿ���ڲ�ѭ�������󣬶�Ҫ���ⲿѭ�����жϣ����������ֵ
		 */
		boolean breakout = false;   //�Ƿ���ֹ�ⲿѭ���ı��
		
		for(int i = 0;i < 10;i++) {
			
			for(int j = 0;j<10;j++) {
				System.out.println(i + ":" + j);
				if(0 == j % 2) {
					breakout = true;  //��ֹ�ⲿѭ���ı������Ϊtrue
				}
			}
			if(breakout) //�ж��Ƿ���ֹ�ⲿѭ��
				break;
		}
		
		System.out.println("-----------------�ָ���--------------------------------��ǩ---------------------");

		 //��ӡ����    
        outloop: //outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break outloop; //�����˫���������ⲿѭ��
            }
             
        }
	}

}
