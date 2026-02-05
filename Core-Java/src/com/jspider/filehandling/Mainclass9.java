package com.jspider.filehandling;

import java.io.IOException;
import java.io.PrintWriter;

public class Mainclass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter ref = null;
		try {
			ref = new PrintWriter("D:/coding/help.txt.txt");
			ref.println("Microsoft");
			ref.println("Google");
			ref.println(4.5);
			ref.println(45);
			ref.flush();
			System.out.println("Write compleated");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			ref.close();
		}
	}

}
