package com.epam.khomyakov.se02.task3;


public class BeginnerSet extends Stationery {
	
	 
	public void getSetName(){
		System.out.println("This is Beginner Set");
	}
	
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


