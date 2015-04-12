package org.xj.learn_crazyjava_05 ;

/**
	学生继承人，添加学校、上课班级、学籍号属性，并可以描述自己
*/
public class Student extends Person{
	private School school ; 
	private int clas ;
	private String stuno ;
	public Student(){}
	public Student(String name,String idCard){
		super(name,idCard) ;
	}
	public Student(String name,String idCard,School school,int clas,String stuno){
		this(name,idCard) ;
		this.setSchool(school) ;
		this.setClas(clas) ;
		this.setStuno(stuno) ;
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
		return super.introduceMyself(name,idCard) + "\n\t所在学校 " + this.getSchool().getName() + "\n\t所在班级 " + this.getClas() + "\n\t学籍号 " + this.getStuno() ;
	}
	public static void main(String[] args){
		Student stu = new Student("王五","555",new School("十六中","1016"),7,"999999") ;
		System.out.println(stu.introduceMyself(stu.getName(),stu.getIdCard())) ;
	}
}