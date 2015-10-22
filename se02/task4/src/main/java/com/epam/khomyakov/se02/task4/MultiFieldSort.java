package com.epam.khomyakov.se02.task4;

import java.util.Comparator;

public class MultiFieldSort implements Comparator<BeginnerSet>{

	@Override
	public int compare(BeginnerSet obj1, BeginnerSet obj2) {
		 int str = obj1.getName().compareToIgnoreCase(obj2.getName());
	     if (str != 0) {
	        return str;
	     } else {
	       return Integer.valueOf(obj1.getCost()).compareTo(Integer.valueOf(obj2.getCost()));
	     }
	}

}
