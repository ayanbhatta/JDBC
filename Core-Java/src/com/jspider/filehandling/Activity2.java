package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Activity2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader1=new BufferedReader(new FileReader("D:/coding/A.txt"));
		BufferedReader reader2=new BufferedReader(new FileReader("D:/coding/.txt"));
		PrintWriter writer = new PrintWriter("D:/coding/C.txt");
		String line1 = reader1.readLine();
		String line2 = reader2.readLine();
		while(line1 != null || line2 != null) {
			if(line1 != null) {
				writer.println(line1);
				line1 = reader1.readLine();
			}
			if(line2 != null) {
				writer.println(line2);
				line2 = reader2.readLine();
			}
		}
	
		writer.flush();
		System.out.println("Merge Copmpleated");
		reader1.close();
		reader2.close();
		writer.close();
	}

}
