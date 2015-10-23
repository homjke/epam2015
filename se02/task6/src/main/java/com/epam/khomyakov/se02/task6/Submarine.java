package com.epam.khomyakov.se02.task6;

/**
 * 
 * @author Khomyakov_Artyom
 *
 */


@About(comments = "Submarine Class", date = "23.10.2015")
public class Submarine {
	
	Engine engine = new Engine();
	
	public void start(){
		System.out.println("Submarine started!");
	}
	
	class Engine{
		
		public void isEngine() throws InterruptedException{
			System.out.println("Engine is started");
			for(int i = 1; i <= 100; i++){
				Thread.sleep(30);  
				System.out.println("Running : " + i + " %");
			}
		}
		
	}

}
