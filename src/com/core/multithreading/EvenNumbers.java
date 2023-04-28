package com.core.multithreading;
public class EvenNumbers implements Runnable {
	private int n;
	public EvenNumbers(int n) {
		this.n = n;
	}
	@Override
	public void run() {
		for (int i = 2; i <= n; i +=2) {
			System.out.println("\t"+i);
		}
	}
}
