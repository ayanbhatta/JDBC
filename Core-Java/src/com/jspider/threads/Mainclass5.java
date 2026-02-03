package com.jspider.threads;

public class Mainclass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread res = new MyThread();
		Thread t1 = new Thread(res);
		t1.setName("Thread-1");
		Thread t2 = new Thread(res);
		t2.setName("Thread-2");
		t1.start();
		t2.start();
	}

}
