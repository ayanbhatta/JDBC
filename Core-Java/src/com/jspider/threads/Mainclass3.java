package com.jspider.threads;
class HelperThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
	}
	synchronized void display() {
		for(int i=0;i<=5;i++) {
			System.out.println("Name: "+ Thread.currentThread().getName());
		}
	}
	
}
public class Mainclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelperThread thread1 = new HelperThread();
		Thread t1 = new Thread(thread1);
		t1.setName("user-1");
		Thread t2 = new Thread(thread1);
		t2.setName("user-2");
		t1.start();
		t2.start();
	}

}
