package com.epam.khomyakov.se02.task5;

public class Link {
	
	
	private int idStudent;
	
	private int idGroup;

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	
	
	Link(int idStudent, int idGroup){
		this.idStudent = idStudent;
		this.idGroup = idGroup;
		
	}
	
	public Link() {
		// TODO Auto-generated constructor stub
	}
	

	/*public int search(int idStudent){
		return idGroup;
		
	}*/
	
	@Override
	public String toString(){
		return String.format("Student : " + getIdStudent() + " , " + "consists a group : " + getIdGroup());
	}
	
	
	


}
