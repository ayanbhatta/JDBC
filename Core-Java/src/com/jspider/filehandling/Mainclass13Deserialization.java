package com.jspider.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Mainclass13Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis=new FileInputStream("");
			ois= new ObjectInputStream(fis);
			
			Contact con = (Contact)ois.readObject();//downcasted to Contact type
			
			System.out.println(con.name);
			System.out.println(con.number);
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
