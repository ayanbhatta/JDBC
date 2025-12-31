package com.jspider.inheritance;
class WhatsappOld{
	void message() {
		System.out.println("Texting...");
	}
}
class WhatsappNew extends WhatsappOld{
	void status() {
		System.out.println("Show status");
	}
}
public class Mainclass3 {
	public static void main(String[] args) {
		WhatsappNew ref = new WhatsappNew();
		ref.message();
		ref.status();
	}
}
