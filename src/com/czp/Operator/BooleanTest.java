package com.czp.Operator;

public class BooleanTest {

	public static void main(String[] args) {
		//长度与  无论第一个表达式的值是true或者是false，第二个值，都会被运算
		int i = 2;
		System.out.println(i==1 & i++ == 2);
		System.out.println(i);
		
		//短路与 只要第一个表达式的值是false的，第二个人表达式的值，就不需要进行运算
		int j = 2;
		//因为j==1返回false,所以右边的j++就没有执行，所以j的值还是2
		System.out.println(j == 1 && j++ == 2);
		System.out.println(j);
		System.out.println("-----------分割线-----------------------------");
		
		//长路或   无论第一个表达式的值是true或者false,第二个的值，都会被运算
		int a = 2;
		System.out.println(a == 1 | a++ == 2);  //无论如何i++都会被执行，所以i的值变成了3
		System.out.println(a);
		//短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
		int b = 2;
		System.out.println(b == 2 || b++ == 2);  //因为j==2返回true,所以右边的j++就没有执行了，j=2
		System.out.println(b);
		
		
		System.out.println("------------------分割线----取反-------------------------");
		boolean c = true;
		
		System.out.println(c);
		System.out.println(!c);
		
		System.out.println("--------------------分割线----异或-----------------------");
		//不同,返回真。相同，返回假
		boolean d = true;
		boolean e = true;
		System.out.println(d^e);
		System.out.println(d^!e);
		System.out.println("--------------------分割线-----习题-------------------");
		int f = 1;
		boolean g = !(f++ == 3) ^ (f++ ==2) && (f++==3);   //最后一个f++没有执行
		System.out.println(g);
		System.out.println(f);

	}

}
