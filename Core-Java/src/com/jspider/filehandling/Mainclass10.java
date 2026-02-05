package com.jspider.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class Mainclass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader ref = null;
		try {
			ref = new FileReader("D:/coding/help.txt.txt");
			int val = ref.read();
			while(val!=-1) {
				System.out.print((char)val);
				val = ref.read();
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
