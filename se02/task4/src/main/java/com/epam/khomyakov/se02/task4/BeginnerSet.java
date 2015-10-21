package com.epam.khomyakov.se02.task4;



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
	
	@Override 
	public String toString(){
		return String.format("Name : " + getName() + " Cost : " + getCost());
	}


}


