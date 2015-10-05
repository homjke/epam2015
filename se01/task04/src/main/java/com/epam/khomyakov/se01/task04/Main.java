package com.epam.khomyakov.se01.task04;

import java.util.Random;

/**
 * In this class, we specify an array of numbers, and find 
 * the maximum (a1+a2n, a2+a2n-1,...,an+an+1).
 * @author Khomyakov_Artyom
 *
 */

public class Main {
	
	/**
	 * This method random generate array.
	 * k - the number of elements in the array
	 * x - Range of values of the array elements
	 * @param k
	 * @param x
	 * @return arr
	 */
	public static int[] generateArray(int k, int x){
		Random rnd = new Random();
		int[] arr = new int[k];
		System.out.println("Array: ");
		for(int i=0; i < k; i++) {
			arr[i] = rnd.nextInt(x);
			System.out.print(" " +arr[i]);
		}
		System.out.println();
		return arr;
	}

	/**
	 * This method takes a full array "arr" and return max(arr[i]+arr[j]).
	 * @param arr
	 * @return max
	 */
	public static int max(int[] arr) {
		int max = 0;
	    for (int i = 0, j = arr.length - 1; i < j; i++, j--) { 
	    	if(arr[i]+ arr[j] > max){
	    		max = arr[i]+arr[j]; //adding arrays elements (first + last, second + penultimate etc)
	    	}
	    }
	    return max;
	}
	
	public static void main(String[] args) {
		
		int[] arr = generateArray(6, 100);
		max(arr);
		System.out.println("Max element: "+max(arr));

	}

}