package org.xj.learn_crazyjava_05 ;

/**
	老师继承人，添加学校、所教班级、所教学科属性，并可以用继承来的姓名、身份证号联合这三个属性描述自己
*/
public class Teacher extends Person{
	private School school ;
	private int[] classes ;
	private String[] subjects ;

	public Teacher(){}
	public Teacher(String name,String idCard){
		super(name,idCard) ;
	}
	public Teacher(String name,String idCard,School school){
		this(name,idCard) ;
		this.setSchool(school) ;
	}
	public Teacher(String name,String idCard,School school,int[] classes){
		this(name,idCard,school) ;
		this.setClasses(classes) ;
	}
	public Teacher(String name,String idCard,School school,int[] classes,String[] subjects){
		this(name,idCard,school,classes) ;
		this.setSubjects(subjects) ;
	}

	public void setSchool(School school){
		this.school = school ;
	}
	public School getSchool(){
		return this.school ;
	}

	public void setClasses(int[] classes){
		this.classes = classes ;
	}
	public int[] getClasses(){
		return this.classes ;
	}

	public void setSubjects(String[] subjects){
		this.subjects = subjects ;
	}
	public String[] getSubjects(){
		return this.subjects ;
	}
	public String introduceMyself(String name, String idCard){
		StringBuilder sbc = new StringBuilder() ;
		StringBuilder sbs = new StringBuilder() ;
		if(null != classes){
			for(int i = 0 ; i < classes.length ; i++){
				sbc.append(classes[i]).append(" ") ;
			}
		}
		if(null != subjects){
			for(int i = 0 ; i < subjects.length ; i++){
				sbs.append(subjects[i]).append(" ") ;
			}
		}

		return super.introduceMyself(name,idCard)+"\n\t所在学校 " + this.getSchool().getName() + "\n\t所教班级 " + sbc.toString() + "\n\t所教学科 " + sbs.toString();
	}
	public static void main(String[] args){
		//new Teacher() ;
		Person p = new Teacher("张三","123") ;
		System.out.println(p.introduceMyself(p.getName(),p.getIdCard())) ;
	} 
}
