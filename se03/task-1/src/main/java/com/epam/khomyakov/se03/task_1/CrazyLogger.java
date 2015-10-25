package com.epam.khomyakov.se03.task_1;

import java.util.Scanner;


public class CrazyLogger {


	public static StringBuilder str = new StringBuilder();
	
	public static void searchString(){
		System.out.println("Enter string for search : ");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();		
		int n = str.indexOf(s);
		int m = str.indexOf(";", n);	
		System.out.println(str.substring(n, m));	
		
	}
	
	public static void print(){
		System.out.print(str);
	}
	
	public static void searchToFrom(){
		System.out.println("To : ");
		Scanner in = new Scanner(System.in);
		String s2 = in.nextLine();	
		int n = str.indexOf(s2);
		System.out.println("Search string from : ");
		String s = in.nextLine();
		int m = str.indexOf(s);
		System.out.println(str.substring(m,n));
	}

	public static void main(String[] args) {
		
		
		
		str.append("21-10-2015 : 22-32 - Error;");
		str.append("21-10-2015 : 21-09 - Ok;");
		str.append("21-10-2015 : 20-20 - Ok;");
		str.append("21-10-2015 : 19-11 - Ok;");
		str.append("21-10-2015 : 18-44 - Ok;");
		str.append("21-10-2015 : 17-32 - Error;");
		str.append("21-10-2015 : 16-12 - Ok;");
		str.append("21-10-2015 : 15-45 - Ok;");
		str.append("21-10-2015 : 14-33 - Ok;");
		str.append("21-10-2015 : 13-21 - Fatal Error;");
		
	
		System.out.println("1 - Search String, 2 - Search String To - From, 3 - Print, 0 - Exit");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();	
		switch(x){
		case  1 : searchString();
				  break;
				  
		case  2 : searchToFrom();
				  break;
				  
		case  3 : print();
				  break;
				  
		case  0 : break;
		
		default : break;
		
		}
		
		
		
		
		

	}

}
