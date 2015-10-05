package com.epam.khomyakov.se01.task06;

import java.util.Scanner;

public class Note {
	
	public void addPost(){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter post: ");
		String c = in.nextLine();

	}
	
	public void seeAllPost(){
		String[] mass = {"sss", "sssuu", "oeiw9ew9"};
		for(int i = 0; i < mass.length; i++){
			System.out.println(" " + i + " | Post: " + mass[i]);
		}
	}
	
	public String editPost(){
		System.out.println("Post was edit");
		return null;
	}
	
	public void delPost(){
		System.out.println("Post was deleted");
	}
	
	
	public void navigation(int k){
		if(k == 1){
			addPost();
		}
		else if(k == 2){
			seeAllPost();
		} 
		else if(k == 3){
			editPost();
		}
		else if(k == 4){
			delPost();
		}
	}


}
