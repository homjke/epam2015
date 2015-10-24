package com.epam.khomyakov.se02.task4;

/**
 * 
 * @author Khomyakov_Artyom
 *
 */
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
	

}
