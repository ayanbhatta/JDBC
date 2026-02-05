package com.jspider.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Mainclass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedWriter ref = null;
		try {
			ref = new BufferedWriter(new FileWriter("D:/coding/bufferedWriter.txt"));
			ref.write("Java Full stack");
			ref.newLine();
			ref.write("Mern ");
			ref.write(65);
			//ref.write(6.5); cannot contain double value
			ref.flush();
			System.out.println("Write Completed");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				ref.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
