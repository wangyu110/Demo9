package com.yu.demo;

public class B extends A{
    //属性
	int b=20;
	//构造
	public B(){
		
	}
	public B(int b){
		
		this.b=b;
	}
	//方法
	public void sub(){
		--b;
		System.out.println("b:"+b);
	}
}
