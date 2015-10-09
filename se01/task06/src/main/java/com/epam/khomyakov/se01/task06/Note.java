package com.epam.khomyakov.se01.task06;

import java.util.Scanner;


/**
 * In this class, we implemented methods for working with a notebook
 * (addPost, seeAllPosts, editPost, delPosts)
 * @author Khomyakov_Artyom
 *
 */
public class Note {
	
	private String[] str;
	
	/**
	 * In this method, we initialize an array  "str" of 
	 * type String size n is transmitted in parameters
	 * @param n
	 */
	@SuppressWarnings("resource")
	public void addPost(int n){
			str = new String[n];
			Scanner in = new Scanner(System.in);
			System.out.println("Enter post: ");
			for(int i = 0; i < str.length; i++){
			String c = in.nextLine();
			str[i] = c;
			}
		
	}
	
	/**
	 * In this method, we print to the console all the elements of the array "str".
	 */
	public void seeAllPosts(){
		for(int i = 0; i < str.length; i++){
			System.out.println(" " + i + " | Post: " + str[i]);
		}
	}
	
	/**
	 * In this method, we turn to the index of the array element
	 * and change the value of this element to the new value
	 * @param k
	 */
	@SuppressWarnings("resource")
	public void editPost(int k){
		Scanner in = new Scanner(System.in);
		System.out.println("Edit post : " + str[k]);
		System.out.println("Enter new post: ");
		String n = in.nextLine();
		str[k] = n;
		System.out.println("Posts after edit: ");
	}
	
	/**
	 * In this method, we annihilate the array elements
	 */
	public void delPosts(){
		for(int i = 0; i < str.length; i++){
		str[i] = null;
		}
		System.out.println("Posts has been successfully removed");
	}
	
	
	
	


}
