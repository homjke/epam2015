package com.epam.khomyakov.se01.task06;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Note note = new Note();
		System.out.println("WELCOME: ");
		System.out.println("1 - AddPost, 2 - SeePost, 3 - EditPost, 4 - DeletePost , 0 - Exit");
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		note.navigation(k);
		System.in.read();
	}

}
