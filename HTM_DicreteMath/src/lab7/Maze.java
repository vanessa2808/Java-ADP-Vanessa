package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import lab6.GraphEdgeMatrix;

public class Maze {
	
	static void shortestPathBFS(GraphEdgeMatrix g, int s, int t){
		int[] previous = new int[g.V];
		
		LinkedList<Integer> L = new LinkedList<Integer>();
		L.add(s);
		g.vertexLabel[s] = "VISITED";
		while (L.size() > 0){
			int v = L.remove(); 
			for (int w = 0; w < g.V; w++)
				if (g.edgeLabel[v][w] == "UNEXPLORED")
					if (g.vertexLabel[w] == "UNEXPLORED")
					{
						g.vertexLabel[w] = "VISITED";
						L.add(w);
						previous[w] = v;
					}
					
		};
		// print shortest path
		List<Integer> path = new ArrayList<Integer>();
		int u = t;
		path.add(u);
		while (previous[u] != 0){
			u = previous[u];
			path.add(u);
		}
		
		Collections.reverse(path);
		
		System.out.println("shortest path");
		for (Integer v : path)
			System.out.print(v + " ");
	}

	public static void main(String[] args) {
		
		GraphEdgeMatrix g = new GraphEdgeMatrix(43);
		g.addEdge(1,2); g.addEdge(1,8);
		g.addEdge(2,1); g.addEdge(2,3);
		g.addEdge(3,2); g.addEdge(3,10);
		g.addEdge(4,11);
		g.addEdge(5,6); g.addEdge(5,12);
		g.addEdge(6,5); g.addEdge(6,7);
		g.addEdge(7,6); g.addEdge(7,14);
		g.addEdge(8,1); g.addEdge(8,15);
		g.addEdge(9,10); g.addEdge(9,16);
		g.addEdge(10,3); g.addEdge(10,9); g.addEdge(10,11); g.addEdge(10,17);
		g.addEdge(11,4); g.addEdge(11,10); g.addEdge(11,18);
		g.addEdge(12,5); g.addEdge(12,13); g.addEdge(12,19);
		g.addEdge(13,12); g.addEdge(13,20);
		g.addEdge(14,7); g.addEdge(14,21);
		g.addEdge(15,8); g.addEdge(15,16); g.addEdge(15,22);
		g.addEdge(16,9); g.addEdge(16,15);
		g.addEdge(17,10); g.addEdge(17,24);
		g.addEdge(18,11);
		g.addEdge(19,12); g.addEdge(19,26);
		g.addEdge(20,13); g.addEdge(20,27);
		g.addEdge(21,14); g.addEdge(21,28);
		g.addEdge(22,15); g.addEdge(22,23);
		g.addEdge(23,22); g.addEdge(23,30);
		g.addEdge(24,17); g.addEdge(24,25); g.addEdge(24,31);
		g.addEdge(25,24); g.addEdge(25,26); g.addEdge(25,32);
		g.addEdge(26,19); g.addEdge(26,25);
		g.addEdge(27,20); g.addEdge(27,28); g.addEdge(27,34);
		g.addEdge(28,21); g.addEdge(28,27);
		g.addEdge(29,36); 
		g.addEdge(30,23); g.addEdge(30,37);
		g.addEdge(31,24); g.addEdge(31,38);
		g.addEdge(32,25); g.addEdge(32,39);
		g.addEdge(33,40); 
		g.addEdge(34,27); g.addEdge(34,41);
		g.addEdge(35,42);
		g.addEdge(36,29); g.addEdge(36,37);
		g.addEdge(37,30); g.addEdge(37,36); g.addEdge(37,38);
		g.addEdge(38,31); g.addEdge(38,37);
		g.addEdge(39,32); g.addEdge(39,40);
		g.addEdge(40,39); g.addEdge(40,33);
		g.addEdge(41,34); g.addEdge(41,42);
		g.addEdge(42,35); g.addEdge(42,41);
		//
		
		shortestPathBFS(g, 1, 42);
		
	}

}
