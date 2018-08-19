package com.javaguides.generics.classes;

public class GenericClass<T extends A> {
	private T t;

	public GenericClass(T t){
	        this.t = t;
	    }

	public void doRunTest() {
		this.t.displayClass();
	}

	public static void main(String[] args) {

		// Creating object of sub class C and
		// passing it to Bound as a type parameter.
		GenericClass<C> bec = new GenericClass<C>(new C());
		bec.doRunTest();

		// Creating object of sub class B and
		// passing it to Bound as a type parameter.
		GenericClass<B> beb = new GenericClass<B>(new B());
		beb.doRunTest();

		// similarly passing super class A
		GenericClass<A> bea = new GenericClass<A>(new A());
		bea.doRunTest();
		
	}
}


class A {
	public void displayClass() {
		System.out.println("Inside super class A");
	}
}

class B extends A {
	public void displayClass() {
		System.out.println("Inside sub class B");
	}
}

class C extends A {
	public void displayClass() {
		System.out.println("Inside sub class C");
	}
}
