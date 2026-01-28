package com.jspider.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Val: ");
		try {
			int val = sc.nextInt();
			System.out.println("Val: " + val);
		}catch(InputMismatchException e) {
			System.out.println("Invalid input entered");
		}finally {
			sc.close();
			System.out.println("Scanner closed");
		}
	}

}
