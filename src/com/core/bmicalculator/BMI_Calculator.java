package com.core.bmicalculator;

public class BMI_Calculator {

	public static void main(String[] args) {
		// bmi = weight in kg/(height * height) meters

		double heightIn = 69;
		double weightLb = 165;

		double heightM = inchesToMeters(heightIn);
		double weightKg = poundsToKg(weightLb);
		
		double bmi = calcBMI(weightKg,heightM);
		
		System.out.println("Body Mass Index (BMI) Calculator");
		System.out.println("\tHeight (inches): "+ heightIn +"\n\tWeight (pounds): " + weightLb);
		System.out.println("\nBMI: " + bmi);
	}

	private static double calcBMI(double weightKg, double heightM) {
		return weightKg/Math.pow(heightM, 2);
	}

	private static double poundsToKg(double weightLb) {
		double conversionRatio = .453592;
		return weightLb * conversionRatio;
	}

	private static double inchesToMeters(double heightIn) {
		double conversionRatio = .0254; //
		return heightIn * conversionRatio;
	}

}
