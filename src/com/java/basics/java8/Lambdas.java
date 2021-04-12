package com.java.basics.java8;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Java8 principles: Lambdas: Arrays.sort, Static Helper Methods: Character.compare
 * 
 * @author Joseph
 */
public class Lambdas {

	public static void main(String[] args) {

		String[] arr = { "alpha", "one", "two", "three", "four", "bravo", "eat", "five", "six", "seven", "eleven" };

		// using Lambdas to sort by length
		Comparator<String> byLength = (i, j) -> {
			if (i.length() < j.length())
				return 1;
			else if (i.length() > j.length())
				return -1;
			return 0;
		};
		Arrays.sort(arr, byLength);
		System.out.println("Sorting by length (descending): " + Arrays.toString(arr));
		
		// sort in ascending order
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println("Sorting by length (ascending): " + Arrays.toString(arr));

		// Sorting alphabetically first character only
		Arrays.sort(arr);
		System.out.println("Sorting by first character: " + Arrays.toString(arr));

		// Stings that contain "e" fist
		Arrays.sort(arr, (i, j) -> {
			if (i.charAt(0) == 'e' || j.charAt(0) == 'e')
				return -1;
			else if (i.length() < j.length())
				return 1;
			else if (i.length() > j.length())
				return -1;
			return 0;
		});
		System.out.println("Sorting by E: " + Arrays.toString(arr));

		// Using Static Helper Methods
		Arrays.sort(arr, (i, j) -> Character.compare(i.charAt(0), j.charAt(0)));
		System.out.println("Sorting by static helper method: " + Arrays.toString(arr));

		

	}

}
