package com.jspider.exceptionhandling;

public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("start");
			System.out.println(10/0);
			System.out.println("end");
		}catch(ArithmeticException e) {
			System.out.println("/ by zero");
		}finally {			//finally will execute irrespective of error
			System.out.println("Executing finally block");
		}
	}

}
