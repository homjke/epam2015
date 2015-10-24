package com.epam.khomyakov.se02.task3;



/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class BeginnerSet extends Stationery {
	
	BeginnerSet(){
		
	}
	
	BeginnerSet(String name, Integer cost){
		setName(name);
		setCost(cost);
	}
	
	BeginnerSet(String nameSet){
		System.out.println("This is Beginner Set. ");
	}
	

}


