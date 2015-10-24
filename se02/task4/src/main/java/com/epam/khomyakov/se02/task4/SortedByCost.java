package com.epam.khomyakov.se02.task4;

import java.util.Comparator;


/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class SortedByCost implements Comparator<BeginnerSet>{

	@Override
	public int compare(BeginnerSet obj1, BeginnerSet obj2) {
		 double cost1 = obj1.getCost();
         double cost2 = obj2.getCost();

         if(cost1 > cost2) {
                return 1;
         }
         else if(cost1 < cost2) {
                return -1;
         }
         else {
                return 0;
         }
	}

}
