package com.jspider.constructorchaining;
class Alpha{
	Alpha(){
		System.out.println("Alpha Constructor");
	}
	Alpha(int a){
		System.out.println("Alpha(int) Constructor");
	}
}
class Beta extends Alpha{
	
	Beta(){
		super(10);
		System.out.println("Beta Constructor");
	}
}
public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beta ref = new Beta();
	}

}
