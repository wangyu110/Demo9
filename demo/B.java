package com.yu.demo;

public class B extends A{
    //����
	int b=20;
	//����
	public B(){
		
	}
	public B(int b){
		
		this.b=b;
	}
	//����
	public void sub(){
		--b;
		System.out.println("b:"+b);
	}
}
