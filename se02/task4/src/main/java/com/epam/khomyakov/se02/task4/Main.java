package com.epam.khomyakov.se02.task4;

import java.util.Arrays;


/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class Main {

	public static void main(String[] args) {
		BeginnerSet[] beg = new BeginnerSet[11];
		beg[0] = new BeginnerSet("Pencil", 5000);
		beg[1] = new BeginnerSet("Pen", 2000);
		beg[2] = new BeginnerSet("Stapler", 6000);
		beg[3] = new BeginnerSet("Eraser", 500);
		beg[4] = new BeginnerSet("Paper sheet", 60000);
		beg[5] = new BeginnerSet("Scissors", 90);
		beg[6] = new BeginnerSet("Scotch", 7000);
		beg[7] = new BeginnerSet("Clip", 50);
		beg[8] = new BeginnerSet("Clip", 50000);
		beg[9] = new BeginnerSet("Clip", 500);
		beg[10] = new BeginnerSet("Scissors", 900);
		new BeginnerSet("");
		
		System.out.println("*********** Without sorting ***********");
		for(BeginnerSet begSet : beg) {
			System.out.println("Name : " + begSet.getName() + "Cost : " + begSet.getCost());
		}
		
		System.out.println("*********** Sorted by cost ***********");
		
        Arrays.sort(beg, new SortedByCost());
        for(BeginnerSet begSet : beg) {
               System.out.println("Name: " + begSet.getName() + " Cost: " + begSet.getCost());
        }  
        
        System.out.println("*********** Sorted by name ***********");
		
        Arrays.sort(beg, new SortedByName());
        for(BeginnerSet begSet : beg) {
               System.out.println("Name: " + begSet.getName() + " Cost: " + begSet.getCost());
        }
        
        System.out.println("*********** Sorted by name and cost ***********");
		
        Arrays.sort(beg, new MultiFieldSort());
        for(BeginnerSet begSet : beg) {
               System.out.println("Name: " + begSet.getName() + " Cost: " + begSet.getCost());
        }
        
	

	}

}
