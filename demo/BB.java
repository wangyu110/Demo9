package com.yu.demo;

public class BB extends AA{
   public int b=100;
   public int b1=200;
   public int a1=30;  //���Ը���
   public void mul(){
	   b *=10;
	   b1 *=10;
	   System.out.println("b:"+b);
	   System.out.println("b1:"+b1);
   }
   public void add(){  //������д
	   int c=b+b1;
	   System.out.println("c:"+c);
   }
}
