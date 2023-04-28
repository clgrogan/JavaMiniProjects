/**
 * 
 */
package com.core.arrays;

import java.util.Arrays;

/**
 * @author cgrogan
 * Use a for loop to print the array in reverse order.
 * 
 */
public class ReverseArrayElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println();
		String a[] = "dog. lazy the over jumped fox brown quick The".split(" ");
		System.out.println(Arrays.toString(a));
		for (int i = a.length-1; i >= 0; i--) {
			
			System.out.print(a[i]+"\s");
			
		}
		System.out.println();
	}

}
