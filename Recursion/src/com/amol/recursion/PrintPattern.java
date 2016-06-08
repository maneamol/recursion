package com.amol.recursion;

/**
 * For question
 * http://www.geeksforgeeks.org/print-a-pattern-without-using-any-loop/
 * @author amolmane
 */
public class PrintPattern {
	
	public static void main(String[] args) {
		PrintPattern pattern = new PrintPattern();
		//pattern.pattern(16, 5, 16, false);
		pattern.pattern(10, 5, 10, false);
	}

	public void pattern(int number, int constant, int n, boolean flag) {
		
		System.out.print(" " + number);
		
		if (!flag && number > 0) {
			pattern((number - constant), constant, n, false);
		} else {
			if (number != n) {
				pattern((number + constant), constant, n, true);
			}
		}
	}
}
