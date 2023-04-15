package com.core.inheritance;

public abstract class HP implements TouchScreenComputer {

	@Override
	public void scroll() {
		System.out.println("scroll() in HP abstract class.");
	}
	
	public abstract void hover();

}
