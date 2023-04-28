package com.core.multithreading;
public class OddNumbers extends Thread {
	private int n;
	public OddNumbers(int n) {
		this.n = n;
	}
	@Override
	public void run() {
		for (int i = 1; i <= n; i += 2) {
			System.out.println("\t" + i);
		}
	}
}
