/*
 * Ex. 6 (Section 6.5)
 */

package lab4;

import java.util.HashMap;
import java.util.Map;

public class CombinationWithRepetition {

	public static void main(String[] args) {
		char[] S = new char[]{'a','b','c'};
		int n = S.length;
		
		Map<Character, Character> nextChar = new HashMap<Character, Character>();
		nextChar.put('a', 'b');
		nextChar.put('b', 'c');
		
		int r = 5;
		char[] c = new char[r];
		
		// initial combination
		for (int i = 0; i < c.length; i++)
			c[i] = S[0];
		
		//
		int count = 1;
		while (true){
			int i = c.length-1;
			while (i >= 0 && c[i] == S[n-1])
				i = i - 1;
			if (i == -1)
				break;
			//
			c[i] = nextChar.get(c[i]);
			for (int j = i+1; j < r; j++)
				c[j] = c[i];
			
			count += 1;
			
		}
		System.out.println("There are " + count + " permutations");
	}

}
