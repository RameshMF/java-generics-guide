package com.javaguides.generics.classes;

/**
 * Create Generic Stack. 
 * @author javaguides.net
 *
 * @param <E>
 */

public class GenericStackExample {

	private static Double[] doubleElements = { 1.1, 2.2, 3.3, 4.4, 5.5};

	private static Integer[] integerElements = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	private static Stack<Double> doubleStack = new Stack<Double>(5); // Stack of
																		// Doubles

	private static Stack<Integer> integerStack = new Stack<Integer>(10); // Stack
																			// of
																			// Integers
	// generic method testPush pushes elements onto a Stack

	private static <T> void testPush(String name, Stack<T> stack, T[] elements) {
		try {
			System.out.printf("\nPushing elements onto %s\n", name);

			for (T element : elements) {
				System.out.printf("%s ", element);
				stack.push(element);
			}
		} catch (FullStackException fullStackException) {
			System.out.println();
			fullStackException.printStackTrace();
		}
	}

	// generic method testPop pops elements from a Stack
	private static <T> void testPop(String name, Stack<T> stack) {
		try {
			System.out.printf("\nPopping elements from %s\n", name);
			T popValue;
			while (true) {
				popValue = stack.pop();
				System.out.printf("%s ", popValue);
			}
		} catch (EmptyStackException emptyStackException) {
			System.out.println();
			emptyStackException.printStackTrace();
		}
	}

	public static void main(String args[]) {
		testPush("doubleStack", doubleStack, doubleElements);
		testPop("doubleStack", doubleStack);
		testPush("integerStack", integerStack, integerElements);
		testPop("integerStack", integerStack);
	}
}


class Stack<E> {
	private final int size;

	private int top;

	private E[] elements;

	public Stack() {
		this(10);
	}

	@SuppressWarnings("unchecked")
	public Stack(int s) {
		size = s > 0 ? s : 10;
		top = -1;

		elements = (E[]) new Object[size]; // create array
	}

	public void push(E pushValue) {
		if (top == size - 1) // if stack is full
			throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue));

		elements[++top] = pushValue; // place pushValue on Stack
	}

	public E pop() {
		if (top == -1) // if stack is empty
			throw new EmptyStackException("Stack is empty, cannot pop");

		return elements[top--]; // remove and return top element of Stack
	}
}

class EmptyStackException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmptyStackException() {
		this("Stack is empty");
	}

	public EmptyStackException(String exception) {
		super(exception);
	}
}

class FullStackException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FullStackException() {
		this("Stack is full");
	}

	public FullStackException(String exception) {
		super(exception);
	}
}

