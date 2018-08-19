package com.javaguides.generics.classes;

import java.util.ArrayList;
import java.util.List;

/**
 * Wildcard Arguments With An Upper Bound Demo
 * @author javaguides.net
 *
 */

public class WildCardWithUpperBoundExample {
	static void processElements(List<? extends Number> a) {
		for (Object element : a) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		// ArrayList Containing Integers

		List<Integer> a1 = new ArrayList<>();

		a1.add(10);

		a1.add(20);

		a1.add(30);

		processElements(a1);

		// ArrayList Containing Longs

		List<Long> a2 = new ArrayList<>();

		a2.add(100L);

		a2.add(200L);

		a2.add(300L);

		processElements(a2);

		// Arraylist containing Doubles

		List<Double> a3 = new ArrayList<>();

		a3.add(21.35);

		a3.add(56.47);

		a3.add(78.12);

		processElements(a3);

		// Arraylist containing Strings

		List<String> a4 = new ArrayList<>();

		a4.add("One");

		a4.add("Two");

		a4.add("Three");

		// This will not work

		//processElements(a4); // Compile time error
	}
}
