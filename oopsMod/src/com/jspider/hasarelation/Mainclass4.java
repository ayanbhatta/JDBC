package com.jspider.hasarelation;
class Camera{
	void photo() {
		System.out.println("Photos..");
	}
}
class SimCard{
	void network() {
		System.out.println("Network...");
	}
}
class Mobile{
	Camera c =new Camera();
	SimCard s;
	Mobile(SimCard s){
		this.s = s;
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimCard s = new SimCard();
		Mobile m = new Mobile(s);
		m.s.network();
		m.c.photo();
	}

}
