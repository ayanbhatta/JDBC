package com.jspider.overriding;
class Mother{
	void cooking() {
		System.out.println("Knows cooking");
	}
}
class Daughter extends Mother{
	@Override
	void cooking() {
		System.out.println("Don't know cooking");
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Mother m = new Mother();
		m.cooking();
		Daughter d = new Daughter();
		d.cooking();
		Mother ref = new Daughter();
		ref.cooking();
		
	}

}
