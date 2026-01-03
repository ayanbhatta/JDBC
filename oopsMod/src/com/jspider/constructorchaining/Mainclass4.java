package com.jspider.constructorchaining;

class Demo{
	Demo(){
		System.out.println("Demo Constructor");
	}
}
class Sample extends Demo{
	Sample(){
		super();
		System.out.println("Sample() Constructor");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample s = new Sample();
	}

}
