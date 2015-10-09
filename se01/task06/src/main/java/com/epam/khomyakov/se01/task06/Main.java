package com.epam.khomyakov.se01.task06;

import java.io.IOException;


/**
 * In this class, we create an object "note" and call its methods.
 * @author Khomyakov_Artyom
 *
 */
public class Main {



	public static void main(String[] args) throws IOException {
		Note note = new Note();
		note.addPost(3);
		note.seeAllPosts();
		note.editPost(1);
		note.seeAllPosts();
		note.delPosts();
	}

}
