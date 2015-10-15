package com.epam.khomyakov.se02.task1;


/**
 * 
 * @author Khomyakov_Artyom
 *
 */
public class Pen {
	
	int a;
	int b;
	
	String name;
	
	
	Pen(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	Pen (String name){
		this.name = name;
	}
	
	
	/**
	 * Method equals()
	 */
	@Override
	public boolean equals(Object obj){
		if(obj == null)
        {
            return false;
        }
        if (obj == this)
        {
           return true;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        Pen other = (Pen) obj;
        if(a != other.a){
        	return false;
        }
        if(b != other.b){
        	return false;
        }
        return true;
        
	}
	
	
	/**
	 * Method hashCode()
	 */
	@Override
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = result * prime + a;
		result = result * prime + b;
		return result;
	}
	
	
	/**
	 * Method toString()
	 */
	@Override
	public String toString(){
		return String.format("Name: " + name);
	}

	public static void main(String[] args) {
		
		Pen obj = new Pen(2,3);
		Pen other = new Pen(2,3);
		boolean result = obj.equals(other);
		System.out.println(result);
		System.out.println(obj.hashCode());
		System.out.println(other.hashCode());
		Pen x = new Pen("Artyom");
		System.out.println(x);
		
	}

}
