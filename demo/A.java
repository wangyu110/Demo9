package com.yu.demo;

 

public class A {
	//属性
	int a=10;
	 
	//构造
	public A(){	
	}
	public A(int a ){
		this.a=a;
	}
	//方法
	public void add(){
		a++;
		System.out.println("a:"+a);
	}

}
