package com.javaguides.generics.classes;

/**
 * Generic interface example to find min and max of array.
 * @author javaguides.net
 *
 */
public class GenericInterfaceExample {
	public static void main(String args[]) {
		Integer intOfArray[] = { 3, 6, 2, 8, 6 };
		Character charOfArray[] = { 'A', 'r', 'V', 'w' };
		String strOfArray[] = {"abc", "xyz", "pqr"};
		
		MinMaxImpl<Integer> intMinMax = new MinMaxImpl<Integer>(intOfArray);
		MinMaxImpl<Character> charMinMax = new MinMaxImpl<Character>(charOfArray);
		MinMaxImpl<String> strMinMax = new MinMaxImpl<String>(strOfArray);

		System.out.println("Max value in intOfArray: " + intMinMax.max());
		System.out.println("Min value in intOfArray: " + intMinMax.min());

		System.out.println("Max value in charOfArray: " + charMinMax.max());
		System.out.println("Min value in charOfArray: " + charMinMax.min());
		
		System.out.println("Max value in strOfArray: " + strMinMax.max());
		System.out.println("Min value in strOfArray: " + strMinMax.min());
	}
}

interface MinMax<T extends Comparable<T>> {
	T min();

	T max();
}

class MinMaxImpl<T extends Comparable<T>> implements MinMax<T> {
	T[] vals;

	MinMaxImpl(T[] o) {
		vals = o;
	}

	public T min() {
		T v = vals[0];

		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v) < 0) {
				v = vals[i];
			}
		}

		return v;
	}

	public T max() {
		T v = vals[0];

		for (int i = 1; i < vals.length; i++) {
			if (vals[i].compareTo(v) > 0) {
				v = vals[i];
			}
		}

		return v;
	}
}