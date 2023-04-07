package com.core.gradecalculator;

public class GradingCalculator {

	public static void main(String[] args) {
		/**
		 * expects three arguments of int type with values from 0 - 100, in this
		 * sequence (math, physics, chemistry). No validation specified, will fail if
		 * not provided. Tasks 1. Specify a grade for each subject 2. Assign an overall
		 * grade. Average score. F < 35 D < 60 C < 70 B < 80 A else or >=80
		 */

		double total = 0;
		int gradeCount = 0;
		for (String s : args) {
			int score = Integer.valueOf(s);

			switch (++gradeCount) {
			case 1:
				total += score;
				System.out.println("Math grade: " + getGrade(score));
				break;
			case 2:
				total += score;
				System.out.println("Physics grade: " + getGrade(score));
				break;
			case 3:
				total += score;
				System.out.println("Chemistry grade: " + getGrade(score));
				break;
			default:
				break;
			}
		}
		if (gradeCount > 0) {
			System.out.println("\nOverall Grade: " + getGrade((int) total / gradeCount));
		}

	}

	private static String getGrade(int score) {
		if (score < 35) {
			return "F";
		} else if (score < 60) {
			return "D";
		} else if (score < 70) {
			return "C";
		} else if (score < 80) {
			return "B";
		}
		return "A";
	}

}
