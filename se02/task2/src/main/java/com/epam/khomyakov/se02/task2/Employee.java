package com.epam.khomyakov.se02.task2;

public class Employee {
	
	private int penCount;
	
	private int pencilCount;
	
	private int paperSheetsCount;
	
	private int scissorsCount;
	
	private int rulerCount;
	
	private int erasersCount;
	
	

	public static final int penCost = 4300;
	public static final int pencilCost = 2500;
	public static final int paperSheetCost = 50;
	public static final int rulerCost = 11000;
	public static final int eraserCost = 4700;
	public static final int scissorCost = 15200;

	

	public int getErasersCount() {
		return erasersCount;
	}

	public void setErasersCount(int erasersCount) {
		this.erasersCount = erasersCount;
	}

	public int getRulerCount() {
		return rulerCount;
	}

	public void setRulerCount(int rulerCount) {
		this.rulerCount = rulerCount;
	}

	public int getScissorsCount() {
		return scissorsCount;
	}

	public void setScissorsCount(int scissorsCount) {
		this.scissorsCount = scissorsCount;
	}

	public int getPaperSheetsCount() {
		return paperSheetsCount;
	}

	public void setPaperSheetsCount(int paperSheetsCount) {
		this.paperSheetsCount = paperSheetsCount;
	}

	public int getPencilCount() {
		return pencilCount;
	}

	public void setPencilCount(int pencilCount) {
		this.pencilCount = pencilCount;
	}

	public int getPenCount() {
		return penCount;
	}

	public void setPenCount(int penCount) {
		this.penCount = penCount;
	}
	
	public long totalCost(){
		return penCost * penCount + pencilCost * pencilCount + paperSheetCost * paperSheetsCount + rulerCost * rulerCount + eraserCost * erasersCount +
				scissorsCount * scissorCost;
	}
	
	
	@Override
	public String toString(){
		return String.format("Counts: " + " Pen: " + getPenCount() + " Pencil: " + getPencilCount() + " PaperSheets: " + getPaperSheetsCount() + 
				" Scissors: " + getScissorsCount() + " Ruler: " + getRulerCount() + " ErasersCount: " + getErasersCount() + " Total Cost: " + totalCost());
	}

}
