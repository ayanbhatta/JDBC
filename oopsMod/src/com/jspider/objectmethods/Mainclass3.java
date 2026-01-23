package com.jspider.objectmethods;
class Circle{
	private int radius=10;
	@Override
	public boolean equals(Object obj) {//up-casting
		Circle c = (Circle) obj;//down-casting
		if(this.radius == c.radius) {
			return true;
		}else {
			return false;
		}
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		System.out.println(c1.equals(c2));
		System.out.println(c1==c2);
		//System.out.println(c1.radius==c2.radius); cannot use because the members are private
		
	}

}
