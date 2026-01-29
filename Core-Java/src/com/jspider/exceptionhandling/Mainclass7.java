package com.jspider.exceptionhandling;
class Demo2{
	void test() {
		System.out.println("Executing test.....");
	}
}
public class Mainclass7 {
	static void instantCreator() throws ClassNotFoundException,IllegalAccessException,InstantiationException {
		Demo2 ref = (Demo2)Class.forName("com.jspider.exceptionhandling.Demo2").newInstance();
		ref.test();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			instantCreator();
		}catch(ClassNotFoundException e) {
			System.out.println("Class Exception");
		}catch(IllegalAccessException e) {
			System.out.println("Illegal Access");
		}catch(InstantiationException e) {
			System.out.println("Instantiation Exception");
		}
	}

}
