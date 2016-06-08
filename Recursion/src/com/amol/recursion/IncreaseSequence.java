package com.amol.recursion;

/**
 * For question
 * http://www.geeksforgeeks.org/print-increasing-sequences-length-k-first-n-natural-numbers/
 * @author amolmane
 */
public class IncreaseSequence
{
	public static void main(String[] args)
	{
		int k = 4;
		int n = 7;
		
//		k = 2;
//		n = 3;
		
		int[] a = new int[k];
		generate(k, n, a, 0);
	}

	static void generate(int k, int n, int[] a, int index)
	{
		if (index == k)
		{
			printUtil(a);
		}
		else
		{
			if (index == 0)
			{
				for (int i = 1; i <= n - k + 1; i++)
				{
					System.out.println("iindex =" + "0");
					a[index] = i;
					generate(k, n, a, index + 1);
				}
			}
			else
			{
				// index is the index we want to add
				// index - 1 is the index(max index) that is in the array now.
				// k - (index - 1) - 1 is amount left
				//
				//for (int i = a[index - 1] + 1; i <= n - (k -(index - 1) - 1) + 1; i++)
				for (int i = a[index - 1] + 1; i <= n - (k - index) + 1; i++)
				{
					System.out.println("index = " + index + " left" + (n - (k - (index - 1) - 1) + 1));
					a[index] = i;
					generate(k, n, a, index + 1);
				}
			}
		}
	}

	static void printUtil(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(" " + a[i]);
		}

		System.out.println("\n---------------");
	}
}