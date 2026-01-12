package com.jspider.hasarelation;
class Printer{
	void print() {
		System.out.println("Printer printing");
	}
}
class Computer{
	static Printer out = new Printer();
}
public class Mainclass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer.out.print();
	}

}
