package com.jspider.constructorchaining;

class Burger{
	Burger(){
		System.out.println("Burger");
	}
	Burger(int a){
		this();
		System.out.println("Fries");
	}
	Burger(double d){
		this(10);//calling the constructor where argument is integer.
		System.out.println("Coke");
	}
}
public class Mainclass1 {
	public static void main(String[] args) {
		Burger b1 = new Burger(100);
		Burger b2 = new Burger(100.2);
	}
}
