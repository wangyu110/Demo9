package com.yu.demo;

public class BB extends AA{
   public int b=100;
   public int b1=200;
   public int a1=30;  //属性覆盖
   public void mul(){
	   b *=10;
	   b1 *=10;
	   System.out.println("b:"+b);
	   System.out.println("b1:"+b1);
   }
   public void add(){  //方法重写
	   int c=b+b1;
	   System.out.println("c:"+c);
   }
}
