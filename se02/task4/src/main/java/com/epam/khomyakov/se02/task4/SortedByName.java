package com.epam.khomyakov.se02.task4;

import java.util.Comparator;

/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class SortedByName implements Comparator<BeginnerSet>{

	@Override
	public int compare(BeginnerSet obj1, BeginnerSet obj2) {
		
		 String str1 = obj1.getName();
         String str2 = obj2.getName();
        
         return str1.compareTo(str2);
	}

	

}
