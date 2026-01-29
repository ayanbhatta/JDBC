package com.jspider.exceptionhandling;

public class Mainclass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		try {
			System.out.println(str.charAt(15));
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
