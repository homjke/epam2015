package com.epam.khomyakov.se03.task_2;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
	
	public static void print(ResourceBundle bundle){
		System.out.println(bundle.getString("1"));
		System.out.println(bundle.getString("2"));
		System.out.println(bundle.getString("3"));
		System.out.println(bundle.getString("4"));
		System.out.println(bundle.getString("5"));
	}
	

	public static void main(String[] args) {
		
		System.out.println("Выберите язык/Choose language: ");
		System.out.println("1 - Русский, 2 - English");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if(n == 1){
			   ResourceBundle bundleRuQuestion = ResourceBundle.getBundle("Bundle", new Locale("ru", "RU"));
			   ResourceBundle bundleRuAnswers = ResourceBundle.getBundle("BundleAnswers", new Locale("ru", "RU"));
			   print(bundleRuQuestion);
			   System.out.println("Выберите вопрос : ");
			   int x = in.nextInt();
			   switch(x){
			   case 1: System.out.println("Ответ 1 : " + bundleRuAnswers.getString("1"));break;
			   case 2: System.out.println("Ответ 2 : " + bundleRuAnswers.getString("2"));break;
			   case 3: System.out.println("Ответ 3 : " + bundleRuAnswers.getString("3"));break;
			   case 4: System.out.println("Ответ 4 : " + bundleRuAnswers.getString("4"));break;
			   case 5: System.out.println("Ответ 5 : " + bundleRuAnswers.getString("5"));break;
			   }
		}else if(n ==2){	  
			   ResourceBundle bundleEnQuestion = ResourceBundle.getBundle("Bundle", new Locale("en", "US"));
			   ResourceBundle bundleEnAnswers = ResourceBundle.getBundle("BundleAnswers", new Locale("en", "US"));
			   print(bundleEnQuestion);
			   System.out.println("Choose Question : ");
			   int x = in.nextInt();
			   switch(x){
			   case 1: System.out.println("Answer 1 : " + bundleEnAnswers.getString("1"));break;
			   case 2: System.out.println("Answer 2 : " + bundleEnAnswers.getString("2"));break;
			   case 3: System.out.println("Answer 3 : " + bundleEnAnswers.getString("3"));break;
			   case 4: System.out.println("Answer 4 : " + bundleEnAnswers.getString("4"));break;
			   case 5: System.out.println("Answer 5 : " + bundleEnAnswers.getString("5"));break;
			   }
		}else{
			System.out.println("Exiting...");
			
		}
		

	}

}
