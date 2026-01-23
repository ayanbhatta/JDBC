package com.jspider.objectmethods;
class Product{
	int pid=1234;
	@Override
	public boolean equals(Object obj) {//up-casting
		Product p = (Product)obj;//down-casting
		if(this.pid==p.pid) {
			return true;
		}else {
			return false;
		}
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.pid==p2.pid);//can do when only two value comparison or the data members are public
	}

}
