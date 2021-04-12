package com.java.basics.oop;

import java.util.Comparator;

/**
 * Comparing objects using Comparable and Comparator
 * 
 * @author Joseph
 */

/**
 * Comparing objects using comparator
 */
class MovRatComp implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		if (o1.getYear() > o2.getYear())
			return -1;
		else if (o1.getYear() < o2.getYear())
			return 1;
		return 0;
	}

}

/**
 * Comparing objects using comparable
 */
class Movie implements Comparable<Movie> {

	private String name;
	private Integer year;
	private Float rating;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Float getRating() {
		return rating;
	}

	public void setRating(Float rating) {
		this.rating = rating;
	}

	public Movie(String name, Integer year, Float rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}

	@Override
	public String toString() {
		return "ComparingObjects [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}

	
}

public class ComparingObjects {

	
}