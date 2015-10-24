package com.epam.khomyakov.se02.task3;

/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class Stationery {
	

	private String name;
	private Integer cost;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCost() {
		return cost;
	}
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	
	@Override 
	public String toString(){
		return String.format("Name : %s, Cost : %s", name, cost);
	}
	
	
	

}
