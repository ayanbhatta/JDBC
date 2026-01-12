package com.jspider.hasarelation;
class Alpha{
	void play() {
		System.out.println("Playing...");
	}
}
class Beta{
	Alpha a;
	Beta(Alpha a){
		this.a = a;
	}
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha a = new Alpha();
		Beta b = new Beta(a);
		//this is aggregation where A,B has a weak relation.
		//If B is destroys still A object will be there.
		b.a.play();
	}

}
