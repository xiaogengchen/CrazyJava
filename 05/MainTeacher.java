package org.xj.learn_crazyjava_05 ;

/**
	班任继承教师，添加主教班级属性，并可以描述自己
*/
public class MainTeacher extends Teacher{
	private int mainClass ; 
	public MainTeacher(){}
	public MainTeacher(String name,String idCard){
		super(name , idCard) ;
	}
	public MainTeacher(String name,String idCard,int mainClass){
		this(name,idCard) ;
		this.setMainClass(mainClass) ;
	}
	public void setMainClass(int mainClass){
		this.mainClass = mainClass ;
	}
	public int getMainClass(){
		return this.mainClass ;
	}
	public String introduceMyself(String name, String idCard){
		return super.introduceMyself(name,idCard) + "\n\t所带班级 " + this.getMainClass();
	}
	public static void main(String[] args){
		MainTeacher mt = new MainTeacher("李四","333") ;
		mt.setMainClass(2) ;
		mt.setSchool(new School("十一中","1011")) ;
		mt.setClasses(new int[]{11,12,13}) ;
		mt.setSubjects(new String[]{"信息技术"}) ;
		System.out.println(mt.introduceMyself(mt.getName(),mt.getIdCard())) ;
	}
}