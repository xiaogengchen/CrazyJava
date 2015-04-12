package org.xj.learn_crazyjava_05 ;

/**
	学校类有学校名和学校代码两个属性
*/
public class School{
	private String name ;
	private String code ;
	public School(){}
	public School(String name,String code){
		this.setName(name) ;
		this.setCode(code) ;
	}
	public void setName(String name){
		this.name = name ;
	}
	public String getName(){
		return this.name ;
	}
	public void setCode(String code){
		this.code = code ;	
	}
	public String getCode(){
		return this.code ;
	}
}