package com.yu.demo;
/**
 * �˵ĸ���
 * 1.���ԣ�name age
 *2.������getup,work,play,sleep
 */
public class Person {
     
	public static final String ROLE_FATHER="father";
	public static final String ROLE_MOTHER="mather";
	public static final String ROLE_CHILD="child";
	 //����
		public String name;
		public int age;
	 	public String role;
	//����
	public Person(){
		
	}
	public Person(String name,int age,String role){
		this.name=name;
		this.age=age;
		this.role=role;
	}
	//����
	public void getup(){
		System.out.println(name+",�����ˣ�");
	}
//	public void work(){
//		 switch(role){
//		 	case ROLE_FATHER :
//		 		System.out.println(name+",���ϰ๤��.");
//		 		break;
//		 	case ROLE_MOTHER :
//		 		System.out.println(name+",���ϰ๤��.");
//		 		break;
//		 	case ROLE_CHILD :
//		 		System.out.println(name+",����ѧ��.");
//		 		break;
//		 }
//	}
//	public void play(){
//		 switch(role){
//		 	case ROLE_FATHER :
//		 		System.out.println(name+",�ҼӰ๤��.");
//		 		break;
//		 	case ROLE_MOTHER :
//		 		System.out.println(name+",����Ϣ.");
//		 		break;
//		 	case ROLE_CHILD :
//		 		System.out.println(name+",�ҹ��.");
//		 		break;
//		 }
//	}
	public void sleep(){
		System.out.println(name+",��˯���ˣ�");
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