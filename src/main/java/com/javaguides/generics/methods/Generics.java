package com.javaguides.generics.methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Generics {

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
    	String[] str = {"abc","bcd"};
		List<String> list = fromArrayToList(str);
		list.forEach(s -> System.out.println(s));
	}
}