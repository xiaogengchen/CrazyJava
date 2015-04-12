package org.xj.learn_crazyjava_05 ;

/**
	老师组引入人和学校
*/
public class Teacher2{
	private School school ;
	private Person person ;
	private int[] classes ;
	private String[] subjects ;

	public Teacher2(){}

	public void setPerson(Person person){
		this.person = person ;
	}

	public Person getPerson(){
		return person ;
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
	public String introduceMyself(){
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

		return "姓名 " + person.getName() + "\n身份证号 " + person.getIdCard() +"\n\t所在学校 " + this.getSchool().getName() + "\n\t所教班级 " + sbc.toString() + "\n\t所教学科 " + sbs.toString();
	}

}
