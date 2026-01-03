package com.jspider.inheritance;
class Watch{
	void dateAndTime() {
		System.out.println("Show date and time");
	}
}
class SmartWatch extends Watch{
	void notification() {
		System.out.println("Show Notification");
	}
}
public class Mainclass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartWatch sw = new SmartWatch();
		sw.dateAndTime();
		sw.notification();								
	}

}
