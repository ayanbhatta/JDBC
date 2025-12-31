package com.jspider.inheritance;
class Alpha{
	int a = 10;
}
class Beta extends Alpha{
	int b = 20;
}
public class Mainclass2 {
	public static void main(String[] args) {
		Beta obj = new Beta();
		System.out.println(obj.a);
		System.out.println(obj.b);
		Alpha ref = new Alpha();
		System.out.println(ref.a);
		//System.out.println(ref.b); Super Class cannot access member of sub class
	}
}
