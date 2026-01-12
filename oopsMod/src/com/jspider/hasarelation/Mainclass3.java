 package com.jspider.hasarelation;
class Engine{
	void power() {
		System.out.println("Car started...");
	}
}
class Driver{
	void drive() {
		System.out.println("Driver is driving");
	}
}
class Car{
	Engine eng = new Engine();//Car Has-A engine : Composition
	Driver dr ;//Car has-A Driver : Aggregation
	Car(Driver dr){
		this.dr=dr;
	}
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver dr = new Driver();
		Car bmw = new Car(dr);
		bmw.eng.power();
		bmw.dr.drive();
	}

}
