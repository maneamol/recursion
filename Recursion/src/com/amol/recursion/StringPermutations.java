package com.amol.recursion;

public class StringPermutations {
	public static void main(String args[]) {
		//permutation("1234");
		StringPermutations permutations = new StringPermutations();
		char[] a = {'a', 'b', 'c'};
		//System.out.println(a.length);
		//System.out.println(3%3);
		permutations.perm(a, 0);
	}

	/*
	 * * A method exposed to client to calculate permutation of String in Java.
	 */
	public static void permutation(String input) {
		permutation("", input);
	}

	/*
	 * * Recursive method which actually prints all permutations * of given
	 * String, but since we are passing an empty String * as current permutation
	 * to start with, * I have made this method private and didn't exposed it to
	 * client.
	 */
	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.out.println(" perm= " + perm + " word = " + word);
			System.out.println(perm + word);
		} else {
			for (int i = 0; i < word.length(); i++) {
				System.out.println("i = " + i + " perm= " + perm + " word = " + word);
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}
	}

	private void perm(char[] a, int pos) {
		if (pos == a.length ) {
			for (char string : a) {
				System.out.print(" " + string);
			}
			System.out.println();
		} else {
			for (int i = pos; i< a.length ; i++) {
				a = swap(a, pos, ((pos + i ) % a.length));
				perm(a, pos + 1);
				a = swap(a, pos, ((pos + i ) % a.length));
			}
		}
	}
	
	private char[] swap(char[] a, int i, int j) {
		char t = a[i];
		a[i] = a [j];
		a[j] = t;
		
		return a;
	}
}
