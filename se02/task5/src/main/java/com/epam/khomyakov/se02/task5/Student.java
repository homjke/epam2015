package com.epam.khomyakov.se02.task5;

public class Student<T> {
	
	T mark; 
	
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
	
	Student(int idStudent, String name, T mark){
		
		this.idStudent = idStudent;
		this.name = name;
		this.mark = mark;
		
		
	}
	
	 Student(T o) {
	        mark = o;
	    }
	 
	 T getMark() {
	        return mark;
	    }
	
	@Override
	public String toString(){
		return String.format("Student ID : %s, Name : %s", idStudent, name);
	}

}
