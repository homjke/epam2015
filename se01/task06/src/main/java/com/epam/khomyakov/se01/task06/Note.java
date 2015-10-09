package com.epam.khomyakov.se01.task06;

import java.util.Scanner;

public class Note {
	
	public String[] str = new String[1];
	
	public void addPost(){
			Scanner in = new Scanner(System.in);
			System.out.println("Enter post: ");
			String c = in.nextLine();
			str[0] = c;
		
	}
	
	public void seeAllPosts(){
		for(int i = 0; i < str.length; i++){
			System.out.println(" " + i + " | Post: " + str[i]);
		}
	}
	
	public void editPost(){
		Scanner in = new Scanner(System.in);
		System.out.println("Edit post : " + str[0]);
		System.out.println("Enter new post: ");
		String n = in.nextLine();
		str[0] = n;
		System.out.println("Post after edit: " + str[0]);
	}
	
	public void delPost(){
		str[0] = null;
		System.out.println("Post has been successfully removed");
	}
	
	
	
	


}
