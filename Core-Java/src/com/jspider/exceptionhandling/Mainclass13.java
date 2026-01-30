package com.jspider.exceptionhandling;
class UnderageException extends RuntimeException{
	UnderageException(){}
	UnderageException(String msg){
		super(msg);
	}
}
class Security{
	static void checkAge(int age) {
		if(age < 18) {
			throw new UnderageException(age + " is underage");
		}
	}
}
public class Mainclass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Security.checkAge(25);
			Security.checkAge(12);
			Security.checkAge(15);
		}catch(UnderageException e) {
			e.printStackTrace();
		}
	}

}
