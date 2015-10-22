package com.epam.khomyakov.se02.task5;

public class Group {
	
	private String nameGroup;
	
	private int idGroup;

	public String getNameGroup() {
		return nameGroup;
	}

	public void setNameGroup(String nameGroup) {
		this.nameGroup = nameGroup;
	}

	public int getIdGroup() {
		return idGroup;
	}

	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	
	Group(int idGroup, String nameGroup){
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
	}
	
	@Override
	public String toString(){
		return String.format("Group ID : " + getIdGroup() + " , " + "Name group : " + getNameGroup());
	}
	

}
