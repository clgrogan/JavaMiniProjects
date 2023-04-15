package com.core.inheritance;

public class HPComputer extends HP {

	@Override
	public void click() {
		System.out.println("click() in HP concrete class.");

	}

	@Override
	public void hover() {
		System.out.println("hover() in HPComputer concrete class.");
		
	}

}
