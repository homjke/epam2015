package com.epam.khomyakov.se02.task5;

public class Group {
	
	private String nameGroup;
	
	private int idGroup;
	
	private Discipline discipline;
	
	

	public Discipline getDiscipline() {
		return discipline;
	}

	public void setDiscipline(Discipline discipline) {
		this.discipline = discipline;
	}

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
	
	Group(int idGroup, String nameGroup, Discipline discpipline){
		this.idGroup = idGroup;
		this.nameGroup = nameGroup;
		this.discipline = discpipline;
	}
	
	@Override
	public String toString(){
		return String.format("Group ID : %s, Name group : %s, Discipline study : %s", idGroup, nameGroup, discipline);
	}
	

}
