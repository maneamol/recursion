package com.amol.fibonacci;

public class Fibinacci {

	public static void main(String args[]) {
		System.out.println("abcd".length());
		System.out.println("abcd".substring(0,0));
		Fibinacci fib = new Fibinacci();
		//fib.fibonacci(0, 7, 0, 1);
		int j = 0;
		for (int i = 0; i<7; i++) {
			j =fib.fibonacci(i);
			System.out.print(" " + j);
		}
	}
	
	public void fibonacci(int count, int limit, int first, int second) {
		if(count == 0) {
			System.out.print(" " + first + " " + second);
		}
		
		if (count < (limit - 2)) {
			System.out.print(" "  + (first + second));
			fibonacci(count +1 , limit, second, (first + second));
		}
	}
	
	public int fibonacci(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n == 1) {
			return 1;
		}
		else return (fibonacci(n-1) + fibonacci(n -2));
	}
}
