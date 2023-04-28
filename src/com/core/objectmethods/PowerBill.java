package com.core.objectmethods;

import java.lang.Math;

public class PowerBill {

	private int meterNumber;
	private String name;
	private String address;

	public PowerBill(String name, String address) {
		this.meterNumber = (int) (Math.random() * 100000000);
		this.name = name;
		this.address = address;
	}

	public int getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(int meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {

		return "Power Bill" 
				+ "\n\tMeter Number:\t" + meterNumber 
				+ "\n\tName:\t\t" + name 
				+ "\n\tAddress:\t" + address;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null  || getClass() != o.getClass()|| this.hashCode() != ((PowerBill) o).hashCode())
			return false;
		if (this == o)
			return true;
		if (this.meterNumber == ((PowerBill) o).getMeterNumber())
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return meterNumber;
	}

}
