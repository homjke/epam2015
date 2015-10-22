package com.epam.khomyakov.se02.task5;

public class Student {
	
	private String name;
	
	private int idStudent;

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	Student(){
		
	}
	
	Student(int idStudent, String name){
		
		this.idStudent = idStudent;
		this.name = name;
		
		
	}
	
	@Override
	public String toString(){
		return String.format("Student ID : " + getIdStudent() + " , " + "Name : " + getName());
	}

}
