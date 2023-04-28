package com.core.multithreading;
public class ThreadCountApp {
	public static void main(String[] args) {
		int n = 17;
		System.out.println("Thread Classes Count Even and Odd\n   (Count to " + n + ")");
		Thread t0 = new OddNumbers(n);
		Thread t1 = new Thread(new EvenNumbers(n));
		t0.start();
		t1.start();
	}
}
