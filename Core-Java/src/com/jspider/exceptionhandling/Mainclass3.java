package com.jspider.exceptionhandling;
class Demo{
	void test() {
		System.out.println("Executing test....");
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Demo ref = (Demo)Class.forName("com.jspider.exceptionhandling.Demo").newInstance();
			ref.test();
		}catch(ClassNotFoundException e) {
			System.out.println("No such class Exist");
		}catch(IllegalAccessException e) {
			System.out.println("Access Denied");
		}catch(InstantiationException e) {
			System.out.println("Object creation failed");
		}
	}

}
