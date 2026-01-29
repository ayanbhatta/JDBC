package com.jspider.exceptionhandling;
	

public class Mainclass6 {
	int size;
	static void createCopy() throws CloneNotSupportedException{
		Mainclass6 ref = new Mainclass6();
		ref.size = 500;
		Mainclass6 copy = (Mainclass6)ref.clone();
		System.out.println(copy.size);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			createCopy();
		}catch(CloneNotSupportedException e) {
			System.out.println("Clone Failed");
		}
	}

}
