package com.jspider.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mainclass11 {
	public static void main(String[] args) {
		BufferedReader ref = null;
		try {
			ref= new BufferedReader(new FileReader("D:/coding/help.txt.txt"));
			String val = ref.readLine();
			while(val != null) {
				System.out.println(val);
				val = ref.readLine();
			}
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
