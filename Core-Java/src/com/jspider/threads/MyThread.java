package com.jspider.threads;

public class MyThread implements Runnable{
	Target tgt = new Target();
	@Override
	public void run() {
		// Object Lock: All non static members associated with obj becomes thread safe
		synchronized(tgt) {
			tgt.displayAlphabets();
			tgt.displayNumbers();
		}
	}

}
