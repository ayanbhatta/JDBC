package com.jspider.hasarelation;
class Demo{
	void test() {
		System.out.println("Running test.........");
	}
}
class Sample{
	Demo d = new Demo();
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
		//Strong relation of B over A.
		//If B is destroyed then A is also destroyed.
		s.d.test();
	}

}
