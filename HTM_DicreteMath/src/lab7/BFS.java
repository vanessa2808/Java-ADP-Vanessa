package lab7;

import java.util.LinkedList;

import lab6.GraphEdgeList;
import lab6.GraphEdgeMatrix;

public class BFS {

	static void bfs(GraphEdgeMatrix g, int u){
		g.vertexLabel[u] = "VISITED";
		LinkedList<Integer> L = new LinkedList<Integer>();
		L.add(u);
		while (L.size() > 0){
			int v = L.remove(); 
			for (int w = 0; w < g.V; w++)
				if (g.edgeLabel[v][w] == "UNEXPLORED")
				{
					if (g.vertexLabel[w] == "UNEXPLORED")
					{
						g.edgeLabel[v][w] = "DISCOVERY";
						g.edgeLabel[w][v] = "DISCOVERY";
						L.add(w);
						g.vertexLabel[w] = "VISITED";
					}
					else{
						g.edgeLabel[v][w] = "CROSS";
						g.edgeLabel[w][v] = "CROSS";
					}
					
				}
		};
	}
	
	public static void main(String[] args) {

		GraphEdgeMatrix g = new GraphEdgeMatrix(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 5);
		g.addEdge(3, 5);
		
		bfs(g, 0);
		
		//
		for (int v = 0; v < g.V; v++)
			for (int w = v+1; w < g.V; w++)
				if (g.edgeLabel[v][w] != null)
					System.out.println("("+ v + "," + w + ") = " + g.edgeLabel[v][w]);
	}

}
