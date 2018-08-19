package com.javaguides.generics.classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Generic methods example to convert array to list.
 * @author javaguides.net
 *
 */
public class GenericMethodsExamples {
	// definition of a generic method
	public static <T> List<T> fromArrayToList(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	// definition of a generic method
	public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
		return Arrays.stream(a).map(mapperFunction).collect(Collectors.toList());
	}

	// example of a generic method that has Number as an upper bound for T
	public static <T extends Number> List<T> fromArrayToListWithUpperBound(T[] a) {
		return Arrays.stream(a).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// testing the generic method with Integer
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		List<Integer> list = fromArrayToList(intArray);
		list.forEach(element -> System.out.println(element));

		// testing the generic method with String
		String[] stringArray = { "hello1", "hello2", "hello3", "hello4", "hello5" };
		List<String> strList = fromArrayToList(stringArray);
		strList.forEach(element -> System.out.println(element));

		// testing the generic method with Integer and String type
		Integer[] intArr = { 1, 2, 3, 4, 5 };
        List<String> stringList = fromArrayToList(intArr, Object::toString);
        stringList.forEach(element -> System.out.println(element));

	}

}
