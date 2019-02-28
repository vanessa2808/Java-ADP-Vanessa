package lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BipartiteTest {

	
	
	public static void main(String[] args) {
		//
		GraphEdgeList g = new GraphEdgeList(6);
		g.addEdge(0, 5);
		g.addEdge(1, 2);
		g.addEdge(1, 5);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 5);
//		g.addEdge(3, 4);
		
		// 
		int[] side = new int[g.V];
		side[0] = 1;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(0);
		boolean is_bipartite = true;
		while (queue.size() > 0){
			int u = queue.remove();
			for (int v : g.adj[u])
				if (side[v] == 0){
					side[v] = 3 - side[u];
					queue.add(v);
				}else if (side[v] == side[u]){
					is_bipartite = false;
					break;
				}
			if (!is_bipartite)
				break;
		}
		
		if (is_bipartite){
			System.out.println("g is a bipartite graph");
			for (int u = 0; u < g.V; u++)
				System.out.print(side[u] + " ");
		}else{
			System.out.println("g is NOT a bipartite graph");
		}
	}

}
