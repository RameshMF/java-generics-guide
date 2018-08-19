package com.javaguides.generics.classes;

public class GenericsMethods {

	//Generics in method
	public static <T> boolean isEqual(GenType<T> g1, GenType<T> g2){
		return g1.get().equals(g2.get());
	}
	
	public static <T extends Comparable<T>> int compare(T t1, T t2){
		return t1.compareTo(t2);
	}
	
	public static void main(String args[]){
		GenType<String> g1 = new GenType<>();
		g1.set("demo");
		
		GenType<String> g2 = new GenType<>();
		g2.set("demo");
		
		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
		
		System.out.println(isEqual);
		//above statement can be written simply as
		isEqual = GenericsMethods.isEqual(g1, g2);
		
		System.out.println(isEqual);
		
		System.out.println(GenericsMethods.compare("abc","abc"));
	}
}
