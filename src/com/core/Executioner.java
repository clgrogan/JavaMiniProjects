package com.core;

import com.core.bmicalculator.BMI_Calculator;
import com.core.flowcontrol.CountToNumber;
import com.core.flowcontrol.PrimeDirective;
import com.core.gradecalculator.GradingCalculator;

public class Executioner {

	public static void main(String[] args) {
		final String[] emptyArgs = new String[] {};
		final String[] wordArgs = {"Just", "some", "words", "as", "Strings", "."};
		String[] miscArgs;
		
		BMI_Calculator.main(emptyArgs);
		
		GradingCalculator.main(emptyArgs);
		
		miscArgs = new String[]{"3", "5","9","11", "12"};
		PrimeDirective.main(miscArgs);

		
		miscArgs = new String[]{"3", "20","13","100", "101"};
		CountToNumber.main(miscArgs);
		
	}

}
