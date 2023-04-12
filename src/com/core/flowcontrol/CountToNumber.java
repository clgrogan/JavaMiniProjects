package com.core.flowcontrol;

public class CountToNumber {
	/**
	 * 1. Print integers up to the number provided starting at 1. 2. Do not print
	 * numbers that are multiples of 10 3. Stop iteration/printing if/when numbers
	 * exceed 100. 4. Use iterators for, while, and do-while
	 * 
	 */

	public static void main(String[] args) {
		System.out.println("CountToNumber");

		System.out.println("Use for loop to count");
		for (String s : args) {
			countUsingFor(Integer.parseInt(s));
			countUsingWhile(Integer.parseInt(s));
			countUsingDoWhile(Integer.parseInt(s));

		}
	}

	private static void countUsingDoWhile(int n) {
		System.out.println("Count to " + n + " using \"do-while\" loop");
		int count = 1;
		do {
			if (count % 10 == 0)
				continue;
			if (count > 100)
				break;
			System.out.println("\t" + count);
		} while (++count <= n);

	}

	private static void countUsingWhile(int n) {
		System.out.println("Count to " + n + " using \"while\" loop");
		int count = 0;
		while (count++ < n) {
			if (count % 10 == 0)
				continue;
			if (count > 100)
				break;
			System.out.println("\t" + count);
		}

	}

	private static void countUsingFor(int n) {
		System.out.println("Count to " + n + " using \"for\" loop");
		for (int i = 1; i <= n; i++) {
			if (i % 10 == 0)
				continue;
			if (i > 100)
				break;
			System.out.println("\t" + i);
		}

	}

}
