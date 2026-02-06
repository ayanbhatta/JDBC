package com.jspider.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Mainclass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("D:/coding/egforSerialization");
			oos = new ObjectOutputStream(fos);
			Contact con = new Contact("Ayan",231346654L);
			oos.writeObject(con);
			System.out.println("Serialization Compleated");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				oos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
