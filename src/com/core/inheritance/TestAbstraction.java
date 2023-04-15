package com.core.inheritance;

public class TestAbstraction {

	public static void main(String[] args) {
		DellComputer dellComputer = new DellComputer();
		HPComputer hpComputer = new HPComputer();
		TouchScreenComputer touchScreenComputer = new DellComputer();
		HP hpAbstract = new HPComputer();
		
		dellComputer.scroll();
		dellComputer.click();
		dellComputer.defaultMethod();
		dellComputer.hover();
		
		hpComputer.scroll();
		hpComputer.click();
		hpComputer.defaultMethod();
		
		System.out.println("Polymorphism: \n\tTouchScreenComputer touchScreenComputer = new DellComputer();");
		touchScreenComputer.scroll();
		touchScreenComputer.click();
		touchScreenComputer.defaultMethod();
//		touchScreenComputer.hover(); nope, doesn't work because the interface doesn't know that hover exists.
		
		hpComputer.scroll();
		hpComputer.click();
		hpComputer.defaultMethod();
		
		System.out.println("Polymorphism:\n\tHP hpAbstract = new HPComputer();");
		hpAbstract.scroll();
		hpAbstract.click();
		hpAbstract.defaultMethod();
		hpAbstract.hover();
		System.out.println("\nstatic method on interface.");
		TouchScreenComputer.staticMethod();
		

	}

}
