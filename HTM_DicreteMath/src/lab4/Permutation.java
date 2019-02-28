package lab4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Permutation {

	static int[] nextPermutation(int[] a){
		int n = a.length;
		int[] ret = new int[n];
		
		// 1. find i
		int i = n-1;
		while (i > 0 && a[i] < a[i-1])
			i = i - 1;
		i = i - 1;
		if (i == -1)
			return null;
		
//		System.out.println("i = " + i);
		// copy a[0..i-1] to ret[]
		for (int j = 0; j < i; j++)
			ret[j] = a[j];
		
		// 2. find min_ai
		int min_ai = a[i+1];
		for (int j = i+1; j < n; j++)
			if (a[j] > a[i] && a[j] < min_ai)
				min_ai = a[j];
		ret[i] = min_ai;
		
		// 3. sort a[i+1..n] using temp
		int[] temp = new int[n-i-1];
		temp[0] = a[i];
		int k = 1;
		for (int j = i+1; j < n; j++)
			if (a[j] != min_ai){
				temp[k] = a[j];
				k = k + 1;
			}
		Arrays.sort(temp);
		// copy temp to ret[i+1..n]
		for (int j = i+1; j < n; j++)
			ret[j] = temp[j-i-1];
		
		return ret;
		
	}
	
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	static void genAllPermutations(int n) {
		int[] a = new int[n];
		for (int i=0; i < n; i++)
			a[i] = i+1;
		
		int[] ret = a;
		printArray(ret);
		while (true) {
			ret = nextPermutation(ret);
			if (ret != null)
				printArray(ret);
			else
				break;
		}
		
	}
	
	public static void main(String[] args) {
//		int[] a = {1,3,4,2};
//		int[] a = {4,5,3,2,1};
//		int[] a = {3,6,2,5,4,1};
//		int[] a = {3,1,5,2,8,7,6,4};
//		printArray(a);
//		int[] ret = nextPermutation(a);
//		printArray(ret);
		
		//
		genAllPermutations(6);
	}

}
