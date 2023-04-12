package com.core.flowcontrol;

public class PrimeDirective {

	public static void main(String[] args) {
		// Determine if the number is prime or not.
		
		for(String s: args) {
			System.out.println("\t"+s+": " + isPrime(Integer.parseInt(s)));
		}

	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		
		boolean primeFlag = true;
		for (int i = 2; i < n; i++) {
			if (n%i == 0) {
				primeFlag = false;
				break;
			}
		}
		return primeFlag ;
	}

}
