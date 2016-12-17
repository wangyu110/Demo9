package com.yu.demo;
/**
 * 人的父类
 * 1.属性：name age
 *2.方法：getup,work,play,sleep
 */
public class Person {
     
	public static final String ROLE_FATHER="father";
	public static final String ROLE_MOTHER="mather";
	public static final String ROLE_CHILD="child";
	 //属性
		public String name;
		public int age;
	 	public String role;
	//构造
	public Person(){
		
	}
	public Person(String name,int age,String role){
		this.name=name;
		this.age=age;
		this.role=role;
	}
	//方法
	public void getup(){
		System.out.println(name+",我起床了！");
	}
//	public void work(){
//		 switch(role){
//		 	case ROLE_FATHER :
//		 		System.out.println(name+",我上班工作.");
//		 		break;
//		 	case ROLE_MOTHER :
//		 		System.out.println(name+",我上班工作.");
//		 		break;
//		 	case ROLE_CHILD :
//		 		System.out.println(name+",我上学了.");
//		 		break;
//		 }
//	}
//	public void play(){
//		 switch(role){
//		 	case ROLE_FATHER :
//		 		System.out.println(name+",我加班工作.");
//		 		break;
//		 	case ROLE_MOTHER :
//		 		System.out.println(name+",我休息.");
//		 		break;
//		 	case ROLE_CHILD :
//		 		System.out.println(name+",我逛街.");
//		 		break;
//		 }
//	}
	public void sleep(){
		System.out.println(name+",我睡觉了！");
	}
 //getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	 
}