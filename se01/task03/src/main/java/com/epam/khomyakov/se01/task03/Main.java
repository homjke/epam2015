package com.epam.khomyakov.se01.task03;

/**
 * In this class, we calculate the value of a function at a 
 * specified interval and at a predetermined pitch
 * @author Khomyakov_Artyom
 *
 */

public class Main {
	
	/**
	 * Calculate the value of function F(x) = tg(2x)-3.
	 * @param x
	 * @return value of function.
	 */
	public static double func(double x){
		
		return Math.tan(2*x) - 3;
	}

	public static void main(String[] args) {

		double h = 1;
		double a = 1;
		double b = 50;
		
		double x = a;
		while(x <= b){
			System.out.println(" | " + x + " | " +func(x));	
			x +=h;
		}
		
	}

}