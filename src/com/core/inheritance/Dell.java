package com.core.inheritance;

public abstract class Dell implements TouchScreenComputer {

	@Override
	public void scroll() {
		System.out.println("Dude, scroll() in Dell abstract class.");
	}

}
