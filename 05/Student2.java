package org.xj.learn_crazyjava_05 ;

/**
	学生继承人，添加学校、上课班级、学籍号属性，并可以描述自己
*/
public class Student2 {
	private School school ; 
	private int clas ;
	private String stuno ;
	private Person person ;

	public Student2(){}
	
	public void setPerson(Person person){
		this.person = person ;
	}

	public Person getPerson(){
		return this.person ;
	}

	public void setSchool(School school){
		this.school = school ;
	}
	public School getSchool(){
		return this.school ;
	}
	public void setClas(int clas){
		this.clas = clas ;
	}
	public int getClas(){
		return this.clas ;
	}
	public void setStuno(String stuno){
		this.stuno = stuno ;
	}
	public String getStuno(){
		return this.stuno ;
	}
	public String introduceMyself(String name,String idCard){
		return "姓名 " + person.getName() + "\n身份证号 " + person.getIdCard()+ "\n\t所在学校 " + this.getSchool().getName() + "\n\t所在班级 " + this.getClas() + "\n\t学籍号 " + this.getStuno() ;
	}

}