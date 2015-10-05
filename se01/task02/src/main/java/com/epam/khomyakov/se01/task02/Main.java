package com.epam.khomyakov.se01.task02;

/**
 * In this class, we are using all kinds of cycles to solve the problem.
 * @author Khomyakov_Artyom
 *
 */

public class Main {
	

	public static void main(String[] args) {
		
	int n = 40;
	
	int[] mass = new int[n+2];
	
	
	for(int i = 2; i < n+2; i+=2){
			mass[i] = i;
			//System.out.println(mass[i]);
			if(mass[i]%4 == 0){          //кратное 4-ем, это тоже самое , что каждое второе число
			int m = mass[i] * mass[i-2]; // каждое второе минус предыдущее
			System.out.println(m);
			}
	
		}
	
	
	int i = 2;
	while(i < n+2){
		mass[i] = i;
		//System.out.println(mass[i]);
		if(mass[i]%4 == 0){         
		int m = mass[i] * mass[i-2]; 
		System.out.println(m);
		}
		i+=2;
	}
	
	
	int k = 2;
	do{
		mass[k] = k;
		//System.out.println(mass[i]);
		if(mass[k]%4 == 0){          
		int m = mass[k] * mass[k-2]; 
		System.out.println(m);
		}
		k+=2;
	} while(k < n+2);

	}

}
