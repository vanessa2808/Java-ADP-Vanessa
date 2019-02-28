package lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_Sum9Cubes {

	public static void main(String[] args) {
		int n = 20;
		int r = 9;
		int[] numbers = new int[n+1];
		for (int i = 1; i < n + 1; i++)
			numbers[i] = i;
		// initial combination
		int[] a = new int[r+1];
		for (int i = 1; i < r+1; i++)
			a[i] = i;

		List<Integer> sum = new ArrayList<Integer>();
		int s = 0;
		for (int t = 1; t < r+1; t++)
			s = s + a[t]*a[t]*a[t];
		sum.add(s);
		
		//
		while (true){
			int i = r;
			while (i > 0 && a[i] == n - r + i)
				i = i - 1;
			if (i == 0)
				break;
			//
			a[i] = a[i] + 1;
			for (int j =i+1; j < r+1; j++)
				a[j] = a[i] + (j-i);
			
			//
			s = 0;
			for (int t = 1; t < r+1; t++)
				s = s + a[t]*a[t]*a[t];
			sum.add(s);
		}
		
		// sort sum
		System.out.println("sum.size = " + sum.size());
		Collections.sort(sum);
		for (int i = 0; i < sum.size(); i++)
			System.out.println(sum.get(i));
		
	}

}
