package com.core.inheritance;

public class DellComputer extends Dell {

	@Override
	public void click() {
		System.out.println("Dude, click() in DellComputer concrete class.");

	}
	public void hover() {
		System.out.println("hover() in DellComputer.");
	}

}
