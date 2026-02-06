package com.jspider.filehandling;

import java.io.Serializable;

public class Contact implements Serializable{
	String name;
	long number;
	Contact(String name,long number){
		this.name=name;
		this.number = number;
	}
}
