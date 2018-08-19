package com.javaguides.generics.classes;

/**
 * Generic class example. Create GenericFactory<T> to get any type of instance.
 * @author javaguides.net
 *
 */
public class GenericClassExample {
	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		GenericFactory<ProductA> factory = new GenericFactory<ProductA>(ProductA.class);
		ProductA productA = factory.createInstance();
		System.out.println(productA.getProductName());

		GenericFactory<ProductB> factoryB = new GenericFactory<ProductB>(ProductB.class);
		ProductB productB = factoryB.createInstance();
		System.out.println(productB.getProductName());
		
		GenericFactory<ProductC> factoryC = new GenericFactory<ProductC>(ProductC.class);
		ProductC productC = factoryC.createInstance();
		System.out.println(productC.getProductName());
	}
}

class ProductA {
	public String getProductName() {
		return "Product A";
	}
}

class ProductB {
	public String getProductName() {
		return "Product B";
	}
}

class ProductC {
	public String getProductName() {
		return "Product C";
	}
}

class GenericFactory<T> {

	Class theClass = null;

	public GenericFactory(Class theClass) {
		this.theClass = theClass;
	}

	public T createInstance() throws IllegalAccessException, InstantiationException {
		return (T) this.theClass.newInstance();
	}
}