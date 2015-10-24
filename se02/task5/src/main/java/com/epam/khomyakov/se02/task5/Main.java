package com.epam.khomyakov.se02.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {


	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		List<Object> group = new ArrayList<>();
		group.add(new Group(1, "EK", Discipline.physics));
		group.add(new Group(2, "KB", Discipline.informatics));
		group.add(new Group(3, "PM", Discipline.mathematics));
		
		for(Object groups : group){
			System.out.println(groups);
		}
		
		List<Object> student = new ArrayList<>();
		student.add(new Student(1, "Artyom", 3));
		student.add(new Student(2, "Vadim", 3.4));
		student.add(new Student(3, "Denis", 2.1));
		
		for(Object students : student){
			System.out.println(students);
		}
		
		List<Object> link = new ArrayList<>();
		
		link.add(new Link(1,1));
		link.add(new Link(1,2));
		link.add(new Link(2,4));
		link.add(new Link(3,1));
		
	
		
		for(Object links : link){
			System.out.println(links);
		}
		
		
		

	}

}
