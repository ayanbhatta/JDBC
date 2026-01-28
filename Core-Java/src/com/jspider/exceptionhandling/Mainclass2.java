package com.jspider.exceptionhandling;

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Developer";
		try {
			System.out.println(str.charAt(15));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid Index value");
		}catch(NullPointerException e) {
			System.out.println("Access with null reference");
		}
	}

}
