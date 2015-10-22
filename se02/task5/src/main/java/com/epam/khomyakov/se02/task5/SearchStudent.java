package com.epam.khomyakov.se02.task5;

public class SearchStudent extends Link{
	
	public String search(int idStudent){
		setIdStudent(idStudent);
		return String.format("Student : " + getIdStudent() + " , consist a group(s) : " + getIdGroup());
	}
	
}
