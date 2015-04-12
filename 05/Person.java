package org.xj.learn_crazyjava_05 ;

/**
	人有姓名和身份证号，能够用姓名和身份证号描述自己
*/
public class Person{
	private String name ;
	private String idCard ;
	
	public Person(){}
	public Person(String name){
		this.setName(name) ;
	}
	public Person(String name,String idCard){
		this(name) ;
		this.setIdCard(idCard) ;
	}

	public String getName(){
		return this.name ;
	}
	public void setName(String name){
		this.name = name ;
	}

	public String getIdCard(){
		return this.idCard ;
	} 

	public void setIdCard(String idCard){
		this.idCard = idCard ;
	}
	public String introduceMyself(String name,String idCard){
		return "我是 " + name + "\n身份证号 " + idCard ;
	}
}