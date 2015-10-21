package com.epam.khomyakov.se02.task3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Object> begSet = new ArrayList<>();
		begSet.add(new BeginnerSet("Pen", 2000));
		begSet.add(new BeginnerSet("Pencil", 3000));
		begSet.add(new BeginnerSet("Stapler", 5600));
		new BeginnerSet("");
		System.out.println(begSet);
		
		
		/*List<Object> stdSet = new ArrayList<>();
		stdSet.add(new StandardSet("Rule", 2500));
		stdSet.add(new StandardSet("Eraser", 3500));
		new StandardSet("");
		System.out.println(stdSet);
		*/

	}

}
