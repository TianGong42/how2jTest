package com.czp.Technological;

public class OutBreakTest {

	public static void main(String[] args) {
		/*
		 * 借助boolean变量结束外部循环
		 * 需要在内部循环中修改这个变量值
		 * 每次内部循环结束后，都要在外部循环中判断，这个变量的值
		 */
		boolean breakout = false;   //是否终止外部循环的标记
		
		for(int i = 0;i < 10;i++) {
			
			for(int j = 0;j<10;j++) {
				System.out.println(i + ":" + j);
				if(0 == j % 2) {
					breakout = true;  //终止外部循环的标记设置为true
				}
			}
			if(breakout) //判断是否终止外部循环
				break;
		}
		
		System.out.println("-----------------分割线--------------------------------标签---------------------");

		 //打印单数    
        outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
        for (int i = 0; i < 10; i++) {
             
            for (int j = 0; j < 10; j++) {
                System.out.println(i+":"+j);
                if(0==j%2) 
                    break outloop; //如果是双数，结束外部循环
            }
             
        }
	}

}
