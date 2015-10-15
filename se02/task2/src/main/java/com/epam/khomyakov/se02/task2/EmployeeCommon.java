package com.epam.khomyakov.se02.task2;

import java.util.Scanner;

public class EmployeeCommon {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Pen counts : ");
		int pen = in.nextInt();
		emp.setPenCount(pen);
		System.out.println("Enter Pencil counts : ");
		int pencil = in.nextInt();
		emp.setPencilCount(pencil);
		System.out.println("Enter Paper Sheets counts : ");
		int paper = in.nextInt();
		emp.setPaperSheetsCount(paper);
		System.out.println("Enter Scissors counts : ");
		int scissors = in.nextInt();
		emp.setScissorsCount(scissors);
		System.out.println("Enter Ruler counts : ");
		int ruler = in.nextInt();
		emp.setRulerCount(ruler);
		System.out.println("Enter Erasers counts : ");
		int erasers = in.nextInt();
		emp.setErasersCount(erasers);
		System.out.println(emp.toString());

	}

}
