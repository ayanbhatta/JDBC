package com.jspider.constructorchaining;
class Student {
	Student(){
		System.out.println("Initializing Personal Details");
		System.out.println("Initializing Academic Details");
	}
	Student(boolean exp){
		this();
		System.out.println("Initialize Experienced Details");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println("--------------------------------");
		Student s2 = new Student(true);
	}

}
