package com.jspider.threads;

public class Mainckass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starts");
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ends");
	}

}
