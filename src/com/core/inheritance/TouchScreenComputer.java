package com.core.inheritance;

public interface TouchScreenComputer {
	void scroll();
	void click();
	default void defaultMethod() {
		System.out.println("Yup. This interface has implementation using default modifier on the method. " + notSoAbstract());
	};
	static void staticMethod() {
		System.out.println("Yup. This interface has implementation using static modifier on the method. " + notSoAbstract());
	}
	static String notSoAbstract() {
		return "Interfaces aren't as abstract as they once were.";
	};
}
