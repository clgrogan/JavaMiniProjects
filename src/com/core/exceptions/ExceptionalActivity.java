package com.core.exceptions;

public class ExceptionalActivity {
	/** 
	 * Exception activity Project
	 * TODO
	 * 1. Create a class with a main method
	 * 2. Main
	 *   - Execute Thread.sleep(2000);
	 *   - handle the checked exception of Thread.sleep() using throws.
	 *   - AND handle using try catch
	 *   - inside catch
	 *     + throw new custom exception that is a unchecked/runtime exception.
	 * @throws InterruptedException 
	 * */

	public static void main(String[] args) throws InterruptedException {
		try {
			System.out.println("Start try {...\nexecute Thread.sleep(2000);");
//			ThrowInterruptedException.throwSomething();
			Thread.sleep(2000);
			System.out.println("... end try.");
		} catch (InterruptedException e) {
			throw new UncheckedExceptionalActivity(e);
		} 
	}

}
