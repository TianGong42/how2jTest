package com.czp.var;

public class ChangeVar {

	public static void main(String[] args) {
		//数据类型转换规则：从小到达自动转，从大到小强制转
	    char c = 'A';
	    short  s = 80;
	    //虽然short和char都是16位，长度是一样的
	    //但是彼此之前，依然需要进行强制转换
	    c = (char)s;
	    //直接转换，会出现编译错误
	    // s = c;
	    
	    long l = 50;
	    int i = 50;
	    
	    // int比较小，要放进比较大的long,随便怎么样，都放的进去
	    l = i;
	    
	    byte b = 5;
	    int i1 = 10;
	    int i2 = 300;
	    
	    b = (byte)i1;
	    //因为i1的值是在byte范围之内，所以即便进行强制转换，最后得到的值也是10
	    System.out.println(b);
	    
	    //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
	    //i2的值是300，其对应的二进制数是100101100
	    //按照byte的长度8位进行截取后，其值为00101100即44
	    b = (byte) i2;
	    System.out.println(b);
	    
	    //查看一个整数对应的二进制的方法
	    System.out.println(Integer.toBinaryString(i2));
	    
	    short a1 = 1;
	    short a2 = 2;
	    System.out.println(a1 + a2);

	}

}
