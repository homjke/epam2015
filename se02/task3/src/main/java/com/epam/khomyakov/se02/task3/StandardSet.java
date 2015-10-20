package com.epam.khomyakov.se02.task3;

public class StandardSet extends Stationery {
	
	StandardSet(){
		
	}
	
	StandardSet(String name, Integer cost){
		setName(name);
		setCost(cost);
	}
	
	StandardSet(String nameSet){
		System.out.println("This is Standard set");
	}
	
	@Override 
	public String toString(){
		return String.format("Name : " + getName() + " Cost : " + getCost());
	}

}
