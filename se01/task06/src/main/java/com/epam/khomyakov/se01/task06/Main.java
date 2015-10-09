package com.epam.khomyakov.se01.task06;

import java.io.IOException;

public class Main {


	

	public static void main(String[] args) throws IOException {
		Note note = new Note();
		note.addPost();
		note.seeAllPosts();
		note.editPost();
		note.delPost();
	}

}
