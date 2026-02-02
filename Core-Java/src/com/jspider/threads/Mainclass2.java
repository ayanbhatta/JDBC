package com.jspider.threads;
class SampleThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i<10; i++) {
			System.out.println("Sample Thread");
		}
	}
	
}
public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleThread s = new SampleThread();
		Thread t = new Thread(s);
		t.start();
		for(int i = 0 ; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
