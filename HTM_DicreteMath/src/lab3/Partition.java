package lab3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/*
 * Exercise 4 (p.463, Discrete Mathematics and Its Applications, 7th Edition)
 */

public class Partition {
	public static void main(String[] args) {
		int C = 4;
		int K = 3;
		Queue<Entry> queue = new LinkedList<Entry>();
		
		// init
		for (int i = C; i > 0; i--){
			List<Integer> sol = new ArrayList<Integer>();
			sol.add(i);
			
			queue.add(new Entry(sol, i));
		}
		
		//
		while (queue.size() > 0){
			Entry e = queue.remove();
			
			if (e.sum == C && e.seq.size() <= K){	// print out
				for (int i : e.seq)
					System.out.print(i + " ");
				for (int i=0; i < K-e.seq.size(); i++)
					System.out.print("0 ");
				System.out.println();
			}else{
				int r = C - e.sum;		// remaining value
				int min = r < e.seq.get(e.seq.size()-1) ? r : e.seq.get(e.seq.size()-1);
				for (int i = min; i > 0; i--){
					// clone e
					Entry e_new = new Entry(e);
					e_new.seq.add(i);
					e_new.sum += i;
					//
					queue.add(e_new);
				}
				
			}
			
		}

		
	}

}
