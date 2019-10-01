package com.czp.var;

public class FinalTest {

	//final修饰一个变量，这个变量只有一次的赋值的机会
	//因为j在成为入参的时候会被赋值一次，所以不能再被赋值
	public void method1(final int j) {
		// j = 5;
	}
}
