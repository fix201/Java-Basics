package com.java.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Java 8 principles: Streams: filter, map, collect
 * 
 * @author Incognito
 */
public class Streams {

	/**
	 * given a list of integers, return a comma delimeted string
	 * 
	 * @param List<Integer>
	 * @return String
	 */
	public static String evenOdd(List<Integer> list) {
		return list.stream().map(i -> i % 2 == 0 ? "e" + Integer.toString(i) : "o" + Integer.toString(i))
				.collect(Collectors.joining(","));
	}

	/**
	 * get the list of strings in a list that starts with the character 'a' and has
	 * exactly 3 letters
	 * 
	 * @param List<String>
	 * @return List<String>
	 */
	public static List<String> startWith_a(List<String> list) {
		return list.stream().filter(i -> i.charAt(0) == 'a').filter(i -> i.length() == 3).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// add e to even and o to odd
		List<Integer> l = Arrays.asList(new Integer[] { 2, 44, 55 });
		System.out.println(evenOdd(l));

		// starts with a and has exactly 3 letters
		List<String> s = Arrays.asList(new String[] { "aboki", "fuckboi", "ala", "mot" });
		System.out.println(startWith_a(s));
	}

}
