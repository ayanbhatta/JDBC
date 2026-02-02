package com.jspider.threads;
class DemoThread extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Demo thread");
		}
	}
}
public class Mainclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoThread dt = new DemoThread();
		dt.start();
		for(int i = 0; i<10; i++) {
			System.out.println("Main thread");
		}
	}

}
