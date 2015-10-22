package com.epam.khomyakov.se02.task5;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Object> group = new ArrayList<>();
		group.add(new Group(1, "EK"));
		group.add(new Group(2, "KB"));
		group.add(new Group(3, "PM"));
		
		for(Object groups : group){
			System.out.println(groups);
		}
		
		List<Object> student = new ArrayList<>();
		student.add(new Student(1, "Artyom"));
		student.add(new Student(2, "Homa"));
		student.add(new Student(3, "Denis"));
		
		for(Object students : student){
			System.out.println(students);
		}
		
		List<Object> link = new ArrayList<>();
		
		link.add(new Link(1,1));
		link.add(new Link(1,2));
		link.add(new Link(2,4));
		link.add(new Link(3,1));
		
		//SearchStudent newSearch = new SearchStudent();
		//System.out.println(newSearch.search(1));
		
		for(Object links : link){
			System.out.println(links);
		}
		
		

	}

}
