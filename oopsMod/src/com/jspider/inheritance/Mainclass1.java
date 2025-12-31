package com.jspider.inheritance;
class Demo{
	int val = 10;
	void test() {
		System.out.println("test()....");
	}
}
class Sample extends Demo{
	
}
public class Mainclass1 {
	public static void main(String[] args) {
		Sample s1 = new Sample();
		System.out.println(s1.val);
		s1.test();
	}
}
