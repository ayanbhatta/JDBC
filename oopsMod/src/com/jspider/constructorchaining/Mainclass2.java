package com.jspider.constructorchaining;
class City{
	City(int a){//1
		this(2.3);	//calling 2
		System.out.println("New York");
	}
	City(double d){//2
		this("ABC");	//calling 3
		System.out.println("London");
	}
	City(String s){//3
		System.out.println("Paris");
	}
}
public class Mainclass2 {
	public static void main(String[] args) {
		System.out.println("---------int---------");
		City c = new City(10);
		System.out.println("---------double---------");
		City c1 = new City(10.0);
		System.out.println("---------String---------");
		City c2 = new City("10");
	}
}
