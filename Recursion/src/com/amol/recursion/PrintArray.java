package com.amol.recursion;

public class PrintArray {

	public static void main(String[] args) {
		int[] a = {1,2, 3};
		PrintArray printArray = new PrintArray();
		//printArray.printArray(a, 0);
		printArray.printArrayReverse(a, 0);
	}
	public void printArray(int[] array, int index) {
		if (index < array.length) {
			System.out.print(" " + array[index]);
			printArray(array, index + 1);
		}
	}
	
	public void printArrayReverse(int[] array, int index) {
		System.out.println("call");
		if (index < array.length) {
			printArrayReverse(array, index + 1);
			System.out.print(" " + array[index]);
		}
	}
}
