package com.javaguides.generics.classes;

public class GenericMultipleTypeParametersExample {
	public static void main(String[] args) {
		OrderedPair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		System.out.println(p1.getKey());
		System.out.println(p1.getValue());
		
		OrderedPair<String, String>  p2 = new OrderedPair<>("hello", "world");
		System.out.println(p2.getKey());
		System.out.println(p2.getValue());
		
		OrderedPair<String, Employee>  p3 = new OrderedPair<>("key", new Employee("Ramesh"));
		System.out.println(p3.getKey());
		System.out.println(p3.getValue().getName());
	}
}

class Employee{
	private String name;
	Employee(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}

interface Pair<K, V> {
    public K getKey();
    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
	this.key = key;
	this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
}