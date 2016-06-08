package com.amol.recursion;

/**
 * N=123 sum = 6
 * @author amolmane
 */
public class SumOfDigits {
	public static void main(String[] args) {
		SumOfDigits sumOfDigits = new SumOfDigits();
		System.out.println(sumOfDigits.sumOfDigits(111));
	}
	public int sumOfDigits(int n) {
		if (n/10 == 0) {
			return n;
		} else {
			return ( (n%10) + sumOfDigits(n/10));
		}
	}
}
