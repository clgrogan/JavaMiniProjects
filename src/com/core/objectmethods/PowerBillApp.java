package com.core.objectmethods;

public class PowerBillApp {

	public static void main(String[] args) {

		PowerBill pBill1 = new PowerBill("Kujo, LLC", "666 S. Heck St., Tampa, FL 33615");
		PowerBill pBill2 = new PowerBill("Kujo, LLC", "666 S. Heck St., Tampa, FL 33615");
		PowerBill pBill3 = new PowerBill("Kujo, LLC", "666 S. Heck St., Tampa, FL 33615");
		PowerBill pBill4 = pBill1;
		pBill3.setMeterNumber(pBill2.getMeterNumber());
		pBill3.setAddress(null);
		pBill3.setName(null);

		System.out.println("\nDemonstrate Overriding Object Methods\n");
		
		printObjectStateChanges();
		System.out.println();
		
		System.out.println("pBill1.toString:\n" + pBill1);
		System.out.println("pBill2.toString:\n" + pBill2);
		System.out.println("pBill3.toString:\n" + pBill3);
		System.out.println("pBill4.toString:\n" + pBill4);
		System.out.println();

		System.out.println("pBill1.hashCode(); " + pBill1.hashCode());
		System.out.println("pBill2.hashCode(); " + pBill2.hashCode());
		System.out.println("pBill3.hashCode(); " + pBill3.hashCode());
		System.out.println("pBill4.hashCode(); " + pBill4.hashCode());
		System.out.println();

		System.out.println("pBill1.equals(pBill2): " + pBill1.equals(pBill2));
		System.out.println("pBill1.equals(pBill3): " + pBill1.equals(pBill3));
		System.out.println("pBill1.equals(pBill4): " + pBill1.equals(pBill4));
		System.out.println("pBill2.equals(pBill3): " + pBill2.equals(pBill3));
		System.out.println("pBill2.equals(pBill4): " + pBill2.equals(pBill4));
		System.out.println("pBill3.equals(pBill4): " + pBill3.equals(pBill4));

	}

	private static void printObjectStateChanges() {
		System.out.println(""
				+ "	PowerBill pBill1 = new PowerBill(\"Kujo, LLC\", \"666 S. Heck St., Tampa, FL 33615\");\n"
				+ "	PowerBill pBill2 = new PowerBill(\"Kujo, LLC\", \"666 S. Heck St., Tampa, FL 33615\");\n"
				+ "	PowerBill pBill3 = new PowerBill(\"Kujo, LLC\", \"666 S. Heck St., Tampa, FL 33615\");\n"
				+ "	PowerBill pBill4 = pBill1;\n"
				+ "	pBill3.setMeterNumber(pBill2.getMeterNumber());"
				+ "	pBill3.setAddress(null);\n"
				+ "	pBill3.setName(null);"
				);
		
	}

}
