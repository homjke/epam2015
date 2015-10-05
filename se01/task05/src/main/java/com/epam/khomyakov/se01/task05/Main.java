package com.epam.khomyakov.se01.task05;

/**
 * In this class, we get matrix of size n * n in which 1 on diagonals.
 * @author Khomyakov_Artyom
 *
 */

public class Main {
	
	/**
	 * This method generate and build matrix.
	 * @param n
	 * @return
	 */
	public static int[][] generateMatrix(int n){
		int[][] matrix = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = 0;
				if(i==j || i+j == n-1){
					matrix[i][j] = 1;
				}
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		return matrix;
	}

	public static void main(String[] args) {
		
		int[][] matrix = generateMatrix(10);
		

	}

}
