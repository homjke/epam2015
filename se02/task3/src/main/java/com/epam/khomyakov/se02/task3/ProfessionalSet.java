package com.epam.khomyakov.se02.task3;

/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class ProfessionalSet extends Stationery {
	
	ProfessionalSet(){
		
	}
	
	ProfessionalSet(String name, Integer cost){
		setName(name);
		setCost(cost);
	}
	
	ProfessionalSet(String nameSet){
		System.out.println("This is Professional set");
	}
	
	

}
