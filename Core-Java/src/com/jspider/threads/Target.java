package com.jspider.threads;

public class Target {
	void displayNumbers() {
		for(int a=1;a<6;a++) {
			System.out.println((a+" Name "+ Thread.currentThread().getName()));
			
		}
	}
	void displayAlphabets() {
		for(char a='a';a<'e';a++) {
			System.out.println((a+" Name "+ Thread.currentThread().getName()));
			
		}
	}


}
