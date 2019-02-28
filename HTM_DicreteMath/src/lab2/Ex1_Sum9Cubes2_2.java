package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Entry{
	public int s;
	public List<Integer> arr;
	//
	public Entry(int s, List<Integer> arr) {
		super();
		this.s = s;
		this.arr = arr;
	}
	
	
}

public class Ex1_Sum9Cubes2_2 {

	private static final List ArrayList = null;

	public static <T> void main(String[] args) {
		int n = 20;
		int r = 9;
		int[] numbers = new int[n+1];
		for (int i = 1; i < n + 1; i++)
			numbers[i] = i;
		// initial combination
		int[] a = new int[r+1];
		for (int i = 1; i < r+1; i++)
			a[i] = i;

		List<Entry> sum = new ArrayList<Entry>();
		int s = 0;
		for (int t = 1; t < r+1; t++)
			s = s + a[t]*a[t]*a[t];
		sum.add(new Entry(s, new ArrayList()));
		
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
			sum.add((Entry) sum);
		}
		
		// sort sum
		System.out.println("sum.size = " + sum.size());
		Collections.sort(ArrayList);
		for (int i = 0; i < 10; i++)
			System.out.println(sum.get(i));
		
	}

}
