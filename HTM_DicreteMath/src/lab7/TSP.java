package lab7;

import java.util.Arrays;

public class TSP {

	static int[] nextPermutation(int[] a){
		int n = a.length;
		int[] ret = new int[n];
		
		// 1. find i
		int i = n-1;
		while (i > 0 & a[i] < a[i-1])
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

	
	public static void main(String[] args) {
		
		int[][] G = new int[][]{{0, 3, 8, 4, 7},
				     {3, 0,10, 9, 2},
				     {8,10, 0, 6, 5},
				     {4, 9, 6, 0, 1},
				     {7, 2, 5, 1, 0}};
		int minCost = 1000000;
		int[] minOrder = new int[5];
		int[] order = new int[5];
		order[4] = 4;
		int[] rest = new int[4];
		rest[0] = 0; rest[1] = 1; rest[2] = 2; rest[3] = 3;
//		while (rest != null){
		for (int count = 0; count < 23; count++){
			for (int i = 0; i < 4; i++)
				order[i] = rest[i];
			
			int cost = 0;
			for (int i = 0; i < 4; i++)
				cost += G[order[i]][order[i+1]];
			cost += G[order[4]][order[0]];
			
			if (cost < minCost){
				minCost = cost;
				for (int i = 0; i < 5; i++)
					minOrder[i] = order[i];
			}
			
			rest = nextPermutation(rest);
		}
		
		//
		System.out.println("minCost = " + minCost);
		System.out.println("minOrder : ");
		for (int i = 0; i < 5; i++)
			System.out.print(minOrder[i] + " ");
		
	}

}
