package org.xj.learn_crazyjava_05 ;

/**
	班任组合教师
*/
public class MainTeacher2{
	private int mainClass ; 
	private Teacher2 teacher ;
	public MainTeacher2(){}

	public void setTeacher(Teacher2 teacher){
		this.teacher = teacher ;
	}
	public Teacher2 getTeacher(){
		return this.teacher ;
	}
	public void setMainClass(int mainClass){
		this.mainClass = mainClass ;
	}
	public int getMainClass(){
		return this.mainClass ;
	}
	public String introduceMyself(){
		return "姓名 " + teacher.getPerson().getName() + "\n身份证号 " + teacher.getPerson().getIdCard() + "\n\t所带班级 " + this.getMainClass();
	}
}